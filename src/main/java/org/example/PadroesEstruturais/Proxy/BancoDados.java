package org.example.PadroesEstruturais.Proxy;

import java.util.HashMap;
import java.util.Map;

public class BancoDados {
    private static Map<Integer, Comprador> compradores = new HashMap<>();

    public static Comprador getComprador(Integer cpf) {
        return compradores.get(cpf);
    }

    public static void addComprador(Comprador comprador) {
        compradores.put(comprador.getCpf(), comprador);
    }
}
