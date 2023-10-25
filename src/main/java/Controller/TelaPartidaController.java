package Controller;

import Model.Jogador;
import Model.JogadorComboboxModel;
import Model.Partida;
import View.TelaPartidaView;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TelaPartidaController {

    private TelaPartidaView view = null;
    Partida partida = CriarPartidaController.retornoPartida();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    DefaultListModel<Jogador> listaCasa = new DefaultListModel<>();
    DefaultListModel<Jogador> listaVisitante = new DefaultListModel<>();
    
    public TelaPartidaController(TelaPartidaView view) {
        this.view = view;
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

    public void addJogadorTimeCasa() {

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

    public void addJogadorTimeVisitante() {

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
            
            Integer placar = Integer.parseInt(view.getLblPlacarTimeCasa().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeCasa().setText(String.valueOf(placar1));
        }
    }
    public void addMarcadorTimeVisitante(){
        
        Jogador jogadorSelecionado = (Jogador) view.getCbMarcadorTimeVisitante().getSelectedItem();
        
        if(jogadorSelecionado != null){
            view.getListMarcadoresTimeVisitante().setModel(listaVisitante);
            listaVisitante.addElement(jogadorSelecionado);
            
            Integer placar = Integer.parseInt(view.getLblPlacarTimeVisitante().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeVisitante().setText(String.valueOf(placar1));
            
        }
    }
}
