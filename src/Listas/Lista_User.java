package Listas;

public class Lista_User 
{
    Nodo_User inicio;
     
    public Lista_User()
    {
        inicio = null;
    }
     
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        return false;
    }
     
    public void addData(String user, String email, String pwd) 
    {
        int id;
        if (isEmpty()) 
        {
            id = 1;  // Si la lista está vacía, asigna ID 1
        }
        else 
        {
            id = getLastUser() + 1;  // Obtiene el último ID y le suma 1
        }

        Nodo_User nuevo;
        if (isEmpty()) 
        {
            nuevo = new Nodo_User(null, id, user, email, pwd, null);
            inicio = nuevo;
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
            id++;
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
