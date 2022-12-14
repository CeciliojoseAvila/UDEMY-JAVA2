
package Enumeraciones;

public enum Continentes {
    AFRICA(54),
    EUROPA(50),
    ASIA(48),
    AMERICA(35),
    OCEANIA(14);
    
    private final int paises; //private porque esta clase solo se usará aqui
    //y hacemos un constructor
    private Continentes(int paises){
        this.paises = paises;
    }
    public int getPaises(){
        return this.paises;
    }//para ejecutar, voy a TestEnumeraciones
}
