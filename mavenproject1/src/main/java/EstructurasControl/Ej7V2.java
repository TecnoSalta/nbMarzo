

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
public class Ej7V2 {

    public static void main(String[] args) {
        String frase;
        String prueba = 
        "XO\n"
      + "X123O\n"
      + "X123O\n"
      + "X12O\n"       
      + "ERROR\n"
      + "OTROERROR\n"
      + "&&&&&\n";
        //Deberia dar al final ::F:F:FF:F:F
        //CAMBIAR POR SYSTEM.in 
        boolean esCorrecto=true;
        boolean encontroFDE=false;
        int cantidadErrores=0;
        int cantidadCorrectas=0;
        Scanner sc = new Scanner(prueba);
        while(!encontroFDE){
            esCorrecto=true;
            System.out.println("Ingrese la frase");
            frase= sc.next();
            if (frase.equals("&&&&&")) {
                System.out.println("FDE");
                esCorrecto=false;
                encontroFDE=true;
            }
            if(esCorrecto && (frase.length()<2 || frase.length()>5) ){
                System.out.println("No tiene largo correcto " +frase);
                esCorrecto=false;
            }
            if (esCorrecto && (!frase.substring(0,1).equals("X")) ) {
                System.out.println("No empieza con X " +frase);
                esCorrecto=false;
            }
             if (esCorrecto && (!frase.substring(frase.length()-1,frase.length()).equals("O")) ) {
                System.out.println("No termina con O " +frase);
                esCorrecto=false;
            }
            if (esCorrecto) {
                 cantidadCorrectas=cantidadCorrectas+1;    
            }else{
                if(!encontroFDE){
                    cantidadErrores=cantidadErrores+1;
                }
                
            }
            
            
       }
        System.out.println("Cantidad Correctas: " + cantidadCorrectas);
        
        System.out.println("Cantidad Errores: " + cantidadErrores);
    }
}