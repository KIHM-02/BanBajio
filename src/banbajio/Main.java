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
       // lista.addData("user3", "user@correo.com", "1234");
        
        Usuarios login = new Usuarios(lista, pila);
        login.setVisible(true);
        
//        int id = lista.getLastUser();
//        boolean datos;
//        boolean datos2;
//        
//        pila.push(id, "DEBITO", "123456789", "12/12", 554);
//        pila.push(id, "CREDITO", "1234567891245", "15/12", 554);
//        
//        datos = pila.buscartarjeta(1);
//        datos2 = pila.buscartarjeta(2);
//        
//        if(datos)
//        {
//            System.out.println("Si hay datos en la pila 1");
//        }
//        if(datos2)
//        {
//            System.out.println("Si hay datos en la pila 2");
//        }
//        
//        if(!datos)
//        {
//            System.out.println("No hay datos en la pila 1");
//        }
//        if(!datos2)
//        {
//            System.out.println("No hay datos en la pila 2");
//        }
        
    }
    
}
