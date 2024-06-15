package org.example.PadroesComportamentais.Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasqueteAntigoTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        BasqueteAntigo basqueteAntigo = new BasqueteAntigo();
        basqueteAntigo.setPonto(2.0);
        basqueteAntigo.setPontoFalta(5.0);

        assertEquals(9.0, basqueteAntigo.calcularPontos());
    }
}