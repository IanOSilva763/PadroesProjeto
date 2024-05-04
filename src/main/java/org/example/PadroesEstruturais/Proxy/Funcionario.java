package org.example.PadroesEstruturais.Proxy;

public class Funcionario {
    private String nome;
    private boolean admFinanceiro;

    public Funcionario(String nome, boolean admFinanceiro) {
        this.nome = nome;
        this.admFinanceiro = admFinanceiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdmFinanceiro() {
        return admFinanceiro;
    }

    public void setAdmFinanceiro(boolean admFinanceiro) {
        this.admFinanceiro = admFinanceiro;
    }
}
