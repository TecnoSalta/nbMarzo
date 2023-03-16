

package EstructurasControl;
import java.util.Scanner;

/**
 *
 * @author David Mendez
Escriba un programa en el cual se ingrese un valor límite positivo,
* y a continuación solicite números al usuario hasta que la suma 
* de los números introducidos supere el límite inicial.


 */
public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese límite: "  );

        int limite = sc.nextInt();
        int suma=0;
        while(suma<limite){
        System.out.println("Ingrese número a sumar: "  );

        int sumando = sc.nextInt();
        suma=suma+sumando;
        }
        System.out.println("La suma de lo ingresado dió: " + suma);
    }
}