package org.example.Builder;

import java.util.Date;

public class ClienteBuilder {
    private Cliente cliente;

    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public Cliente build() {
        if (cliente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
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

    public ClienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        cliente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ClienteBuilder setEnderecoNumero(int enderecoNumero) {
        cliente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ClienteBuilder setEnderecoComplemento(String enderecoComplemento) {
        cliente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ClienteBuilder setEnderecoBairro(String enderecoBairro) {
        cliente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ClienteBuilder setEnderecoCidade(String enderecoCidade) {
        cliente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ClienteBuilder setEnderecoUF(String enderecoUF) {
        cliente.setEnderecoUF(enderecoUF);
        return this;
    }

    public ClienteBuilder setCep(String cep) {
        cliente.setCep(cep);
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        cliente.setEmail(email);
        return this;
    }
}
