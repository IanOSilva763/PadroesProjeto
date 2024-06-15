package org.example.PadroesComportamentais.Command;

public class FechamentoCorrecaoRedacaoEnem implements Acao {

    private Anual anual;

    public FechamentoCorrecaoRedacaoEnem(Anual anual) {
        this.anual = anual;
    }

    public void executar() {
        this.anual.fecharCorrecao();
    }

    public void fechar() {
        this.anual.abrirCorrecao();
    }
}
