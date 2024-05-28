package org.example.PadroesComportamentais.Observer;

import java.util.Observable;
import java.util.Observer;

public class Aplicativo implements Observer{
    private String nome;
    private String lastCrash;

    public Aplicativo(String nome) {
        this.nome =nome;
    }
    public String getLastCrash() {
        return this.lastCrash;
    }
    public void reinicio(MedidaSeguranca medidaSeguranca) {
        medidaSeguranca.addObserver(this);
    }
    public void update(Observable medidaSeguranca, Object arg1) {
        this.lastCrash = this.nome + ", esse aplicativo travou e algumas " + medidaSeguranca.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
