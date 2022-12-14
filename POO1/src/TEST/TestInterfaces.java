
package TEST;

/**
 *
 * @author CECILIO
 */
import Interfaces.*;

public class TestInterfaces {
    public static void main(String[] args) {
        
        BaseDeDatos datos = new ImplementarMySQL();
        datos.insertar();
        datos.actualizar();
        
    }
}
