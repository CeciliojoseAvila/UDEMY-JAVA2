
package herencia;
//heredamos con la instruccion extends, como Empleado no necesita pasar herencia
// sino que empleado hereda de persona, usamos private y no protected
public class Empleado extends persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //generamos el constructor, string NOmbre y lo inicializamos con su idEmpleado y sueldo
    //del metodo public Empleado quitamos int idEmpleado,
    public Empleado( double sueldo, String nombre) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;//idEmpleado lo modificamos para hacer un contador
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
//eliminamos setIdEmpleado porque se està trabajando interno
    /*public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }*/

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
//tambien eliminamos el contador empleado, no,lo vamos a usar
   /* public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }*/
    //GENERAMOS EL toString Builder
    
    //para ejemplo de Polimorfismo coloco "obtenerDetalle"
       
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        //agregamos a heredar un estado de la super clase
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    } 
  //ahora creamos la clase cliente en "herencia".   
    //EJEMPLO DE POLIMORFISMO:
    @Override
    public String obtenerDetalle(){
    return super.obtenerDetalle() + "Sueldo: " + this.sueldo;
    }//LO MISMO HACEMOS EN LA CLASE CLIENTES
}
