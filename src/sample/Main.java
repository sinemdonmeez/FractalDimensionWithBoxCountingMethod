package sample;

import Action.Action;
import Picture.Picture;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("KUTU SAYMA YÖNTEMİ İLE FRAKTAL BOYUT HESAPLAMA");
        primaryStage.setScene(new Scene(root, 640, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);


    }
}
