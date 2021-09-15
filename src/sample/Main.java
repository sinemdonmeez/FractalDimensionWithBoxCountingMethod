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
/*
        Picture foto=new Picture("C:/Users/Sinem Dönmez/OneDrive/Belgeler/GitHub/FractalDimensionWithBoxCountingMethod-/src/sample/b.png");
        Color renk1=new Color(0,0,0);


        Color renk2;
        for(int i=0; i<foto.width();i++ )
            for(int j=0; j<foto.height();j++ ){
                Color renk =foto.get(i, j);
                int b =renk.getBlue();
                int g=renk.getGreen();
                int r=renk.getRed();
                if(r>=200 && g>=200 && b>=200)
                    renk2=new Color(255,255,255);
                else
                    renk2=foto.get(i, j);
                foto.set(i, j, renk2);

            };
        Color renk3;
        for(int i=0; i<foto.width();i++ )
            for(int j=0; j<foto.height();j++ ){
                Color renk =foto.get(i, j);
                int b =renk.getBlue();
                int g=renk.getGreen();
                int r=renk.getRed();
                if(r<=55 && g<=55 && b<=55)
                    renk3=new Color(0,0,0);
                else
                    renk3=foto.get(i, j);
                foto.set(i, j, renk3);
            }
        foto.save("b.png");*/
    }
}
