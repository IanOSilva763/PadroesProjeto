package org.example.PadroesComportamentais.Mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {
    @Test
    void deveContratar() {
        Candidato candidato = new Candidato();
        assertEquals("O RH agradece seu contato.\nO Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor vem informar a sua contratacao!: Curriculo1",
                candidato.enviarCurriculoCorreto("Curriculo1"));
    }

    @Test
    void naoDeveContratar() {
        Candidato candidato = new Candidato();
        assertEquals("O RH agradece seu contato.\nO Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor agradece a sua inscricao!: Curriculo2",
                candidato.enviarCurriculo("Curriculo2"));
    }
}