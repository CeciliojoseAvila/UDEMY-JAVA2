
package clases;

public class calculadora {
    public static double PI = 3.152;
    
    public static int sumar(int a, int b){
        return a + b;
    }
    
    //sobrecarga de metodos
    static double sumar(double a, double b){
        return a + b;
    }
     //sobrecargas
    public int restar(int a, int b){
        return a - b;
    }
    public double restar(double a, double b){
        return a - b;
    }
}
