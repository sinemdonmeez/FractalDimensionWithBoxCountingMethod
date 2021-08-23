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
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1200, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        //Action.GridMaker(new Picture("C:/Users/Sinem Dönmez/OneDrive/Belgeler/GitHub/FractalDimensionWithBoxCountingMethod-/src/sample/a.png"),8);
        //Action.CalculateFractalDimension(8,new Picture("C:/Users/Sinem Dönmez/OneDrive/Belgeler/GitHub/FractalDimensionWithBoxCountingMethod-/src/sample/a.png"));
    }
}
