package org.example.PadroesComportamentais.Memento;

import java.util.ArrayList;
import java.util.List;

public class Git {
    private GitCommit commit;
    private List<GitCommit> memento = new ArrayList<GitCommit>();

    public GitCommit getCommit() {
        return this.commit;
    }

    public void setCommit(GitCommit commit) {
        this.commit = commit;
        this.memento.add(this.commit);
    }

    public void commitAnterior(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.commit = this.memento.get(indice);
    }

    public List<GitCommit> getCommits() {
        return this.memento;
    }
}
