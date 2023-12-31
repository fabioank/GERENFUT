package View;

import Controller.TelaPartidaController;
import Controller.VotacaoController;
import Model.Jogador;
import javax.swing.JLabel;
import javax.swing.JList;


public class VotacaoView extends javax.swing.JFrame {

    
    VotacaoController controller;

    public VotacaoView() {
        initComponents();
        
        controller = new VotacaoController(this);
        controller.carregarDados();
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(790, 610);
        setLocationRelativeTo(null);
   

        setTitle("Tela da partida");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        lblMelhorJogador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaVotacaoGolMaisBonito = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaVotacaoMelhorJogador = new javax.swing.JList<>();
        btnSalvarPartida = new javax.swing.JButton();
        btnContVotoMelhorJogador = new javax.swing.JButton();
        btnContVotoMelhorGol = new javax.swing.JButton();
        lblVotosRestantesCasa = new javax.swing.JLabel();
        lblVotosCasa = new javax.swing.JLabel();
        lblJogadorMelhorJogador = new javax.swing.JLabel();
        lblJogadorMelhorGol = new javax.swing.JLabel();
        lblVotosRestantesVisitantes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEleicao = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblMelhorJogador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMelhorJogador.setForeground(new java.awt.Color(255, 255, 255));
        lblMelhorJogador.setText("MELHOR JOGADOR DA PARTIDA");
        getContentPane().add(lblMelhorJogador);
        lblMelhorJogador.setBounds(480, 120, 270, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GOL MAIS BONITO DA PARTIDA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 120, 270, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(430, 353, 0, 280);

        jScrollPane3.setViewportView(listaVotacaoGolMaisBonito);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(38, 150, 290, 320);

        jScrollPane4.setViewportView(listaVotacaoMelhorJogador);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(470, 150, 290, 320);

        btnSalvarPartida.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarPartida.setText("Salvar partida");
        btnSalvarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarPartida);
        btnSalvarPartida.setBounds(330, 540, 130, 23);

        btnContVotoMelhorJogador.setForeground(new java.awt.Color(0, 0, 0));
        btnContVotoMelhorJogador.setText("Contabilizar Voto");
        btnContVotoMelhorJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContVotoMelhorJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnContVotoMelhorJogador);
        btnContVotoMelhorJogador.setBounds(170, 480, 140, 20);

        btnContVotoMelhorGol.setForeground(new java.awt.Color(0, 0, 0));
        btnContVotoMelhorGol.setText("Contabilizar Voto");
        btnContVotoMelhorGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContVotoMelhorGolActionPerformed(evt);
            }
        });
        getContentPane().add(btnContVotoMelhorGol);
        btnContVotoMelhorGol.setBounds(590, 480, 150, 23);

        lblVotosRestantesCasa.setForeground(new java.awt.Color(255, 255, 255));
        lblVotosRestantesCasa.setText("0");
        getContentPane().add(lblVotosRestantesCasa);
        lblVotosRestantesCasa.setBounds(140, 480, 30, 20);

        lblVotosCasa.setForeground(new java.awt.Color(255, 255, 255));
        lblVotosCasa.setText("Votos restantes: ");
        getContentPane().add(lblVotosCasa);
        lblVotosCasa.setBounds(40, 480, 90, 20);

        lblJogadorMelhorJogador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJogadorMelhorJogador.setForeground(new java.awt.Color(255, 255, 255));
        lblJogadorMelhorJogador.setText("Jogador mais votado : ");
        getContentPane().add(lblJogadorMelhorJogador);
        lblJogadorMelhorJogador.setBounds(480, 510, 260, 20);

        lblJogadorMelhorGol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJogadorMelhorGol.setForeground(new java.awt.Color(255, 255, 255));
        lblJogadorMelhorGol.setText("Jogador mais votado : ");
        getContentPane().add(lblJogadorMelhorGol);
        lblJogadorMelhorGol.setBounds(50, 510, 260, 20);

        lblVotosRestantesVisitantes.setForeground(new java.awt.Color(255, 255, 255));
        lblVotosRestantesVisitantes.setText("0");
        getContentPane().add(lblVotosRestantesVisitantes);
        lblVotosRestantesVisitantes.setBounds(570, 480, 30, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Votos restantes: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 480, 100, 16);

        lblEleicao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEleicao.setForeground(new java.awt.Color(255, 255, 255));
        lblEleicao.setText("Votação de jogadoes");
        getContentPane().add(lblEleicao);
        lblEleicao.setBounds(220, 20, 360, 50);

        lblImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\Downloads\\imgCampo.jpg")); // NOI18N
        lblImagem.setText("jLabel3");
        getContentPane().add(lblImagem);
        lblImagem.setBounds(1, -4, 790, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContVotoMelhorJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContVotoMelhorJogadorActionPerformed
        controller.addVotoMelhorGol();
    }//GEN-LAST:event_btnContVotoMelhorJogadorActionPerformed

    private void btnContVotoMelhorGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContVotoMelhorGolActionPerformed
        controller.addVotoMelhorJogador();
    }//GEN-LAST:event_btnContVotoMelhorGolActionPerformed

    private void btnSalvarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPartidaActionPerformed
        controller.salvarPartida();
        dispose();
    }//GEN-LAST:event_btnSalvarPartidaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VotacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContVotoMelhorGol;
    private javax.swing.JButton btnContVotoMelhorJogador;
    private javax.swing.JButton btnSalvarPartida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEleicao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblJogadorMelhorGol;
    private javax.swing.JLabel lblJogadorMelhorJogador;
    private javax.swing.JLabel lblMelhorJogador;
    private javax.swing.JLabel lblVotosCasa;
    private javax.swing.JLabel lblVotosRestantesCasa;
    private javax.swing.JLabel lblVotosRestantesVisitantes;
    private javax.swing.JList<Jogador> listaVotacaoGolMaisBonito;
    private javax.swing.JList<Jogador> listaVotacaoMelhorJogador;
    // End of variables declaration//GEN-END:variables

    public JList<Jogador> getListaVotacaoGolMaisBonito() {
        return listaVotacaoGolMaisBonito;
    }

    public void setListaVotacaoGolMaisBonito(JList<Jogador> listaVotacaoGolMaisBonito) {
        this.listaVotacaoGolMaisBonito = listaVotacaoGolMaisBonito;
    }

    public JList<Jogador> getListaVotacaoMelhorJogador() {
        return listaVotacaoMelhorJogador;
    }

    public void setListaVotacaoMelhorJogador(JList<Jogador> listaVotacaoMelhorJogador) {
        this.listaVotacaoMelhorJogador = listaVotacaoMelhorJogador;
    }

    public JLabel getLblVotosRestantesCasa() {
        return lblVotosRestantesCasa;
    }

    public void setLblVotosRestantesCasa(JLabel lblVotosRestantesCasa) {
        this.lblVotosRestantesCasa = lblVotosRestantesCasa;
    }

    public JLabel getLblVotosRestantesVisitante() {
        return lblVotosRestantesVisitantes;
    }

    public void setLblVotosRestantesVisitante(JLabel lblVotosRestantesVisitante) {
        this.lblVotosRestantesVisitantes = lblVotosRestantesVisitante;
    }

    public JLabel getLblJogadorMaisVotado() {
        return lblJogadorMelhorJogador;
    }

    public void setLblJogadorMaisVotado(JLabel lblJogadorMaisVotado) {
        this.lblJogadorMelhorJogador = lblJogadorMaisVotado;
    }

    public JLabel getLblJogadorMelhorGol() {
        return lblJogadorMelhorGol;
    }

    public void setLblJogadorMelhorGol(JLabel lblJogadorMelhorGol) {
        this.lblJogadorMelhorGol = lblJogadorMelhorGol;
    }

    public JLabel getLblVotosRestantesVisitantes() {
        return lblVotosRestantesVisitantes;
    }

    public void setLblVotosRestantesVisitantes(JLabel lblVotosRestantesVisitantes) {
        this.lblVotosRestantesVisitantes = lblVotosRestantesVisitantes;
    }  
    
}
