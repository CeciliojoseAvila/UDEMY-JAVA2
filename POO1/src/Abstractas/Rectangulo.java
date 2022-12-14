
package Abstractas;

public class Rectangulo extends FigurasGeometricas{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    //GENERAMOS EL extends de FigurasGeometricas Y hacemos el constructor
    @Override
    public void dibujar(){
        System.out.println("SE DIBUJA UN: "+ getClass().getSimpleName()); //creamos en TEST nueva clase
        //TestAbstracta
    }
}
