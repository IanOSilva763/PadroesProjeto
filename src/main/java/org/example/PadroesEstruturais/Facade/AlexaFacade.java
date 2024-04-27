package org.example.PadroesEstruturais.Facade;

public class AlexaFacade {
    public static boolean verificarErros(Alexa alexa) {
        if (Iluminacao.getInstancia().verificarAlexaComErro(alexa)) {
            return false;
        }
        if (Seguranca.getInstancia().verificarAlexaComErro(alexa)) {
            return false;
        }
        if (Midia.getInstancia().verificarAlexaComErro(alexa)) {
            return false;
        }
        return true;
    }
}
