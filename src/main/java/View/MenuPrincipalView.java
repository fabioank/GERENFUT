package View;

import Controller.MenuPrincipalController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.SwingConstants;

public class MenuPrincipalView extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    public MenuPrincipalView() {
        initComponents();
        controller = new MenuPrincipalController(this);
        setExtendedState(MAXIMIZED_BOTH);
        jLabel3.setLayout(new FlowLayout());
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setVerticalAlignment(SwingConstants.CENTER);
        setTitle("Menu principal");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemNovoJogador = new javax.swing.JMenu();
        menuItemVerJogadores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemCriarNovoTime = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemCriarPartida = new javax.swing.JMenuItem();
        menuRanking = new javax.swing.JMenu();
        menuItemVerRanking = new javax.swing.JMenuItem();
        menuHistorico = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View//Imagens/IMAGEMGRAMADO.jpg")));
        getContentPane().add(jLabel3, java.awt.BorderLayout.CENTER);
        ImageIcon icon = new ImageIcon(getClass().getResource("/View//Imagens/IMAGEMGRAMADO.jpg"));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Obtenha as dimensões da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Obtenha as dimensões da imagem
        int imageWidth = icon.getIconWidth();
        int imageHeight = icon.getIconHeight();

        // Calcule as proporções de escala
        double scaleX = (double) screenSize.width / imageWidth;
        double scaleY = (double) screenSize.height / imageHeight;

        // Use a proporção de escala maior para preencher a tela
        double scale = Math.max(scaleX, scaleY);

        // Redimensione a imagem para preencher a tela
        Image scaledImage = icon.getImage().getScaledInstance((int) (scale * imageWidth), (int) (scale * imageHeight), Image.SCALE_DEFAULT);

        // Crie um novo ImageIcon com a imagem redimensionada
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Defina o ícone na JLabel
        jLabel3.setIcon(scaledIcon);

        menuItemNovoJogador.setText("Jogador");
        menuItemNovoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoJogadorActionPerformed(evt);
            }
        });

        menuItemVerJogadores.setText("Ver Jogadores");
        menuItemVerJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerJogadoresActionPerformed(evt);
            }
        });
        menuItemNovoJogador.add(menuItemVerJogadores);

        jMenuBar1.add(menuItemNovoJogador);

        jMenu2.setText("Time");

        menuItemCriarNovoTime.setText("Cadastrar novo time");
        menuItemCriarNovoTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCriarNovoTimeActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemCriarNovoTime);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Partida");

        menuItemCriarPartida.setText("Criar partida");
        menuItemCriarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCriarPartidaActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemCriarPartida);

        jMenuBar1.add(jMenu3);

        menuRanking.setText("Ranking");
        menuRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRankingActionPerformed(evt);
            }
        });

        menuItemVerRanking.setText("Ver ranking");
        menuItemVerRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerRankingActionPerformed(evt);
            }
        });
        menuRanking.add(menuItemVerRanking);

        jMenuBar1.add(menuRanking);

        menuHistorico.setText("Històrico");
        jMenuBar1.add(menuHistorico);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCriarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCriarPartidaActionPerformed
        CriarPartidaView criarPartida = new CriarPartidaView();
        criarPartida.setVisible(true);
    }//GEN-LAST:event_menuItemCriarPartidaActionPerformed

    private void menuRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRankingActionPerformed

    }//GEN-LAST:event_menuRankingActionPerformed

    private void menuItemVerRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerRankingActionPerformed
        RankingView ranking = new RankingView();
        ranking.setVisible(true);
    }//GEN-LAST:event_menuItemVerRankingActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TodosJogadoresView todosJogadoresView = new TodosJogadoresView();
        todosJogadoresView.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemCriarNovoTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCriarNovoTimeActionPerformed
        CadastrarTimeView cadastrarTime = new CadastrarTimeView();
        cadastrarTime.setVisible(true);
    }//GEN-LAST:event_menuItemCriarNovoTimeActionPerformed

    private void menuItemNovoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoJogadorActionPerformed

    }//GEN-LAST:event_menuItemNovoJogadorActionPerformed

    private void menuItemVerJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerJogadoresActionPerformed
        TodosJogadoresView todosJogadoresView = new TodosJogadoresView();
        todosJogadoresView.setVisible(true);
        
    }//GEN-LAST:event_menuItemVerJogadoresActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuHistorico;
    private javax.swing.JMenuItem menuItemCriarNovoTime;
    private javax.swing.JMenuItem menuItemCriarPartida;
    private javax.swing.JMenu menuItemNovoJogador;
    private javax.swing.JMenuItem menuItemVerJogadores;
    private javax.swing.JMenuItem menuItemVerRanking;
    private javax.swing.JMenu menuRanking;
    // End of variables declaration//GEN-END:variables

}
