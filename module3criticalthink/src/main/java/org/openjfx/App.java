package org.openjfx;

import java.util.Date;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;
/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("User Interface I");
        Button TimeInfo = new Button("Date and Time");
        Button TextToFile = new Button("Submit log.txt");
        Button RandGreen = new Button("Random Green");
        Button Exit = new Button("Exit Program");

        Text DateTime = new Text();
        TextArea LogInput = new TextArea("Type in me!");

        HBox Menu = new HBox(TimeInfo, TextToFile, RandGreen, Exit);
        Menu.setAlignment(Pos.CENTER);

        BorderPane baseLayout = new BorderPane();
        baseLayout.setPadding(new Insets(5,5,5,5));
        baseLayout.setTop(Menu);
        baseLayout.setCenter(LogInput);
        baseLayout.setBottom(DateTime);

        TimeInfo.setOnAction(event -> {
            Date currDate= new Date();
            DateTime.setText(currDate.toString());
        });
        TextToFile.setOnAction(event -> {
            
        });
        RandGreen.setOnAction(event -> {
            Scene green = new Scene(baseLayout, 400, 100, Color.rgb(0, rand, 0, 1))
        });
        Exit.setOnAction(event -> {
            System.exit(0);
        });
        Scene scene = new Scene(baseLayout, 400,100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}