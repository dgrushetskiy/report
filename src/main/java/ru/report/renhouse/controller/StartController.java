package ru.report.renhouse.controller;

import com.google.common.collect.Lists;
import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.DragEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.CustomTextField;
import org.controlsfx.control.textfield.TextFields;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import ru.report.renhouse.fxml.ReportView;
import ru.report.renhouse.fxml.StartView;
import ru.report.renhouse.model.House;
import ru.report.renhouse.service.HouseService;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

@Component
public class StartController extends Observable{

    private static final int PAGE_SIZE = 19;
    public static final int MAX_PAGE_SHOW = 10;

    private Page page; // текущие постраничные данные

    @Autowired
    private HouseService houseService;
    @Autowired
    private StartView startView;
    @Autowired
    private ReportView reportView;


    ObservableList<House> houseObservableList;

    //Ссылки на FXML интерфейс

    @FXML
    private CustomTextField unomSearchTextField;
    @FXML
    private CustomTextField mrSearchTextField;
    @FXML
    private CustomTextField adressSearchTextField;
//    @FXML
//    private Button unomSearch;

//    @FXML
//    private Button mrSearch;
    @FXML
    private Button buttonReport;
    @FXML
    private TableView<House> tableViewHouseData;
    @FXML
    private TableColumn<House, String> columnUnomData;
    @FXML
    private TableColumn<House, String> columnMrData;
    @FXML
    private TableColumn<House, String> columnAdressData;
    @FXML
    private Pagination paginationData;
    @FXML
    private TableView<House> tableViewHouseUpdata;
    @FXML
    private TableColumn<House, Long> columnUnomUpdata;
    @FXML
    private TableColumn<House, String> columnMrUpdata;
    @FXML
    private TableColumn<House, String> columnAdressUpdata;
    @FXML
    private Pagination paginationUpdata;
    @FXML
    private ComboBox comboBoxFilter;
    @FXML
    private Label labelRecordTable;

    private Parent fxmlEdit;

    private FXMLLoader fxmlLoader = new FXMLLoader();

    private Stage editDialogStage;

    private ResourceBundle resourceBundle;



    private static final String RU_CODE="ru";
    private static final String EN_CODE="en";

    @FXML
    public void initialize(){
//        List<House> houseList = houseService.findAll();
//        houseObservableList = FXCollections.observableList(Lists.newArrayList(houseList));
        paginationData.setMaxPageIndicatorCount(MAX_PAGE_SHOW);//задаем количество строчек в таблице
        this.resourceBundle = startView.getResourceBundle();//определяем локацию по умолчанию

        columnUnomData.setCellValueFactory(cellData -> cellData.getValue().unomProperty().asString());
        columnMrData.setCellValueFactory(cellData -> cellData.getValue().mrProperty());
        columnAdressData.setCellValueFactory(cellData -> cellData.getValue().adressProperty());

        setupClearButtonField(mrSearchTextField);
        fillData();
        initListeners();
//        tableViewHouseData.getColumns().setAll(columnUnomData, columnMrData, columnAdressData);
//        tableViewHouseData.setItems(houseObservableList);
    }

    private void initListeners() {
        // слушает двойное нажатие для редактирования записи
        tableViewHouseData.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getClickCount() == 2) {
//                    editDialogController.setPerson((Person) tableAddressBook.getSelectionModel().getSelectedItem());
//                    showDialog();
                   // btnEdit.fire();
                }
            }
        });

        paginationData.currentPageIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                fillTable(newValue.intValue());
            }
        });
    }

    private void fillData() {
        fillTable();
    }

    private void fillTable(){
        if (mrSearchTextField.getText().trim().length() == 0){
            page = houseService.findAll(0, PAGE_SIZE);
        } else {
            page = houseService.findAll(0, PAGE_SIZE, mrSearchTextField.getText());
        }
        fillPagination(page);
        paginationData.setCurrentPageIndex(0);
        updateCountLabel(page.getTotalElements());
    }

    private void fillTable(int pageNumber){
        if (mrSearchTextField.getText().trim().length() == 0){
            page = houseService.findAll(pageNumber, PAGE_SIZE);
        }else {
            page = houseService.findAll(pageNumber,PAGE_SIZE, mrSearchTextField.getText());
        }
        fillPagination(page);
        updateCountLabel(page.getTotalElements());
    }

    private void updateCountLabel(long textRecordTable) {
        labelRecordTable.setText(resourceBundle.getString("textRecordTable") + ":" + textRecordTable);
    }

    private void fillPagination(Page page) {
        if (page.getTotalPages()<=1){
            paginationData.setDisable(true);
        }else {
            paginationData.setDisable(false);
        }
        paginationData.setPageCount(page.getTotalPages());
        houseObservableList = FXCollections.observableList(page.getContent());
        tableViewHouseData.setItems(houseObservableList);
    }

    private void setupClearButtonField(CustomTextField customTextField) {
        try {
            Method method = TextFields.class.getDeclaredMethod("setupClearButtonField", TextField.class, ObjectProperty.class);
            method.setAccessible(true);
            method.invoke(null, customTextField, customTextField.rightProperty());
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //поиск по УНОМу
    public void actionSearchUnom(ActionEvent actionEvent) {
        System.out.println("Поиск по УНОМ");
    }
    //поиск по Району
    public void actionSearchMr(ActionEvent actionEvent) {
        fillTable();
    }

    public void actionSearchAdress(ActionEvent actionEvent) {
        System.out.println("Поиск по Адресу");
    }

    public void actionGeneratorReport(ActionEvent actionEvent) {
        System.out.println("Report");
    }

    public void onMouseDragEntered(MouseDragEvent mouseDragEvent) {
    }

//    @Override
//    public void doClose() {
//
//    }
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//
//    }
//
//    @Override
//    public void setMessageSource(MessageSource messageSource) {
//
//    }

    public void MouseComboBox(MouseEvent mouseEvent) {
        System.out.println("Выбрал");
    }

    public void searchUnom(InputMethodEvent inputMethodEvent) {
        System.out.println("Text");
    }

    public void onMouseDragDropData(DragEvent dragEvent) {
    }

    public void onMouseDragDropUpata(DragEvent dragEvent) {
    }
}
