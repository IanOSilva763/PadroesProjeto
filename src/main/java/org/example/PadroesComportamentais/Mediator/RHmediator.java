package org.example.PadroesComportamentais.Mediator;

public class RHmediator {
    private static RHmediator instancia = new RHmediator();

    private RHmediator() {}

    public static RHmediator getInstancia() {
        return instancia;
    }

    public String receberMsgContratacao(String mensagem) {
        return "O RH agradece seu contato.\n"+
                "O Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SetorChefe.getInstancia().mensagemContratacao(mensagem);
    }

    public String receberMsgAgradecimento(String mensagem) {
        return "O RH agradece seu contato.\n"+
                "O Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SetorChefe.getInstancia().mensagemAgradecimento(mensagem);
    }
}
