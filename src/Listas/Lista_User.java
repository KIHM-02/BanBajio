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
     
     public void addData(String user, String account, String email, String pwd)
     {
         Nodo_User nuevo;
         
         if(isEmpty())
         {
             nuevo = new Nodo_User(null, user, account, email, pwd, null);
             inicio = nuevo;
             ultimo = inicio;
         }
         else
         {
             nuevo = new Nodo_User(null, user, account, email, pwd, inicio);
             inicio.setAnterior(nuevo);
             inicio = nuevo;
         }   
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
