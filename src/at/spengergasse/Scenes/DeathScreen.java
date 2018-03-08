package at.spengergasse.Scenes;


import at.spengergasse.Controls.*;
import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DeathScreen extends Application {
	static double W=800;
	static double H=800;
	static Group root ;
	static Scene scene;
	public  Image picture ;
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("SpaceJump");
		root = new Group();
		scene = new Scene(root, W, H, Color.WHITE);
		Image icon=new Image("/img/playerSkins/icon.png");
		primaryStage.getIcons().addAll(icon);
		Image picture= new Image("/img/ba/DeathScreen.png");
		Node Background = new ImageView(picture);
		root.getChildren().add(Background);
		Controls.stopStage(KeyCode.ENTER,primaryStage,scene);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
