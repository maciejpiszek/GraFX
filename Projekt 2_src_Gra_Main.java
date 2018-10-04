package Gra;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private static Stage primaryStage;

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MainScreen.fxml"));
        StackPane pane = loader.load();
        Scene scena = new Scene(pane, 400, 300);
        primaryStage.setTitle("SLAVES");
        primaryStage.setScene(scena);
        primaryStage.show();
    }

    @FXML
    public static void close() {

        primaryStage.close();
    }
}
