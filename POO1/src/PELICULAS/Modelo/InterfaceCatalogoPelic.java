
package PELICULAS.Modelo;

public interface InterfaceCatalogoPelic {
    
    void insertarPelicula(Peliculas nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
}//ahora, en paquete Modelo creamos nueva clase "implementacionCatalogoPeliculas"
