package org.example.PadroesEstruturais.Composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoCientificoTest {
    @Test
    void deveRetornarEmentaDisciplina() {
        Topico topico1 = new Topico("Introdução");
        Secao secao11 = new Secao("Justificativa", 2);
        Secao secao12 = new Secao("Questão de Investigação", 3);
        Secao secao13 = new Secao("Objetivos", 4);
        topico1.addConteudo(secao11);
        topico1.addConteudo(secao12);
        topico1.addConteudo(secao13);

        Topico topico2 = new Topico("Metodologia");

        Topico topico3 = new Topico("Referencial Teórico");

        Topico topico4 = new Topico("Trabalhos Relacionados");

        Topico ementa = new Topico("TCC");
        ementa.addConteudo(topico1);
        ementa.addConteudo(topico2);
        ementa.addConteudo(topico3);
        ementa.addConteudo(topico4);

        ProjetoCientifico projetoCientifico = new ProjetoCientifico();
        projetoCientifico.setEmenta(ementa);

        assertEquals("Tópico: TCC\n" +
                "Tópico: Introdução\n" +
                "Seção: Justificativa - ordenação: 2\n" +
                "Seção: Questão de Investigação - ordenação: 3\n" +
                "Seção: Objetivos - ordenação: 4\n" +
                "Tópico: Metodologia\n" +
                "Tópico: Referencial Teórico\n" +
                "Tópico: Trabalhos Relacionados\n", projetoCientifico.getEmenta());
    }

    @Test
    void deveRetornarExcecaoProjetoCientificoSemEmenta() {
        try {
            ProjetoCientifico projetoCientifico = new ProjetoCientifico();
            projetoCientifico.getEmenta();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Projeto Científico sem ementa", e.getMessage());
        }
    }
}