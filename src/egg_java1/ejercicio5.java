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
                
        System.out.println("Ingrese un múmero");
        
        int num = input.nextInt();
        
        System.out.println("El doble de " + num + " es: " + 2 * num);
        System.out.println("El triple de " + num + " es: " + 3 * num);
        
        if(num < 0){
            System.out.println("No existen raíces cuadradas para números negativos");
        }else{
            //Usamos String.format para informar solo 2 decimales
            System.out.println("La raíz cuadrada de " + num + " es: " + String.format("%.2f", (Math.sqrt(num))));
        }
       
    }
    
}
