package org.example.PadroesEstruturais.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class DestinoFactory {
    private static Map<String, Destino> destinos = new HashMap<>();

    public static Destino getDestino(String cidade, String uf) {
        Destino destino = destinos.get(cidade);
        if (destino == null) {
            destino = new Destino(cidade, uf);
            destinos.put(cidade, destino);
        }
        return destino;
    }

    public static int getTotalDestinos() {
        return destinos.size();
    }

}
