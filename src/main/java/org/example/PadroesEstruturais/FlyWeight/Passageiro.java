package org.example.PadroesEstruturais.FlyWeight;

public class Passageiro {
    private String nome;
    private Destino localDestino;

    public Passageiro(String nome, Destino localDestino) {
        this.nome = nome;
        this.localDestino = localDestino;
    }

    public String obterPassageiro() {
        return "Passageiro{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + localDestino.getCidade() + '\'' +
                ", uf='" + localDestino.getUf() + '\'' +
                '}';
    }
}
