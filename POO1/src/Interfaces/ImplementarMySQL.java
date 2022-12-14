
package Interfaces;

/**
 *
 * @author CECILIO
 */
//IMPLENTAMOS DE BASE DE DATOS (implements BaseDeDatos)
//LUEGO CON AYUDA DEL IDE (BOMBILLO) IMPLEMENTAMOS LOS METODOS ABSTRACTOS
public class ImplementarMySQL implements BaseDeDatos{

    @Override
    public void insertar() {
        System.out.println("SE INSERTO UN DATO"); 
    }

    @Override
    public void listar() {
        System.out.println("LISTANDO DATOS");   
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando un dato");
    }

    @Override
    public void eliminar() {
        System.out.println("SE ELIMINO UN DATO");
    }
    //PARA EJECUTAR INTERFACES, CREAMOS UN Testinterface en TEST
}
