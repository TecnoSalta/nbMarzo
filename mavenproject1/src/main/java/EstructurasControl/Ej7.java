

package EstructurasControl;
import java.util.Scanner;

/**
 *
 * @author David Mendez
Realizar un programa que simule el funcionamiento de un dispositivo RS232,
* este tipo de dispositivo lee cadenas enviadas por el usuario.
* Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo
* de 5 caracteres de largo, el primer carácter tiene 
* que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
* la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
* y toda secuencia distinta de FDE,
* que no respete el formato se considera incorrecta.
Al finalizar el proceso,
* se imprime un informe indicando la cantidad de lecturas correctas
* e incorrectas recibidas. Para resolver el ejercicio deberá investigar
* cómo se utilizan las siguientes funciones
* de Java Substring(), Length(), equals().
IDEA: Iterar mientras cadena sea distinto de :&&&&&
 */
public class Ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase ;
        boolean continuar=true;
        do {
            System.out.println("Ingrese la palabra en el formato solicitado X _ _ _ _ O");
            frase = sc.next();
            String primerLetra = frase.substring(0, 1);
            int longitudFrase = frase.length();
            String ultimaLetra = frase.substring(longitudFrase-1, longitudFrase);
            //NO debe ser el fin
            if (continuar && frase.equals("&&&&&")) {
                System.out.println("FDE");
                continuar=false;
            }
            //Deben ser de un maximo de 5 caracteres
            if (longitudFrase != 5) {
                System.out.println("Incorrecto 5");
                continuar=false;
            }
            if (continuar && !primerLetra.equals("X")) {
                System.out.println("Incorrecto X");
                continuar=false;
                
            }
             if (continuar && !ultimaLetra.equals("O")) {
                System.out.println("Incorrecto O");
                continuar=false;
                
            }
           
            if (continuar) {
                System.out.println("Correcto");
            }
        } while (continuar);
        
       sc.close();
    }
}