/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.agenda;

import javax.swing.JFrame;

/**
 *
 * @author cristian
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jFrame = new AgendaView();
        jFrame.setTitle("Agenda UMG");
        jFrame.setVisible(true);
    }
    
}
