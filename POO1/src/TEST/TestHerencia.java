package TEST;

import herencia.*;
import clases.persona;
import java.util.Date;

public class TestHerencia {
    
    public static void main(String[] args) {
       // persona persona1 = new persona("CECILIO JOSE A", 'M', 35, "MEDELLIN");
        //System.out.println(persona1);
        //CREAMOS LOS EMPLEADOS:
       /* persona persona = new persona("JOSE AVILA", 'M', 36, "LA PAMPA");
        //System.out.println(persona.obtenerDetalle());
        imprimir(persona);*/ //LO COMENTO PARA PROBAR EL EQUALS
        Empleado empleado = new Empleado(50000, "CECILIO");
        //System.out.println(empleado1);
        //System.out.println(empleado1.obtenerDetalle());
       // imprimir(Empleado);
        
        Empleado empleado2 = new Empleado(60000, "JOSE");
        //System.out.println(empleado2);
        //System.out.println(empleado2.obtenerDetalle());
        //imprimir(persona);
         Empleado empleado3 = new Empleado(70000, "AVILA");
        //System.out.println(empleado3);
        System.out.println(empleado3.obtenerDetalle());
        //NECESITAMOS CREAR LOS DEMAS DATOS E IMPORTAR DATE
        var fecha = new Date();
        Clientes cliente = new Clientes(fecha, true, " CECILIO JOSE ", 'M', 35, " MEDELLIN-ANTIOQUIA ");
        //fecha, true (SI ES VIP O NO), nombre ("COLOCAMOS NOMBRE"), 0("ES EL GENERO"), 0 (ES PARA EDAD), direccion(COLOCAMOS)
        //System.out.println(cliente1);
        System.out.println(cliente.obtenerDetalle());
        //imprimir(cliente1);
        String nombre = "Mateo marti";
        determinarTipo(nombre); //ARROJA DE "TIPO OBJECT"
        //imprimir(Empleado);
       // determinarTipo(persona);
       
    //CONVERSION DE OBJETOS // Downcasting
    Empleado persona1 = new Empleado(25000, " BRAYAN MARTIN ");
    Empleado empleado1 = (Empleado) persona1;
        System.out.println(empleado1.obtenerDetalle());
        
        //Upcasting
    Empleado persona2 = empleado1;
        System.out.println(persona2.obtenerDetalle());
        
    ///Equals
    persona p1 = new persona("JOSE AVILA", 'M', 36, "LA PAMPA");
    persona p2 = new persona("JOSE AVILA", 'M', 36, "LA PAMPA");
       // System.out.println(p1 == p2);
       // System.out.println("Hola" == "Hola");
        //voy a clase persona y heredo (persona de "herencia")
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        if(p1.hashCode() == p2.hashCode()){
            System.out.println("LOS OBJETOS SON IGUALES");
        }else{
            System.out.println("LOS OBJETOS NO SON IGUALES");
        }
    }//DEBERIA DEVOLVER LOS OBJETOS SON IGUALES

    public static void imprimir(persona persona) {
      //  System.out.println(persona.obtenerDetalle()); //la comento, al parecer se generó un conflicto y no me dejaba ver determinar Tipo
      
    }    
        // InstanceOf
    public static void determinarTipo(Object objeto){
        
        if (objeto instanceof Empleado) {            
            System.out.println("Es de tipo Empleado ");
            
        }else if (objeto instanceof Clientes) {
            
            System.out.println("Es de tipo cliente");
        }else if (objeto instanceof persona) {
            
            System.out.println("Es de tipo persona");
        }else if (objeto instanceof Object) {
            
            System.out.println("Es de tipo Object");
        }
    }
}