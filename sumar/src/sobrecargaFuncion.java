
public class sobrecargaFuncion {
    public static void main(String[] args) {
       // System.out.println(sumaEnteros(45, 45));
        System.out.println(sumar(4.5, 4.5));
    }
    //comento para demostrar la sobrecarga, al usar 2 funciones con un llamado(deber ser o double o int)
    //static int sumaEnteros(int a, int b){
    //return a + b;
     static int sumar(int a, int b){
    return a + b;
    }
    //static double sumaDecimales(double a, double b){
    //return a + b;
     static double sumar(double a, double b){
    return a + b;
    }
}
