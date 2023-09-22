package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.ConsultarJogador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarJogadorController {
    
    private final ConsultarJogador view;
    
    public ConsultarJogadorController(ConsultarJogador view){
        this.view = view;
    }

    public void ConsultarJogadores() {
        
        String posicao = view.getCbConsultar().getSelectedItem().toString();
        
        List<Jogador> lista = new ArrayList<>();
        
        lista = JogadorDAO.consultarJogador(posicao);
        
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Não há nennhum jogador cadastrado nessa posição");
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblConsultarJogador().getModel();
        
        for (Jogador jogador : lista) {
            Object[] jogadores = {
                jogador.getId(),
                jogador.getName(),
                jogador.getNumero(),
                jogador.getPosicao()
            };
            tableModel.addRow(jogadores);
        }
        
    }
}
