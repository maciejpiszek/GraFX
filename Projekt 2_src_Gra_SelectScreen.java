package Gra;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class SelectScreen {

    @FXML
    private static Stage thirdStage;

    @FXML
    public void startGame() throws IOException {


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Game.fxml"));
        Scene scena = new Scene(loader.load(), 480, 580);
        thirdStage = new Stage();
        thirdStage.setTitle("SLAVES");
        thirdStage.setScene(scena);
        thirdStage.show();

        thirdStage.setResizable(false); // zdjęcia się nie rozciągają (bez zdjęć jest ok)

        StartScreen.close();
    }
}
