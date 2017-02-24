
package factorial;

import java.util.Scanner;
/**
 *
 * @author Joshy
 */
public class bucle_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numero = scan.nextInt();
        int resultado = 1;
        
        while (numero != 0){
            resultado = resultado * numero;
            numero--;
        }
        System.out.println("Su resultado es: " + resultado);
        
    }
    
}
