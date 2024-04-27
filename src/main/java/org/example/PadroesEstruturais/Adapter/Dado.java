package org.example.PadroesEstruturais.Adapter;

public class Dado {
    BancoDados dados;
    BancoAdapter adaptador;
    public Dado() {
        dados = new BancoNoSql();
        adaptador = new BancoAdapter(dados);
    }
    public void setDados(String noSql) {
        dados.setDados(noSql);
        adaptador.salvarDados();
    }

    public String getDados() {
        return adaptador.recuperarDados();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public String getSql() {
        return adaptador.getSql();
    }
}
