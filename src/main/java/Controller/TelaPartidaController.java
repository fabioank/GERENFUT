package Controller;

import Model.Partida;
import View.TelaPartidaView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TelaPartidaController {
    
    private final TelaPartidaView view;
    private final Partida partida = CriarPartidaController.retornoPartida();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
    public TelaPartidaController(TelaPartidaView view){
        this.view = view;
    }
    public void partida(){
  
       
        String timeCasa = partida.getTimeCasa().getNome();
        String timeVisitante = partida.getTimeVisitante().getNome();
        
        view.getLblTimeCasa().setText(timeCasa);
        view.getLblTimeVisitante().setText(timeVisitante); 
        view.getLblDataJogo().setText(sdf.format(partida.getData()));
    }
}
