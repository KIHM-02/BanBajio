package banbajio;
import Listas.Lista_User;
import Listas.Pila_Tarjeta;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Lista_User lista = new Lista_User();
        Pila_Tarjeta pila = new Pila_Tarjeta();
        
        
        lista.addData("usuario1", "user", "1234");
        pila.push(1, "DEBITO", "1234567890", "12/12", 240);
        
        Usuarios login = new Usuarios(lista, pila);
        login.setVisible(true);
        
//        System.out.println("La ultima ID es: "+lista.getLastUser());
//        
//        System.out.println("Agregando primera tarjeta.....");
//        pila.push(1, "DEBITO", "12345678910", "12/12", 123);
//        //pila.contarDatos();
//        pila.buscartarjeta(1);
        
    }
    
}
