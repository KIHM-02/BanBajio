package Listas;

public class Lista_User 
{
    Nodo_User inicio, ultimo;
     
    public Lista_User()
    {
        inicio = null;
        ultimo = null;
    }
     
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        return false;
    }
     
    public void addData(int id, String user, String email, String pwd)
    {
        Nodo_User nuevo;
         
        if(isEmpty())
        {
            nuevo = new Nodo_User(null, id, user, email, pwd, null);
            inicio = nuevo;
            ultimo = inicio;
        }
        else
        {
            nuevo = new Nodo_User(null, id, user, email, pwd, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }   
    }
   
    public int getLastUser()
    {
        int id = 0;
        Nodo_User walker = inicio;
        
        if(!isEmpty())
        {
            while(walker.getSiguiente() != null)
            {
                id++;
                walker = walker.getSiguiente();
            }
        }
        
        return id;
    }
   
    public boolean userExists(String username){
         Nodo_User temp = inicio;
         while(temp != null){
             if(temp.getUser().equals(username)){
                 return true;
             }
             temp = temp.getSiguiente();
         }
         return false;
     }
     
    public String getPasswordForUser(String username){
        Nodo_User temp = inicio;
        while(temp != null){
            if(temp.getUser().equals(username)){
               return temp.getPassword();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
}
