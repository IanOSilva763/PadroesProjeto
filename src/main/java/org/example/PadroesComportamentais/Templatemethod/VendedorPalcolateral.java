package org.example.PadroesComportamentais.Templatemethod;

public class VendedorPalcolateral extends Vendedor {

    public String verificarMeta() {
        if (this.calcularQtIngresso() >= 150) {
            return "Bateu a meta!";
        }
        else {
            return "Não vendeu a meta de ingressos.";
        }
    }
}
