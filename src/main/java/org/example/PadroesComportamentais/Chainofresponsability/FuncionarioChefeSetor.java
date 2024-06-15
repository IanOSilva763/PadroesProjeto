package org.example.PadroesComportamentais.Chainofresponsability;

public class FuncionarioChefeSetor extends Funcionario {

    public FuncionarioChefeSetor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoNotaFiscal.getTipoDocumentoNotaFiscal());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Chefe Setor";
    }
}
