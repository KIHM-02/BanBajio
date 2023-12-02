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
        if (isEmpty()) { id = 1; }
        else { id = getLastUser() + 1; }

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
    
    public int getUserId(String email)                                          //solo funciona al existir registros
    {
         Nodo_User temp = inicio;
         while(temp != null){
             if(temp.getEmail().equals(email)){
                 return temp.getId();
             }
             temp = temp.getSiguiente();
         }
         return 0;
    }
   
    public boolean userExists(String email){
         Nodo_User temp = inicio;
         while(temp != null){
             if(temp.getEmail().equals(email)){
                 return true;
             }
             temp = temp.getSiguiente();
         }
         return false;
     }
     
    public String getPasswordForUser(String email){
        Nodo_User temp = inicio;
        while(temp != null){
            if(temp.getEmail().equals(email)){
               return temp.getPassword();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
    
    public String[] getUserInformation(int id){
        String [] datos = null;
        Nodo_User temp = inicio;
        boolean find = false;
        
        while(temp != null && find == false){
            if(temp.getId()==id){
                datos = new String[]{temp.getUser(), temp.getEmail(), temp.getPassword()};
                find = true;
            }
            
        }
        return datos;
    }
}
