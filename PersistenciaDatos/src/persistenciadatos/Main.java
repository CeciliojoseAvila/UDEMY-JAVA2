
package persistenciadatos;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        List lista1 = new ArrayList();
        
        lista1.add(1);
        lista1.add("CECILIO JOSE ");
        lista1.add(35);
        lista1.add(1.80);
        lista1.add(true);
        
       // System.out.println(lista1);
        for(Object dato: lista1){
            System.out.println(lista1);
        }
    }
    
}
