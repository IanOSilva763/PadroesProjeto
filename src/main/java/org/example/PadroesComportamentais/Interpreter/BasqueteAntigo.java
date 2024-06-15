package org.example.PadroesComportamentais.Interpreter;

public class BasqueteAntigo {
    private double ponto;

    public double getPonto() {
        return ponto;
    }

    public BasqueteAntigo setPonto(double ponto) {
        this.ponto = ponto;
        return this;
    }

    public double getPontoFalta() {
        return pontoFalta;
    }

    public BasqueteAntigo setPontoFalta(double pontoFalta) {
        this.pontoFalta = pontoFalta;
        return this;
    }

    private double pontoFalta;

    public double calcularPontos() {
        return QtPontos.calcularPontos(this.ponto, this.pontoFalta);
    }
}

