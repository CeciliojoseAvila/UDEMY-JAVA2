
package clases;

public class Rectangulo {
    public int base;
    public int altura;
    
    public Rectangulo(){
        System.out.println(base);
        System.out.println(altura);
    }
     public int area(int base, int altura){
        this.base = base;
        this.altura = altura;
        
        return this.base * this.altura;
    }
    public int perimetro(int base, int altura){
        this.base = base;
        this.altura = altura;
        
        return 2 * (this.base + this.altura);// el this es para referirnos a los atributos de la clase
        //YA LO PODEMOS LLAMAR Y EJECUTAR EN EL MAIN(POO1)
    }
}
