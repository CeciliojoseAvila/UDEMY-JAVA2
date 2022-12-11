
package juego;
//para generar un ejecutable JAR. Al lado de Projects Clic en Files, buscamos el proyecto
// Le damos clic derecho y clic properties, Clic en Compiling y marcamos todas las casillas.
//Luego packaging y selecionamos las 3 primeras casillas
//Luego en Run y marcamos ok.
//Luego, en Clean and Build
//Ya lo podemos compartir y ejecutar en cualquier lugar.
// en mi cdm (simbolo del sistema)
// esta es la ruta en mi pc: C:\Users\GERMAN\OneDrive\Escritorio\juego-java
//java -jar Juego.jar


import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        //jugar(5);
        
        //complemento/subiendo complejidad del juego
        OUTER:
        while (true) {            
            System.out.println("JUEGO ADIVINA EL NUMERO \n");
            System.out.println("1 - Nivel Facil \n"
            +"2 - Nivel Intermedio \n"
            + "3 - Nivel Dificil \n"
            +"4 - Salir ");
            
        Scanner leer = new Scanner(System.in);
            System.out.print("INGRESE UNA OPCION: ");
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break;
                case 4:
                    System.out.println("CERRANDO PROGRAMA");
                    break OUTER;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
    }
    static void jugar(int vidas){
    int numeroRandom = (int)(Math.random()*101);
    int numeroElegido= -1;
    
        Scanner leer = new Scanner(System.in);
        
        while (numeroElegido != numeroRandom){            
            System.out.print("Ingrese un numero entre 1 y 100: \n");
            numeroElegido = leer.nextInt();
            
            if (numeroRandom < numeroElegido) {
                System.out.println("El numero es mas pequeño \n");
                vidas--;
            }else if (numeroRandom > numeroElegido) {
                System.out.println("El numero es mas grande \n");
                vidas--;
            }
            if (vidas == 0){
                System.out.println("------------------");
                System.out.println("|   GAME OVER    |");
                System.out.println("------------------");
                break;
            }
            System.out.println("----------------------");
            System.out.printf("|  Te quedan %d vidas  |\n", vidas);
            System.out.println("-----------------------");
        }
        if (numeroElegido == numeroRandom) {
            System.out.println("--------------------------");
            System.out.println("|   FELICIDADES GANASTE   |");
            System.out.println("--------------------------");
        }
    }    
}
