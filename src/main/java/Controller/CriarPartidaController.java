package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.CriarPartida;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CriarPartidaController {

    private final CriarPartida view;

    public CriarPartidaController(CriarPartida view) {
        this.view = view;
    }

    public void carregarDados() {

        List<Jogador> lista = JogadorDAO.listaTodosJogadores();

        for (Jogador jogador : lista) {

            view.getCbJogadoresTime1().addItem(jogador.getId() + ", " + jogador.getNumero() + ", " + jogador.getName() + " (" + jogador.getPosicao() + ")");
            view.getCbJogadoresTime2().addItem(jogador.getName() + " (" + jogador.getPosicao() + ")");

        }
    }

    public void adicionarJogador() {
    DefaultTableModel tableModel = (DefaultTableModel) view.getTblJogadoresTime1().getModel();
    
    String jogadorSelecionado = view.getCbJogadoresTime1().getSelectedItem().toString();
    
    String[] idJogador = jogadorSelecionado.split(",");
    int id = Integer.parseInt(idJogador[0]);
    
    Jogador jogador = JogadorDAO.encontrarPeloId(id);
    
    if (jogador != null) {
        Object[] jogadores = {jogador.getName(), jogador.getNumero(), jogador.getPosicao()};
        tableModel.addRow(jogadores);
    } else {
    
    }
}
}
