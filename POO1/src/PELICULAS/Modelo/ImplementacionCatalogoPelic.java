
package PELICULAS.Modelo;
//implementamos de InterfaceCatalogoPelic

import java.util.ArrayList;

public class ImplementacionCatalogoPelic implements InterfaceCatalogoPelic{

    private final ArrayList<String> listaPeliculas;//paso seguido el constructor

    public ImplementacionCatalogoPelic() {//ArrayList<String> listaPeliculas//lo quitè del ()
        this.listaPeliculas = new ArrayList<>();// = listaPeliculas
    }    
    
    @Override
    public void insertarPelicula(Peliculas nombrePelicula) {
       
    }

    @Override
    public void listarPelicula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //con ayuda del IDE Implementamos los Metodos
}
