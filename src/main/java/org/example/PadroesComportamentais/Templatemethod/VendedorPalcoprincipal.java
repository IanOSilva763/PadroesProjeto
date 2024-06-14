package org.example.PadroesComportamentais.Templatemethod;

public class VendedorPalcoprincipal extends Vendedor {

    public String verificarMeta() {
        if (this.calcularQtIngresso() >= 200) {
            return "Bateu a meta!";
        }
        else {
            return "Não vendeu a meta de ingressos.";
        }
    }

    @Override
    public String getTipo() {
        return "VendedorPalcoPrincipal";
    }
}
