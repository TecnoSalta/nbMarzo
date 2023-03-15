/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author David Mendez
 * Escribir un programa que lea un número entero por teclado 
 * y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

 */
public class Ej5 {
      public static void main(String[] args) {
          int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el número: "  );
    numero = sc.nextInt();

    System.out.println("Doble: "  + (numero *2) );
    System.out.println("Triple: "  + (numero *3) );
    System.out.println("Raíz: "  + Math.sqrt(numero) );
       
    }
}
