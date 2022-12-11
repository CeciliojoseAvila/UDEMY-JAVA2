/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dias;

/**
 *
 * @author GERMAN
 */
import java.util.Scanner;

public class Dias {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de la semana: ");
        int dia = leer.nextInt();
        String nombreDia = null;
        
        switch (dia){
            case 1:
                nombreDia= "Domoingo";
                break;
                 case 2:
                nombreDia= "Lunes";
                break;
                 case 3:
                nombreDia= "Martes";
                break;
                 case 4:
                nombreDia= "Miercoles";
                break;
                 case 5:
                nombreDia= "Jueves";
                break;
                  case 6:
                nombreDia= "Viernes";
                break;
                 case 7:
                nombreDia= "Sabado";
                break;
                 default:
                     System.out.println("Il numero ingresado es incorrecto");
        }
        System.out.println("El dia es: "+ nombreDia);
    }
    
}
