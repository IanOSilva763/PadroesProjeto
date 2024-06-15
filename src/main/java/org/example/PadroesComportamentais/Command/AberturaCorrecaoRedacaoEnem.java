package org.example.PadroesComportamentais.Command;

public class AberturaCorrecaoRedacaoEnem implements Acao {

    private Anual anual;

    public AberturaCorrecaoRedacaoEnem(Anual anual) {
        this.anual = anual;
    }

    public void executar() {
        this.anual.abrirCorrecao();
    }

    public void fechar() {
        this.anual.fecharCorrecao();
    }
}
