package sample;

import javafx.application.Application;

import javafx.stage.Stage;
import sample.Model.Plateau;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Plateau plateau = new Plateau();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
