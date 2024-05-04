package org.example.PadroesEstruturais.Proxy;

import java.util.List;

public class CompradorProxy implements IComprador {
    private Comprador comprador;

    private Integer cpf;

    public CompradorProxy(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.comprador == null) {
            this.comprador = new Comprador(this.cpf);
        }
        return this.comprador.obterDadosPessoais();
    }

    @Override
    public List<Integer> obterDadosCompra(Funcionario funcionario) {
        if (!funcionario.isAdmFinanceiro()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.comprador == null) {
            this.comprador = new Comprador(this.cpf);
        }
        return this.comprador.obterDadosCompra(funcionario);
    }
}
