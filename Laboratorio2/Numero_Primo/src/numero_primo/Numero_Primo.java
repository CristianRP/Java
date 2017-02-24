
package numero_primo;

import java.util.Scanner;
/**
 *
 * @author Joshy
 */
public class Numero_Primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = scan.nextInt();
        int cuenta = 0;
        int i;
        
        for (i = 1; i <(numero+1); i++){
            if ((numero % i) == 0){
                cuenta += 1;
            }
        }
        if (cuenta == 2){
            System.out.println("El número es primo");
        }
        else{
            System.out.println("El número no es primo");
        }
        
        
    }
    
}
