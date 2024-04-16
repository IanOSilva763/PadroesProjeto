package org.example.PadroesEstruturais.FacadeBuilder;

public class Seguranca extends Setor{
    public static Seguranca seguranca = new Seguranca();

    private Seguranca() {
    }

    public static Seguranca getInstancia() {
        return seguranca;
    }
}
