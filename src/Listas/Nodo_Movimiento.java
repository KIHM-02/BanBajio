package Listas;

public class Nodo_Movimiento 
{
    private int userId, movimientoId;
    private String tipoMovimiento, fecha, descripcion;
    private double cantidad;
    private Nodo_Movimiento siguiente;
    
    public Nodo_Movimiento(int userId, int movId, String movimiento, double cantidad,
            String fecha, String descripcion, Nodo_Movimiento siguiente)
    {
        this.userId = userId;
        this.movimientoId = movId;
        this.tipoMovimiento = movimiento;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.siguiente = siguiente;
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }
    
    public int getMovId()
    {
        return movimientoId;
    }
    
    public void setMovId(int movId)
    {
        this.movimientoId = movId;
    }

    public String getMovimiento() {
        return tipoMovimiento;
    }

    public void setMovimiento(String movimiento) {
        this.tipoMovimiento = movimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Nodo_Movimiento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Movimiento siguiente) {
        this.siguiente = siguiente;
    }
}
