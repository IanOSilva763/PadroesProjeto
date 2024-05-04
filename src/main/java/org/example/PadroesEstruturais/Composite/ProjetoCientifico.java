package org.example.PadroesEstruturais.Composite;

public class ProjetoCientifico {
    private Conteudo ementa;

    public void setEmenta(Conteudo ementa) {
        this.ementa = ementa;
    }

    public String getEmenta() {
        if (this.ementa == null) {
            throw new NullPointerException("Projeto Científico sem ementa");
        }
        return this.ementa.getConteudo();
    }
}
