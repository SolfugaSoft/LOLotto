package LOLottoWindow;
import Controller.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MyFrame extends Application {
	public static void main(String[]args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/LoLottoXML/StackPanelWindow.fxml/"));
		StackPane randomizerWindow = loader.load();
		
		StackPaneController controller = loader.getController();
		
		Scene scene = new Scene (randomizerWindow);
		
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("LoLotto is the best Champions Randomizer");
		primaryStage .show();
		
	}
	
	

}
