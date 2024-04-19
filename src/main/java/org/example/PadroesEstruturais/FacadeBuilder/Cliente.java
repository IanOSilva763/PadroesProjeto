package org.example.PadroesEstruturais.FacadeBuilder;

import java.util.Date;

public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private String genero;
    private Date dataNascimento;
    private int telefone;
     private int renda;
     private String historicoPagamento;
     private int numCartao;

    public Cliente() {
        this.setCpf("");
        this.setNumCartao(0);
        this.setRg("");
    }

    public boolean quitarDivida() {
        return ClienteFacade.verificarPendenciasDivida(this);
    }

    public String getNome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getRg() {
        return rg;
    }

    public Cliente setRg(String rg) {
        this.rg = rg;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Cliente setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Cliente setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public int getTelefone() {
        return telefone;
    }

    public Cliente setTelefone(int telefone) {
        this.telefone = telefone;
        return this;
    }

    public int getRenda() {
        return renda;
    }

    public Cliente setRenda(int renda) {
        this.renda = renda;
        return this;
    }

    public String getHistoricoPagamento() {
        return historicoPagamento;
    }

    public Cliente setHistoricoPagamento(String historicoPagamento) {
        this.historicoPagamento = historicoPagamento;
        return this;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public Cliente setNumCartao(int numCartao) {
        this.numCartao = numCartao;
        return this;
    }
}
