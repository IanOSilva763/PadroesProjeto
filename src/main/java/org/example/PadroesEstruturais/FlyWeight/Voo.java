package org.example.PadroesEstruturais.FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private List<Passageiro> passageiros = new ArrayList<>();

    public void marcarVoo(String nomePassageiro, String nomeDestino, String uf) {
        Destino destino = DestinoFactory.getDestino(nomeDestino, uf);
        Passageiro passageiro = new Passageiro(nomePassageiro, destino);
        passageiros.add(passageiro);
    }

    public List<String> obterPassageiros() {
        List<String> saida = new ArrayList<String>();
        for (Passageiro passageiro : this.passageiros) {
            saida.add(passageiro.obterPassageiro());
        }
        return saida;
    }
}
