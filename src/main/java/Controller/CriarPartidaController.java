package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.TimeDAO;
import Model.Jogador;
import Model.JogadorComboboxModel;
import Model.Time;
import View.CriarPartidaView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CriarPartidaController {

    private final CriarPartidaView view;

    public CriarPartidaController(CriarPartidaView view) {
        this.view = view;
    }

    public void carregarDados() {

        List<Jogador> listaJogador = JogadorDAO.listaTodosJogadores();

        JogadorComboboxModel jogadorComboboxModel = new JogadorComboboxModel();

        for (Jogador jogador : listaJogador) {

            jogadorComboboxModel.addJogador(jogador);

            view.getCbJogadoresTime1().setModel(jogadorComboboxModel);
            view.getCbJogadoresTime2().setModel(jogadorComboboxModel);
        }

        List<Time> listaTime = TimeDAO.todosOsTimes();

        for (Time time : listaTime) {
            view.getCbTime1().addItem(time.getNome());
            view.getCbTime2().addItem(time.getNome());
        }
    }

    public void adicionarJogadorTimeCasa() {
        DefaultTableModel tableModel1 = (DefaultTableModel) view.getTblJogadoresTime1().getModel();
        Jogador jogadorSelecionado = (Jogador) view.getCbJogadoresTime1().getSelectedItem();

        if (jogadorSelecionado != null) {
            int linhasTabela = tableModel1.getRowCount();
            boolean jogadorJaAdicionado = false;

            for (int i = 0; i < linhasTabela; i++) {
                int idNaTabela = (int) tableModel1.getValueAt(i, 0);
                if (idNaTabela == jogadorSelecionado.getId()) {
                    jogadorJaAdicionado = true;
                    break;
                }
            }

            if (jogadorJaAdicionado) {
                JOptionPane.showMessageDialog(null, "Esse jogador já foi adicionado, por favor adicione outro.","Jogador ja adicionado", JOptionPane.WARNING_MESSAGE);
            } else {
                Object[] jogadoresCasa = {jogadorSelecionado.getId(), jogadorSelecionado.getNome(), jogadorSelecionado.getNumero(), jogadorSelecionado.getPosicao()};
                tableModel1.addRow(jogadoresCasa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o jogador");
        }
    }

    public void adicionarJogadorTimeVisitante() {
        DefaultTableModel tableModel2 = (DefaultTableModel) view.getTblJogadoresTime2().getModel();

        Jogador jogadorSelecionado = (Jogador) view.getCbJogadoresTime2().getSelectedItem();

        if (jogadorSelecionado != null) {
            Object[] jogadores2 = {jogadorSelecionado.getId(), jogadorSelecionado.getNome(), jogadorSelecionado.getNumero(), jogadorSelecionado.getPosicao()};

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
