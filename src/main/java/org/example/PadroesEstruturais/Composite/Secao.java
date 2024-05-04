package org.example.PadroesEstruturais.Composite;

public class Secao extends Conteudo {

    private int ordenacao;

    public Secao(String descricao, int ordenacao) {
        super(descricao);
        this.ordenacao = ordenacao;
    }

    public int getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(int ordenacao) {
        this.ordenacao = ordenacao;
    }

    public String getConteudo() {
        return "Seção: " + this.getDescricao() + " - ordenação: " + this.ordenacao + "\n";
    }

}
