/* 4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5). 
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int grados;
        
        System.out.println("Ingrese los °C que desea convertir a Farenheit");
        
        grados = input.nextInt();
        
        float F = 32 + (9 * grados / 5);
        
        System.out.println(grados + " °C es equivalente a " + F + " °F");
    }
    
}
