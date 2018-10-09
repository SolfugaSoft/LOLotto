package Controller;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
	@FXML
	private Button buildButtion;
	public void buildClick() {
		String adresURI = "https://www.mobafire.com/league-of-legends/" + championName.getText()+ "-guide";
		try {
			Desktop.getDesktop().browse(new URI(adresURI));
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (URISyntaxException e) {
			
			e.printStackTrace();
		}
		


	}
	

}