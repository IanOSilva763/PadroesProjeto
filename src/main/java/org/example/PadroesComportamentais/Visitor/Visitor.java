package org.example.PadroesComportamentais.Visitor;

public interface Visitor {

    String exibirJuiz(Juiz juiz);
    String exibirCliente(Cliente cliente);
    String exibirAdvogado(Advogado advogado);

}
