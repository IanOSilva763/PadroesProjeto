package org.example.PadroesComportamentais.Templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorPalcoprincipalTest {
    @Test
    void deveRetonarBateuMeta() {
        VendedorPalcoprincipal vendedor = new VendedorPalcoprincipal();
        vendedor.setVendalote1(12000);
        vendedor.setVendalote2(9000);
        vendedor.setVendalote3(4000);
        assertEquals("Bateu a meta!", vendedor.verificarMeta());
    }

    @Test
    void deveRetonarNaoBateuMeta() {
        VendedorPalcoprincipal vendedor = new VendedorPalcoprincipal();
        vendedor.setVendalote1(140);
        vendedor.setVendalote2(210);
        vendedor.setVendalote3(210);
        assertEquals("Não vendeu a meta de ingressos.", vendedor.verificarMeta());
    }

    @Test
    void deveRetornarInformacoes() {
        VendedorPalcoprincipal vendedor = new VendedorPalcoprincipal();
        vendedor.setVendalote1(140);
        vendedor.setVendalote2(210);
        vendedor.setVendalote3(210);
        vendedor.setNome("Katia");
        assertEquals("VendedorPalcoPrincipal{nome='Katia', meta=Não vendeu a meta de ingressos.}", vendedor.getInfo());
    }

}