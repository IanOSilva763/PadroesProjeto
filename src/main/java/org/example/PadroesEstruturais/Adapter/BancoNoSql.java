package org.example.PadroesEstruturais.Adapter;

public class BancoNoSql implements BancoDados {

    private String noSql;

    @Override
    public String getDados() {
        return this.noSql;
    }

    @Override
    public void setDados(String noSql) {
        this.noSql = noSql;
    }
}
