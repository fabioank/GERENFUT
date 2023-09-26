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

    public void buscarDados() {

        try {
            String cpf = view.getTxtCpf().getText();

            Jogador jogador = JogadorDAO.buscarCpf(cpf);

            if (jogador != null) {
                String nome = jogador.getName();
                int numero = jogador.getNumero();
                String posicao = jogador.getPosicao();
                Boolean situacao = jogador.isSituacao();

                view.getTxtNome().setText(nome);
                view.getTxtNumero().setText(String.valueOf(numero));
                view.getCbPosicao().setSelectedItem(posicao);
                if (situacao == true) {
                    view.getCbSituacao().setSelectedItem("Ativo");
                } else {
                    view.getCbSituacao().setSelectedItem("Inativo");
                }
            }
            
            if(jogador == null) {
                JOptionPane.showMessageDialog(null, "O jogador com o CPF informado não foi encontrado");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um problema inesperado!");
        }
    }

    public void editarJogador() {

        if (view.getTxtNome().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome!");
            return;
        } else if (view.getTxtNumero().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um numero!");
            return;
        } else if (view.getTxtSenha().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma senha!");
            return;
        }

        int numero = 0;
        String nome = view.getTxtNome().getText();
        try {
            numero = Integer.parseInt(view.getTxtNumero().getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo 'número camisa' deve ser preenchido com um valor inteiro");
            return;
        }
        String posicao = view.getCbPosicao().getSelectedItem().toString();

        boolean situacao = view.getCbSituacao().getSelectedItem().toString().equals("Ativo");

        Jogador jogador = new Jogador(nome, numero, posicao, situacao);

        boolean senha = JogadorDAO.verificarJogador(view.getTxtCpf().getText(), view.getTxtSenha().getText());

        if (senha == true) {
            JogadorDAO.atualizarJogador(view.getTxtCpf().getText(), jogador);
            JOptionPane.showMessageDialog(null, "Jogador atualizado com sucesso!");
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente");
            return;
        }

    }

}
