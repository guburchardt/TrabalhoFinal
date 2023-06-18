package dados;


public class Frete 
{
    private Carga carga;

    private double frete;

    private Distancia distancia;

    public Frete()
    {

    }

    public Frete (Carga carga)
    {
        this.carga = carga;
        frete = 0;
    }
    
    public double setFrete()
	{
		frete = 0;
		double CustoPorMilha = 0;
		double distanciaEntrePortos = 0;
		double CustoPorPeso = 0;
		double CustoPorRegiao = 0;

		//Custo Por Milha
		if (carga.getPrioridade().equals("BARATO"))
		{
			CustoPorMilha = carga.getNavio().getCustoPorMilhaBasico();
		}
		else if (carga.getPrioridade().equals("RAPIDO"))
		{
			CustoPorMilha = carga.getNavio().getCustoPorMilhaBasico() * 2;
		}

		//Preco Por Peso
		if (carga.getCargaPerecivel() != null)
		{
			CustoPorPeso = carga.getPeso() * 2;
		}
		else if (carga.getCargaDuravel() != null)
		{
			CustoPorPeso = carga.getPeso() * 1.5 + carga.getCargaDuravel().getIpi();
		}
		
		//Custo Por Regiao
		if (carga.getOrigem().getPais().equals("Brasil") &&  carga.getDestino().getPais().equals("Brasil"))
		{
			CustoPorRegiao = 10000;
		}
		else
		{
			CustoPorRegiao = 500000;
		}

		return frete;
	}

	public void setCarga(Carga carga)
	{
		this.carga = carga;
	}

	public Carga getCarga()
	{
		return this.carga;
	}

	public void setFrete(double frete)
	{
		this.frete = frete;
	}

	public double getFrete()
	{
		return this.frete;
	}


	public Distancia getDistancia()
	{
		return this.distancia;
	}


}