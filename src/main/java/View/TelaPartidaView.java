package View;

import Controller.TelaPartidaController;
import Model.Jogador;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class TelaPartidaView extends javax.swing.JFrame {

    private final TelaPartidaController controller;

    public TelaPartidaView() {
        initComponents();
        controller = new TelaPartidaController(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        controller.partida();
        controller.comporTimeCasa();
        controller.comporTimeVisitante();
        setSize(900, 700);
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
        lblPartidaEmAndamento = new javax.swing.JLabel();
        lblTimeCasa = new javax.swing.JLabel();
        lblTimeVisitante = new javax.swing.JLabel();
        lblDataJogo = new javax.swing.JLabel();
        lblVersus = new javax.swing.JLabel();
        cbMarcadorTimeCasa = new javax.swing.JComboBox<>();
        cbMarcadorTimeVisitante = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMarcadoresTimeVisitante = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMarcadoresTimeCasa = new javax.swing.JList<>();
        btnAddMarcadorCasa = new javax.swing.JButton();
        lblPlacarTimeCasa = new javax.swing.JLabel();
        lblPlacarTimeVisitante = new javax.swing.JLabel();
        btnAddMarcadorVisitante = new javax.swing.JButton();
        btnEncerrarPartida = new javax.swing.JButton();
        btnRemoverMarcadorCasa = new javax.swing.JButton();
        btnRemoverJogadorVisitante = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblPartidaEmAndamento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPartidaEmAndamento.setText("Partida em andamento");
        getContentPane().add(lblPartidaEmAndamento);
        lblPartidaEmAndamento.setBounds(324, 33, 242, 32);

        lblTimeCasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimeCasa.setText("Time Casa");
        getContentPane().add(lblTimeCasa);
        lblTimeCasa.setBounds(139, 135, 90, 25);

        lblTimeVisitante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimeVisitante.setText("Time Visitante");
        getContentPane().add(lblTimeVisitante);
        lblTimeVisitante.setBounds(645, 135, 120, 25);

        lblDataJogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataJogo.setText("Data do jogo");
        getContentPane().add(lblDataJogo);
        lblDataJogo.setBounds(402, 77, 100, 20);

        lblVersus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVersus.setText("X");
        getContentPane().add(lblVersus);
        lblVersus.setBounds(435, 135, 11, 25);

        cbMarcadorTimeCasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbMarcadorTimeCasa);
        cbMarcadorTimeCasa.setBounds(59, 167, 258, 22);

        cbMarcadorTimeVisitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbMarcadorTimeVisitante);
        cbMarcadorTimeVisitante.setBounds(570, 167, 258, 22);

        jScrollPane1.setViewportView(listMarcadoresTimeVisitante);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(570, 202, 258, 99);

        jScrollPane2.setViewportView(listMarcadoresTimeCasa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(59, 202, 258, 104);

        btnAddMarcadorCasa.setText("+");
        btnAddMarcadorCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcadorCasaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMarcadorCasa);
        btnAddMarcadorCasa.setBounds(323, 167, 44, 23);

        lblPlacarTimeCasa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPlacarTimeCasa.setText("0");
        getContentPane().add(lblPlacarTimeCasa);
        lblPlacarTimeCasa.setBounds(330, 129, 37, 32);

        lblPlacarTimeVisitante.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPlacarTimeVisitante.setText("0");
        getContentPane().add(lblPlacarTimeVisitante);
        lblPlacarTimeVisitante.setBounds(529, 129, 37, 32);

        btnAddMarcadorVisitante.setText("+");
        btnAddMarcadorVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcadorVisitanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMarcadorVisitante);
        btnAddMarcadorVisitante.setBounds(509, 167, 43, 23);

        btnEncerrarPartida.setText("Encerrar a partida");
        btnEncerrarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncerrarPartida);
        btnEncerrarPartida.setBounds(380, 310, 140, 23);

        btnRemoverMarcadorCasa.setText("-");
        btnRemoverMarcadorCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMarcadorCasaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverMarcadorCasa);
        btnRemoverMarcadorCasa.setBounds(330, 200, 40, 23);

        btnRemoverJogadorVisitante.setText("-");
        getContentPane().add(btnRemoverJogadorVisitante);
        btnRemoverJogadorVisitante.setBounds(510, 200, 40, 23);

        lblMelhorJogador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMelhorJogador.setText("ELEGER O MELHOR JOGADOR DA PARTIDA");
        getContentPane().add(lblMelhorJogador);
        lblMelhorJogador.setBounds(510, 370, 360, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ELEGER O GOL MAIS BONITO DA PARTIDA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 370, 350, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(430, 353, 0, 280);

        jScrollPane3.setViewportView(listaVotacaoGolMaisBonito);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(60, 400, 258, 120);

        jScrollPane4.setViewportView(listaVotacaoMelhorJogador);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(570, 400, 260, 120);

        btnSalvarPartida.setText("Salvar partida");
        btnSalvarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarPartida);
        btnSalvarPartida.setBounds(390, 590, 110, 23);

        btnContVotoMelhorJogador.setText("Contabilizar Voto");
        btnContVotoMelhorJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContVotoMelhorJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnContVotoMelhorJogador);
        btnContVotoMelhorJogador.setBounds(190, 530, 130, 20);

        btnContVotoMelhorGol.setText("Contabilizar Voto");
        btnContVotoMelhorGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContVotoMelhorGolActionPerformed(evt);
            }
        });
        getContentPane().add(btnContVotoMelhorGol);
        btnContVotoMelhorGol.setBounds(700, 530, 130, 23);

        lblVotosRestantesCasa.setText("0");
        getContentPane().add(lblVotosRestantesCasa);
        lblVotosRestantesCasa.setBounds(150, 530, 30, 20);

        lblVotosCasa.setText("Votos restantes: ");
        getContentPane().add(lblVotosCasa);
        lblVotosCasa.setBounds(60, 530, 90, 20);

        lblJogadorMelhorJogador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJogadorMelhorJogador.setText("Jogador mais votado : ");
        getContentPane().add(lblJogadorMelhorJogador);
        lblJogadorMelhorJogador.setBounds(570, 560, 260, 20);

        lblJogadorMelhorGol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJogadorMelhorGol.setText("Jogador mais votado : ");
        getContentPane().add(lblJogadorMelhorGol);
        lblJogadorMelhorGol.setBounds(60, 560, 260, 20);

        lblVotosRestantesVisitantes.setText("0");
        getContentPane().add(lblVotosRestantesVisitantes);
        lblVotosRestantesVisitantes.setBounds(660, 530, 30, 20);

        jLabel2.setText("Votos restantes: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 530, 90, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMarcadorCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcadorCasaActionPerformed
        controller.addMarcadorTimeCasa();
    }//GEN-LAST:event_btnAddMarcadorCasaActionPerformed

    private void btnAddMarcadorVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcadorVisitanteActionPerformed
        controller.addMarcadorTimeVisitante();
    }//GEN-LAST:event_btnAddMarcadorVisitanteActionPerformed

    private void btnRemoverMarcadorCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMarcadorCasaActionPerformed
        //controller.removerMarcadorTimeCasa();
    }//GEN-LAST:event_btnRemoverMarcadorCasaActionPerformed

    private void btnEncerrarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarPartidaActionPerformed

        //new VotacaoView().setVisible(true);
        controller.elegerGolMaisBonito();
        controller.elegerMelhorJogador();
    }//GEN-LAST:event_btnEncerrarPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPartidaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPartidaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPartidaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPartidaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPartidaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMarcadorCasa;
    private javax.swing.JButton btnAddMarcadorVisitante;
    private javax.swing.JButton btnContVotoMelhorGol;
    private javax.swing.JButton btnContVotoMelhorJogador;
    private javax.swing.JButton btnEncerrarPartida;
    private javax.swing.JButton btnRemoverJogadorVisitante;
    private javax.swing.JButton btnRemoverMarcadorCasa;
    private javax.swing.JButton btnSalvarPartida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbMarcadorTimeCasa;
    private javax.swing.JComboBox<String> cbMarcadorTimeVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDataJogo;
    private javax.swing.JLabel lblJogadorMelhorGol;
    private javax.swing.JLabel lblJogadorMelhorJogador;
    private javax.swing.JLabel lblMelhorJogador;
    private javax.swing.JLabel lblPartidaEmAndamento;
    private javax.swing.JLabel lblPlacarTimeCasa;
    private javax.swing.JLabel lblPlacarTimeVisitante;
    private javax.swing.JLabel lblTimeCasa;
    private javax.swing.JLabel lblTimeVisitante;
    private javax.swing.JLabel lblVersus;
    private javax.swing.JLabel lblVotosCasa;
    private javax.swing.JLabel lblVotosRestantesCasa;
    private javax.swing.JLabel lblVotosRestantesVisitantes;
    private javax.swing.JList<Jogador> listMarcadoresTimeCasa;
    private javax.swing.JList<Jogador> listMarcadoresTimeVisitante;
    private javax.swing.JList<Jogador> listaVotacaoGolMaisBonito;
    private javax.swing.JList<Jogador> listaVotacaoMelhorJogador;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblTimeCasa() {
        return lblTimeCasa;
    }

    public void setLblTimeCasa(JLabel lblTimeCasa) {
        this.lblTimeCasa = lblTimeCasa;
    }

    public JLabel getLblTimeVisitante() {
        return lblTimeVisitante;
    }

    public void setLblTimeVisitante(JLabel lblTimeVisitante) {
        this.lblTimeVisitante = lblTimeVisitante;
    }

    public JLabel getLblDataJogo() {
        return lblDataJogo;
    }

    public void setLblDataJogo(JLabel lblDataJogo) {
        this.lblDataJogo = lblDataJogo;
    }

    public JComboBox<String> getCbMarcadorTimeCasa() {
        return cbMarcadorTimeCasa;
    }

    public void setCbMarcadorTimeCasa(JComboBox<String> cbMarcadorTimeCasa) {
        this.cbMarcadorTimeCasa = cbMarcadorTimeCasa;
    }

    public JComboBox<String> getCbMarcadorTimeVisitante() {
        return cbMarcadorTimeVisitante;
    }

    public void setCbMarcadorTimeVisitante(JComboBox<String> cbMarcadorTimeVisitante) {
        this.cbMarcadorTimeVisitante = cbMarcadorTimeVisitante;
    }

    public JList<Jogador> getListMarcadoresTimeCasa() {
        return listMarcadoresTimeCasa;
    }

    public void setListMarcadoresTimeCasa(JList<Jogador> listMarcadoresTimeCasa) {
        this.listMarcadoresTimeCasa = listMarcadoresTimeCasa;
    }

    public JList<Jogador> getListMarcadoresTimeVisitante() {
        return listMarcadoresTimeVisitante;
    }

    public void setListMarcadoresTimeVisitante(JList<Jogador> listMarcadoresTimeVisitante) {
        this.listMarcadoresTimeVisitante = listMarcadoresTimeVisitante;
    }

    public JLabel getLblPlacar() {
        return lblPlacarTimeVisitante;
    }

    public void setLblPlacar(JLabel lblPlacar) {
        this.lblPlacarTimeVisitante = lblPlacar;
    }

    public JLabel getLblPlacarTimeCasa() {
        return lblPlacarTimeCasa;
    }

    public void setLblPlacarTimeCasa(JLabel lblPlacarTimeCasa) {
        this.lblPlacarTimeCasa = lblPlacarTimeCasa;
    }

    public JLabel getLblPlacarTimeVisitante() {
        return lblPlacarTimeVisitante;
    }

    public void setLblPlacarTimeVisitante(JLabel lblPlacarTimeVisitante) {
        this.lblPlacarTimeVisitante = lblPlacarTimeVisitante;
    }

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
