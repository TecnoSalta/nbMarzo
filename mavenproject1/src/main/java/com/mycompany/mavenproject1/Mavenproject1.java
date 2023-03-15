/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author David Mendez
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese primer sumando");
        a = sc.nextInt();
        
        System.out.println("Ingrese segundo sumando");
        b= sc.nextInt();
        c=a+b;
        System.out.println("Suma: " + c);
       
    }
}
