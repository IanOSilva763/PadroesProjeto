package org.example.PadroesEstruturais.Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlexaTest {
    @Test
    void deveRetornarAlexaErroIluminacao() {
        Alexa alexa = new Alexa();
        Iluminacao.getInstancia().addAlexaComErro(alexa);

        assertEquals(false, alexa.ligar());
    }

    @Test
    void deveRetornarAlexaErroSeguranca() {
        Alexa alexa = new Alexa();
        Seguranca.getInstancia().addAlexaComErro(alexa);

        assertEquals(false, alexa.ligar());
    }

    @Test
    void deveRetornarAlexaErroMidia() {
        Alexa alexa = new Alexa();
        Midia.getInstancia().addAlexaComErro(alexa);

        assertEquals(false, alexa.ligar());
    }

    @Test
    void deveRetornarAlexaSemErro() {
        Alexa alexa = new Alexa();

        assertEquals(true, alexa.ligar());
    }

}