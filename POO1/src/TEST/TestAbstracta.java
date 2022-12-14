
package TEST;

import Abstractas.Cuadrado;
import Abstractas.FigurasGeometricas;
import Abstractas.Rectangulo;

/**
 *
 * @author CECILIO
 */
public class TestAbstracta {
    public static void main(String[] args) {
        FigurasGeometricas figura = new Rectangulo("RECTANGULO1");
        System.out.println(figura);
        
        //OTRA FORMA DE LLAMAR DIBUJAR
        figura.dibujar();//clse Rectangulo
        
        figura = new Cuadrado("Cuadrado1");
        figura.dibujar();//clase cuadrado
       
    }
}
