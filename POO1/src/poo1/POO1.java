//se ha creado un nuevo paquete llamado clases, donde ingresamos persona. esto para menejar
// las importaciones 
//aqui trabajamos las modularizaciones con una clase Main(POO1)
package poo1;
// importamos clases "persona.java"
import clases.persona;
import clases.calculadora;
import clases.Rectangulo;

public class POO1 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*persona persona1 = new persona();
        persona1 = new persona(); 
        persona1.Nombre = "CECILIO";
        persona1.Edad = 35;         
        persona1.mostrarDatos();  
        
        persona persona2 = new persona();
        persona2 = new persona();
        persona2.Nombre = "JOSE MIGUEL";
        persona2.Edad = 40;        
        persona2.mostrarDatos(); */
       
       
        //otra clase:
        System.out.println(calculadora.PI);
        System.out.println(calculadora.sumar(40, 50));
        
        persona persona3 = new persona();
        persona persona4 = new persona("JOSE ");
        
         persona persona5 = new persona();
         persona5.Nombre = "JOSE AVILA";
         persona5.Edad = 37;
         persona5.mostrarDatos();
         
         //clase calculadora
        calculadora calcular = new calculadora();
        System.out.println(calcular.restar(80, 70));
        System.out.println(calcular.restar(50.5, 30));
        
        Rectangulo rectangulo1 = new Rectangulo();
        //AHORA REALIZAMOS UN METODO PUBLICO PARA RETORNAR LOS VALORES DEL RECTANGULO
        //Y LO HACEMOS EN LA CLASE RECTANGULO
        System.out.println(rectangulo1.area(12, 4));
    }
   
}
