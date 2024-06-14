package org.example.PadroesComportamentais.Templatemethod;

public abstract class Vendedor {
    private String nome;
    private int vendalote1;
    private int vendalote2;
    private int vendalote3;

    public String getNome() {
        return nome;
    }

    public Vendedor setNome(String nome) {
        this.nome = nome;
        return this;
    }


    public int getVendalote1() {
        return vendalote1;
    }

    public Vendedor setVendalote1(int vendalote1) {
        this.vendalote1 = vendalote1;
        return this;
    }

    public int getVendalote2() {
        return vendalote2;
    }

    public Vendedor setVendalote2(int vendalote2) {
        this.vendalote2 = vendalote2;
        return this;
    }

    public int getVendalote3() {
        return vendalote3;
    }

    public Vendedor setVendalote3(int vendalote3) {
        this.vendalote3 = vendalote3;
        return this;
    }

    public double calcularQtIngresso() {
        return (this.vendalote1 + this.vendalote2 / 1.5 + this.vendalote3 / 2.0) / 70;
    }

    public abstract String verificarMeta();

    public String getTipo() {
        return "Vendedor";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", meta=" + this.verificarMeta() +
                '}';
    }
}
