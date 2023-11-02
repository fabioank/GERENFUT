package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.RankingView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RankingController {

    private final RankingView view;

    public RankingController(RankingView view) {

        this.view = view;
    }

    public void addJogadoresRanking() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblRankingJogadores().getModel();

        List<Jogador> jogadores = new ArrayList<>();

        jogadores = JogadorDAO.listaTodosJogadores();

        for (Jogador jogador : jogadores) {
            if (jogador.isSituacao() == true) {
                Object[] jog = {
                    jogador.getNome(),
                    jogador.getGolsMarcados(),
                    jogador.getTitulosMelhorJogador(),
                    jogador.getTitulosMelhorGol()};
                defaultTableModel.addRow(jog);
            }
        }
    }
}
