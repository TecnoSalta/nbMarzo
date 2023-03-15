package newpackage;


import java.util.Scanner;

/**
 *
 * @author David Mendez
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
public class Mavenproject2 {

    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese nombre: ");
        nombre = sc.next();
        
        System.out.println("Tu nombre es:  " + nombre);
        
       
    }
}
