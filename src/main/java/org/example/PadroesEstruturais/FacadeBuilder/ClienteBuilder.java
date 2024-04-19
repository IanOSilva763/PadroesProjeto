package org.example.PadroesEstruturais.FacadeBuilder;

import java.util.Date;

public class ClienteBuilder {
    private Cliente cliente;

    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public Cliente build() {
        if (cliente.getNumCartao() == 0 ) {
            throw new IllegalArgumentException("Número do cartão inválido");
        }
        if (cliente.getCpf().equals("")) {
            throw new IllegalArgumentException("Cpf inválido");
        }
        if (cliente.getRg().equals("")) {
            throw new IllegalArgumentException("Rg inválido");
        }
        return cliente;
    }
    public ClienteBuilder setNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder setDataNascimento(Date dataNascimento) {
        cliente.setDataNascimento(dataNascimento);
        return this;
    }

    public ClienteBuilder setCpf(String cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setRg(String rg) {
        cliente.setRg(rg);
        return this;
    }

    public ClienteBuilder setGenero(String genero) {
        cliente.setGenero(genero);
        return this;
    }

    public ClienteBuilder setTelefone(int telefone) {
        cliente.setTelefone(telefone);
        return this;
    }

    public ClienteBuilder setRenda(int renda) {
        cliente.setRenda(renda);
        return this;
    }

    public ClienteBuilder setHistoricoPagamento(String historicoPagamento) {
        cliente.setHistoricoPagamento(historicoPagamento);
        return this;
    }

    public ClienteBuilder setNumCartao(int numCartao) {
        cliente.setNumCartao(numCartao);
        return this;
    }
}
