

package EstructurasControl;
import java.util.Scanner;

/**
 *
 * @author David Mendez
* Crear un programa que dado un número determine si es par o impar.
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Num: "  );

        int num = sc.nextInt();
        if (num % 2 ==0) {
            System.out.println("Es par");
        }else{
                System.out.println("Es impar");
        }
    }
}