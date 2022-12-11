/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GERMAN
 */
public class Array {
    public static void main(String[] args) {
        
     String nombres [];
     nombres = new String[3];
     
     nombres[0] = "Cecilio";
     nombres[1] = "Jose";
     nombres[2] = "Avila";
     
        System.out.println(nombres[0]);
        nombres[1]="Mario"; //para cambiar datos
        System.out.println(nombres[1]);
        System.out.println(nombres.length);//muestra la longitud del arreglo
       
       int[] array1 = {1,2,3,4,5};
       String[] array2= {"Cecilio","Jose","Avila","Ramos"};
        System.out.println(array1[1]);//devuelve el 2
        
        System.out.println(array2[0]);
        //para llamar todo el arreglo
        String[] nombres2= {"Cecilio ","Jose ","Avila ","Ramos "," Estudiante \n"};
        int i= 0;
        while(i < nombres2.length){
            System.out.print(nombres2[i]);
            i++;
        }
        //ahora lo mismo con for
        String[] nombre= {"Cecilio ","Jose ","Avila ","Ramos "," Estudiante \n"};
        int c=0;
        /*for(int c = 0; c < nombre.length; c++){
            System.out.println(nombre[c]);
        }*/
        //forEtch, hace lo mismo que el for y el while, pero mas corto
        for(String dato : nombre){
            System.out.println(dato);
        }
    }
}
