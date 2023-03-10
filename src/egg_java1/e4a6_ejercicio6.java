/* 6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package egg_java1;

import java.util.Scanner;

/**
 *
 * @author Maby
 */
public class e4a6_ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new  Scanner(System.in);
                       
        boolean log;
        log = false;
               
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
        do {
            System.out.println("Por favor, elija una opción");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            
            int opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de ambos números es: " + suma);
                    break;
                    
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta entre el primer número y el segundo número es: " + resta);
                    break;
                    
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicación entre ambos números es: " + multi);
                    break;
                    
                case 4:
                    int divi = num1 / num2;
                    System.out.println("La división entre el primer número y el segundo número es: " + divi);   
                    break;
                    
                case 5:
                    System.out.println("Está seguro que desea salir?");
                    System.out.println("S para Sí ó N para No");
                    String rta = leer.next();
                    
                    log = rta.equalsIgnoreCase("S");      
                
            }          
                    
        } while(log != true);
        
    }
    
}
