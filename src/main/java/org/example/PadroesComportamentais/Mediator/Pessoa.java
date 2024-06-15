package org.example.PadroesComportamentais.Mediator;

public class Pessoa {
    public String enviarCurriculoCorreto(String mensagem) {
        return RHmediator.getInstancia().receberMsgContratacao(mensagem);
    }

    public String enviarCurriculo(String mensagem) {
        return RHmediator.getInstancia().receberMsgAgradecimento(mensagem);
    }
}
