import dados.*;
import ui.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Porto porto = new Porto();
        Navio navio = new Navio();
        Carga carga = new Carga();
        TipoCarga TipoCarga = new TipoCarga();
        CargaDuravel cargaDuravel = new CargaDuravel();
        CargaPerecivel cargaPerecivel = new CargaPerecivel();
        Aplicacao aplicacao = new Aplicacao(cliente, porto, navio, TipoCarga, carga, cargaDuravel, cargaPerecivel);
    }
}