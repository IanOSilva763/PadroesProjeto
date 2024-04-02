package org.example.FactoryMethod;

public class ImpressaoFactory {
    public static Documentar obterImpressao(String impressao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.FactoryMethod.Impressao" + impressao);
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
