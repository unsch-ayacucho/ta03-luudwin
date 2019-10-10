
package arreglos;

import java.util.Scanner;

/**
 *
 * @author luudwin
 */
public class Ejercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numero = new int[100];
    int i;
    /*utilizamos una secuencia de colores y declaramos como variables, el 
    cual nos permitira pintar de ,color los numeros modificados
    */
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    /* la siguien Instruccion de control para Rellenar el array con números 
      aleatorios */
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + "  ");
    }
    // pediremos al usuario ingresar por teclado el numero mostrado 
    System.out.print("\nEScriba un numero mostrado: ");
    // para almacenar el valor ingresado utilizamos Scannaer
    Scanner entrada =new Scanner(System.in);
        int numero1 = entrada.nextInt();
    // Utilizando 
    System.out.print("Escriba  el valor para sustituirlo: ");
    int numero2 = entrada.nextInt();
    
    
    System.out.println();
    
    /* instruccion de cotrol que nos permitira reemplazar con el nuevo valor
    ingresado tambien por teclado
    */
    for (i = 0; i < 100; i++) {
      if (numero[i] == numero1) {
        numero[i] = numero2;
        System.out.print(verde + "\"" + numero[i] + "\"  ");
      } else {
        System.out.print(blanco + numero[i] + "  ");
      }
    }

    System.out.println();
    }
    
}
