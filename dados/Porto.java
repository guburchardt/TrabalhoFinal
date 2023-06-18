package dados;
public class Porto {

	private int id;

	private String nome;

	private String pais;


	public Porto()
	{

	}

	public Porto(int id, String nome, String pais)
	{
		this.id = id;
		this.nome = nome;
		this.pais = pais;
	}



	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setPais(String pais)
	{
		this.pais = pais;
	}

	public String getPais()
	{
		return this.pais;
	}

	
}
