package Listas;

public class Nodo_User 
{
    private String user, bankAccount, email, password;
    private Nodo_User siguiente, anterior;
    
    public Nodo_User (Nodo_User anterior, String user, String account, String email,
            String pwd, Nodo_User siguiente)
    {
        this.user = user;
        this.bankAccount = account;
        this.email = email;
        this.password = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
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
