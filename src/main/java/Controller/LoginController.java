package Controller;

import Model.DAO.JogadorDAO;
import View.CadastrarJogadoresView;
import View.LoginView;
import View.MenuPrincipalView;
import javax.swing.JOptionPane;

public class LoginController {

    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void irParaCadastro() {

        CadastrarJogadoresView cadastrarJogadoresView = new CadastrarJogadoresView(null);
        cadastrarJogadoresView.setVisible(true);
        //view.dispose();
    }

    public void entrarNoSistema() {

        String cpf = view.getTxtCpf().getText();
        String senha = view.getTxtSenha().getText();

        boolean login = JogadorDAO.verificarJogador(cpf, senha);

        if (login == true) {
            MenuPrincipalView menuPrincipal = new MenuPrincipalView();
            menuPrincipal.setVisible(true);
            this.view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
            return;
        }
    }
}
