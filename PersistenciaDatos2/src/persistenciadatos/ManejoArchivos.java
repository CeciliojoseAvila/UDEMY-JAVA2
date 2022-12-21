
package persistenciadatos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo) {
        
        File archivo = new File(nombreArchivo);
            
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("SE CREO EL ARCHIVO CORRECTAMENTE");//En el Main ejecutamos e importamos
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo, String contenido) throws IOException {
        
        File archivo = new File(nombreArchivo);
            
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//init era "archivo", esto para que siga añadiendo archivos
            
            salida.println(contenido);//escribir archivos
            salida.close();//crear 
            System.out.println("SE ESCRIBIO EN EL ARCHIVO CORRECTAMENTE");//En el Main ejecutamos e importamos
        
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);
            
        try {
           BufferedReader entrada = new BufferedReader(new FileReader(archivo));
           String lectura = entrada.readLine();
            while (lectura != null) { 
                
                    System.out.println(lectura);
                    lectura = entrada.readLine();
            }
            entrada.close();
           // System.out.println(lectura);//lo ingreso al while y En el Main ejecutamos e importamos
        
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        }
    }
    public static void eliminarArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);
          //  System.out.println(archivo.exists()); //verifica si el archivo existe y devuelve boolena
        archivo.delete();
        System.out.println("SE ELIMINO EL ARCHIVO");
        
        
        
    }
}

