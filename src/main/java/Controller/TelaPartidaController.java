package Controller;

import Model.DAO.PartidaDAO;
import Model.Jogador;
import Model.JogadorComboboxModel;
import Model.Partida;
import View.TelaPartidaView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaPartidaController {

    private TelaPartidaView view = null;
    Partida partida = CriarPartidaController.retornoPartida();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    DefaultListModel<Jogador> listaCasa = new DefaultListModel<>();
    DefaultListModel<Jogador> listaVisitante = new DefaultListModel<>();
    DefaultListModel<Jogador> listaGolMaisBonito = new DefaultListModel<>();
    DefaultListModel<Jogador> listaMelhorJogador = new DefaultListModel<>();

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

            Integer placar = Integer.parseInt(view.getLblPlacarTimeCasa().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeCasa().setText(String.valueOf(placar1));
        }
    }

    public void addMarcadorTimeVisitante() {

        Jogador jogadorSelecionado = (Jogador) view.getCbMarcadorTimeVisitante().getSelectedItem();

        if (jogadorSelecionado != null) {
            view.getListMarcadoresTimeVisitante().setModel(listaVisitante);
            listaVisitante.addElement(jogadorSelecionado);

            Integer placar = Integer.parseInt(view.getLblPlacarTimeVisitante().getText());
            int placar1 = placar + 1;
            view.getLblPlacarTimeVisitante().setText(String.valueOf(placar1));
        }
    }

    /*public void removerMarcadorTimeCasa() {

        int linhaSelecionada = view.getListMarcadoresTimeCasa().getSelectedIndex();

        view.getListMarcadoresTimeCasa().remove(linhaSelecionada);

        Integer placar = Integer.parseInt(view.getLblPlacarTimeCasa().getText());
        int placar1 = placar + 1;
        view.getLblPlacarTimeCasa().setText(String.valueOf(placar1));

    }*/
    public void elegerGolMaisBonito() {

        List<Jogador> jogadores = new ArrayList<>();

        for (int i = 0; i < listaCasa.size(); i++) {
            jogadores.add(listaCasa.getElementAt(i));
        }
        for (int i = 0; i < listaVisitante.size(); i++) {
            jogadores.add(listaVisitante.getElementAt(i));
        }
        for (Jogador jogador : jogadores) {
            listaGolMaisBonito.addElement(jogador);
        }
        view.getListaVotacaoGolMaisBonito().setModel(listaGolMaisBonito);

        Integer totalJogadores = view.getCbMarcadorTimeCasa().getItemCount();
        totalJogadores += view.getCbMarcadorTimeVisitante().getItemCount();
        view.getLblVotosRestantesCasa().setText(String.valueOf(totalJogadores));
        view.getLblVotosRestantesVisitante().setText(String.valueOf(totalJogadores));
    }

    public void elegerMelhorJogador() {

        List<Jogador> jogadores = new ArrayList<>();

        for (Jogador jogador : partida.getTimeCasa().getJogador()) {
            jogadores.add(jogador);
        }
        for (Jogador jogador : partida.getTimeVisitante().getJogador()) {
            jogadores.add(jogador);
        }
        for (Jogador jogador : jogadores) {
            listaMelhorJogador.addElement(jogador);
        }
        view.getListaVotacaoMelhorJogador().setModel(listaMelhorJogador);

    }
    
    int maiorQuantidadeCasa = 0;
    Jogador jogadorMaisVotadoGols = null;
    List<Jogador> jogadoresGols = new ArrayList<>();
    

    public void addVotoMelhorGol() {

        if (view.getLblVotosRestantesCasa().getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Todos os votos ja foram efetuados!");
            return;
        }
        if (view.getListaVotacaoGolMaisBonito().getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um jogador antes de efetuar a votação.");
            return;
        }

        Jogador jogadorSelecionado = view.getListaVotacaoGolMaisBonito().getSelectedValue();
        jogadoresGols.add(jogadorSelecionado);
        
        int contador = 0;
        
        for (Jogador jogador : jogadoresGols) {
            contador = 0;
            for (Jogador j : jogadoresGols) {
                if (jogador.equals(j)) {
                    contador++;
                }
            }
            if (contador > maiorQuantidadeCasa) {
                maiorQuantidadeCasa = contador;
                jogadorMaisVotadoGols = jogador;
            }
        }

        int votosRestantes = Integer.parseInt(view.getLblVotosRestantesCasa().getText());
        int votoContabilizado = votosRestantes - 1;

        view.getLblVotosRestantesCasa().setText(String.valueOf(votoContabilizado));

        view.getLblJogadorMelhorGol().setText("Jogador mais votado : " + jogadorMaisVotadoGols.getNome());
    }
    
    List<Jogador> melhorJogador = new ArrayList<>();
    int maiorQuantidade = 0;
    Jogador jogadorMaisVotado = null;

    public void addVotoMelhorJogador(){
        
        if (view.getLblVotosRestantesVisitante().getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Todos os votos ja foram efetuados!");
            return;
        }
        if (view.getListaVotacaoMelhorJogador().getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um jogador antes de efetuar a votação.");
            return;
        }

        Jogador jogadorSelecionado = view.getListaVotacaoMelhorJogador().getSelectedValue();
        melhorJogador.add(jogadorSelecionado);
        
        int contador = 0;
        
        for (Jogador jogador : melhorJogador) {
            contador = 0;
            for (Jogador j : melhorJogador) {
                if (jogador.equals(j)) {
                    contador++;
                }
            }
            if (contador > maiorQuantidade) {
                maiorQuantidade = contador;
                jogadorMaisVotado = jogador;
            }
        }

        int votosRestantes = Integer.parseInt(view.getLblVotosRestantesVisitante().getText());
        int votoContabilizado = votosRestantes - 1;

        view.getLblVotosRestantesVisitantes().setText( String.valueOf(votoContabilizado));

        view.getLblJogadorMaisVotado().setText("Jogador mais votado : " + jogadorMaisVotado.getNome());
    }

    public void salvarPartida() {
        
        if(!view.getLblVotosRestantesCasa().getText().equals("0") || !view.getLblVotosRestantesVisitante().getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Ainda exixtem votos a serem realizados, por favor finalize a "
                    + "votação para salvar os dados da partida", "Votação não encerrada", JOptionPane.WARNING_MESSAGE);
        }
        
        partida.setMelhor_gol(jogadorMaisVotadoGols.getNome());
        partida.setMelhor_jogador(jogadorMaisVotado.getNome());
        partida.setGolsTimeCasa(Byte.parseByte(view.getLblPlacarTimeCasa().getText()));
        partida.setGolsTimeVisitante(Byte.parseByte(view.getLblPlacarTimeVisitante().getText()));
        
        PartidaDAO.adicionarPartida(partida);
        
    } 
}
