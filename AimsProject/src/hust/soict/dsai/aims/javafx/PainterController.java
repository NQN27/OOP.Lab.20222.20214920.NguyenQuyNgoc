package hust.soict.dsai.aims.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton radioButton;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private Button btnClear;
    
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (radioButton.isSelected())
        {
            Circle newCircle = new Circle(event.getX(),event.getY(),4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
         // the following lines of code are for prevent circles go out of the pane
        	Rectangle clipRect = new Rectangle(drawingAreaPane.getWidth(), drawingAreaPane.getHeight());
        	clipRect.heightProperty().bind(drawingAreaPane.heightProperty());
        	clipRect.widthProperty().bind(drawingAreaPane.widthProperty());
        	drawingAreaPane.setClip(clipRect);
        } else
        {
            Circle newCircle = new Circle(event.getX(),event.getY(),10, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);
        }
        
    }
    @FXML
    void clearButtonPressed(ActionEvent event){
        drawingAreaPane.getChildren().clear();
    }
}