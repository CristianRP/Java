/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.busquedaplacas;

import com.umg.busquedaplacas.handler.HandlerFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author cramirez
 */
public class BusquedaPlacas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jFrame = new MainJFrame();
        jFrame.setVisible(true);
        
        /*HandlerFile.getInstance().readFile("placas.txt");
        //HandlerFile.getInstance().printPlacas();
        HandlerFile.getInstance().searchPlaca("P-62135204");
        HandlerFile.getInstance().searchPlaca("P-21632669");
        HandlerFile.getInstance().searchPlaca("P-94621670");

        System.out.println("Ingresa una placa:");
        Scanner scann = new Scanner(System.in);
        String placa = scann.next();
        HandlerFile.getInstance().searchPlaca(placa);*/
    }
    
    
}
