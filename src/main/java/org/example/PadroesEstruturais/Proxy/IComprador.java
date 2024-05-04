package org.example.PadroesEstruturais.Proxy;

import java.util.List;

public interface IComprador {
    List<String> obterDadosPessoais();
    List<Integer> obterDadosCompra(Funcionario funcionario);
}
