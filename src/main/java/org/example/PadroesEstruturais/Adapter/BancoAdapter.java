package org.example.PadroesEstruturais.Adapter;

public class BancoAdapter extends BancoSql {

    private BancoDados bancoNoSql;

    public BancoAdapter(BancoDados bancoNoSql) {
        this.bancoNoSql = bancoNoSql;
    }

    public String recuperarDados() {
        if (this.getSql().equals("INSERT INTO tabela (coluna1, coluna2, coluna3) VALUES (valor1, valor2, valor3);"))
            bancoNoSql.setDados("db.colecao.insertOne({ 'campo1': valor1, 'campo2': valor2, 'campo3': valor3});");
        return bancoNoSql.getDados();
    }

    public void salvarDados() {
        if (bancoNoSql.getDados().equals("db.colecao.insertOne({ 'campo1': valor1, 'campo2': valor2, 'campo3': valor3});"))
            this.setSql("INSERT INTO tabela (coluna1, coluna2, coluna3) VALUES (valor1, valor2, valor3);");
        else
            return;
    }
}
