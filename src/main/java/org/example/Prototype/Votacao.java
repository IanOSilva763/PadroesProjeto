package org.example.Prototype;

public class Votacao implements Cloneable {
    private String nome;
    private String totalVotos;
    private Atualizacao atualizacao;
    private String localPesquisado;

    public Votacao(String nome, String totalVotos, Atualizacao atualizacao, String localPesquisado) {
        this.nome = nome;
        this.totalVotos = totalVotos;
        this.atualizacao = atualizacao;
        this.localPesquisado = localPesquisado;
    }


    public String getNome() {
        return nome;
    }

    public Votacao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public Votacao setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
        return this;
    }

    public Atualizacao getAtualizacao() {
        return atualizacao;
    }

    public Votacao setAtualizacao(Atualizacao atualizacao) {
        this.atualizacao = atualizacao;
        return this;
    }

    public String getLocalPesquisado() {
        return localPesquisado;
    }

    public Votacao setLocalPesquisado(String localPesquisado) {
        this.localPesquisado = localPesquisado;
        return this;
    }


    @Override
    public Votacao clone() throws CloneNotSupportedException {
        Votacao votacaoClone = (Votacao) super.clone();
        votacaoClone.atualizacao = (Atualizacao) votacaoClone.atualizacao.clone();
        return votacaoClone;
    }

    @Override
    public String toString() {
        return "Votacao{" +
                "nome='" + nome + '\'' +
                ", totalVotos='" + totalVotos + '\'' +
                ", atualizacao=" + atualizacao +
                ", localPesquisado='" + localPesquisado + '\'' +
                '}';
    }
}
