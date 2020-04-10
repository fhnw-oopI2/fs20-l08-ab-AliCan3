package ch.fhnw.oop2.module08.ab1;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class ApplicationUI extends StackPane{
	
	private Button button;
	private StringProperty buttontext = new SimpleStringProperty();
	
	
	public ApplicationUI(PresentationModel pm) {
		buttontext.bind(pm.button);
		initializeControls();
		layoutControls();
		}
		
	private void initializeControls() {
		button = new Button(buttontext.getValue());
		}
		
	private void layoutControls() {
		getChildren().add(button);	
	
	}
	
	
	
}
