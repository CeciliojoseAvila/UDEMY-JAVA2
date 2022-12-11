
public class funcRecursiva {
    public static void main(String[] args) {
        cuentaRegresiva(10);
    }
    static void cuentaRegresiva(int numero){
    numero --;
    
        if (numero > 0) {
            System.out.println(numero);
            cuentaRegresiva(numero);
        }else{
            System.out.println("Llego hasta 0 ");
        }
    }
 
}
