/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GERMAN
 */
//para numeros infinitos(TODAS LAS OPERACIONES Y STRING)
public class varArgs {
    public static void main(String[] args) {
        System.out.println(sumar("CECILIO ",5,5,6,6, 12,120));
       System.out.println(sumar(4.5,5.0,3.9,4.7,4.5,4.1));
    }
    static int sumar(String nombre, int ... numeros){
        System.out.print("LA SUMA DE " + nombre + "ES: ");
        int suma = 0;
        for(int num : numeros){
        suma += num;
        }
    return suma;
    }
     static double sumar(double ... numeros){
        double suma = 0;
        for(double num : numeros){
        suma += num;
        }
    return suma;
}
}
