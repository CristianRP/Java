package ejerciciolistasfx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Cristian Ramírez
 */
public class EjercicioListasFX extends Application {
    
    ArrayList<String> fila = new ArrayList<>();
    Random random = new Random();
    Text lista = new Text();
    Text count = new Text();
    
    @Override
    public void start(Stage primaryStage) {
       
        Button btnAgregar = new Button();
        btnAgregar.setText("Agregar");
        btnAgregar.setOnAction((ActionEvent event) -> {
            agregar();
        });
        
        Button btnEliminar = new Button();
        btnEliminar.setText("Eliminar");
        btnEliminar.setOnAction((ActionEvent event) -> {
            eliminar();
        });
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text titulo = new Text("Ejercicio de posiciones");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0, 0, 2, 1);
        
        lista.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(lista, 0, 1, 2, 1); 
        
        count.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(count, 0, 2, 3, 1);
        
        GridPane gridButtons = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(gridButtons, 1, 4);
        
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        hbox.getChildren().add(btnAgregar);
        gridButtons.add(hbox, 1, 4);
        
        HBox hboxEliminar = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(btnEliminar);
        grid.add(hboxEliminar, 0, 2);
        
        setStage(primaryStage, grid);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void setStage(Stage primaryStage, Parent parent) {
        Scene scene = new Scene(parent, 1000, 400);
        primaryStage.setTitle("Ejercicio Listas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void agregar() {
        fila.add("Turno " + (int)(random.nextDouble() * 10 + 0));
        lista.setText(fila.toString());
        count.setText("Posiciones: " + fila.size());
    }
    
    private void eliminar() {
        fila.remove(0);
        lista.setText(fila.toString());
        count.setText("Posiciones: " + fila.size());
    }
}
