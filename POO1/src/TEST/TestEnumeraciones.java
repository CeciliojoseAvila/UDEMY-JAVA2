
package TEST;
import Enumeraciones.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println(Dias.DOMINGO);
        
        System.out.println(Continentes.AMERICA);
        System.out.println(Continentes.AMERICA.getPaises());//para traer la cantidad de paises en america
    //otra manera de retornar, hacer una variable:
    Continentes continente = Continentes.EUROPA;
        System.out.println(continente.getPaises());
    }
}
