

package EstructurasControl;
import java.util.Scanner;

/**
 *
 * @author David Mendez
*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
* *el programa pondrá un mensaje de Correcto,
* *sino mostrará un mensaje de Incorrecto.
* *Nota: investigar la función equals() en Java.
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese frase: "  );

        String frase = sc.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else{
                System.out.println("Incorrecto");
        }
    }
}