package org.example.PadroesEstruturais.FlyWeight;

public class Destino {
    private String cidade;
    private String uf;

    public Destino(String cidade, String uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
