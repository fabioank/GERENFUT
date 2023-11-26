package Controller;

import Model.Jogador;
import Model.JogadorComboboxModel;
import Model.JogadorPartida;
import Model.Partida;
import View.TelaPartidaView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaPartidaController {

    public static List<Jogador> marcadores = new ArrayList<>();
    public static List<JogadorPartida> marcadores1 = new ArrayList();

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
        marcadores1.clear();
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
            JogadorPartida jogadorPartida = null;

            for (JogadorPartida jp : marcadores1) {
                if (jp.getJogador().equals(jogadorSelecionado)) {
                    jogadorPartida = jp;
                    break;
                }
            }
            if (jogadorPartida == null) {
                jogadorPartida = new JogadorPartida(jogadorSelecionado);
                marcadores1.add(jogadorPartida);
                view.getListMarcadoresTimeCasa().setModel(listaCasa);
                listaCasa.addElement(jogadorPartida.getJogador());
            }

            jogadorPartida.setGolsMarcados((short) (jogadorPartida.getGolsMarcados() + 1));

            Integer placar = Integer.parseInt(view.getLblPlacarTimeCasa().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeCasa().setText(String.valueOf(placar1));
        }
    }

    public void removerJogadorTimeCasa() {
        Jogador jogador = view.getListMarcadoresTimeCasa().getSelectedValue();
        JogadorPartida jogadorPartida = new JogadorPartida(jogador);

        if (jogador != null) {
            listaCasa.removeElement(jogador);
            Integer placar = Integer.parseInt(view.getLblPlacarTimeCasa().getText());
            int placar1 = placar - 1;
            view.getLblPlacarTimeCasa().setText(String.valueOf(placar1));

            int index = marcadores1.indexOf(jogadorPartida);
            if (index != -1) {
                marcadores1.remove(index);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, primeiramente selecione um jogador na lista antes de tentar removê-lo");
        }
    }

    public void removerJogadorTimeVisitante() {
        Jogador jogador = view.getListMarcadoresTimeVisitante().getSelectedValue();
        JogadorPartida jogadorPartida = new JogadorPartida(jogador);

        if (jogador != null) {
            listaVisitante.removeElement(jogador);

            int index = marcadores1.indexOf(jogadorPartida);
            if (index != -1) {
                marcadores1.remove(index);
            }

            Integer placar = Integer.parseInt(view.getLblPlacarTimeVisitante().getText());
            int placar1 = placar - 1;
            view.getLblPlacarTimeVisitante().setText(String.valueOf(placar1));
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, primeiramente selecione um jogador na lista antes de tentar removê-lo");
        }
    }

    public void addMarcadorTimeVisitante() {
        Jogador jogadorSelecionado = (Jogador) view.getCbMarcadorTimeVisitante().getSelectedItem();

        if (jogadorSelecionado != null) {
            JogadorPartida jogadorPartida = null;

            for (JogadorPartida jp : marcadores1) {
                if (jp.getJogador().equals(jogadorSelecionado)) {
                    jogadorPartida = jp;
                    break;
                }
            }
            
            if (jogadorPartida == null) {
                jogadorPartida = new JogadorPartida(jogadorSelecionado);
                marcadores1.add(jogadorPartida);
                view.getListMarcadoresTimeVisitante().setModel(listaVisitante);
                listaVisitante.addElement(jogadorPartida.getJogador());
            }

            jogadorPartida.setGolsMarcados((short) (jogadorPartida.getGolsMarcados() + 1));

            Integer placar = Integer.parseInt(view.getLblPlacarTimeVisitante().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeVisitante().setText(String.valueOf(placar1));
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

    public static Partida retornoPartida() {
        return partida;
    }

    public static List<JogadorPartida> getMarcadores1() {
        return marcadores1;
    }
}
