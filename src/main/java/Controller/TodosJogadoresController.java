package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.TodosJogadoresView;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

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
        if (filtro.equals("Todos os jogadores")){
            lista = JogadorDAO.listaTodosJogadores();
        }else{
            lista = JogadorDAO.consultarJogador(filtro);
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
}
