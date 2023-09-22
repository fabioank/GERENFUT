package Controller;

import Model.DAO.JogadorDAO;
import View.CadastrarJogador;
import View.Login;
import View.MenuPrincipal;
import javax.swing.JOptionPane;

public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public void irParaCadastro() {

        CadastrarJogador cadastro = new CadastrarJogador();
        cadastro.setVisible(true);
        view.dispose();
    }

    public void entrarNoSistema() {

        String cpf = view.getTxtCpf().getText();
        String senha = view.getTxtSenha().getText();

        boolean login = JogadorDAO.verificarJogador(cpf, senha);

        if (login == true) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
            return;
        }
    }
}
