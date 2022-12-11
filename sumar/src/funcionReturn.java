
public class funcionReturn {
    public static void main(String[] args) {
        var suma = sumar(20,40);
        System.out.println("La suma es: " + suma);// System.out.println("La suma es: " + sumar(45,45));
        //var edad = 11;
    }   
    static int sumar(int a, int b){
       return a+b;
    }
    
}
