/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pelicula2.Modelo;

public interface InterfaceCatalogoPelic {
    
    void insertarPelicula(Peliculas nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
}//ahora, en paquete Modelo creamos nueva clase "implementacionCatalogoPeliculas"
