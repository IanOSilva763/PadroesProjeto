package org.example.PadroesCriacao.FactoryMethod;

import org.example.PadroesCriacao.FactoryMethod.Documentar;

public class ImpressaoFactory {
    public static Documentar obterImpressao(String impressao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.PadroesCriacao.FactoryMethod.Impressao" + impressao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Opção inexistente");
        }
        if (!(objeto instanceof Documentar)) {
            throw new IllegalArgumentException("Opção inválida");
        }
        return (Documentar) objeto;
    }
}
