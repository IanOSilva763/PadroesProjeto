package org.example.PadroesComportamentais.Memento;

public class GitCommitConcluido implements GitCommit {

    private GitCommitConcluido() {};
    private static GitCommitConcluido instance = new GitCommitConcluido();
    public static GitCommitConcluido getInstance() {
        return instance;
    }

    public String getNomeCommit() {
        return "Concluido";
    }
}
