package org.example.PadroesComportamentais.Visitor;

public class Advogado implements Pessoa{
    private String oab;
    private String nome;
    private String cnj;

    public Advogado(String oab, String nome, String cnj) {
    this.oab = oab;
    this.nome = nome;
    this.cnj = cnj;
}
    public String getOab() {
        return oab;
    }

    public String getNome() {
        return nome;
    }

    public String getCnj() {
        return cnj;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirAdvogado(this);
    }

}
