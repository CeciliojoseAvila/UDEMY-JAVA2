
package PELICULAS;

//import java.util.ArrayList; //importo javax.swing.JOptionPane; para trabajar cuadros de dialogos
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
     /* //JOptionPane.ERROR_MESSAGE = 0
     // JOptionPane.INFORMATION_MESSAGE = 1
     //JOptionPane.WARNING_MESSAGE = 2
     JOptionPane.QUESTION_MESSAGE = 3*/
       String valor = JOptionPane.showInputDialog(null, "INGRESE TEXTO",
                "ENTRADA", 3);
        
        JOptionPane.showMessageDialog(null,valor,                
                "MI MENSAJE",
                2);
        /*
        ArrayList<String> meses = new ArrayList<>();
        
        meses.add("ENERO");
        meses.add("FEBRERO");
        meses.add("MARZO");
        
        System.out.println(meses);
        
        for(String dato: meses){//tambien podemos usar "Use Funcional Operation" con ayuda del IDE (forEach9
            
            System.out.println(dato);
        }*///COMENTO TODO PARA TRABAJAR LOS CUADROS DE DIALOGOS
    }//ahora puedo crear en el paquete Modelo una clase interfaces
}
