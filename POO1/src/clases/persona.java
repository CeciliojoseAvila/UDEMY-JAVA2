
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

    public persona(String jose_avila, char c, int i, String la_pampa) {
     
    }

    
    public void mostrarDatos(){
    
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }

    public boolean obtenerDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
