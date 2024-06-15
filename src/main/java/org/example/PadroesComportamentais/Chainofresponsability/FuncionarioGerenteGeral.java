package org.example.PadroesComportamentais.Chainofresponsability;

public class FuncionarioGerenteGeral extends Funcionario {

    public FuncionarioGerenteGeral(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoPessoal.getTipoDocumentoPessoal());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente Geral";
    }
}
