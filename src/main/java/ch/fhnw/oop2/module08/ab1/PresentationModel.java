package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	public StringProperty button;
	public StringProperty WindowName;
	
	public PresentationModel() {
		initializeProperties();
		
	}
	private void initializeProperties() {
		button = new SimpleStringProperty();
		WindowName = new SimpleStringProperty();
		button.set("Hello World!");
		WindowName.set("JavaFX Application");
	}

}
