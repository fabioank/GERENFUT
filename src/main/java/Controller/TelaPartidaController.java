package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.PartidaDAO;
import Model.Jogador;
import Model.JogadorComboboxModel;
import Model.Partida;
import View.TelaPartidaView;
import View.VotacaoView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TelaPartidaController {

    public static List<Jogador> marcadores = new ArrayList<>();

    private TelaPartidaView view;

    public static Partida partida = null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    DefaultListModel<Jogador> listaCasa = new DefaultListModel<>();
    DefaultListModel<Jogador> listaVisitante = new DefaultListModel<>();
    DefaultListModel<Jogador> listaGolMaisBonito = new DefaultListModel<>();
    DefaultListModel<Jogador> listaMelhorJogador = new DefaultListModel<>();

    public TelaPartidaController() {
    }

    public TelaPartidaController(TelaPartidaView view) {
        this.view = view;
        partida = CriarPartidaController.retornoPartida();
        marcadores.clear();
    }

    public void partida() {

        if (partida != null) {
            String timeCasa = partida.getTimeCasa().getNome();
            String timeVisitante = partida.getTimeVisitante().getNome();

            view.getLblTimeCasa().setText(timeCasa);
            view.getLblTimeVisitante().setText(timeVisitante);
            view.getLblDataJogo().setText(sdf.format(partida.getData()));
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel iniciar a partida");
            return;
        }
    }

    public void comporTimeCasa() {

        try {
            JogadorComboboxModel jogadorComboboxModel = new JogadorComboboxModel();

            for (Jogador jogador : partida.getTimeCasa().getJogador()) {
                jogadorComboboxModel.addJogador(jogador);
            }
            view.getCbMarcadorTimeCasa().setModel(jogadorComboboxModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel iniciar a partida");
            return;
        }
    }

    public void comporTimeVisitante() {

        try {
            JogadorComboboxModel jogadorComboboxModel = new JogadorComboboxModel();

            for (Jogador jogador : partida.getTimeVisitante().getJogador()) {
                jogadorComboboxModel.addJogador(jogador);
            }
            view.getCbMarcadorTimeVisitante().setModel(jogadorComboboxModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel iniciar a partida");
        }
    }

    public void addMarcadorTimeCasa() {

        Jogador jogadorSelecionado = (Jogador) view.getCbMarcadorTimeCasa().getSelectedItem();

        if (jogadorSelecionado != null) {
            view.getListMarcadoresTimeCasa().setModel(listaCasa);
            listaCasa.addElement(jogadorSelecionado);
            jogadorSelecionado.setGolsMarcados((short) (jogadorSelecionado.getGolsMarcados() + 1));

            Integer placar = Integer.parseInt(view.getLblPlacarTimeCasa().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeCasa().setText(String.valueOf(placar1));

            if (!marcadores.contains(jogadorSelecionado)) {
                marcadores.add(jogadorSelecionado);

            }
        }
    }

    public void addMarcadorTimeVisitante() {

        Jogador jogadorSelecionado = (Jogador) view.getCbMarcadorTimeVisitante().getSelectedItem();

        if (jogadorSelecionado != null) {
            view.getListMarcadoresTimeVisitante().setModel(listaVisitante);
            listaVisitante.addElement(jogadorSelecionado);
            jogadorSelecionado.setGolsMarcados((short) (jogadorSelecionado.getGolsMarcados() + 1));

            Integer placar = Integer.parseInt(view.getLblPlacarTimeVisitante().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeVisitante().setText(String.valueOf(placar1));

            if (!marcadores.contains(jogadorSelecionado)) {
                marcadores.add(jogadorSelecionado);

            }
        }
    }

    public void finalPartida() {
        partida.setGolsTimeCasa(Byte.parseByte(view.getLblPlacarTimeCasa().getText()));
        partida.setGolsTimeVisitante(Byte.parseByte(view.getLblPlacarTimeVisitante().getText()));
    }

    public List<Jogador> marcadoresPartida() {
        return marcadores;
    }

    public void encerrarPartida() {
        partida.setGolsTimeCasa(Byte.parseByte(view.getLblPlacarTimeCasa().getText()));
        partida.setGolsTimeVisitante(Byte.parseByte(view.getLblPlacarTimeVisitante().getText()));
    }
    public static Partida retornoPartida(){
        return partida;
    }
    public static List<Jogador> getMarcadores(){
        return marcadores;
    }
}
