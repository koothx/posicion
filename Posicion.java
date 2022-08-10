package Homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Posicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] arrNumeros = new int[5000];
    int posicion;
    
    // llenar el array hasta 5000
    for(int i = 0; i < 5000 ; i++) {
      arrNumeros[i] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
    }
    
    // loop para seguir
    String seguir = "si";
    while  (seguir.equals("si")) {
      // pedir posicion
      System.out.print("Ingrese posicion:  ");
      posicion = Integer.parseInt(leer.nextLine());
      while ( posicion < 1 || posicion > 5000 ) {
        System.out.println("ERROR, la posicion debe ser entre 1 y 5000");
        System.out.print("Ingrese posicion:  ");
        posicion = Integer.parseInt(leer.nextLine());
      }
      
      // imprimir numero de la posicion
      System.out.println("El numero de posicion " + posicion + " es:  " + arrNumeros[posicion - 1]);
      
      System.out.println("¿Quiere intentarlo de nuevo?");
      seguir = leer.nextLine();
    }
    
    System.out.println("Take care, Thanks");
    leer.close();
  
  }
}
