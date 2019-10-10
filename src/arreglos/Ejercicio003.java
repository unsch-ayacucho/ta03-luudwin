
 
package arreglos;

import java.util.Scanner;

/**
 *
 * @author luudwin
 */
public class Ejercicio003 {

 
    public static void main(String[] args) {
        // TODO code application logic here
          int[] numero = new int[100];
          
    int minimo = Integer.MAX_VALUE;
   
    int maximo = Integer.MIN_VALUE;
    
    int i;
      
    // El siguiente intruccion condicional permite rellenar con numeros aleatorios
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 501);
      System.out.print(numero[i] + "  ");
    }
    
    System.out.print("\nvalor maximo destacado ");
    Scanner entrada =new Scanner(System.in);
    
    int valor1 = entrada.nextInt();

   
    System.out.println();
    
    for (i = 0; i < 100; i++) {
      if (numero[i] == Integer.MIN_VALUE ) {
        numero[i] = Integer.MIN_VALUE;
        // mostramos el resultado en pantalla
        System.out.print( "**" + numero[i] + "**");
      } else {
        System.out.print( + numero[i] + "  ");
      }
    }

    System.out.println();
    }
    
}
