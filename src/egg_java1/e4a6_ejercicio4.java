/* 4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
*/
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class e4a6_ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String letra;
        System.out.println("Ingrese una frase ó palabra");
        String frase = leer.nextLine();
        
        frase = frase.toUpperCase();
        
        letra = frase.substring(0,1);
        
        /*System.out.println(letra);*/
        
        if (letra.equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
