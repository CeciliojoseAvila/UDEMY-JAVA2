
package Abstractas;

/**
 *
 * @author CECILIO
 */
public class Cuadrado extends FigurasGeometricas{

    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("SE DIBUJA UN: "+ this.getClass().getSimpleName());
        //en la clase TestAbstracta los ejecuto
    }
}
