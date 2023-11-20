package Controller;

import Model.DAO.JogadorDAO;
import Model.DAO.JogadorPartidaDAO;
import Model.DAO.PartidaDAO;
import Model.Jogador;
import Model.Partida;
import View.VotacaoView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VotacaoController {

    Partida partida = null;
    List<Jogador> marcadores = null;
    private TelaPartidaController controller;
    private VotacaoView view;

    DefaultListModel<Jogador> listaGolMaisBonito = new DefaultListModel<>();
    DefaultListModel<Jogador> listaMelhorJogador = new DefaultListModel<>();
    DefaultListModel<Jogador> listaCasa = new DefaultListModel<>();
    DefaultListModel<Jogador> listaVisitante = new DefaultListModel<>();

    public VotacaoController(VotacaoView view) {
        this.view = view;
        partida = TelaPartidaController.retornoPartida();
        marcadores = TelaPartidaController.getMarcadores();
    }

    int maiorQuantidadeCasa = 0;
    Jogador jogadorMaisVotadoGols = null;
    List<Jogador> jogadoresGols = new ArrayList<>();
    
    public void carregarDados() {

        List<Jogador> todosJogadores = new ArrayList<>();
        List<Jogador> marcadores = this.marcadores;
        todosJogadores.addAll(partida.getTimeCasa().getJogador());
        todosJogadores.addAll(partida.getTimeVisitante().getJogador());

        for (Jogador jogador : todosJogadores) {
            listaMelhorJogador.addElement(jogador);
        }
        view.getListaVotacaoMelhorJogador().setModel(listaMelhorJogador);

        for (Jogador jogador : marcadores) {
            listaGolMaisBonito.addElement(jogador);
        }
        view.getListaVotacaoGolMaisBonito().setModel(listaGolMaisBonito);

        view.getLblVotosRestantesCasa().setText((String.valueOf(todosJogadores.size())));
        view.getLblVotosRestantesVisitante().setText((String.valueOf(todosJogadores.size())));
        
        if (listaGolMaisBonito.size() == 1) {
            jogadorMaisVotadoGols = (Jogador) listaGolMaisBonito.getElementAt(0);
            view.getLblJogadorMelhorGol().setText("Jogador eleito automaticamente");
            view.getLblVotosRestantesCasa().setText("0");
        }

        if (partida.getGolsTimeCasa() == 0 && partida.getGolsTimeVisitante() == 0) {
            view.getLblVotosRestantesCasa().setText(String.valueOf(0));
            partida.setMelhor_gol("----");
        }
    }

    public void addVotoMelhorGol() {

        if (listaGolMaisBonito.size() != 1) {
            
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
    }

    List<Jogador> melhorJogador = new ArrayList<>();
    int maiorQuantidade = 0;
    Jogador jogadorMaisVotado = null;

    public void addVotoMelhorJogador() {

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

        view.getLblVotosRestantesVisitantes().setText(String.valueOf(votoContabilizado));

        view.getLblJogadorMaisVotado().setText("Jogador mais votado : " + jogadorMaisVotado.getNome());
    }

    public void salvarPartida() {

        try {
            if (!view.getLblVotosRestantesCasa().getText().equals("0") || !view.getLblVotosRestantesVisitante().getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Ainda existem votos a serem realizados, por favor finalize a "
                        + "votação para salvar os dados da partida", "Votação não encerrada", JOptionPane.WARNING_MESSAGE);
            }
            if (partida.getMelhor_gol() == null) {
                partida.setMelhor_gol(jogadorMaisVotadoGols.getNome());
                JogadorPartidaDAO.addMelhorGol(jogadorMaisVotadoGols);
            }
            partida.setMelhor_jogador(jogadorMaisVotado.getNome());
            JogadorPartidaDAO.addMelhorJogador(jogadorMaisVotado);

            for (Jogador jogador : marcadores) {
                JogadorPartidaDAO.atualizarGols(jogador);
            }

            int id_partida = PartidaDAO.adicionarPartida(partida);

            PartidaDAO.associarTimePartida(id_partida, partida.getTimeCasa().getId_time(), partida.getGolsTimeCasa());
            PartidaDAO.associarTimePartida(id_partida, partida.getTimeVisitante().getId_time(), partida.getGolsTimeVisitante());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Infelizmente não foi possivel salvar a partida", "Partida não salva", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
