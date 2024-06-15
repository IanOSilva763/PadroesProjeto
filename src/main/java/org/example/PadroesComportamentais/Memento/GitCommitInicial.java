package org.example.PadroesComportamentais.Memento;

public class GitCommitInicial implements GitCommit {

    private GitCommitInicial() {};
    private static GitCommitInicial instance = new GitCommitInicial();
    public static GitCommitInicial getInstance() {
        return instance;
    }

    public String getNomeCommit() {
        return "Inicial";
    }
}
