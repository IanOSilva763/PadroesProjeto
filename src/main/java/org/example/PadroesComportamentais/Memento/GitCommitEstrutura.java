package org.example.PadroesComportamentais.Memento;

public class GitCommitEstrutura implements GitCommit {

    private GitCommitEstrutura() {};
    private static GitCommitEstrutura instance = new GitCommitEstrutura();
    public static GitCommitEstrutura getInstance() {
        return instance;
    }

    public String getNomeCommit() {
        return "Estrutura";
    }
}
