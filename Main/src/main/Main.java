/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author GERMAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.util.Scanner leer = new java.util.Scanner(System.in);
       
        System.out.println("Ingrese su nombre:  ");
     String nombre= leer.nextLine();
     
        System.out.println("Ingrese su edad:  ");
        int edad= leer.nextInt();
        
        System.out.println("Nombre:  " + nombre +" su edad es: ");
        System.out.println(edad  );
    }
    
}
