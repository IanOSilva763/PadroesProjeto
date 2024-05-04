package org.example.PadroesEstruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Topico extends Conteudo {
    private List<Conteudo> conteudos;

    public Topico(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Tópico: " + this.getDescricao() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
