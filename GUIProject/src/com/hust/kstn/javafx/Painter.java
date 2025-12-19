package com.hust.kstn.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		var url = getClass().getResource("/com/hust/kstn/javafx/Painter.fxml");
	    System.out.println("FXML URL = " + url);
		Parent root = FXMLLoader.load(url);
		Scene scene = new Scene(root);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
