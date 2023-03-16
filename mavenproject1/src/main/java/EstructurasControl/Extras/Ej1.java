

package EstructurasControl.Extras;
import java.util.Scanner;

/**
 *
 * @author David Mendez
* Dado un tiempo en minutos, 
* calcular su equivalente en días y horas.
* Por ejemplo, si el usuario ingresa 1600 minutos,
* el sistema debe calcular su equivalente: 1 día, 2 horas.
int quotient = dividend / divisor;
int remainder = dividend % divisor;
*/
public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tiempo en Minutos: "  );

        int num = sc.nextInt();
        
        if (num <60) {
            System.out.println(num+ " minutos No alcanzan para hacer al menos una hora");
            return;
        }
        
        // un dia tiene : 60*24 Minutos
        int numDias= num / (60*24);
        num = num % (60*24);
        int numHoras = num /60;
        String fNumDias;
        
        switch (numDias) {
            case 0:
                fNumDias="";
                break;
            case 1:
                fNumDias="1 día, ";
                break;
            default:
                fNumDias= numDias + "días, ";
        }
        
        String fNumHoras;
        switch (numHoras) {
            case 0:
                fNumHoras="";
                break;
            case 1:
                fNumHoras="1 hora ";
                break;
            default:
                fNumHoras= numHoras + " horas. ";
        }
        System.out.println(fNumDias + " " + fNumHoras );
    }
}