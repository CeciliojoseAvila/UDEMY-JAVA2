
package clasemath;

public class ClaseMath {
  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(3,3));
        
        System.out.println(Math.random());        
      //  var numerosRandom = Math.random()*101; //devuelve double
      int numerosRandom = (int)(Math.random()*101);//devuelve enteros
        System.out.println(numerosRandom);//devuelve enteros
        
         System.out.println(Math.sqrt(64));
         System.out.println(Math.max(15, 25));
         System.out.println(Math.min(15, 25));
         System.out.println(Math.round(25.8777));//redondear numeros
         
         double moneda= (double)Math.round(3.4389 * 100d)/100; //para trabajar con monedas
         System.out.println(moneda);        
         
    }    
}
