package org.example.PadroesComportamentais.Visitor;

public class Cliente implements Pessoa{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
