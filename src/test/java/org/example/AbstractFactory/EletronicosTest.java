package org.example.AbstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EletronicosTest {
    @Test
    void deveEmitirCelularApple() {
        FabricaAbstrata fabrica = new FabricaApple();
        Eletronicos eletronicos = new Eletronicos(fabrica);
        assertEquals("Iphone", eletronicos.emitirCelular());
    }

    @Test
    void deveEmitirCelularAsus() {
        FabricaAbstrata fabrica = new FabricaAsus();
        Eletronicos eletronicos = new Eletronicos(fabrica);
        assertEquals("Zenfone", eletronicos.emitirCelular());
    }

    @Test
    void deveEmitirNotebookApple() {
        FabricaAbstrata fabrica = new FabricaApple();
        Eletronicos eletronicos = new Eletronicos(fabrica);
        assertEquals("Macbook", eletronicos.emitirNotebook());
    }

    @Test
    void deveEmitirNotebookAsus() {
        FabricaAbstrata fabrica = new FabricaAsus();
        Eletronicos eletronicos = new Eletronicos(fabrica);
        assertEquals("Notebook Asus", eletronicos.emitirNotebook());
    }

}