package Controller;

import Model.DAO.JogadorDAO;
import View.ExcluirJogadorView;
import javax.swing.JOptionPane;

public class ExcluirJogadorController {

    private final ExcluirJogadorView view;

    public ExcluirJogadorController(ExcluirJogadorView view) {
        this.view = view;
    }

    public void excluirJogador() {
        try {
            if (view.getTxtCpf().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe o id!");
                return;
            }
            if (view.getTxtSenha().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, informe a senha!");
                return;
            }

            String cpf = view.getTxtCpf().getText();
            String senha = view.getTxtSenha().getText();

            boolean exclusao = JogadorDAO.excluirJogador(cpf, senha);

            if (exclusao == true) {
                JOptionPane.showMessageDialog(null, "Jogador excluido com sucesso!");
                view.dispose();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o jogador!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
