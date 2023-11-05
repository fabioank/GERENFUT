package Model;

import java.util.List;

public class Time {
    
    private int id_time;
    private String nome;
    private int pontos;
    private List<Jogador> jogador;

    public Time() {
    }
    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    public Time(String nome, List<Jogador> jogador) {
        this.nome = nome;
        this.jogador = jogador;
    }
    
    public Time(int id_time, String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
        this.id_time = id_time;
    }
    public Time(int id_time, String nome, List<Jogador> jogador) {
        this.id_time = id_time;
        this.nome = nome;
        this.jogador = jogador;
    }

    public int getId_time() {
        return id_time;
    }

    public void setId_time(int id_time) {
        this.id_time = id_time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(short pontos) {
        this.pontos = pontos;
    }

    public List<Jogador> getJogador() {
        return jogador;
    }

    public void setJogador(List<Jogador> jogador) {
        this.jogador = jogador;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
