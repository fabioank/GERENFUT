/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastrarTimeController;
import javax.swing.JTextField;

/**
 *
 * @author fabio
 */
public class CadastrarTimeView extends javax.swing.JFrame {
    
    private final CadastrarTimeController controller;
    
    public CadastrarTimeView() {
        initComponents();
        setSize(790, 610);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        controller = new CadastrarTimeController(this);
        setTitle("Cadastrar time");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastrarNovoTime = new javax.swing.JLabel();
        lblNomeTime = new javax.swing.JLabel();
        txtNomeTime = new javax.swing.JTextField();
        btnCadastrarTime = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblCadastrarNovoTime.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblCadastrarNovoTime.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarNovoTime.setText("Cadastrar novo time");
        getContentPane().add(lblCadastrarNovoTime);
        lblCadastrarNovoTime.setBounds(230, 40, 340, 48);

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeTime.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeTime.setText("Digite o nome do time: ");
        getContentPane().add(lblNomeTime);
        lblNomeTime.setBounds(140, 260, 260, 32);
        getContentPane().add(txtNomeTime);
        txtNomeTime.setBounds(410, 262, 220, 30);

        btnCadastrarTime.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrarTime.setText("Cadastrar");
        btnCadastrarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTimeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarTime);
        btnCadastrarTime.setBounds(360, 480, 80, 23);

        lblImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\Downloads\\imgCampo.jpg")); // NOI18N
        lblImagem.setText("jLabel1");
        getContentPane().add(lblImagem);
        lblImagem.setBounds(-3, -4, 790, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTimeActionPerformed
        controller.cadastrarTime();
        this.dispose();
        
    }//GEN-LAST:event_btnCadastrarTimeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarTimeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTimeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTimeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTimeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTimeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarTime;
    private javax.swing.JLabel lblCadastrarNovoTime;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JTextField txtNomeTime;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtNomeTime() {
        return txtNomeTime;
    }

    public void setTxtNomeTime(JTextField txtNomeTime) {
        this.txtNomeTime = txtNomeTime;
    }


}
