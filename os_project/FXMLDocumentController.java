/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.effect.BoxBlur;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView imageview;
    private Image image;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        Image image = new Image(OS_Project.class.getResourceAsStream("west_car.jpg"));
        imageview.setImage(image);        
        
        Timeline timeline = new Timeline();

        timeline.getKeyFrames().addAll(
            new KeyFrame(new Duration(1200),
            new KeyValue(imageview.translateXProperty(), 100),
            new KeyValue(imageview.translateYProperty(), 89))
            ,
            new KeyFrame(new Duration(4200),
            new KeyValue(imageview.translateXProperty(), 440),
            new KeyValue(imageview.translateYProperty(), 89))
            ,
            new KeyFrame(new Duration(5400),
            new KeyValue(imageview.translateXProperty(), 540),
            new KeyValue(imageview.translateYProperty(), 0))
        );
        timeline.play();
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
