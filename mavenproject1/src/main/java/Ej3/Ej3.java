/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;


import java.util.Scanner;

/**
 *
 * @author David Mendez
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 */
public class Ej3 {

    public static void main(String[] args) {
       //String frase;
       String frase = "You can eat water too! ";
        frase += new String(Character.toChars(0x1F349));
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese frase");
        frase = sc.nextLine();
        
        frase = frase.toUpperCase();
        System.out.println("Mayusculas: " +frase  );
        
        frase = frase.toLowerCase();
        System.out.println("Minusculas: " +frase  );
        
       
    }
}