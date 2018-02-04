package ru.report.renhouse.controller;

import javafx.fxml.Initializable;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSourceAware;

public interface FxInitializable extends Initializable, ApplicationContextAware, MessageSourceAware{

    void doClose();
}
