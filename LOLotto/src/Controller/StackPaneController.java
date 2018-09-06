package Controller;

import java.io.IOException;

import Function.TopRandomizer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class StackPaneController {

	

	public StackPaneController() {
		System.out.println("Controller TEST");
	}

	@FXML
	void initialize() {
		
		
	}

	
	@FXML
	private Text championName;
	private Button topButton;
	public void topClick() {
		championName.setText(TopRandomizer.RandomMachine());
	
	}

}
