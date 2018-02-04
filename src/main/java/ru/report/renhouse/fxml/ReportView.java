package ru.report.renhouse.fxml;

import org.springframework.stereotype.Component;

@Component
public class ReportView extends SpringFxmlView{

    private static final String FXML_REPORT = "fxml/report.fxml";

    public ReportView(){
        super(StartView.class.getClassLoader().getResource(FXML_REPORT));
    }
}
