package Gra;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import java.io.IOException;

public class StartController {

    @FXML
    private StackPane stackPane;

    public StartController() {

    }

    @FXML
    public void initialize() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("StartScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        stackPane.getChildren().add(pane);
    }
}
