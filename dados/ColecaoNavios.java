package dados;

import java.util.ArrayList;

public class ColecaoNavios {
    private ArrayList<Navio> colecaoNavios;


    public ColecaoNavios() {
        colecaoNavios = new ArrayList<Navio>();
    }

    public boolean insereNavio(Navio navio) {
        return colecaoNavios.add(navio);
    }

    public Navio consultaNavio(String nome) {
        for(int i=0; i<colecaoNavios.size(); i++) {
            Navio navio = colecaoNavios.get(i);
            if(navio.getNome().equals(nome))
                return navio;
        }
        return null;
    }

    public boolean consultaNavioBoolean(String nome) {
        for(int i=0; i<colecaoNavios.size(); i++) {
            Navio navio = colecaoNavios.get(i);
            if(navio.getNome().equals(nome))
                return true;
        }
        return false;
    }
    

}




