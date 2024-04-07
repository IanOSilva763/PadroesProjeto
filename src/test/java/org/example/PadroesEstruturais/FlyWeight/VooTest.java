package org.example.PadroesEstruturais.FlyWeight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {
    @Test
    void deveRetornarPassageiro() {
        Voo voo = new Voo();
        voo.marcarVoo("Julia", "Cabo Frio", "RJ");
        voo.marcarVoo("Paulo", "Juiz de Fora", "MG");
        voo.marcarVoo("Ana",  "Cabo Frio", "RJ");
        voo.marcarVoo("Joao", "Vitoria", "ES");

        List<String> saida = Arrays.asList(
                "Passageiro{nome='Julia', cidade='Cabo Frio', uf='RJ'}",
                "Passageiro{nome='Paulo', cidade='Juiz de Fora', uf='MG'}",
                "Passageiro{nome='Ana', cidade='Cabo Frio', uf='RJ'}",
                "Passageiro{nome='Joao', cidade='Vitoria', uf='ES'}");

        assertEquals(saida, voo.obterPassageiros());
    }

    @Test
    void deveRetornarTotalDestinos() {
        Voo voo = new Voo();
        voo.marcarVoo("Julia", "Cabo Frio", "RJ");
        voo.marcarVoo("Paulo", "Juiz de Fora", "MG");
        voo.marcarVoo("Ana",  "Cabo Frio", "RJ");
        voo.marcarVoo("Joao", "Vitoria", "ES");

        assertEquals(3, DestinoFactory.getTotalDestinos());
    }

}