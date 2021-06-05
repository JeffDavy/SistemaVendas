package br.sp.tads.classeMae;

/**
 *
 * @author Jeferson Davi
 */
public abstract class Pessoa {
    
    protected String nome;
    protected String email;
    protected String contato1;
    protected String contato2;
    protected String usuario;
    protected String senha;
    protected String tipo;
    protected String estadoAtual;

    public Pessoa(String nome, String email, String contato1, String contato2, String usuario, String senha, String tipo, String estadoAtual) {
        this.nome = nome;
        this.email = email;
        this.contato1 = contato1;
        this.contato2 = contato2;
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
        this.estadoAtual = estadoAtual;
    }

    public Pessoa() {
    }
    
}
