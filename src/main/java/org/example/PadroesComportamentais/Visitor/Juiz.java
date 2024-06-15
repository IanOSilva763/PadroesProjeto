package org.example.PadroesComportamentais.Visitor;

public class Juiz implements Pessoa{
    private String cnj;
    private String nome;

    public Juiz(String nome, String cnj) {
        this.nome = nome;
        this.cnj = cnj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnj() {
        return cnj;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirJuiz(this);
    }
}
