package View;

import Controller.CadastrarJogadorController;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastrarJogadorView extends javax.swing.JFrame {

    private final CadastrarJogadorController controller;

    public CadastrarJogadorView() {
        initComponents();
        controller = new CadastrarJogadorController(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Tela de cadastro");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblNomeCadastro = new javax.swing.JLabel();
        lblCpfCadastro = new javax.swing.JLabel();
        lblSenhaCadastro = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        txtCpfCadastro = new javax.swing.JTextField();
        txtSenhaCadastro = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblNumeroCamisa = new javax.swing.JLabel();
        lblPosicao = new javax.swing.JLabel();
        txtNumeroJogador = new javax.swing.JTextField();
        cbPosicoes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("GERENFUT");

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCadastro.setText("Cadastro");

        lblNomeCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeCadastro.setText("Nome: ");

        lblCpfCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCpfCadastro.setText("CPF:");

        lblSenhaCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenhaCadastro.setText("Senha: ");

        txtNomeCadastro.setToolTipText("Digite o nome do jogador");
        txtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastroActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblNumeroCamisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumeroCamisa.setText("Numero camisa: ");

        lblPosicao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPosicao.setText("Posição: ");

        cbPosicoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Goleiro", "Lateral Esquerdo", "Lateral Direito ", "Zagueiro", "Volante", "Meio campo", "Atacante" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblNomeCadastro)
                        .addGap(6, 6, 6)
                        .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblCpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtCpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblNumeroCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtNumeroJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(cbPosicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo)
                .addGap(6, 6, 6)
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpfCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtCpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroCamisa)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtNumeroJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbPosicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPosicao))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenhaCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadastroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        controller.cadastrarJogador();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarJogadorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbPosicoes;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCpfCadastro;
    private javax.swing.JLabel lblNomeCadastro;
    private javax.swing.JLabel lblNumeroCamisa;
    private javax.swing.JLabel lblPosicao;
    private javax.swing.JLabel lblSenhaCadastro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCpfCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JTextField txtNumeroJogador;
    private javax.swing.JTextField txtSenhaCadastro;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtCpfCadastro() {
        return txtCpfCadastro;
    }

    public void setTxtCpfCadastro(JTextField txtCpfCadastro) {
        this.txtCpfCadastro = txtCpfCadastro;
    }

    public JTextField getTxtNomeCadastro() {
        return txtNomeCadastro;
    }

    public void setTxtNomeCadastro(JTextField txtNomeCadastro) {
        this.txtNomeCadastro = txtNomeCadastro;
    }

    public JTextField getTxtSenhaCadastro() {
        return txtSenhaCadastro;
    }

    public void setTxtSenhaCadastro(JTextField txtSenhaCadastro) {
        this.txtSenhaCadastro = txtSenhaCadastro;
    }

    public JTextField getTxtNumeroJogador() {
        return txtNumeroJogador;
    }

    public void setTxtNumeroJogador(JTextField txtNumeroJogador) {
        this.txtNumeroJogador = txtNumeroJogador;
    }

    public JComboBox<String> getCbPosicoes() {
        return cbPosicoes;
    }

    public void setCbPosicoes(JComboBox<String> cbPosicoes) {
        this.cbPosicoes = cbPosicoes;
    }

}
