
package clases.encapsulamiento;
//en el package clases hice new package y dentro new clase java "persona" 
//para ver el encapsulamiento
public class persona {
    private String nombre;
    private int edad;
    private boolean eliminado;
    // creamos el constructor (insertar code)

    public persona(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
        
    }
    //ahora los getter y setter (insertar code)
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    //ahora en el package del source principal creamos un nuevo paquete para el testear el encapsulado

    //aqui hago toString  
   
    public String toString() {
        return " persona: [Nombre: %s, Edad: %d, Eliminado %b]"
                .formatted(this.nombre, this.edad, this.eliminado); // del return elimino super.toString(),Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String obtenerDetalle() {
          
        return "Nombre: ";
          
    }
    
}
