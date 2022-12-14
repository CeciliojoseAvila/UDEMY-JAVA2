
package herencia;

import java.util.Date;

public class Clientes extends persona{
    private int idCliente;
    private Date fecharRegistro;
    private boolean VIP;
    private static int contadorCliente;
//generamos constructor con todos los datos de Persona e inicializado con todo
 //menos con el idCliente
    public Clientes(Date fecharRegistro, boolean VIP, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        //aqui debe ir tambien el idCliente con su contador
        this.idCliente = ++Clientes.contadorCliente;
        this.fecharRegistro = fecharRegistro;
        this.VIP = VIP;
    }
    //generamos los getter and setter, solo para Cliente

    public int getIdCliente() {
        return this.idCliente;
    }
//eliminamos el setIdCliente
   /* public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }*/

    public Date getFecharRegistro() {
        return this.fecharRegistro;
    }

    public void setFecharRegistro(Date fecharRegistro) {
        this.fecharRegistro = fecharRegistro;
    }

    public boolean isVIP() {
        return this.VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }
//tambien eliminamos el contadorCliente
   /* public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Clientes.contadorCliente = contadorCliente;
    }*/
        @Override
        public String obtenerDetalle(){
        return super.obtenerDetalle() + " Es VIP: " + this.VIP;
    }
//AHORA REALIZAMOS EL toString con el StringBuilder

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fecharRegistro=").append(fecharRegistro);
        sb.append(", VIP=").append(VIP);
        //aqui agregamos lo que hereda de la clase persona
        sb.append(", ").append(super.toString());//
        sb.append('}');
        return sb.toString();
        
    
    }
    //hasta aqui està lista todas las subclases
    //ahora las podemos probar desde el archivo TesStHerencia
    
}
