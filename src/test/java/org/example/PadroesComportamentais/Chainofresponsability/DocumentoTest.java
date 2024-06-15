package org.example.PadroesComportamentais.Chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioGerenteGeral gerenteGeral;
    FuncionarioChefeSetor chefeSetor;
    FuncionarioCrediarista crediarista;

    @BeforeEach
    void setUp() {
        gerenteGeral = new FuncionarioGerenteGeral(null);
        chefeSetor = new FuncionarioChefeSetor(gerenteGeral);
        crediarista = new FuncionarioCrediarista(chefeSetor);
    }

    @Test
    void deveRetornarCrediaristaParaBoleto() {
        assertEquals("Crediarista", crediarista.assinarDocumento(new Documento(TipoDocumentoBoleto.getTipoDocumentoBoleto())));
    }

    @Test
    void deveRetornarChefeSetorParaNotaFiscal() {
        assertEquals("Chefe Setor", chefeSetor.assinarDocumento(new Documento(TipoDocumentoNotaFiscal.getTipoDocumentoNotaFiscal())));
    }

    @Test
    void deveRetornarGerenteGeralParaPessoal() {
        assertEquals("Gerente Geral", gerenteGeral.assinarDocumento(new Documento(TipoDocumentoPessoal.getTipoDocumentoPessoal())));
    }

    @Test
    void deveRetornarSemAssinaturaParaNotaFiscal() {
        assertEquals("Sem assinatura", gerenteGeral.assinarDocumento(new Documento(TipoDocumentoNotaFiscal.getTipoDocumentoNotaFiscal())));
    }

}