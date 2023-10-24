package Controller;

import Model.Partida;
import View.TelaPartidaView;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaPartidaController {

    private final TelaPartidaView view;
    Partida partida = CriarPartidaController.retornoPartida();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
        }else{
            JOptionPane.showMessageDialog(null, "BACALHAU");
        }
    }
}
