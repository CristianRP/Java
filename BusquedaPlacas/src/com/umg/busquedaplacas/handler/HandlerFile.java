/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.busquedaplacas.handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class HandlerFile {

    private HandlerFile() {
    }

    public static HandlerFile getInstance() {
        return ReadFileUtilHolder.INSTANCE;
    }

    private static class ReadFileUtilHolder {

        private static final HandlerFile INSTANCE = new HandlerFile();
    }

    public static ArrayList<String> placas = new ArrayList<>();

    public void readFile(String url) {
        BufferedReader r;
        try {
            File txt = new File(url);
            r = new BufferedReader(new FileReader(txt));
            String s = "", line = null;
            while ((line = r.readLine()) != null) {
                s = line;
                placas.add(s);
            }
            r.close();
        } catch (Exception ex) {
            Logger.getLogger(HandlerFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void printPlacas() {
        for (String s : placas) {
            print(s);
        }
    }

    private void print(String message) {
        System.out.println(message);
    }
    
    public void searchPlaca(String placa) {
        String msg_encontrada = "--Placa %1$s encontrada!";
        String msg_placa_anterior = "Placa anterior: %1$s";
        String msg_placa_posterior = "Placa posterior: %1$s";
        boolean encontrado = false;
        for (int i = 0; i < placas.size(); i++) {
            if (placas.get(i).equals(placa)) {
                encontrado = true;
                print(placas.get(i));
                print(String.format(Locale.getDefault(), msg_encontrada, placas.get(i)));
                if (placas.indexOf(placas.get(i)) == 0) {
                    print("**Este es el primer registro!");
                } else {
                    print(String.format(Locale.getDefault(), msg_placa_anterior, placas.get(i - 1)));
                }
                if (placas.indexOf(placas.get(i)) != placas.size() - 1) {
                    print(String.format(Locale.getDefault(), msg_placa_posterior, placas.get(i + 1)));
                } else {
                    print("**Este es el último registro!");
                }
            } 
        }
        if (!encontrado) {
            print("Esta placa no existe en el registro!");
        }
    }
}
