package org.example.PadroesComportamentais.Visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirJuiz(Juiz juiz) {
        return "Juiz{" +
                "nome='" + juiz.getNome() + '\'' +
                ", CNJ=" + juiz.getCnj() +
                '}';
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "nome='" + cliente.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirAdvogado(Advogado advogado) {
        return "Advogado{" +
                "OAB=" + advogado.getOab() +
                ", nome='" + advogado.getNome() + '\'' +
                ", CNJ=" + advogado.getCnj() +
                '}';
    }
}
