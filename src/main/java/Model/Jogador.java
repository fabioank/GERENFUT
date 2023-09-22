package Model;

public class Jogador {

    private int id;
    private String name;
    private String cpf;
    private int numero;
    private String posicao;
    private String senha;
    private boolean situacao;

    //contstrutor para login
    public Jogador(String cpf, String senha){
        this.cpf = cpf;
        this.senha = senha;
    }
    public Jogador(String name, int numero, String posicao){
        this.name = name;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(String name, int numero, String posicao, boolean situacao){
        this.name = name;
        this.numero = numero;
        this.posicao = posicao;
        this.situacao = situacao;
    }
    public Jogador(int id, String name, int numero, String posicao) {
        this.id = id;
        this.name = name;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(int id, String name, String cpf, int numero, String posicao, String senha,boolean situacao) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.numero = numero;
        this.posicao = posicao;
        this.senha = senha;
        this.situacao = situacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
}