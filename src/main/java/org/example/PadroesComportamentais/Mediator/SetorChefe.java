package org.example.PadroesComportamentais.Mediator;

public class SetorChefe implements Setor {

    private static SetorChefe instancia = new SetorChefe();

    private SetorChefe() {
    }

    public static SetorChefe getInstancia() {
        return instancia;
    }

    public String mensagemContratacao(String mensagem) {
        return "O Setor vem informar a sua contratacao!: " + mensagem;
    }

    public String mensagemAgradecimento(String mensagem) {
        return "O Setor agradece a sua inscricao!: " + mensagem;
    }
}
