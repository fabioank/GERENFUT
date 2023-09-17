package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int id;
    private String name;
    private String cpf;
    private int numero;
    private String posicao;
    private String senha;

    public Jogador(String cpf, String senha){
    }
    public Jogador(String name, int numero, String posicao){
        this.name = name;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(int id, String name, int numero, String posicao) {
        this.id = id;
        this.name = name;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(int id, String name, String cpf, int numero, String posicao) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.numero = numero;
        this.posicao = posicao;
        this.senha = senha;
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
}