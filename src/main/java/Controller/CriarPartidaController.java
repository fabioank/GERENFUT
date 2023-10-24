package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.TimeDAO;
import Model.Jogador;
import Model.JogadorComboboxModel;
import Model.Partida;
import Model.Time;
import Model.TimeComboboxModel;
import View.CriarPartidaView;
import View.TelaPartidaView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CriarPartidaController {

    private final CriarPartidaView view;
    public static Partida partida;

    public CriarPartidaController(CriarPartidaView view) {
        this.view = view;
    }

    public CriarPartidaController() {
        this.view = new CriarPartidaView();
    }

    public void carregarDados() {

        List<Jogador> listaJogador = JogadorDAO.listaTodosJogadores();

        JogadorComboboxModel jogadorComboboxModel1 = new JogadorComboboxModel();
        JogadorComboboxModel jogadorComboboxModel2 = new JogadorComboboxModel();

        for (Jogador jogador : listaJogador) {

            jogadorComboboxModel1.addJogador(jogador);
            jogadorComboboxModel2.addJogador(jogador);

            view.getCbJogadoresTime1().setModel(jogadorComboboxModel1);
            view.getCbJogadoresTime2().setModel(jogadorComboboxModel2);

        }

        List<Time> listaTime = TimeDAO.todosOsTimes();

        TimeComboboxModel timeComboboxModel1 = new TimeComboboxModel();
        TimeComboboxModel timeComboboxModel2 = new TimeComboboxModel();

        for (Time time : listaTime) {

            timeComboboxModel1.addTime(time);
            timeComboboxModel2.addTime(time);

            view.getCbTime1().setModel(timeComboboxModel1);
            view.getCbTime2().setModel(timeComboboxModel2);
        }
    }

    public void carregarTimeCasa() {

        DefaultTableModel tableModel1 = (DefaultTableModel) view.getTblJogadoresTime1().getModel();

        if (view.getChkTime1().isSelected()) {
            Time timeCasa = (Time) view.getCbTime1().getSelectedItem();
            timeCasa.getId_time();

            List<Integer> lista = TimeDAO.carregarJogadores(timeCasa);
            List<Jogador> listaJogadores = new ArrayList<>();

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Esse time ainda não possui jogadores cadastrados");
                view.getChkTime1().setSelected(false);
                return;
            }

            for (Integer i : lista) {
                Jogador jogador = JogadorDAO.encontrarPeloId(i);
                listaJogadores.add(jogador);
            }
            for (Jogador j : listaJogadores) {
                Object[] jogadoresCasa = {j.getId(), j.getNome(), j.getNumero(), j.getPosicao()};
                tableModel1.addRow(jogadoresCasa);
            }
        }
    }

    public void carregarTimeVisitante() {

        DefaultTableModel tableModel2 = (DefaultTableModel) view.getTblJogadoresTime2().getModel();

        if (view.getChkTime2().isSelected()) {
            Time timeVisitante = (Time) view.getCbTime2().getSelectedItem();
            timeVisitante.getId_time();

            List<Integer> lista = TimeDAO.carregarJogadores(timeVisitante);
            List<Jogador> listaJogadores = new ArrayList<>();

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Esse time ainda não possui jogadores cadastrados");
                view.getChkTime2().setSelected(false);
                return;
            }

            for (Integer i : lista) {
                Jogador jogador = JogadorDAO.encontrarPeloId(i);
                listaJogadores.add(jogador);
            }
            for (Jogador j : listaJogadores) {
                Object[] jogadoresVisitantes = {j.getId(), j.getNome(), j.getNumero(), j.getPosicao()};
                tableModel2.addRow(jogadoresVisitantes);
            }
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
                JOptionPane.showMessageDialog(null, "Esse jogador já foi adicionado, por favor adicione outro.", "Jogador ja adicionado", JOptionPane.WARNING_MESSAGE);
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
            int linhasTabela = tableModel2.getRowCount();
            boolean jogadorJaAdicionado = false;

            for (int i = 0; i < linhasTabela; i++) {
                int idNaTabela = (int) tableModel2.getValueAt(i, 0);
                if (idNaTabela == jogadorSelecionado.getId()) {
                    jogadorJaAdicionado = true;
                    break;
                }
            }

            if (jogadorJaAdicionado) {
                JOptionPane.showMessageDialog(null, "Esse jogador já foi adicionado, por favor adicione outro.", "Jogador ja adicionado", JOptionPane.WARNING_MESSAGE);
            } else {
                Object[] jogadoresCasa = {jogadorSelecionado.getId(), jogadorSelecionado.getNome(), jogadorSelecionado.getNumero(), jogadorSelecionado.getPosicao()};
                tableModel2.addRow(jogadoresCasa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o jogador");
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

            if (view.getCbTime1().getSelectedItem() == null || view.getCbTime2().getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione os dois times para a partida");
                return;
            }
            if (view.getCbTime1().getSelectedItem().equals(view.getCbTime2().getSelectedItem())) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione dois times diferentes para a realização da partida");
                return;
            }

            if (tableModel1.getRowCount() < 7 || tableModel1.getRowCount() > 10 || tableModel2.getRowCount() < 7 || tableModel2.getRowCount() > 10) {
                JOptionPane.showMessageDialog(null, "Os times precisam ter entre 7 e 10 jogadores");
                return;
            }

            if (tableModel1.getRowCount() != tableModel2.getRowCount()) {
                JOptionPane.showMessageDialog(null, "Ambos os times devem ter a mesma quantidade de jogadores");
                return;
            }

            Time timeCasa = (Time) view.getCbTime1().getSelectedItem();
            Time timeVisitante = (Time) view.getCbTime2().getSelectedItem();

            List<Jogador> jogadoresTime1 = new ArrayList<>();
            List<Jogador> jogadoresTime2 = new ArrayList<>();

            for (int i = 0; i < tableModel1.getRowCount(); i++) {
                Jogador jogador = JogadorDAO.encontrarPeloId((int) tableModel1.getValueAt(i, 0));
                jogadoresTime1.add(jogador);

                if (!TimeDAO.jaAssociado(timeCasa, jogador)) {
                    TimeDAO.associarJogador(timeCasa.getId_time(), jogador.getId());
                }
            }
            Time time1 = new Time(view.getCbTime1().getSelectedItem().toString(), jogadoresTime1);

            for (int i = 0; i < tableModel2.getRowCount(); i++) {
                Jogador jogador = JogadorDAO.encontrarPeloId((int) tableModel2.getValueAt(i, 0));
                jogadoresTime2.add(jogador);

                if (!TimeDAO.jaAssociado(timeVisitante, jogador)) {
                    TimeDAO.associarJogador(timeVisitante.getId_time(), jogador.getId());
                }
            }
            Time time2 = new Time(view.getCbTime2().getSelectedItem().toString(), jogadoresTime2);

            partida = new Partida(0, new Date(), null, null, time1, time2);

            if (partida != null) {
                view.dispose();
                TelaPartidaView partidaView = new TelaPartidaView();
                partidaView.setVisible(true);               
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve algum problema com a criação da partida");
            e.printStackTrace();
            return;
        }
    }

    public static Partida retornoPartida() {
        return partida;
    }
}
