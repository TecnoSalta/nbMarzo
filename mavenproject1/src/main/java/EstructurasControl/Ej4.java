

package EstructurasControl;
import java.util.Scanner;

/**
 *
 * @author David Mendez
Escriba un programa que pida una frase o palabra y valide
* si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
* se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
* en caso contrario, se deberá imprimir “INCORRECTO”. 
* Nota: investigar la función Substring y equals() de Java.
* Nota2: si comienza con a me parece q es incorrecto.

 */
public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese frase: "  );

        String frase = sc.nextLine();
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}