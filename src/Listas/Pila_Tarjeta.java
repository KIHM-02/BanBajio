package Listas;

import javax.swing.JOptionPane;

public class Pila_Tarjeta 
{    
    private  Nodo_Tarjeta inicio;
    
   public Pila_Tarjeta(){
    inicio = null;
    } 
   
   public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        return false;
    }
   
   public void push(int id, String tipo_Tarjeta, String numero_Tarjeta, String fecha_Off, int security_Code){
       Nodo_Tarjeta nuevo;
       
       if(isEmpty()){
           nuevo = new Nodo_Tarjeta(id, tipo_Tarjeta, numero_Tarjeta, fecha_Off, 
                   security_Code, null);
           inicio = nuevo;
           JOptionPane.showMessageDialog(null, "Se agrego el primer dato");
       }else{
           nuevo = new Nodo_Tarjeta(id, tipo_Tarjeta, numero_Tarjeta, fecha_Off, 
                   security_Code, inicio);
           inicio = nuevo;
           JOptionPane.showMessageDialog(null, "Se agregan los otros datos");
       }
   }
   
   public void contarDatos()
   {
       int iterador = 0;
       
       if(isEmpty())
       {
           System.out.println("No hay datos registrados");
       }
       else
       {
           Nodo_Tarjeta walker = inicio;
           
           while(walker != null)
           {
               iterador++;
               walker = walker.getSiguiente();
           }
           
           System.out.println("Hay "+iterador+" datos");
       }
   }
   
   public boolean buscartarjeta(int id){
       boolean find = false;
       
       if(isEmpty()){
          JOptionPane.showMessageDialog(null, "No hay tarjetas registradas para el usuario "+id);
       }
       else
       {
          Nodo_Tarjeta walker = inicio;
          
          while(walker != null && find == false)
          {
            if(walker.getId() == id)
            {
                find = true;
            }
            walker = walker.getSiguiente();
          }
       }
       
       return find;
   }
   
   public String[] displayCardInformation(int id, String tipoTarjeta)
   {
       Nodo_Tarjeta walker = inicio;
       boolean find = false;
       String datos[] = null;
       
       while(walker != null && find == false)
       {
           if(walker.getId() == id && walker.getTipo_Tarjeta().equals(tipoTarjeta))
           {
                datos = new String[] {walker.getNumero_Tarjeta(), walker.getFecha_Off(),
                   String.valueOf(walker.getSecurity_Code())};
               
                find = true;
           }
           walker = walker.getSiguiente();
       }
       
       return datos;
   }
}
