package org.example.PadroesComportamentais.Iterator;

public class Funcionario {
    private String nome;
    private boolean administrador;

    public Funcionario(String nome, boolean administrador) {
        this.nome = nome;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAtivo(boolean administrador) {
        this.administrador = administrador;
    }
}
