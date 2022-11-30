package com.example.my_dictonary;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;




public class MyDictonary extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(CreateContent());
        stage.setTitle("My Dictonary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    Pane CreateContent() {
        Pane root = new Pane();
        root.setPrefSize(300,300);

        TextField wordTextField = new TextField();
        wordTextField.setPromptText("Please enter a word");
        wordTextField.setTranslateX(5);
        wordTextField.setTranslateY(10);

        Label meaningLabel = new Label("I am the meaning");
        meaningLabel.setTranslateY(40);
        meaningLabel.setTranslateX(10);

        Button searchButton = new Button("Search");
        searchButton.setTranslateY(10);
        searchButton.setTranslateX(200);
        DictonaryUsingHashmap dictonaryUsingHashmap = new DictonaryUsingHashmap();

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String word = wordTextField.getText();
                if(word.isBlank())
                {
                    meaningLabel.setText("Please enter a word");
                    meaningLabel.setTextFill(Color.RED);
                }
                else{
                    meaningLabel.setText(dictonaryUsingHashmap.FindMeaning(word));
                    meaningLabel.setTextFill(Color.BLACK);

                }
            }
        });


        root.getChildren().addAll(meaningLabel,searchButton,wordTextField);








        return root;

    }
}