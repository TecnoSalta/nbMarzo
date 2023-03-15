/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author David Mendez
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ej4 {

    public static void main(String[] args) {
      int gradosF;
      int gradosC  ;
      Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese los C: "  );

        gradosC = sc.nextInt();
        gradosF = 32 + (9 * gradosC / 5);
        
  
        System.out.println("(30 °"+gradosC+" × 9/5) + 32 = "+gradosF+" °F ");
     

       
    }
}