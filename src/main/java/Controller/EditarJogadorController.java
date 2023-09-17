package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.EditarJogador;
import View.MenuPrincipal;
import javax.swing.JOptionPane;

public class EditarJogadorController {
    
    private final EditarJogador view;

    public EditarJogadorController(EditarJogador view) {
        this.view = view;
    }
    
    public void buscarDados(){
        
        try {
            String cpf = view.getTxtCpf().getText();
            
            Jogador jogador = JogadorDAO.buscarCpf(cpf);
            
            if(jogador != null){
                String nome = jogador.getName();
                int numero = jogador.getNumero();
                String posicao= jogador.getPosicao();
                
                view.getTxtNome().setText(nome);
                view.getTxtNumero().setText(String.valueOf(numero));
                view.getTxtPosicao().setText(posicao);
            }else{
                JOptionPane.showMessageDialog(null, "Jogador não encontrado");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um problema inesperado!");
        }
    }
    public void editarJogador(){
        
        
        if(view.getTxtNome().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome!");
            return;
        }
        else if(view.getTxtNumero().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, insira um numero!");
            return;
        }else if(view.getTxtPosicao().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, insira uma posicao!");
            return;
        }else if(view.getTxtSenha().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, insira uma senha!");
            return;
        }
        
        String nome = view.getTxtNome().getText();
        int numero = Integer.parseInt(view.getTxtNumero().getText());
        String posicao = view.getTxtPosicao().getText();
        
        Jogador jogador = new Jogador(nome, numero, posicao);
        
        boolean senha = JogadorDAO.verificarJogador(view.getTxtCpf().getText(), view.getTxtSenha().getText());
        
        if(senha == true){
            JogadorDAO.atualizarJogador(view.getTxtCpf().getText(), jogador);
            JOptionPane.showMessageDialog(null, "Jogador atualizado com sucesso!");
            view.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente");
            return;
        }
        

        
        
        
    }

}
