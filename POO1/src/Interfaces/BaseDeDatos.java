
package Interfaces;

/**
 *
 * @author CECILIO
 */
//LAS INTERFACES HEREDAN LOS COMPORTAMIENTOS, SE RECOMIENDA EN MAYUSCULAS
//LAS INTERFACES SON CLASES TIPO ABSTRACTAS
public interface BaseDeDatos {
    int MAXIMO_DATO= 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
//IMPLEMENTAMOS UNA NEW CLASE(normal) EN "interfaces"    
    
}
