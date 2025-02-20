package application;

import component.layout.Inventory;
import component.layout.Shop;
import component.player.BasePlayer;
import component.player.Maguire;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {

        primaryStage.setTitle("Football Carano");
        Label label = new Label();
		/*// harry maguire test
		Maguire maguire = new Maguire();
		System.out.println(maguire.getHealth());
		// inventory test
		Inventory inventory = new Inventory();
		inventory.add(maguire);
		System.out.println(inventory.toString());
		// shop test
		Shop shop = new Shop();
		shop.generateShop();
		System.out.println(shop.toString());*/
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200); 
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);
        gridPane.add(button3, 2, 3);
        gridPane.add(button4, 3, 3);
        gridPane.add(button5, 4, 3);
        gridPane.add(button6, 5, 3);

        gridPane.getChildren().addAll(label);
        Scene scene = new Scene(gridPane, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
}
