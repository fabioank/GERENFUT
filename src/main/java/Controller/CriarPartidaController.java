package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.TimeDAO;
import Model.Jogador;
import Model.Time;
import View.CriarPartida;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CriarPartidaController {

    private final CriarPartida view;

    public CriarPartidaController(CriarPartida view) {
        this.view = view;
    }

    public void carregarDados() {

        List<Jogador> listaJogador = JogadorDAO.listaTodosJogadores();

        for (Jogador jogador : listaJogador) {

            view.getCbJogadoresTime1().addItem(jogador.toString());
            view.getCbJogadoresTime2().addItem(jogador.toString());
        }

        List<Time> listaTime = TimeDAO.todosOsTimes();

        for (Time time : listaTime) {
            view.getCbTime1().addItem(time.getNome());
            view.getCbTime2().addItem(time.getNome());
        }
    }

    public void adicionarJogadorTimeCasa() {

        DefaultTableModel tableModel1 = (DefaultTableModel) view.getTblJogadoresTime1().getModel();

        String jogadorSelecionado1 = view.getCbJogadoresTime1().getSelectedItem().toString();

        String[] idJogador1 = jogadorSelecionado1.split(",");
        int id1 = Integer.parseInt(idJogador1[0]);

        //Jogador jogadorSelecionado = (Jogador) view.getCbJogadoresTime1().getSelectedItem();
        Jogador jogador1 = JogadorDAO.encontrarPeloId(id1);

        //;(Jogador) combo.getItem();
        if (jogador1 != null) {
            Object[] jogadores1 = {jogador1.getNome(), jogador1.getNumero(), jogador1.getPosicao()};

            //List<Jogador> jogs = new ArrayList<>();
            tableModel1.addRow(jogadores1);

        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o jogador");
            return;
        }
    }

    public void adicionarJogadorTimeVisitante() {
        DefaultTableModel tableModel2 = (DefaultTableModel) view.getTblJogadoresTime2().getModel();
        String jogadorSelecionado2 = view.getCbJogadoresTime2().getSelectedItem().toString();

        String[] idJogador2 = jogadorSelecionado2.split(",");
        int id2 = Integer.parseInt(idJogador2[0]);

        Jogador jogador2 = JogadorDAO.encontrarPeloId(id2);

        if (jogador2 != null) {
            Object[] jogadores2 = {jogador2.getNome(), jogador2.getNumero(), jogador2.getPosicao()};

            //List<Jogador> jogs = new ArrayList<>();
            tableModel2.addRow(jogadores2);

        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o jogador");
            return;
        }
    }

    public void removerJogadorTimeCasa() {

        try {
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblJogadoresTime1().getModel();

            int linhaSelecionada = view.getTblJogadoresTime1().getSelectedRow();

            tableModel.removeRow(linhaSelecionada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um jogador da tabela antes de tentar remove-lo.");
            return;
        }

    }

    public void removerJogadorTimeVisitante() {

        try {
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblJogadoresTime2().getModel();

            int linhaSelecionada = view.getTblJogadoresTime2().getSelectedRow();

            tableModel.removeRow(linhaSelecionada);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um jogador da tabela antes de tentar remove-lo.");
            return;
        }
    }

    public void iniciarPartida() {

        try {

            DefaultTableModel tableModel1 = (DefaultTableModel) view.getTblJogadoresTime1().getModel();
            DefaultTableModel tableModel2 = (DefaultTableModel) view.getTblJogadoresTime2().getModel();

            if (tableModel1.getRowCount() < 7 || tableModel1.getRowCount() > 10) {
                JOptionPane.showMessageDialog(null, "Os times precisam ter entre 7 e 10 jogadores");
                return;
            }
            if (tableModel2.getRowCount() < 7 || tableModel2.getRowCount() > 10) {
                JOptionPane.showMessageDialog(null, "Os times precisam ter entre 7 e 10 jogadores");
                return;
            }

            if (tableModel1.getRowCount() != tableModel2.getRowCount()) {
                JOptionPane.showMessageDialog(null, "Ambos os times devem ter a mesma quantidade de jogadores");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "tudo certo para iniciar");
                return;
            }

            /*int columnIndex = 0;
            int rowCount = tableModel1.getRowCount();
            Object[] columnData = new Object[rowCount];
            Jogador jogador;

            for (int i = 0; i < rowCount; i++) {
                columnData[i] = tableModel1.getValueAt(i, columnIndex);
                jogador = JogadorDAO.encontrarPeloId(Integer.columnData[i]);
                
            }

            Time TimeCasa = new Time(view.getCbTime1().getSelectedItem().toString(),
            );
            Time timeVisitante = new Time();
            
            */
        } catch (Exception e) {

        }
    }
}
