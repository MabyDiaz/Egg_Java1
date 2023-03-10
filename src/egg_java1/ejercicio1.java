/* 1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
              
       System.out.println("Ingrese el primer número");
        
       int num1 = input.nextInt();
        
       System.out.println("Ingrese el segundo número");
        
       int num2 = input.nextInt();
       
       int suma = num1 + num2;
       
       System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es: " + suma);
        
        
    }
    
}
