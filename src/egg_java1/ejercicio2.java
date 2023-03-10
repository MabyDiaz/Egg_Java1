/* 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.println("Ingresa tu nombre");
        
        String nombre = input.next();
        
        System.out.println("Hola " + nombre + " ! ");
    }
    
}
