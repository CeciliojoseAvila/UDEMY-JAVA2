
package cursojavaudemy;

/**
 *
 * @author GERMAN
 */
public class CursoJavaUdemy {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String nombre;
        String apellido;
        int a,b,c;
        
nombre="CECILIO JOSE";
apellido= "AVILA RAMOS";
int edad=34;
a=2;
b=3;
c=5;
        
        System.out.println(nombre);
         System.out.println(apellido);
        System.out.println(edad);
        System.out.println(a+b+c); */
        
        //nuevas formas de definir las variables
        var primerNombre="CECILIO ";
        var segundoNombre="JOSE";
        
        var misNombres=primerNombre + segundoNombre;
        System.out.println("MI NOMBRE ES " + misNombres);
        
        //TIPOS DE DATOS PRIMITIVOS:
        //byte(-128 al 127), short(-32.768 al 32.767), int( -2.147.483.648 al 2.147.483.647), long(-9.223.372.036.854.775.808 al 9.223.372.036.854.775.807),
         // float(decimales(de 6 a 7 digitos)), double(decimales, hasta 15 decimales), char (un codigo ASCIL) y boolean
         
         long numerosGrandes= 2552255545L;
          System.out.println(numerosGrandes);
          
          float nDec= 40.5f;
          System.out.println(nDec);
          
          double nd =3.55;
System.out.println(nd);          

char letra = 'C';
char codigo = 77;
         System.out.println(letra );
         System.out.println(codigo);
         
         /*
         //Operadores aritmeticos
         int a=50;
         int b=7;
         int c=5;
         
         System.out.println((a - b * c)/2);
         
         a=10;
         a *=5;
         System.out.println(a); */
         
         //incremento y decremento a++ y a-- ; pre y pos= ++a , a++
         int a = 5;
         
         //System.out.println(a++);
           //System.out.println(a++); //el increment se ve despues de la primera impresion
           
           System.out.println(++a);//incrementa de una vez 1 
           System.out.println(++a); // =7
    }
    
}
