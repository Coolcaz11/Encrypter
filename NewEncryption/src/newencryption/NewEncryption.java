/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newencryption;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author hbhaa
 */
public class NewEncryption extends Application {
    private static Stage stg;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
    
    stg = primaryStage;
    FXMLLoader loader = new FXMLLoader(getClass().getResource("EncryptLU.fxml"));
    Parent root = loader.load();
    Button lg = new Button();
        ComboBox S1 = new ComboBox();
        Button gb = new Button();
        ComboBox msb = new ComboBox();
        TextField inb = new TextField();
        TextArea outb = new TextArea();
       primaryStage.setTitle("Encrypter");
       primaryStage.setScene(new Scene(root, 640, 480));
       primaryStage.show();
    }
    public void changeScene(String fxml) throws IOException{
        Parent pane;
        pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.setScene(new Scene(pane, 1280, 800));
    } 

    /**
     * @param args the command line argumentsN
     */
    public static void main(String[] args) {
//        EncryptionSystem encSys = new EncryptionSystem();
        launch(args);
    }
    
}
