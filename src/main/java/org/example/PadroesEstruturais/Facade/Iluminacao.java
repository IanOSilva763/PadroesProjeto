package org.example.PadroesEstruturais.Facade;

public class Iluminacao extends Sistema {

    private static Iluminacao iluminacao = new Iluminacao();

    private Iluminacao() {};

    public static Iluminacao getInstancia() {
        return iluminacao;
    }
}
