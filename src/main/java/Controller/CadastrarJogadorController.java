package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.CadastrarJogador;
import View.Login;
import com.sun.source.tree.TryTree;
import javax.swing.JOptionPane;

public class CadastrarJogadorController {

    private final CadastrarJogador view;

    public CadastrarJogadorController(CadastrarJogador view) {
        this.view = view;
    }

    public void cadastrarJogador() {

        try {

            if (view.getTxtNomeCadastro().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe o nome!");
                return;
            } else if (view.getTxtCpfCadastro().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe o CPF!");
                return;
            } else if (view.getTxtCpfCadastro().getText().length() != 11) {
                JOptionPane.showMessageDialog(null, "O CPF precisa conter 11 digitos, sendo apenas numeros");
                return;
            } else if (view.getTxtNumeroJogador().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe o numero do jogador!");
                return;
            } else if (view.getTxtSenhaCadastro().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe uma senha!");
                return;
            } else if (view.getTxtSenhaCadastro().getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "A senha deve conter no minimo 8 digitos");
                return;
            }
            int numero = 0;
            String nome = view.getTxtNomeCadastro().getText();
            String cpf = view.getTxtCpfCadastro().getText();
            try {
                numero = Integer.parseInt(view.getTxtNumeroJogador().getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "O campo 'número camisa' deve ser preenchido com um valor inteiro");
                return;
            }
            String posicao = view.getCbPosicoes().getSelectedItem().toString();
            String senha = view.getTxtSenhaCadastro().getText();

            Jogador jogador = new Jogador(0, nome, cpf, numero, posicao, senha, true);

            boolean jaCadastrado = JogadorDAO.verificaCadastro(jogador);

            if (jaCadastrado == true) {
                JOptionPane.showMessageDialog(null, "Um jogador com esse CPF já foi cadastrado anteriormente");
                return;
            }

            JogadorDAO.inserirJogador(jogador);
            JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
            view.dispose();
            Login login = new Login();
            login.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o jogador");
        }
    }
}
