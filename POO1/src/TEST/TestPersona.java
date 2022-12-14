
package TEST;
//importamos la clase * para todas
import clases.encapsulamiento. *;
import herencia.Clientes;
import herencia.Empleado;

public class TestPersona {

    private static persona Clientes;
    private static Object empleado;
    private static Object Empleado;
    //creamos el PSVM
    public static void main(String[] args) {
        
        persona persona1 = new persona("CECILIO", 35, false);
        
        String estado = persona1.toString();
        System.out.println(estado);
        
        System.out.println(persona1.getNombre());//me trae el nombre encapsulado y en estado privado
        //AHORA QUIERO MODIFICAR LOS DATOS:
        persona1.setNombre("CECILIO JOSE");        
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        
        //para sobre-escribir un metodo usamos toString en la clase persona.java
        // al usar toString aparece @Override
        System.out.println(persona1);
        //imprimir(Clientes);
        determinarTipo(Empleado);
    }
    
    public static void imprimir(persona persona){
        System.out.println(persona.obtenerDetalle());
    }
    
    public static void determinarTipo(Object Empleado) {
     
    } 
  
    }

