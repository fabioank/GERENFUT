package Model;

import java.util.Objects;

public class JogadorPartida {
    
    private Jogador jogador;
    private short golsMarcados;
    private short titulos_melhor_Jogador;
    private short titulos_melhor_gol;

   public JogadorPartida(){
       
   }
   public JogadorPartida(Jogador jogador, short golsMarcados){
       this.jogador = jogador;
       this.golsMarcados = golsMarcados;
   }
   public JogadorPartida(Jogador jogador){
       this.jogador = jogador;
   }
    public JogadorPartida(Jogador jogador, short golsMarcados, short titulos_melhor_Jogador, short titulos_melhor_gol) {
        this.jogador = jogador;
        this.golsMarcados = golsMarcados;
        this.titulos_melhor_Jogador = titulos_melhor_Jogador;
        this.titulos_melhor_gol = titulos_melhor_gol;
    }
   
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public short getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(short golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public short getTitulos_melhor_Jogador() {
        return titulos_melhor_Jogador;
    }

    public void setTitulos_melhor_Jogador(byte titulos_melhor_Jogador) {
        this.titulos_melhor_Jogador = titulos_melhor_Jogador;
    }

    public short getTitulos_melhor_gol() {
        return titulos_melhor_gol;
    }

    public void setTitulos_melhor_gol(byte titulos_melhor_gol) {
        this.titulos_melhor_gol = titulos_melhor_gol;
    }   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JogadorPartida other = (JogadorPartida) obj;
        return Objects.equals(jogador, other.jogador);
    }

}
