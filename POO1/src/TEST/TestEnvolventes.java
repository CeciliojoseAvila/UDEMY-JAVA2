
package TEST;

/**
 *
 * @author CECILIO
 */
public class TestEnvolventes {
    public static void main(String[] args) {
        
        Integer n = 10;
        System.out.println("Entero -> "+ n +" Entero -> "+" n + n "+ " = " +(n + n));
        
        String ns = n.toString();
        System.out.println("Entero a String -> "+ ns + " -> " + (ns + ns));
        
        System.out.println("Entero a Double -> "+ n.doubleValue());
        //generar Boxing, convertir string a enteros
        int n2 = n;
        n2 = Integer.parseInt(ns);
        System.out.println(n2 + n2); //sumó una concatenacion 1010
        
        double nd = Double.parseDouble(ns);
        System.out.println(nd); //convierte a double
        
    }
}
