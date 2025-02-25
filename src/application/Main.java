package application;

import component.layout.Inventory;
import component.layout.Shop;
import component.player.BasePlayer;
import component.player.Maguire;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("src/application/SceneBuilder.fxml"));

			primaryStage.setTitle("Football Carano");
        	primaryStage.setScene(new Scene (root));
        	primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}