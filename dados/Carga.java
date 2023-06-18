package dados;

public class Carga {

	private int identificador;

	private int peso;

	private double valorDeclarado;

	private int tempoMaximo;

	private Porto destino;

	private Porto origem;
	
	private Navio navio;

	private Cliente cliente;

	private String prioridade;

	private SituacoesEnum situacao;

	private CargaDuravel cargaDuravel;

	private CargaPerecivel cargaPerecivel;

	private double frete;

	public Carga()
	{

	}

	public Carga(int identificador, int peso, double valorDeclarado, int tempoMaximo, Porto destino, Porto origem, Cliente cliente, String prioridade, CargaDuravel cargaDuravel, CargaPerecivel cargaPerecivel)
	{
		this.identificador = identificador;
		this.peso = peso;
		this.valorDeclarado = valorDeclarado;
		this.tempoMaximo = tempoMaximo;
		this.destino = destino;
		this.origem = origem;
		this.cliente = cliente;
		this.prioridade = prioridade;
		this.cargaDuravel = cargaDuravel;
		this.cargaPerecivel = cargaPerecivel;
	}

	//PERECIVEL
	public Carga(int identificador, int peso, double valorDeclarado, int tempoMaximo, Porto destino, Porto origem, Cliente cliente, String prioridade, CargaPerecivel cargaPerecivel)
	{
		this.identificador = identificador;
		this.peso = peso;
		this.valorDeclarado = valorDeclarado;
		this.tempoMaximo = tempoMaximo;
		this.destino = destino;
		this.origem = origem;
		this.cliente = cliente;
		this.prioridade = prioridade;
		this.cargaPerecivel = cargaPerecivel;
	}

	//DURAVEL
	public Carga(int identificador, int peso, double valorDeclarado, int tempoMaximo, Porto destino, Porto origem, Cliente cliente, String prioridade, CargaDuravel cargaDuravel)
	{
		this.identificador = identificador;
		this.peso = peso;
		this.valorDeclarado = valorDeclarado;
		this.tempoMaximo = tempoMaximo;
		this.destino = destino;
		this.origem = origem;
		this.cliente = cliente;
		this.prioridade = prioridade;
		this.cargaDuravel = cargaDuravel;
	}

	public Carga(int identificador, int peso, double valorDeclarado, int tempoMaximo, Porto destino, Porto origem, TipoCarga tipoCarga, Cliente cliente, String prioridade, Navio navio, CargaDuravel cargaDuravel, CargaPerecivel cargaPerecivel)
	{
		this.identificador = identificador;
		this.peso = peso;
		this.valorDeclarado = valorDeclarado;
		this.tempoMaximo = tempoMaximo;
		this.destino = destino;
		this.origem = origem;
		this.cliente = cliente;
		this.prioridade = prioridade;
		this.navio = navio;
	}

	public void setIdentificador(int identificador)
	{
		this.identificador = identificador;
	}

	public int getIdentificador()
	{
		return this.identificador;
	}

	public void setPeso(int peso)
	{
		this.peso = peso;
	}

	public int getPeso()
	{
		return this.peso;
	}

	public void setValorDeclarado(double valorDeclarado)
	{
		this.valorDeclarado = valorDeclarado;
	}

	public double getValorDeclarado()
	{
		return this.valorDeclarado;
	}

	public void setTempoMaximo(int tempoMaximo)
	{
		this.tempoMaximo = tempoMaximo;
	}

	public int getTempoMaximo()
	{
		return this.tempoMaximo;
	}

	public void setDestino(Porto destino)
	{
		this.destino = destino;
	}

	public Porto getDestino()
	{
		return this.destino;
	}

	public void setOrigem(Porto origem)
	{
		this.origem = origem;
	}

	public Porto getOrigem()
	{
		return this.origem;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Cliente getCliente()
	{
		return this.cliente;
	}

	public void setPrioridade(String prioridade)
	{
		this.prioridade = prioridade;
	}

	public String getPrioridade()
	{
		return this.prioridade;
	}

	public void setSituacao(SituacoesEnum situacao)
	{
		this.situacao = situacao;
	}

	public SituacoesEnum getSituacao()
	{
		return this.situacao;
	}		

	public void setNavio(Navio navio)
	{
		this.navio = navio;
	}

	public Navio getNavio()
	{
		return this.navio;
	}

	public void setCargaPerecivel(CargaPerecivel cargaPerecivel)
	{
		this.cargaPerecivel = cargaPerecivel;
	}

	public CargaPerecivel getCargaPerecivel()
	{
		return this.cargaPerecivel;
	}

	public void setCargaDuravel(CargaDuravel cargaDuravel)
	{
		this.cargaDuravel = cargaDuravel;
	}

	public CargaDuravel getCargaDuravel()
	{
		return this.cargaDuravel;
	}


	public double setFrete()
	{
		double frete = 0;
		double CustoPorMilha = 0;
		double distanciaEntrePortos = 0;
		double CustoPorPeso = 0;
		double CustoPorRegiao = 0;

		//Custo Por Milha
		if (prioridade.equals("BARATO"))
		{
			CustoPorMilha = navio.getCustoPorMilhaBasico();
		}
		else if (prioridade.equals("RAPIDO"))
		{
			CustoPorMilha = navio.getCustoPorMilhaBasico() * 2;
		}

		//Preco Por Peso
		if (cargaPerecivel != null)
		{
			CustoPorPeso = this.getPeso() * 2;
		}
		else if (cargaDuravel != null)
		{
			CustoPorPeso = this.getPeso() * 1.5 + cargaDuravel.getIpi();
		}
		
		//Custo Por Regiao
		if (origem.getPais().equals("Brasil") &&  destino.getPais().equals("Brasil"))
		{
			CustoPorRegiao = 10000;
		}
		else
		{
			CustoPorRegiao = 500000;
		}

		return frete;
	}
	

}
