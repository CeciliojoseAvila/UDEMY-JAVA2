
package Abstractas;
//para que sea abstracta debemos colocar antes de class "abstract"
public abstract class FigurasGeometricas {
    
    protected String tipoFigura;
    protected FigurasGeometricas(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();
   //insertamos los get y set y el toString con builder

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FigurasGeometricas{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }    
   //para heredar de esta clase abstracta debemos crear otra clase en "Abstractas"
    // y desde alli la usamos
}
