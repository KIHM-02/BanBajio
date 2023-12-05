package Listas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lista_Movimiento 
{
    Nodo_Movimiento inicio;
    
    public Lista_Movimiento()
    {
        inicio = null;
    }
    
    public boolean isEmpty()    
    {
        if(inicio == null)
            return true;
        return false;
    }
    
    public void addMovement(int userId, String tipoMovimiento, double cantidad,
            String fecha, String descripcion)
    {
        Nodo_Movimiento nuevo;
        int idMov = getLastMovement();
        if(idMov == 0) idMov = 1;
        else idMov += 1;
        
        if(isEmpty())
        {
            nuevo = new Nodo_Movimiento(userId, idMov, tipoMovimiento, cantidad, fecha, 
                    descripcion, null);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se agrego el primer movimiento");
        }
        else
        {
           nuevo = new Nodo_Movimiento(userId, idMov, tipoMovimiento, cantidad, fecha, 
                    descripcion, inicio);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se agrego el movimiento");
        }
    }
    
    public void deleteMovement(int idMov) 
    {
        Nodo_Movimiento temp = inicio;
        Nodo_Movimiento prev = null;
        boolean find = false;

        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay movimientos registrados",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        while (temp != null && !find) {
            if (temp.getMovId()== idMov) {
                if (prev == null) {
                    // El nodo a eliminar es el primer nodo de la lista
                    inicio = temp.getSiguiente();
                } else {
                    // El nodo a eliminar no es el primer nodo
                    prev.setSiguiente(temp.getSiguiente());
                }

                JOptionPane.showMessageDialog(null, "Se ha eliminado el movimiento",
                        "Aviso", JOptionPane.WARNING_MESSAGE);
                find = true;
            } else {
                prev = temp;
                temp = temp.getSiguiente();
            }
        }

        if (!find) {
            JOptionPane.showMessageDialog(null, "Movimiento no encontrado",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public int getLastMovement()
    {
        int idMov = 0;
        Nodo_Movimiento temp = inicio;
        
        if(!isEmpty())
        {
            while(temp.getSiguiente() != null)
            {
                idMov++;
                temp = temp.getSiguiente();
            }
            idMov++;
        }
        
        return idMov;
    }
    
    public DefaultTableModel setModelo(DefaultTableModel modeloMovimientos, String tipoMovimiento, int userId)
    {
        Nodo_Movimiento temp;
        
        if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No hay movimientos registrados",
                "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            temp = inicio;
            
            while(temp != null)
            {
                String[] datos = new String[4];
                
                if(temp.getId() == userId && temp.getMovimiento().equals(tipoMovimiento))
                {
                    datos[0] = String.valueOf(temp.getMovId());
                    datos[1] = temp.getMovimiento();
                    datos[2] = String.valueOf(temp.getCantidad());
                    datos[3] = temp.getFecha();

                    modeloMovimientos.addRow(datos);
                }
                
                temp = temp.getSiguiente();
            }
        }
        
        return modeloMovimientos;
    }
    
    public double getSaldoTotal(int userId)
    {
        double saldo = 0;
        Nodo_Movimiento temp = inicio;
        
        if(!isEmpty())
        {
            while(temp != null)
            {
                if(temp.getId() == userId && temp.getMovimiento().equals("Ingresos"))
                {
                    saldo += temp.getCantidad();
                }
                else
                {
                    saldo -= temp.getCantidad();
                }
                temp = temp.getSiguiente();
            }
        }
        System.out.println("El saldo es: "+saldo);
        return saldo;
    }
    
    public String displayDescription(int idMov, int userId)
    {
        Nodo_Movimiento temp;
        String description = "No existe";
        
        if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No hay movimientos registrados",
                "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            temp = inicio;
            
            while(temp != null)
            {   
                if(temp.getId() == userId && temp.getMovId() == idMov)
                {
                    description = temp.getDescripcion();
                }
                
                temp = temp.getSiguiente();
            }
        }
        
        return description;
    }
}
