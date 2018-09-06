package Controller;

import Function.LineRandomizer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
		championName.setText(LineRandomizer.RandomMachine());
	
	}
	
	@FXML
	private Button midButton;
	public void midClick() {
		championName.setText(LineRandomizer.MidRandomMachine());
	}
	@FXML
	private Button jungleButton;
	public void jungleClick() {
		championName.setText(LineRandomizer.JungleRandomMachine());
	}
	@FXML
	private Button adcButton;
	public void adcClick() {
		championName.setText(LineRandomizer.AdcRandomMachine());
	}
	@FXML
	private Button supportButton;
	public void supportClick() {
		championName.setText(LineRandomizer.SupportRandomMachine());
	}

}