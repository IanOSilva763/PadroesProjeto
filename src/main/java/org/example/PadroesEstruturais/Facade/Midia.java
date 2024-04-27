package org.example.PadroesEstruturais.Facade;

public class Midia extends Sistema {

    private static Midia midia = new Midia();

    private Midia() {};

    public static Midia getInstancia() {
        return midia;
    }
}
