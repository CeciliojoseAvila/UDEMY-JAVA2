
package pelicula2.UI;

import pelicula2.Modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    
    public static void interfazUsuario(){
    
       InterfaceCatalogoPelic peliculas = new ImplementacionCatalogoPelic();
       Peliculas pelicula;
       
       CERRAR:
       while (true) {           
           
           String opcion = JOptionPane.showInputDialog(null,
                   "1 - Insertar Pelicula\n"
                  +"2 - Listar Pelicula\n"
                  +"3 - Buscar Pelicula\n"
                  + "4 - Salir", "Ingrese una opcion", 3 );
           //CONVIERTO EL STRING A ENTERO:
           int opcionInt = 0; //el try solo para la conversion a entero
           
           try {
                opcionInt = Integer.parseInt(opcion);
           } catch (NumberFormatException e) {
               //e.printStackTrace(System.out);
               JOptionPane.showMessageDialog(
                       null, "LAS OPCIONES DEBEN SER NUMEROS ENTEROS \n"
                       + e, "ERROR", JOptionPane.ERROR_MESSAGE );
           }catch(Exception e){
               JOptionPane.showMessageDialog(
               null, e, "ERROR", JOptionPane.ERROR_MESSAGE );
           }
          
           
           switch (opcionInt) {
               case 1:
                   String nombrePelicula = JOptionPane.showInputDialog(
                   null, "INGRESE EL NOMBRE DE LA PELICULA",
                           "ENTRADA", 3 );
                   pelicula = new Peliculas(nombrePelicula);
                   peliculas.insertarPelicula(pelicula);
                   break;
                   
                case 2:
                   peliculas.listarPelicula();
                   break;
        
                case 3:
                    nombrePelicula = JOptionPane.showInputDialog(
                            null, "INGRESE EL NOMBRE DE LA PELICULA",
                            "INGRESE", 3 );
                    peliculas.buscarPelicula(nombrePelicula);
                   break;
                   
                case 4:   
                    break CERRAR; 
                    
               default:
                   JOptionPane.showMessageDialog(
                   null, 
                               "OPCION INCORRECTA\n"
                               +"VUELVE A INGRESAR UNA \n"
                               + "OPCION CORRECTA \n"
                               +"LAS OPCIONES SON DE 1 A 4",
                               "ERROR", JOptionPane.ERROR_MESSAGE);
           }//para ejecutarlo, vamos a la clase Main  de PELICULAS Y lo instanciamos
           
       }
    }
}
