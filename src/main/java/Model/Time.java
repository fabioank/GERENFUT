package Model;

import java.util.List;

public class Time {
    
    private int id_time;
    private String nome;
    private short pontos;
    private List<Jogador> jogador;

    public Time(String nome, short pontos){
        this.nome = nome;
        this.pontos = pontos;
    }
    public Time(int id_time, String nome, short pontos, List<Jogador> jogador) {
        this.id_time = id_time;
        this.nome = nome;
        this.pontos = pontos;
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

    public short getPontos() {
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
}
