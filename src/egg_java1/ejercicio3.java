/* 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        
        frase = input.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
