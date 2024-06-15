package org.example.PadroesComportamentais.Visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirJuiz() {
        Juiz juiz = new Juiz("Ana", "1021312-2312.548");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Juiz{nome='Ana', CNJ=1021312-2312.548}", visitor.exibir(juiz));
    }

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente("Maria");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{nome='Maria'}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirAdvogado() {
        Advogado advogado = new Advogado("168.347.160-02", "Pedro", "5000683-1667.348");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Advogado{OAB=168.347.160-02, nome='Pedro', CNJ=5000683-1667.348}", visitor.exibir(advogado));
    }
}