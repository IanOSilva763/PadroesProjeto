package org.example.Singleton;

public class ControleAcesso {
    private ControleAcesso() {};
    private static ControleAcesso instance = new ControleAcesso();
    public static ControleAcesso getInstance() {
        return instance;
    }
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
