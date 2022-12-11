
public class funciones {
    public static void main(String[] args) {
        //saludar();
        sumar(20, 20);
        saludar("YOCELIS AVILA", 11);
        // var nombre "Yocelis";
        //var edad = 11;
    }
    //la funcion static void se ejecuta, pero se debe declarar dentro del Metodo main
    static  void sumar(int a, int b){ //los int a y b son parámetros
    int suma=a+b;
        System.out.println("LA SUMA ES: "+ suma);
    }
    static void saludar( String nombre, int edad){
        System.out.printf("HOLA %s tu edad es %d \n",nombre, edad );//los args van asi: "hola" 
    }
}
