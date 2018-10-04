package Gra;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;


import java.io.IOException;

public class SelectScreenController {


    public StackPane stackPane;

    @FXML
    private Label press = new Label();

    @FXML
    public void initialize() {

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.45), evt -> press.setVisible(false)),
                new KeyFrame(Duration.seconds(0.15), evt -> press.setVisible(true)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SelectScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        stackPane.getChildren().add(pane);
    }
}