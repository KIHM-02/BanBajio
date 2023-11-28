package Listas;

public class Pila_Tarjeta {
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
       }else{
           nuevo = new Nodo_Tarjeta(id, tipo_Tarjeta, numero_Tarjeta, fecha_Off, 
                   security_Code, inicio);
           inicio = nuevo;
       }
   }
   
   public boolean buscartarjeta(int id){
       boolean find = false;
       
       if(!isEmpty()){
          Nodo_Tarjeta walker = inicio;
          
          while(walker.getSiguiente() != null || find != true)
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
}