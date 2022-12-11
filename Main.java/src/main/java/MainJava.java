/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java;

/**
 *
 * @author GERMAN
 */
import java.util.Scanner;
public class MainJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre= leer.nextLine();
        
        System.out.println("Ingrese su Edad: ");
        int edad= leer.nextInt();
        
        System.out.println("Ingrese un caracter");
        char C= leer.next().charAt(0);
        
         System.out.printf("Nombre: %s Edad: %d \n, ", nombre, edad);
       
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Caracter: "+ C);
        //para sacar el slash contraio: \ alt+92, \t= espacio tabulado 
        System.out.println("\\");
    }
    
}
