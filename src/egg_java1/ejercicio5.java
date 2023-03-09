/* 5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt(). 
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
                
        System.out.println("Ingrese un múmero");
        
        num = input.nextInt();
        
        System.out.println("El doble de " + num + " es: " + 2 * num);
        System.out.println("El triple de " + num + " es: " + 3 * num);
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
    
}
