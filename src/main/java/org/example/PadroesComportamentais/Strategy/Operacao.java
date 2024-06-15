package org.example.PadroesComportamentais.Strategy;

public class Operacao {
    private float valor1;
    private float valor2;

    public Operacao(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(Analise analise) {
        return analise.calcular(valor1, valor2);
    }
}
