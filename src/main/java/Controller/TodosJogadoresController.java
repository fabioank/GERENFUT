package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.JogadorPartidaDAO;
import Model.Jogador;
import View.CadastrarJogadoresView;
import View.TodosJogadoresView;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TodosJogadoresController {

    private final TodosJogadoresView view;

    public TodosJogadoresController(TodosJogadoresView view) {
        this.view = view;
    }

    public void todosJogadores() {

        DefaultTableModel tableModel = (DefaultTableModel) view.getTblJogadores().getModel();
        tableModel.setRowCount(0);
        List<Jogador> lista;
        String filtro = view.getCbFiltro().getSelectedItem().toString();
        if (filtro.equals("Todos os jogadores")) {
            lista = JogadorDAO.listaTodosJogadores();
        } else {
            lista = JogadorDAO.consultarPelaPosicao(filtro);
        }
        for (Jogador jogador : lista) {
            Object[] jogadores = {
                jogador.getId(),
                jogador.getNome(),
                jogador.getNumero(),
                jogador.getPosicao(),
                jogador.isSituacao() ? "Ativo" : "Inativo"};
            tableModel.addRow(jogadores);
        }
    }
    
    public void duploClick(MouseEvent evt) {

        if (evt.getClickCount() == 2) {
            TableModel model = view.getTblJogadores().getModel();

            Long id = (Long) model.getValueAt(view.getTblJogadores().getSelectedRow(), 0);
            Jogador jogador = new Jogador();

            jogador = JogadorDAO.encontrarPeloId(id);

            CadastrarJogadoresView form = new CadastrarJogadoresView(jogador);
            form.setVisible(true);
        }
    }
}
