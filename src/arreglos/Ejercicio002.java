

package arreglos;

import java.util.Scanner;

/**
 *
 * @author luudwin
 */
public class Ejercicio002 {

    
    public static void main(String[] args) {
        /* declaramos los arreglos y definimos el tamaño de las mismas,
           ademas declaramos las variables y inicializamos en cero;
        */ 
        int[] num = new int[10];
        int[] resultado = new int[10];
        int contador = 0;
        int cuentaArray = 0;
        int prim = 0;
        int prueba = 0;
    
    System.out.println("Ingrese  10 números");
    /*primeramente pediremos al usuario ingresar los numeros por teclado
      y lo guardamos con el metodo Scanner
    */
    Scanner entrada =new Scanner(System.in);
    // empleando estructuras condicionales definimos las instrucciones a seguir
    for (int i = 0; i < 10; i++) {
      num[i] = entrada.nextInt();
    }
    
    System.out.println("Índice\tValor");
    //mostramos el array
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "\t" + num[i]);
    }
    
    //comprovaremos  cuales son primos y los posicionamos primero
    for (int i = 0; i < 10; i++) {
      do {
        prim++;
        prueba = num[i] % prim;
        
        if (prueba == 0) {
          contador++;
        } else {
         
        }
      } while (prim != num[i]); 
      
        if (contador == 2) {
          resultado[cuentaArray] = num[i];
          cuentaArray++;
        } else {
        
        }
      
      contador = 0;
      prim = 0;
    }
    
    //una vezomprobado formaremos un array con los numeros que quedan( no primos)
    for (int i = 0; i < 10; i++) {
      do {
        prim++;
        prueba = num[i] % prim;
        
        if (prueba == 0) {
          contador++;
        } 
        else {}
      } while (prim != num[i]);  
      
        if (contador != 2) {
        resultado[cuentaArray] = num[i];
        cuentaArray++;
        } 
        else {}
      
      contador = 0;
      prim = 0;
    }
        System.out.println("\nArreglo resultante");
    //muestra el arreglo  resultante en pantalla
    System.out.println("Índice\tValor");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "\t" + resultado[i]);
    }
    }
    
}
