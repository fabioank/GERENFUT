package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.TodosJogadores;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class TodosJogadoresController {

    private final TodosJogadores view;

    public TodosJogadoresController(TodosJogadores view) {
        this.view = view;
    }

    public void todosJogadores() {

        DefaultTableModel tableModel = (DefaultTableModel) view.getTblJogadores().getModel();

        List<Jogador> lista = JogadorDAO.listaTodosJogadores();

        System.out.println(lista.size());
        for (Jogador jogador : lista) {
            Object[] jogadores = {
                jogador.getId(),
                jogador.getName(),
                jogador.getNumero(),
                jogador.getPosicao()
            };
            tableModel.addRow(jogadores);

        }
    }
}
