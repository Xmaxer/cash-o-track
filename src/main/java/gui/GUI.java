package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(new VBox(), 100, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void startGUI(String[] args)
	{
		launch(args);
	}
}
