package ru.devcity.report.renovhouse.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.devcity.report.renovhouse.model.House;
import ru.devcity.report.renovhouse.service.HouseService;

import javax.annotation.PostConstruct;
import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
public class MainController {
    //Инъекции Spring
    @Autowired
    private HouseService houseService;

    //Инъекции JavaFX
    @FXML
    private TableView<House> houseTableView;
    @FXML
    private TextField txtUnom;
    @FXML
    private TextField txtMr;
    @FXML
    private TextField txtAdress;

    // Variables
    private ObservableList<House> dataHouse;

    /**
     * Инициализация контроллера от JavaFX.
     * Метод вызывается после того как FXML загрузчик произвел инъекции полей.
     *
     * Обратите внимание, что имя метода <b>обязательно</b> должно быть "initialize",
     * в противном случае, метод не вызовется.
     *
     * Также на этом этапе еще отсутствуют бины спринга
     * и для инициализации лучше использовать метод,
     * описанный аннотацией @PostConstruct,
     * который вызовется спрингом, после того, как им будут произведены все инъекции.
     * {@link MainController#init()}
     */
    @FXML
    public void initialize() {
        // Этап инициализации JavaFX
    }
    /**
     * На этом этапе уже произведены все возможные инъекции.
     */
    @SuppressWarnings("unchecked")
    @PostConstruct
    public void init(){
        List<House> houseList = houseService.findAll();
        dataHouse = FXCollections.observableArrayList(houseList);

        //Столбцы таблицы
        TableColumn<House, String> unomColumn = new TableColumn<>("УНОМ");
        unomColumn.setCellValueFactory(new PropertyValueFactory<>("unom"));

        TableColumn<House, String> mrColumn = new TableColumn<>("РАЙОН");
        mrColumn.setCellValueFactory(new PropertyValueFactory<>("mr"));

        TableColumn<House, String> adressColumn = new TableColumn<>("АДРЕС");
        adressColumn.setCellValueFactory(new PropertyValueFactory<>("adress"));

        houseTableView.getColumns().setAll(unomColumn, mrColumn, adressColumn);
        //Данные таблицы
        houseTableView.setItems(dataHouse);
    }

    public void addContact(ActionEvent actionEvent) {
        System.out.println("Test dobavlen");
    }
}
