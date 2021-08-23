package sample;

import Picture.Picture;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;
import Action.Action;


public class Controller {

    @FXML
    private ImageView imageview0;
    @FXML
    private ImageView imageview01;

    @FXML
    private ImageView imageview02;

    @FXML
    private ImageView imageview03;

    @FXML
    private ImageView imageview04;

    @FXML
    private ImageView imageview05;

    @FXML
    private ImageView imageview06;

    @FXML
    private ImageView imageview07;

    @FXML
    private ImageView imageview08;

    @FXML
    private ImageView imageview09;

    @FXML
    private ImageView imageview010;
    @FXML
    private URL location;
    @FXML
    private TextField fotoğrafYolu;

    @FXML
    private TextField adımSayısı;

    @FXML
    private Button OkButton;
// "C:/Users/Sinem Dönmez/OneDrive/Belgeler/GitHub/FractalDimensionWithBoxCountingMethod-/src/sample/a.png"


public void displayImage(){


    String fotoYoluString=fotoğrafYolu.getText();
    int tekrarSayısı=Integer.parseInt(adımSayısı.getText());
    File file = new File(fotoYoluString);
    Image image = new Image(file.toURI().toString());
    imageview0.setImage(image);
    Action.GridMaker(new Picture(file),tekrarSayısı);
    Action.CalculateFractalDimension(tekrarSayısı, new Picture(file));}

public void hesapla(){
    imageview01.setImage(new Image(getClass().getResourceAsStream("a1.png")));
    imageview02.setImage(new Image(getClass().getResourceAsStream("a2.png")));
    imageview03.setImage(new Image(getClass().getResourceAsStream("a3.png")));

}
}
