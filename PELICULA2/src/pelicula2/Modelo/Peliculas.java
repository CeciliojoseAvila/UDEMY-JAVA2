
package pelicula2.Modelo;

//primero generé el paquete "PELICULAS" Y dentro la clase Main
//despues hice nuevo Paquete PELICULAS.Modelo" y dentro la clase Peliculas

import java.io.Serializable;
import java.util.Objects;
//aqui trabajamos JAVA BEANS
//implements serializable
public class Peliculas implements Serializable{
    //los atributos son privados y debe llevar un constructor vacio
    private String nombre;

    public Peliculas() {
        
    }
    //constructor con sus datos

    public Peliculas(String nombre) {
        this.nombre = nombre;
    }
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //toString e equals and hashCode
    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculas other = (Peliculas) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    //en la clase Main generamos un Array
}
