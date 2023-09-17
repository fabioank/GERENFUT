package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.Cadastro;
import View.Login;
import javax.swing.JOptionPane;

public class CadastroController {
    
    private final Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void cadastrarJogador(){

        try {
            
            if (view.getTxtNomeCadastro().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe o nome!");
                return;
            }
            else if (view.getTxtCpfCadastro().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, informe o CPF!");
                return;
            }
            else if(view.getTxtCpfCadastro().getText().length() != 11){
                JOptionPane.showMessageDialog(null, "O CPF precisa conter 11 digitos, sendo apenas numeros");
                return;
            }
            else if (view.getTxtNumeroJogador().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, informe o numero do jogador!");
                return;
            }
            else if (view.getTxtPosicaoJogador().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, informe a posição!");
                return;
            }
            else if (view.getTxtSenhaCadastro().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, informe uma senha!");
                return;
            }
            
            String nome = view.getTxtNomeCadastro().getText();
            String cpf = view.getTxtCpfCadastro().getText();
            int numero = Integer.parseInt(view.getTxtNumeroJogador().getText());
            String posicao = view.getTxtPosicaoJogador().getText();
            String senha = view.getTxtSenhaCadastro().getText();
            
            Jogador jogador = new Jogador(0, nome, cpf, numero, posicao);
            
            boolean jaCadastrado = JogadorDAO.verificaCadastro(jogador);
            
            if(jaCadastrado == true){
                JOptionPane.showMessageDialog(null, "Um jogador com esse CPF já foi cadastrado anteriormente");
                return;
            }
            
            JogadorDAO.inserirJogador(jogador);
            
            JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
            
            Login login = new Login();
            view.dispose();;
            login.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Não foi possivel adicionar o jogador" );
        }
    }  
}
