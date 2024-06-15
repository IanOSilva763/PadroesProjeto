package org.example.PadroesComportamentais.Chainofresponsability;

public class FuncionarioCrediarista extends Funcionario {

    public FuncionarioCrediarista(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoBoleto.getTipoDocumentoBoleto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Crediarista";
    }
}
