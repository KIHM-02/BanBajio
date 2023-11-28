package banbajio;
import Listas.Lista_User;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Lista_User lista = new Lista_User();
        
        lista.addData(lista.getLastUser(), "user", "user@correo.com", "1234");
        lista.addData(lista.getLastUser(), "user2", "user@correo.com", "1234");
        
        Usuarios login = new Usuarios(lista);
        login.setVisible(true);
    }
    
}
