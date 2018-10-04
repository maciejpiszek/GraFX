package Gra;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class StartScreen {


    @FXML
    private static Stage secondStage;

    @FXML
    public void startGame() throws IOException {


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MainScreenSecond.fxml"));
        Scene scena = new Scene(loader.load(), 480, 540);
        secondStage = new Stage();
        secondStage.setTitle("SLAVES");
        secondStage.setScene(scena);
        secondStage.show();
        Main.close();
    }

    @FXML
    public static void close() {

        secondStage.close();
    }
}

