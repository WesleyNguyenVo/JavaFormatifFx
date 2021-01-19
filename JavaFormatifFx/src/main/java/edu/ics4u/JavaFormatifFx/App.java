package edu.ics4u.JavaFormatifFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage stage) 
    {
 
        var label = new Label("Discord");
        var text = new TextField("Type here"); 
        var button = new Button("Push to talk"); 
        
        var hbox = new HBox(text, button);   
        var root = new VBox(label, hbox); 
        var scene = new Scene(root, 450, 400); 
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch();
    }

}