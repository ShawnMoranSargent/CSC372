package org.openjfx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
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
            String filePath = "log.txt";
            try (FileWriter logger = new FileWriter(filePath)){
                logger.write(LogInput.getText());
            } catch(IOException e){
                System.err.println("Error: " + e.getMessage());
            }
        });
        RandGreen.setOnAction(event -> {
            Random ran= new Random();
            int ranGreen = ran.nextInt(255) + 1;
            baseLayout.setBackground(new Background(new BackgroundFill(Color.rgb(0, ranGreen, 0, 1),null, null)));
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