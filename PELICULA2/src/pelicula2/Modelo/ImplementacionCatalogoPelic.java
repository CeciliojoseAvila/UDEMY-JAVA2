
package pelicula2.Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementacionCatalogoPelic implements InterfaceCatalogoPelic{

    private final ArrayList<String> listaPeliculas;//paso seguido el constructor

    public ImplementacionCatalogoPelic() {//ArrayList<String> listaPeliculas//lo quitè del ()
        this.listaPeliculas = new ArrayList<>();// = listaPeliculas
    }    //ahora en insertar
    
    @Override
    public void insertarPelicula(Peliculas nombrePelicula) {
       this.listaPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null,this.listaPeliculas,
                "LISTA DE PELICULAS", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
    String resultado = null;
        for (var pelicula : this.listaPeliculas) {
            
            if (pelicula.equals(nombrePelicula)) {
               
                resultado = pelicula;
                break;
            }else{
                resultado = pelicula;
            }           
        }
        if(nombrePelicula.equals(resultado)){
            JOptionPane.showMessageDialog(null, " Resultado -> "+ resultado,
                    "BUSCAR PELICULA", JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    " No se encontro la pelicula -> "+ nombrePelicula,
                    "BUSCAR PELICULA", JOptionPane.WARNING_MESSAGE);
        }//en el paquete PELICULA creamos OTRO paquete "Pelicula.UI"
    }
    //con ayuda del IDE Implementamos los Metodos
}
