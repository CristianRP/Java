package com.umg.numeroperfecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumeroPerfecto extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("numero_perfecto_view.fxml"));
        primaryStage.setTitle("Número Perfecto");
        primaryStage.setScene(new Scene(root, 370, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        //matriz();
    }

    private static void matriz() {
        char[][] espiral = {{'a', 'b', 'c', 'd'}, {'f', 'g', 'h', 'i'},
                            {'j', 'l', 'm', 'n'}, {'p', 'e', 'j', 'o'},
                            {'r', 't', 'u', 'v'}};

        for (int f = 0; f < espiral.length; f++) {
            for (int c = 0; c < espiral[f].length; c++) {
                System.out.print(espiral[f][c]);
            }
        }
    }
}
