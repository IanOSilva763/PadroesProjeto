package org.example.PadroesComportamentais.Memento;

public class GitCommitTratamentoExcecao implements GitCommit {

    private GitCommitTratamentoExcecao() {};
    private static GitCommitTratamentoExcecao instance = new GitCommitTratamentoExcecao();
    public static GitCommitTratamentoExcecao getInstance() {
        return instance;
    }

    public String getNomeCommit() {
        return "Tratamento de Excecao";
    }
}
