package dados;


public class Navio {

	private String nome;

	private double velocidade;

	private double autonomia;

	private double custoPorMilhaBasico;

	private Carga carga;

	private ColecaoCargas colecaoCargas;

	public Navio()
	{

	}

	public Navio(String nome, double velocidade, double autonomia, double custoPorMilhaBasico)
	{
		this.nome = nome;
		this.velocidade = velocidade;
		this.autonomia = autonomia;
		this.custoPorMilhaBasico = custoPorMilhaBasico;
	}

	public Navio(String nome, double velocidade, double autonomia, double custoPorMilhaBasico, Carga carga)
	{
		this.nome = nome;
		this.velocidade = velocidade;
		this.autonomia = autonomia;
		this.custoPorMilhaBasico = custoPorMilhaBasico;
		this.carga = carga;
	}

	public void setCarga(Carga carga)
	{
		this.carga = carga;
	}

	public Carga getCarga()
	{
		return this.carga;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setVelocidade(double velocidade)
	{
		this.velocidade = velocidade;
	}

	public double getVelocidade()
	{
		return this.velocidade;
	}

	public void setAutonomia(double autonomia)
	{
		this.autonomia = autonomia;
	}

	public double getAutonomia()
	{
		return this.autonomia;
	}

	public void setCustoPorMilhaBasico(double custoPorMilhaBasico)
	{
		this.custoPorMilhaBasico = custoPorMilhaBasico;
	}

	public double getCustoPorMilhaBasico()
	{
		return this.custoPorMilhaBasico;
	}

	

	public void setCargas(ColecaoCargas colecaoCargas)
	{
		this.colecaoCargas = colecaoCargas;
	}

	public ColecaoCargas getCargas()
	{
		return this.colecaoCargas;
	}
	

	

}
