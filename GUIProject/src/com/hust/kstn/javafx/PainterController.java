package com.hust.kstn.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	private Color myColor = Color.BLACK;
	
	@FXML
	private Pane drawingAreaPane;
	
	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
	}
	
	@FXML
	void penButtonPressed(ActionEvent event) {
		myColor = Color.BLACK;
	}
	
	@FXML
	void eraserButtonPressed(ActionEvent event) {
		myColor = Color.WHITE;
	}
	
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		Circle newCircle = new Circle(event.getX(), event.getY(), 4, myColor);
		drawingAreaPane.getChildren().add(newCircle);
	}
	
	@FXML
	void drawingAreaMouseClicked(MouseEvent event) {
		Circle newCircle = new Circle(event.getX(), event.getY(), 4, myColor);
		drawingAreaPane.getChildren().add(newCircle);
	}
}
