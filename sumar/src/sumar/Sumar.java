/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumar;

/**
 *
 * @author Cecilio
 * Mas: El autor es Cecilio
 */
import java.util.Scanner;

public class Sumar {

    /**
     * @param args the command line arguments
     * Warning: No modifique los param a mennos que sepa lo que va a realizar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        System.out.print("Ingrese numero 01: ");
        var n1 = leer.nextInt();
         
       System.out.print("Ingrese numero 02: ");
       var n2 = leer.nextInt();
       
       var r= n1 + n2;
       
        System.out.printf("La suma %d + %d = %d \n", n1,n2,r);
    }
    
}
