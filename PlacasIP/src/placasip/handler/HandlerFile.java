/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placasip.handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
    
    ArrayList<String> placas = new ArrayList<>();
    ArrayList<String> placasPar = new ArrayList<>();
    ArrayList<String> placasImpar = new ArrayList<>();
    
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
            System.out.println(s);
        }
    }
    
    public void getParesImpares() {
        for (String s : placas) {
            System.out.println("valor -> " + s);
            System.out.println("patito -> " + s.charAt(s.length()-1));
            if (s.charAt(s.length()-1) % 2 == 0) {
                System.out.println("patito par -> " + s.charAt(s.length()-1));
                System.out.println("patito valor -> " + s);
                placasPar.add(s);
            } else {
                print("patito impar -> " + s.charAt(s.length()-1));
                print("patito valor -> " + s);
                placasImpar.add(s);
            }
        }
    }
   
    public void getPares() {
        for (String s : placasPar) {
            print(s);
        }
    }
    
    public void getImpares() {
        for (String s : placasImpar) {
            print(s);
        }
    }
    
    public void makeFilePares() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("pares.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : placasPar) {
                bufferedWriter.write(s + "\n");
            }
            print("Archivo de pares creado!!");
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(HandlerFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    public void makeFileImpares() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("impares.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : placasImpar) {
                bufferedWriter.write(s + "\n");
            }
            print("Archivo de impares creado!!");
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(HandlerFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    private void print(String message) {
        System.out.println(message);
    }
}
