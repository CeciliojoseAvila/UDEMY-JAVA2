
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GERMAN
 */
public class DoWhile {
     public static void main(String[] args) {
        // TODO code application logic here
        int c=0;
        do{
        System.out.println("El valor de c es: "+ c);
        c++;        
        }while(c <= 10 ); //si en lugar de esto: c <= 10 coloco true se ejecuta infinitamente
      
    }
}
