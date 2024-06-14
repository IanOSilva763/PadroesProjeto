package org.example.PadroesComportamentais.Templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorPalcolateralTest {
    @Test
    void deveRetonarAprovado() {
        VendedorPalcolateral vendedor = new VendedorPalcolateral();
        vendedor.setVendalote1(5000);
        vendedor.setVendalote2(6000);
        vendedor.setVendalote3(3000);
        assertEquals("Bateu a meta!", vendedor.verificarMeta());
    }

    @Test
    void deveRetonarReprovado() {
        VendedorPalcolateral vendedor = new VendedorPalcolateral();
        vendedor.setVendalote1(140);
        vendedor.setVendalote2(210);
        vendedor.setVendalote3(210);
        assertEquals("Não vendeu a meta de ingressos.", vendedor.verificarMeta());
    }

    @Test
    void deveRetornarInformacoes() {
        VendedorPalcolateral vendedor = new VendedorPalcolateral();
        vendedor.setVendalote1(140);
        vendedor.setVendalote2(210);
        vendedor.setVendalote3(210);
        vendedor.setNome("Marcelo");
        assertEquals("Vendedor{nome='Marcelo', meta=Não vendeu a meta de ingressos.}", vendedor.getInfo());
    }
}