package Excepciones;

import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author CECILIO
 */
public class TestExcepciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean continuarEjecucion = true;

        do {
            try {
                System.out.println("Ingrese N1: ");
                int n1 = leer.nextInt();

                System.out.println("Ingrese N2: ");
                int n2 = leer.nextInt();

                //int resultado = n1 / n2;   
                int resultado = dividir(n1, n2);
                System.out.println("Resultado -> "+resultado);
                
                continuarEjecucion = false;
                
            } catch (InputMismatchException e) {// importamos con la ayuda del IDE (BOMBILLO)Y PODEMOS USAR MULTIPLES EXCEPCIONES
                //capturar errores e imprimir la excepcion
                System.err.println("OCURRIO UN ERROR: INGRESE SOLO NUMEROS ENTEROS");
               // e.printStackTrace(System.out);//ejecutamos y el error que nos muestra lo pegamos en la excepcion e
                leer.nextLine();//esto para que no se vuelva ciclo infinito
                
            } catch (OperadorExcepcion e) {
                System.err.println("Error: " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace(System.out);//al final de la excepcion debe ir una instruccion
            
            } finally {
                System.out.println("SE REVISO LA OPERACION");
            }
            //el programa presentarà problemas si se ingresa un booleano
            //para el manejo de excepciones debemos crear un try - catch al inicio y todo 
            // el codigo dentro del try

        } while (continuarEjecucion);

    }
    //nueva excepcion
    static int dividir(int n, int d) {
        if (d == 0) {
            throw new OperadorExcepcion("DIVISION ENTRE CERO");//en el bombillo "add throw"
        }
        return n / d; // en linea 26 modificamos el "int resultado = n1 / n2;"
    }
}
