package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application{
	
	private StringProperty WindowName = new SimpleStringProperty();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		PresentationModel pm = new PresentationModel();
		Parent rootPanel = new ApplicationUI(pm);
		Scene scene = new Scene(rootPanel);
		
		WindowName.bind(pm.WindowName);
		
		primaryStage.setTitle(WindowName.getValue());
		primaryStage.setScene(scene);
		
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.centerOnScreen();
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
} 
