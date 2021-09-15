package sample;

import Picture.Picture;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
import java.util.ResourceBundle;

import Action.Action;


public class Controller  {

    @FXML
    private ImageView myImageview;
    @FXML
    private ListView<?> myListview;

    @FXML
    private URL location;
    @FXML
    private TextField fotoğrafYolu;

    @FXML
    private TextField adımSayısı;


// "C:/Users/Sinem Dönmez/OneDrive/Belgeler/GitHub/FractalDimensionWithBoxCountingMethod-/src/sample/a.png"

    public void displayImage(){


    String fotoYoluString=fotoğrafYolu.getText();

    File file = new File(fotoYoluString);
    Image image = new Image(file.toURI().toString());
    myImageview.setImage(image);
        Picture picture = new Picture(file.toURI().toString());

        ObservableList fractalDim = FXCollections.observableArrayList();
        for(String i: Action.CalculateFractalDimension(Integer.parseInt(adımSayısı.getText()),picture))
            fractalDim.add(i);
        myListview.setItems(fractalDim);



   }


}
