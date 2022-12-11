


public class ClaseString {
    public static void main(String[] args) {
        String nombre = "Cecilio";
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.length());
        
        for(int i=0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
        System.out.println(nombre.substring(0, 6));
        System.out.println(nombre.toLowerCase());//convierte en minuscula
        System.out.println(nombre.toUpperCase());//convierte en mayusculas
        
        nombre="C E C I L I O";
        System.out.println(nombre.replace(" ", "-"));//reemplaza
        System.out.println(nombre.replace(" ", ""));
        
        System.out.println("Hola".equals("hola"));//false
        System.out.println("Hola".equals("Hola"));//true
        
        //String Builder/ es un constructor
        StringBuilder nuevo= new StringBuilder();
        System.out.println(nuevo);
        
        nuevo.append("HOLA ");
        nuevo.append("MUNDO");
        System.out.println(nuevo.toString());
    }
}
