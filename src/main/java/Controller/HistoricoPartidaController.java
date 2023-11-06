package Controller;

import Model.DAO.PartidaDAO;
import Model.Partida;
import View.HistoricoPartidaView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class HistoricoPartidaController {

    private final HistoricoPartidaView view;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public HistoricoPartidaController(HistoricoPartidaView view) {
        this.view = view;
    }

    public void addPartidasHistorico() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblHistoricoPartidas().getModel();

        List<Partida> listaPartida = new ArrayList<>();

        listaPartida = PartidaDAO.todasAsPartidas();

        listaPartida.sort((lista1, lista2) -> Long.compare(lista1.getId_partida(), lista2.getId_partida()));

        
        for (Partida partida : listaPartida) {
            Object[] partidas = {
                partida.getId_partida(),
                sdf.format(partida.getData()),
                partida.getTimeCasa().getNome(),
                partida.getGolsTimeCasa(),
                partida.getTimeVisitante().getNome(),
                partida.getGolsTimeVisitante(),
                partida.getMelhor_jogador(),
                partida.getMelhor_gol()
            };
            defaultTableModel.addRow(partidas);
        }
    }

}


