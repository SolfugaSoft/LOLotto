package Controller;

import Function.TopRandomizer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {
	
	@FXML
	private Button topButton;
	
	public StackPaneController() {
		System.out.println("Controller TEST");
	}
	
	@FXML
	void initialize(){
		topButton.setText("Running");
		
	}
	
	@FXML
	public void topClick() {
		TopRandomizer.RandomMachine();
	}

}
