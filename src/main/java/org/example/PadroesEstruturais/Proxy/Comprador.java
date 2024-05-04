package org.example.PadroesEstruturais.Proxy;

import java.util.Arrays;
import java.util.List;

public class Comprador implements IComprador {
    private Integer cpf;
    private String nome;
    private String cep;
    private Integer numCartao;

    public Comprador(int cpf) {
        this.cpf = cpf;
        Comprador objeto = BancoDados.getComprador(cpf);
        this.nome = objeto.nome;
        this.cep = objeto.cep;
        this.numCartao = objeto.numCartao;
    }

    public Comprador(Integer cpf, String nome, String cep, Integer numCartao) {
        this.cpf = cpf;
        this.nome = nome;
        this.cep = cep;
        this.numCartao = numCartao;
    }

    public Integer getCpf() {
        return cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cep);
    }

    @Override
    public List<Integer> obterDadosCompra(Funcionario funcionario) {
        return Arrays.asList(this.cpf, this.numCartao);
    }
}
