package banbajio;
import Listas.Lista_User;
import Listas.Pila_Tarjeta;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Lista_User lista = new Lista_User();
        Pila_Tarjeta pila = new Pila_Tarjeta();
        
        lista.addData("user", "user@correo.com", "1234");
        lista.addData("user2", "user@correo.com", "1234");
        
        Usuarios login = new Usuarios(lista, pila);
        login.setVisible(true);
    }
    
}
