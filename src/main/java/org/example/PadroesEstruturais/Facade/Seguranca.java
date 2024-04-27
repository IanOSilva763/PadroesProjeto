package org.example.PadroesEstruturais.Facade;

public class Seguranca extends Sistema {

    private static Seguranca seguranca = new Seguranca();

    private Seguranca() {};

    public static Seguranca getInstancia() {
        return seguranca;
    }
}
