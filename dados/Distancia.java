package dados;

public class Distancia 
{
    private Porto origem;
    private Porto destino;
    double distancia;

    public Distancia()
    {

    }

    public Distancia(Porto origem, Porto destino, double distancia)
    {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public void setOrigem(Porto origem)
    {
        this.origem = origem;
    }

    public Porto getOrigem()
    {
        return this.origem;
    }

    public void setDestino(Porto destino)
    {
        this.destino = destino;
    }

    public Porto getDestino()
    {
        return this.destino;
    }

    public void setDistancia(double distancia)
    {
        this.distancia = distancia;
    }

    public double getDistancia()
    {
        return this.distancia;
    }


}
