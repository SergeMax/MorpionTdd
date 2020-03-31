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
        plateau.get(0)[1]=3;
        System.out.println(plateau.toString());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
