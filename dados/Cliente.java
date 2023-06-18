package dados;

import java.util.Collection;

public class Cliente {
    private int cod;
    private String nome;
    private String email;
    private Collection<Carga> carga;

    public Cliente()
    {

    }

    public Cliente(int cod, String nome, String email)
    {
        this.cod = cod;
        this.nome = nome;
        this.email = email;
    }

    public void setCod(int cod)
    {
        this.cod = cod;
    }

    public int getCod()
    {
        return this.cod;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setCarga(Collection<Carga> carga)
    {
        this.carga = carga;
    }

    public Collection<Carga> getCarga()
    {
        return this.carga;
    }
}
