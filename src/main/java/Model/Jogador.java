package Model;

public class Jogador {

    private Long id;
    private String nome;
    private String cpf;
    private short numero;
    private String posicao;
    private String senha;
    private boolean situacao;

    public Jogador() {}

    public Jogador(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Jogador(String name, short numero, String posicao) {
        this.nome = name;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(String name, short numero, String posicao, boolean situacao) {
        this.nome = name;
        this.numero = numero;
        this.posicao = posicao;
        this.situacao = situacao;
    }
    public Jogador(Long id, String name, short numero, String posicao, boolean situacao) {
        this.id = id;
        this.nome = name;
        this.numero = numero;
        this.posicao = posicao;
        this.situacao = situacao;
    }
    public Jogador(String name, String cpf, short numero, String posicao, String senha, boolean situacao) {
        this.nome = name;
        this.cpf = cpf;
        this.numero = numero;
        this.posicao = posicao;
        this.senha = senha;
        this.situacao = situacao;
    }
    public Jogador(Long id, String name, String cpf, short numero, String posicao, String senha, boolean situacao) {
        this.id = id;
        this.nome = name;
        this.cpf = cpf;
        this.numero = numero;
        this.posicao = posicao;
        this.senha = senha;
        this.situacao = situacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
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

    public void setNumero(short numero) {
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

    public String toString() {
        return numero + " - " + nome + " (" + posicao + ")";
    }

}
