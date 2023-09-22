/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MenuPrincipalController;

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    public MenuPrincipal() {
        initComponents();
        controller = new MenuPrincipalController(this);
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemNovoJogador = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemEditarJogador = new javax.swing.JMenuItem();
        menuItemExcluirJogador = new javax.swing.JMenuItem();
        menuItemVerJogadores = new javax.swing.JMenuItem();
        menuItemConsultarJogador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemCriarNovoTime = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        menuItemNovoJogador.setText("Jogador");

        jMenuItem1.setText("Cadastrar novo jogador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuItemNovoJogador.add(jMenuItem1);

        menuItemEditarJogador.setText("Editar jogador");
        menuItemEditarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditarJogadorActionPerformed(evt);
            }
        });
        menuItemNovoJogador.add(menuItemEditarJogador);

        menuItemExcluirJogador.setText("Excluir jogador");
        menuItemExcluirJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExcluirJogadorActionPerformed(evt);
            }
        });
        menuItemNovoJogador.add(menuItemExcluirJogador);

        menuItemVerJogadores.setText("Ver jogadores cadastrados");
        menuItemVerJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerJogadoresActionPerformed(evt);
            }
        });
        menuItemNovoJogador.add(menuItemVerJogadores);

        menuItemConsultarJogador.setText("Consultar pela posição");
        menuItemConsultarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultarJogadorActionPerformed(evt);
            }
        });
        menuItemNovoJogador.add(menuItemConsultarJogador);

        jMenuBar1.add(menuItemNovoJogador);

        jMenu2.setText("Time");

        menuItemCriarNovoTime.setText("Criar novo time");
        jMenu2.add(menuItemCriarNovoTime);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Partida");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ranking");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarJogador cadastro = new CadastrarJogador();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemEditarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarJogadorActionPerformed
        EditarJogador editarJogador = new EditarJogador();
        editarJogador.setVisible(true);
    }//GEN-LAST:event_menuItemEditarJogadorActionPerformed

    private void menuItemExcluirJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExcluirJogadorActionPerformed
        ExcluirJogador excluirJogador = new ExcluirJogador();
        excluirJogador.setVisible(true);
    }//GEN-LAST:event_menuItemExcluirJogadorActionPerformed

    private void menuItemVerJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerJogadoresActionPerformed
        TodosJogadores todosJogadores = new TodosJogadores();
        todosJogadores.setVisible(true);
    }//GEN-LAST:event_menuItemVerJogadoresActionPerformed

    private void menuItemConsultarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultarJogadorActionPerformed
        ConsultarJogador consultarJogador = new ConsultarJogador();
        consultarJogador.setVisible(true);
    }//GEN-LAST:event_menuItemConsultarJogadorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuItemConsultarJogador;
    private javax.swing.JMenuItem menuItemCriarNovoTime;
    private javax.swing.JMenuItem menuItemEditarJogador;
    private javax.swing.JMenuItem menuItemExcluirJogador;
    private javax.swing.JMenu menuItemNovoJogador;
    private javax.swing.JMenuItem menuItemVerJogadores;
    // End of variables declaration//GEN-END:variables

}
