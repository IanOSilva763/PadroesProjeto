package org.example.PadroesComportamentais.Strategy;

public class Compra {
    private float valor;
    public float getValor() {
        return valor;
    }

    public void LucroTotal(float valor1, float valor2) {
        Operacao operacao = new Operacao(valor1, valor2);
        this.valor = operacao.calcular(new AnaliseLucroTotal());
    }

    public void ProdutosVendidos(float valor1, float valor2) {
        Operacao operacao = new Operacao(valor1, valor2);
        this.valor = operacao.calcular(new AnaliseProdutosVendidos());
    }

    public void LucroMensal(float valor1, float valor2) {
        Operacao operacao = new Operacao(valor1, valor2);
        this.valor = operacao.calcular(new AnaliseLucroMensal());
    }
}
