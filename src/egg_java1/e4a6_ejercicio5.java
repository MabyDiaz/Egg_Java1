/* 5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
*/
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class e4a6_ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       
        
        System.out.println("Ingrese un número límite");
        int num = leer.nextInt();
        int suma = 0;   
        
        do {
            System.out.println("Ingrese un número");
            int num1 = leer.nextInt();
            
            suma = suma + num1;
            
        } while (suma <= num);
                    
        
    }
    
}
