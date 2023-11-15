package banbajio;
import Listas.Lista_User;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Lista_User lista = new Lista_User();
        
        Usuarios login = new Usuarios(lista);
        login.setVisible(true);
    }
    
}
