package dados;

public class CargaDuravel extends TipoCarga
{
    private String setor;
    private String materialPrincipal;
    private double ipi;
    
    public CargaDuravel()
    {
        
    }

    public CargaDuravel(int codigo, String descricao, String setor, String materialPrincipal, double ipi)
    {
        super(codigo, descricao);
        this.setor = setor;
        this.materialPrincipal = materialPrincipal;
        this.ipi = ipi;
    }

    public void setSetor(String setor)
    {
        this.setor = setor;
    }

    public String getSetor()
    {
        return this.setor;
    }

    public void setMaterialPrincipal(String materialPrincipal)
    {
        this.materialPrincipal = materialPrincipal;
    }

    public String getMaterialPrincipal()
    {
        return this.materialPrincipal;
    }

    public void setIpi(double ipi)
    {
        this.ipi = ipi;
    }

    public double getIpi()
    {
        return this.ipi;
    }

    
}
