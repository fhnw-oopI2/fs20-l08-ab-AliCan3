package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	public ObjectProperty<String> button;
	public StringProperty WindowName;
	
	public PresentationModel() {
		initializeProperties();
	}
	private void initializeProperties() {
		button = new SimpleObjectProperty<String>();
		WindowName = new SimpleStringProperty();
		button.setValue(State.OFF.toString());
		WindowName.setValue("Toggle Application");
	}
	
	public void toggle() {
		if (button.get().equals(State.ON.toString())) {
			button.set(State.OFF.toString());
		}
		else {
			button.set(State.ON.toString());
		}
		
	}


}
