package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Model.Plateau;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Plateau plateau = new Plateau();
        System.out.println(plateau.getPlateau().get(0)[0]);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
