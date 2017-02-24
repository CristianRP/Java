
package factorial;

import java.util.Scanner;
/**
 *
 * @author Joshy
 */
public class bucle_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scan.nextInt();
        int resultado = 1;
        
        for(int i = resultado; i <= numero; i++){
           resultado = resultado * i;
        } 
        
        System.out.println("Su resultado es " + resultado);
        
        
        
  
    }
    
}
