package org.example.PadroesComportamentais.Observer;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AplicativoTest {
    @Test
    void deveNotificarUmAplicativo() {
        MedidaSeguranca medidaSeguranca = new MedidaSeguranca(1, "Erro ocorreu na inicialização", "Verificar integridade dos arquivos e iniciar");
        Aplicativo aplicativo = new Aplicativo("Aplicativo 1");
        aplicativo.reinicio(medidaSeguranca);
        medidaSeguranca.displayErro();
        assertEquals("Aplicativo 1, esse aplicativo travou e algumas medidas de seguranca serao feitas{código do erro=1, informacoes do erro='Erro ocorreu na inicialização', tipo de reinicializacao='Verificar integridade dos arquivos e iniciar'}", aplicativo.getLastCrash());
    }

    @Test
    void deveNotificarAplicativos() {
        MedidaSeguranca medidaSeguranca = new MedidaSeguranca(2, "Erro ocorreu no na transferencia de dados", "iniciar com segurança");
        Aplicativo aplicativo2 = new Aplicativo("Aplicativo 2");
        Aplicativo aplicativo3 = new Aplicativo("Aplicativo 3");
        aplicativo2.reinicio(medidaSeguranca);
        aplicativo3.reinicio(medidaSeguranca);
        medidaSeguranca.displayErro();
        assertEquals("Aplicativo 2, esse aplicativo travou e algumas medidas de seguranca serao feitas{código do erro=2, informacoes do erro='Erro ocorreu no na transferencia de dados', tipo de reinicializacao='iniciar com segurança'}", aplicativo2.getLastCrash());
        assertEquals("Aplicativo 3, esse aplicativo travou e algumas medidas de seguranca serao feitas{código do erro=2, informacoes do erro='Erro ocorreu no na transferencia de dados', tipo de reinicializacao='iniciar com segurança'}", aplicativo3.getLastCrash());
    }

    @Test
    void naoDeveNotificarErro() {
        MedidaSeguranca medidaSeguranca = new MedidaSeguranca(22, "Erro", "reiniciar");
        Aplicativo aplicativo = new Aplicativo("Aplicativo");
        medidaSeguranca.displayErro();
        assertEquals(null, aplicativo.getLastCrash());
    }

    @Test
    void deveNotificarErroDoAplicativoA() {
        MedidaSeguranca medidaSegurancaA = new MedidaSeguranca(4, "Erro ocorreu devido a sobrecarga da cpu", "iniciar com segurança");
        MedidaSeguranca medidaSegurancaB = new MedidaSeguranca(5, "Erro ocorreu devido a incompatibilidade de versões", "instalar e iniciar");
        Aplicativo aplicativoA = new Aplicativo("AplicativoA");
        Aplicativo aplicativoB = new Aplicativo("AplicativoB");
        aplicativoA.reinicio(medidaSegurancaA);
        aplicativoB.reinicio(medidaSegurancaB);
        medidaSegurancaA.displayErro();
        assertEquals("AplicativoA, esse aplicativo travou e algumas medidas de seguranca serao feitas{código do erro=4, informacoes do erro='Erro ocorreu devido a sobrecarga da cpu', tipo de reinicializacao='iniciar com segurança'}", aplicativoA.getLastCrash());
        assertEquals(null, aplicativoB.getLastCrash());
    }
}