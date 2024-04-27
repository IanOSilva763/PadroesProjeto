package org.example.PadroesEstruturais.Facade;

public class Alexa {
    public boolean ligar() {
        return AlexaFacade.verificarErros(this);
    }
}
