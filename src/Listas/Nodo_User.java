package Listas;

public class Nodo_User 
{
    private int id;
    private String user, email, password;
    private Nodo_User siguiente, anterior;
    
    public Nodo_User (Nodo_User anterior, int id,  String user, String email,
            String pwd, Nodo_User siguiente)
    {
        this.id = id;
        this.user = user;
        this.email = email;
        this.password = pwd;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Nodo_User getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_User siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_User getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_User anterior) {
        this.anterior = anterior;
    }
    
    
}
