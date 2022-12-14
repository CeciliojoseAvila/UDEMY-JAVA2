
package Excepciones;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.io.FileNotFoundException;
//import java.io.FileReader;

/**
 *
 * @author CECILIO
 */
public class ExcepcionVerificada {
    
    public static void main(String[] args) {
        readFile1();
    }
    public static void readFile1() 
    //lanzar una excepcion en el metodo
   // throws FileNotFoundException{
    {
        File file = new File("C://file.txt");// lo manejamos en try catch (bombillo)
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException ex) {
        //Logger.getLogger(ExcepcionVerificada.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("EL ARCHIVO NO SE PUEDE LEER");
            ex.printStackTrace(System.out);
        }
    }
}
