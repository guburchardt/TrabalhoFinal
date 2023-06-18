package dados;
// Classe catalogo de carros

import java.util.*;

public class ColecaoCargas {
    private Queue<Carga> colecaoCarga; 

    
    public ColecaoCargas() {
        colecaoCarga = new LinkedList <Carga>();
    }

   
    public boolean insereCarga(Carga carga) {
        return colecaoCarga.add(carga);
    }

    public Carga consultaCarga(int identificador) {
        for (Carga carga : colecaoCarga) {
            if (carga.getIdentificador() == identificador)
                return carga;
        }
        return null;
    }

    /*public boolean consultaClienteBoolean(String cod, String email) {
        for(int i=0; i<colecaoCarga.size(); i++) {
            Cliente cliente = colecaoCarga.get(i);
            if(cliente.getCod().equals(cod) || cliente.getEmail().equals(email))
                return true;
        }
        return false;
    }
    */
}
