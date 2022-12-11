
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(5));
    }
    static int factorial(int numero){
        if (numero > 1) {
            numero = numero * factorial( numero - 1);
        }
        return numero;
    }
}
