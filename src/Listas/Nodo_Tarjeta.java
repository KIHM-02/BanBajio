package Listas;
import java.util.LinkedList;

public class Nodo_Tarjeta {
     //LinkedList<Ta> tarjtas = new LinkedList<>(); 
    private String tipo_Tarjeta, numero_Tarjeta, fecha_Off;
    private int id, security_Code;
    private Nodo_Tarjeta siguiente;

    public Nodo_Tarjeta(int id, String tipo_Tarjeta, String numero_Tarjeta, 
            String fecha_Off, int security_Code, Nodo_Tarjeta siguiente)
    {
        this.tipo_Tarjeta = tipo_Tarjeta;
        this.numero_Tarjeta = numero_Tarjeta;
        this.fecha_Off = fecha_Off;
        this.id = id;
        this.security_Code = security_Code;
        this.siguiente = siguiente;
    }

    public String getTipo_Tarjeta() {
        return tipo_Tarjeta;
    }

    public void setTipo_Tarjeta(String tipo_Tarjeta) {
        this.tipo_Tarjeta = tipo_Tarjeta;
    }

    public String getNumero_Tarjeta() {
        return numero_Tarjeta;
    }

    public void setNumero_Tarjeta(String numero_Tarjeta) {
        this.numero_Tarjeta = numero_Tarjeta;
    }

    public String getFecha_Off() {
        return fecha_Off;
    }

    public void setFecha_Off(String fecha_Off) {
        this.fecha_Off = fecha_Off;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecurity_Code() {
        return security_Code;
    }

    public void setSecurity_Code(int security_Code) {
        this.security_Code = security_Code;
    }

    public Nodo_Tarjeta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Tarjeta siguiente) {
        this.siguiente = siguiente;
    }
}
