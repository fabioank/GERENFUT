package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.CadastrarJogadoresView;
import View.LoginView;
import javax.swing.JOptionPane;

public class CadastrarJogadoresController {

    private final CadastrarJogadoresView view;

    public CadastrarJogadoresController(CadastrarJogadoresView view) {
        this.view = view;
    }

    public void buscarDados() {

        try {

            String cpf = view.getTxtCpf().getText();

            Jogador jogador = JogadorDAO.buscarCpf(cpf);

            if (jogador != null) {
                String nome = jogador.getNome();
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
            } else {
                JOptionPane.showMessageDialog(null, "O jogador com o CPF informado não foi encontrado",
                        "Jogador não encontrado", JOptionPane.ERROR_MESSAGE);
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

        short numero = 0;
        String nome = view.getTxtNome().getText();
        try {
            numero = Short.parseShort(view.getTxtNumero().getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo 'número camisa' deve ser preenchido com um valor inteiro");
            return;
        }
        String posicao = view.getCbPosicao().getSelectedItem().toString();

        boolean situacao = view.getCbSituacao().getSelectedItem().toString().equals("Ativo");

        Jogador jogador = new Jogador(nome, numero, posicao, situacao);

        boolean senha = JogadorDAO.verificarJogador(view.getTxtCpf().getText(), view.getTxtSenha().getText());

        if (senha == true && view.getTxtSenha().getText().equals(view.getTxtConfirmarSenha().getText())) {
            JogadorDAO.atualizarJogador(view.getTxtCpf().getText(), jogador);
            JOptionPane.showMessageDialog(null, "Jogador atualizado com sucesso!");
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente");
            return;
        }
    }

    public void novoJogador() {
            try {

                if (view.getTxtNome().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor, informe o nome!");
                    return;
                } else if (view.getTxtCpf().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor, informe o CPF!");
                    return;
                } else if (view.getTxtCpf().getText().matches(".*[a-zA-Z].*")) {
                    JOptionPane.showMessageDialog(null, "O CPF deve conter apenas numeros");
                    return;
                } else if (view.getTxtCpf().getText().length() != 11) {
                    JOptionPane.showMessageDialog(null, "O CPF precisa conter 11 digitos, sendo apenas numeros");
                    return;
                } else if (view.getTxtNumero().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor, informe o numero do jogador!");
                    return;
                } else if (JogadorDAO.numeroJaCadastrado(Integer.parseInt(view.getTxtNumero().getText()))) {
                    JOptionPane.showMessageDialog(null, "Um jogador com esse numero ja foi cadastrado");
                    return;
                } else if (view.getTxtSenha().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor, informe uma senha!");
                    return;
                } else if (view.getTxtSenha().getText().length() < 8) {
                    JOptionPane.showMessageDialog(null, "A senha deve conter no minimo 8 digitos");
                    return;
                } else if (!view.getTxtSenha().getText().equals(view.getTxtConfirmarSenha().getText())) {
                    JOptionPane.showMessageDialog(null, "As senhas não são iguais");
                    return;
                }
                short numero = 0;
                String nome = view.getTxtNome().getText();
                String cpf = view.getTxtCpf().getText();
                try {
                    numero = Short.parseShort(view.getTxtNumero().getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O campo 'número camisa' deve ser preenchido com um valor inteiro");
                    return;
                }
                String posicao = view.getCbPosicao().getSelectedItem().toString();
                String senha = view.getTxtSenha().getText();

                Jogador jogador = new Jogador(0L, nome, cpf, numero, posicao, senha, true,(short) 0,(short) 0,(short) 0);

                boolean jaCadastrado = JogadorDAO.verificaCadastro(jogador);

                if (jaCadastrado == true) {
                    JOptionPane.showMessageDialog(null, "Um jogador com esse CPF já foi cadastrado anteriormente");
                    return;
                }

                JogadorDAO.inserirJogador(jogador);
                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
                view.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algum dado foi digitado incorretamente");
            }
        
    }
}
