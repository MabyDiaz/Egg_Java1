/* Crear un programa que dado un número determine si es par o impar.
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class e4a6_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Ingrese un número");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
        
        
        
    }
    
}
