package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.RankingView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class RankingController {

    private final RankingView view;

    public RankingController(RankingView view) {

        this.view = view;
    }

    public void rankingArtilheiro() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();
        List<Jogador> jogadores = new ArrayList<>();
        defaultTableModel.setRowCount(0);
        jogadores = JogadorDAO.listaTodosJogadores();

        jogadores.sort((jogador1, jogador2) -> Integer.compare(jogador2.getGolsMarcados(), jogador1.getGolsMarcados()));

        for (Jogador jogador : jogadores) {
            if (jogador.isSituacao() == true && jogador.getGolsMarcados() != 0 ) {
                Object[] jog = {
                    defaultTableModel.getRowCount() + 1 + "°",
                    jogador.getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulosMelhorJogador(),
                    jogador.getTitulosMelhorGol()};
                defaultTableModel.addRow(jog);
            }
        }
    }

    public void rankingMelhorJogador() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();
        List<Jogador> jogadores = new ArrayList<>();
        defaultTableModel.setRowCount(0);
        jogadores = JogadorDAO.listaTodosJogadores();

        jogadores.sort((jogador1, jogador2) -> Integer.compare(jogador2.getTitulosMelhorJogador(), jogador1.getTitulosMelhorJogador()));

        for (Jogador jogador : jogadores) {
            if (jogador.isSituacao() == true && jogador.getTitulosMelhorJogador() != 0) {
                Object[] jog = {
                    defaultTableModel.getRowCount() + 1 + "°",
                    jogador.getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulosMelhorJogador(),
                    jogador.getTitulosMelhorGol()};
                defaultTableModel.addRow(jog);
            }
        }
    }

    public void rankingMelhorGol() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();
        List<Jogador> jogadores = new ArrayList<>();
        defaultTableModel.setRowCount(0);
        jogadores = JogadorDAO.listaTodosJogadores();

        jogadores.sort((jogador1, jogador2) -> Integer.compare(jogador2.getTitulosMelhorGol(), jogador1.getTitulosMelhorGol()));

        for (Jogador jogador : jogadores) {
            if (jogador.isSituacao() == true && jogador.getTitulosMelhorGol() != 0 ) {
                Object[] jog = {
                    defaultTableModel.getRowCount() + 1 + "°",
                    jogador.getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulosMelhorJogador(),
                    jogador.getTitulosMelhorGol()};
                defaultTableModel.addRow(jog);
            }
        }
    }
}
