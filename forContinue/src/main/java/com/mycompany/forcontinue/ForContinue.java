/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.forcontinue;

/**
 *
 * @author GERMAN
 */
public class ForContinue {
    public static void main(String[] args) {
        
       for(int i= 0; i<=10; i++){                     
           System.out.println("El valor de i: "+ i);             
           if(i==5){
               System.out.println("saltar a la sgte ejecucion");
               //break
               continue;
           }
           System.out.println("NO ME EJECUTARÉ EN 5");
    }
}
}