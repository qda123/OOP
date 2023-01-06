package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class PainterController {
	javafx.scene.paint.Color color;

    private Pane drawingAreaPane;

    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
    
    private ToggleGroup identical;
 
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 8);
    	newCircle.setFill(color);
    	drawingAreaPane.getChildren().add(newCircle);
    }

    void eraser(ActiveEvent event) {
    	color =  javafx.scene.paint.Color.WHITE;
    }

    void pen(ActiveEvent event) {
    	color = javafx.scene.paint.Color.BLACK;
    }
}
