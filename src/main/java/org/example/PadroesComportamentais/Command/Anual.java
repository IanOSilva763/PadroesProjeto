package org.example.PadroesComportamentais.Command;

public class Anual {
    private int ano;
    private String situacao;

    public Anual(int ano) {
        this.ano = ano;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirCorrecao() {
        this.situacao = "Correcao aberta";
    }

    public void fecharCorrecao() {
        this.situacao = "Correcao fechada";
    }
}
