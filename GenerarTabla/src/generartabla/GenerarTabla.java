/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generartabla;

/**
 *
 * @author GERMAN
 */
import java.util.Scanner;
public class GenerarTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
         int n= leer.nextInt();
         
         int c= 0;
         
         while(c <= 10){
             System.out.printf("%d x %d= %d \n", n,c,(n*c));
             c++;
    }
    }
    
}
