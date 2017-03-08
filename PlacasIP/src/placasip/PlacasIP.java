/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placasip;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import placasip.handler.HandlerFile;

/**
 *
 * @author alumno
 */
public class PlacasIP extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        HandlerFile.getInstance().readFile("placas.txt");
        //HandlerFile.getInstance().printPlacas();
        HandlerFile.getInstance().getParesImpares();
        HandlerFile.getInstance().getPares();
        HandlerFile.getInstance().getImpares();
        HandlerFile.getInstance().makeFilePares();
        HandlerFile.getInstance().makeFileImpares();
    }
    
}
