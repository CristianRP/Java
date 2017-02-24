package com.umg.numeroperfecto;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NumeroPerfectoController {
    @FXML private TextField numero;
    @FXML private Label lblDivisores;
    @FXML private Label lblResultado;

    @FXML protected void handleCalcularButtonAction() {
        if (isNumeric(numero.getText())) {
            calcularPerfecto(Integer.parseInt(numero.getText()));
        } else {
            lblResultado.setText("No es un número!");
        }
    }

    private void calcularPerfecto(int numero) {
        int count = 0;
        String divisores = "";
        for (int i = 1; i < numero; i ++) {
            if ((numero % i) == 0) {
                count += i;
                divisores += " " + i;
                lblDivisores.setText(divisores);
            }
        }
        if (count == numero) {
            lblResultado.setText("Es un número perfecto " + count);
        } else {
            lblResultado.setText("No es perfecto!");
        }
    }

    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

}
