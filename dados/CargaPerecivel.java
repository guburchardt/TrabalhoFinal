package dados;

public class CargaPerecivel extends TipoCarga 
{
    private String origem;
    private int validade;
    
    public CargaPerecivel()
    {
        
    }

    public CargaPerecivel(int codigo, String descricao, String origem, int validade)
    {
        super(codigo, origem);
        this.origem = origem;
        this.validade = validade;
    }

    public void setOrigem(String origem)
    {
        this.origem = origem;
    }

    public String getOrigem()
    {
        return this.origem;
    }

    public void setValidade(int validade)
    {
        this.validade = validade;
    }

    public int getValidade()
    {
        return this.validade;
    }


}
