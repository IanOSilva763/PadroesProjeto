package org.example.PadroesComportamentais.Strategy;

public class AnaliseLucroMensal implements Analise{
    public float calcular(float valor1, float valor2) {
        return (valor1 * valor2) / 30;
    }
}
