package org.example.Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VotacaoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Votacao votacao = new Votacao("votacao original", "123", new Atualizacao("13h as 17h", "45"), "Juiz de Fora");

        Votacao votacaoClone = votacao.clone();
        votacaoClone.setNome("Votacao Clonada");
        votacaoClone.getAtualizacao().setHorario("2h a 4h");

        assertEquals("Votacao{nome='votacao original', totalVotos='123', atualizacao=Atualizacao{horario='13h as 17h', qtVotos=45}, localPesquisado='Juiz de Fora'}", votacao.toString());
        assertEquals("Votacao{nome='Votacao Clonada', totalVotos='123', atualizacao=Atualizacao{horario='2h a 4h', qtVotos=45}, localPesquisado='Juiz de Fora'}", votacaoClone.toString());
    }
}
