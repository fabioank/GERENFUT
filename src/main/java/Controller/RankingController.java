package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.JogadorPartidaDAO;
import Model.Jogador;
import Model.JogadorPartida;
import View.RankingView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RankingController {

    private final RankingView view;

    public RankingController(RankingView view) {

        this.view = view;
    }

    public void rankingArtilheiro() {
        
        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();
        List<JogadorPartida> jogadores = new ArrayList<>();
        defaultTableModel.setRowCount(0);
        jogadores = JogadorPartidaDAO.todosOsRegistros();

        jogadores.sort((jogador1, jogador2) -> Integer.compare(jogador2.getGolsMarcados(), jogador1.getGolsMarcados()));

        for (JogadorPartida jogador : jogadores) {
            if (jogador.getGolsMarcados() != 0 ) {
                Object[] jog = {
                    defaultTableModel.getRowCount() + 1 + "°",
                    jogador.getJogador().getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulos_melhor_Jogador(),
                    jogador.getTitulos_melhor_gol()
                };
                defaultTableModel.addRow(jog);
            }
        }
    }

    public void rankingMelhorJogador() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();
        List<JogadorPartida> jogadores = new ArrayList<>();
        defaultTableModel.setRowCount(0);
        jogadores = JogadorPartidaDAO.todosOsRegistros();

        jogadores.sort((jogador1, jogador2) -> Integer.compare(jogador2.getTitulos_melhor_Jogador(), jogador1.getTitulos_melhor_Jogador()));

        for (JogadorPartida jogador : jogadores) {
            if (jogador.getTitulos_melhor_Jogador() != 0) {
                Object[] jog = {
                    defaultTableModel.getRowCount() + 1 + "°",
                    jogador.getJogador().getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulos_melhor_Jogador(),
                    jogador.getTitulos_melhor_gol()};
                defaultTableModel.addRow(jog);
            }
        }
    }

    public void rankingMelhorGol() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();
        List<JogadorPartida> jogadores = new ArrayList<>();
        defaultTableModel.setRowCount(0);
        jogadores = JogadorPartidaDAO.todosOsRegistros();

        jogadores.sort((jogador1, jogador2) -> Integer.compare(jogador2.getTitulos_melhor_gol(), jogador1.getTitulos_melhor_gol()));

        for (JogadorPartida jogador : jogadores) {
            if (jogador.getTitulos_melhor_gol() != 0 ) {
                Object[] jog = {
                    defaultTableModel.getRowCount() + 1 + "°",
                    jogador.getJogador().getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulos_melhor_Jogador(),
                    jogador.getTitulos_melhor_gol()};
                defaultTableModel.addRow(jog);
            }
        }
    }
}
