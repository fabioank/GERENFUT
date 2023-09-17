package Controller;

import Model.DAO.JogadorDAO;
import View.Cadastro;
import View.Login;
import View.MenuPrincipal;
import javax.swing.JOptionPane;
public class LoginController {

    private final Login view;
    
    public LoginController(Login view) {
        this.view = view;
    }
    
    public void IrParaCadastro(){
        
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        view.dispose();
    }
    
    public void entrarNoSistema(){
        
        String cpf = view.getTxtCpf().getText();
        String senha = view.getTxtSenha().getText();
      
        boolean login = JogadorDAO.verificarJogador(cpf, senha);
        
        if(login == true){
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            this.view.dispose();
            menuPrincipal.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
            return;
        } 
    }
}
