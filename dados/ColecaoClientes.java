package dados;
// Classe colecao de Clientes

import java.util.ArrayList;

public class ColecaoClientes {
    private ArrayList<Cliente> colecaoClientes; 

    
    public ColecaoClientes() {
        colecaoClientes = new ArrayList<Cliente>();
    }

   
    public boolean insereCliente(Cliente cliente) {
        return colecaoClientes.add(cliente);
    }

    public Cliente consultaCliente(int cod, String email) {
        for(int i=0; i<colecaoClientes.size(); i++) {
            Cliente cliente = colecaoClientes.get(i);
            if(cliente.getCod() == cod || cliente.getEmail().equals(email))
                return cliente;
        }
        return null;
    }

    public boolean consultaClienteBoolean(int cod, String email) {
        for(int i=0; i<colecaoClientes.size(); i++) {
            Cliente cliente = colecaoClientes.get(i);
            if(cliente.getCod() == cod || cliente.getEmail().equals(email))
                return true;
        }
        return false;
    }

}
