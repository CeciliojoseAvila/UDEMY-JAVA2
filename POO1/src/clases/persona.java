
package clases;

public class persona {
    
    public String Nombre;
    public int Edad;
    
    public persona(){
        System.out.println("Construyendo el objeto");
    }
    public persona(String nombre){
        System.out.println("Hola " + nombre + "te llamamos desde el constructor");
    }
    
    public void mostrarDatos(){
    
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
}
