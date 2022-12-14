
package Bloque.Codigo;

/**
 *
 * @author CECILIO
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecutando bloque estatico");
        ++Persona.contadorPersona;
    }//realizamos otro bloque de codigo 
    // solo abrimos y cerramos llaves
    {
        System.out.println("EJECUTANDO BLOQUE CODIGO");
        this.idPersona = Persona.contadorPersona++;
    }
    //HACEMOS EL CONSTRUCTOR Y LUEGO GET DE IdPersona

    public Persona() {
        System.out.println("EJECUTANDO EL CONSTRUCTOR");
    }

    public int getIdPersona() {
        return idPersona;
    }//para probarlo hacemos un TestClase en Bloque.Codigo

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
