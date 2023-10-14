package Model;

import java.util.Date;


public class Partida {
    
    private int id_partida;
    private Date data;
    private String melhor_jogador;
    private String melhor_gol;
    
    private Time timeCasa;
    private Time timeVisitante;

    public Partida(int id_partida, Date data, String melhor_jogador, String melhor_gol, Time timeCasa, Time timeVisitante) {
        this.id_partida = id_partida;
        this.data = data;
        this.melhor_jogador = melhor_jogador;
        this.melhor_gol = melhor_gol;
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    

    public int getId_partida() {
        return id_partida;
    }

    public void setId_partida(int id_partida) {
        this.id_partida = id_partida;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMelhor_jogador() {
        return melhor_jogador;
    }

    public void setMelhor_jogador(String melhor_jogador) {
        this.melhor_jogador = melhor_jogador;
    }

    public String getMelhor_gol() {
        return melhor_gol;
    }

    public void setMelhor_gol(String melhor_gol) {
        this.melhor_gol = melhor_gol;
    }
}
