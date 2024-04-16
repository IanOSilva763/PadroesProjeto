package org.example.PadroesEstruturais.FacadeBuilder;
import java.util.ArrayList;
import java.util.List;
public abstract class Setor {
    public List<Cliente> clientesEndividados = new ArrayList<Cliente>();

    public void addClienteEndividado(Cliente cliente){
        this.clientesEndividados.add(cliente);
    }

    public boolean verificarClientesEndividados(Cliente cliente) {
        return this.clientesEndividados.contains(cliente);
    }

}
