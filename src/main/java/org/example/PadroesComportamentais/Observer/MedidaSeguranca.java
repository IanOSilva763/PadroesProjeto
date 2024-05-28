package org.example.PadroesComportamentais.Observer;
import java.util.Date;
import java.util.Observable;
public class MedidaSeguranca extends Observable{
    private int codErro;
    private String infoErro;
    private String tipoReinicio;

    public MedidaSeguranca(int codErro, String infoErro, String tipoReinicio) {
        this.codErro = codErro;
        this.infoErro = infoErro;
        this.tipoReinicio = tipoReinicio;
    }

    public void displayErro() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "medidas de seguranca serao feitas{" +
                "código do erro=" + codErro +
                ", informacoes do erro='" + infoErro + '\'' +
                ", tipo de reinicializacao='" + tipoReinicio + '\'' +
                '}';
    }

}
