package ru.devcity.report.renovhouse;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication extends AbstractJavaFxApplicationSupport{

    @Value("${ui.title: Генератор по Нежилым Объектам }")
    private String windowTitle;

    @Qualifier("mainView")
    @Autowired
    private ControllersConfiguration.ViewHolder view;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(windowTitle);
        primaryStage.setScene(new Scene(view.getView()));
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

	public static void main(String[] args) {
        launchApp(StartApplication.class, args);
	//	SpringApplication.run(RenovhouseApplication.class, args);
	}


}
