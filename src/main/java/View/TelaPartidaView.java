package View;

import Controller.TelaPartidaController;
import Model.Jogador;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;


public class TelaPartidaView extends javax.swing.JFrame {

    private final TelaPartidaController controller;

    public TelaPartidaView() {
        initComponents();
        controller = new TelaPartidaController(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        controller.partida();
        controller.comporTimeCasa();
        controller.comporTimeVisitante();
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
        jSeparator2 = new javax.swing.JSeparator();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 610));
        setResizable(false);
        getContentPane().setLayout(null);

        lblPartidaEmAndamento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPartidaEmAndamento.setForeground(new java.awt.Color(255, 255, 255));
        lblPartidaEmAndamento.setText("Partida em andamento");
        getContentPane().add(lblPartidaEmAndamento);
        lblPartidaEmAndamento.setBounds(290, 30, 243, 32);

        lblTimeCasa.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTimeCasa.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeCasa.setText("Time Casa");
        getContentPane().add(lblTimeCasa);
        lblTimeCasa.setBounds(50, 160, 220, 48);

        lblTimeVisitante.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTimeVisitante.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeVisitante.setText("Time Visitante");
        getContentPane().add(lblTimeVisitante);
        lblTimeVisitante.setBounds(540, 160, 250, 40);

        lblDataJogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataJogo.setForeground(new java.awt.Color(255, 255, 255));
        lblDataJogo.setText("Data do jogo");
        getContentPane().add(lblDataJogo);
        lblDataJogo.setBounds(370, 80, 100, 20);

        lblVersus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVersus.setForeground(new java.awt.Color(255, 255, 255));
        lblVersus.setText("X");
        getContentPane().add(lblVersus);
        lblVersus.setBounds(400, 170, 11, 25);

        cbMarcadorTimeCasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbMarcadorTimeCasa);
        cbMarcadorTimeCasa.setBounds(30, 270, 258, 22);

        cbMarcadorTimeVisitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbMarcadorTimeVisitante);
        cbMarcadorTimeVisitante.setBounds(500, 270, 258, 22);

        jScrollPane1.setViewportView(listMarcadoresTimeVisitante);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 310, 258, 99);

        jScrollPane2.setViewportView(listMarcadoresTimeCasa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 310, 258, 104);

        btnAddMarcadorCasa.setText("+");
        btnAddMarcadorCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcadorCasaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMarcadorCasa);
        btnAddMarcadorCasa.setBounds(300, 270, 44, 23);

        lblPlacarTimeCasa.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblPlacarTimeCasa.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacarTimeCasa.setText("0");
        getContentPane().add(lblPlacarTimeCasa);
        lblPlacarTimeCasa.setBounds(310, 160, 37, 40);

        lblPlacarTimeVisitante.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblPlacarTimeVisitante.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacarTimeVisitante.setText("0");
        getContentPane().add(lblPlacarTimeVisitante);
        lblPlacarTimeVisitante.setBounds(460, 150, 37, 60);

        btnAddMarcadorVisitante.setText("+");
        btnAddMarcadorVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcadorVisitanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMarcadorVisitante);
        btnAddMarcadorVisitante.setBounds(450, 270, 43, 23);

        btnEncerrarPartida.setText("Encerrar a partida");
        btnEncerrarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncerrarPartida);
        btnEncerrarPartida.setBounds(340, 460, 150, 23);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(430, 353, 0, 280);

        lblImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\Downloads\\imgCampo.jpg")); // NOI18N
        lblImagem.setText("jLabel1");
        getContentPane().add(lblImagem);
        lblImagem.setBounds(0, 0, 790, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMarcadorCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcadorCasaActionPerformed
        controller.addMarcadorTimeCasa();
    }//GEN-LAST:event_btnAddMarcadorCasaActionPerformed

    private void btnAddMarcadorVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcadorVisitanteActionPerformed
        controller.addMarcadorTimeVisitante();
    }//GEN-LAST:event_btnAddMarcadorVisitanteActionPerformed

    private void btnEncerrarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarPartidaActionPerformed
        controller.encerrarPartida();
        dispose();
        VotacaoView votacaoView = new VotacaoView();
        votacaoView.setVisible(true);
    }//GEN-LAST:event_btnEncerrarPartidaActionPerformed

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
    private javax.swing.JButton btnEncerrarPartida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbMarcadorTimeCasa;
    private javax.swing.JComboBox<String> cbMarcadorTimeVisitante;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDataJogo;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblPartidaEmAndamento;
    private javax.swing.JLabel lblPlacarTimeCasa;
    private javax.swing.JLabel lblPlacarTimeVisitante;
    private javax.swing.JLabel lblTimeCasa;
    private javax.swing.JLabel lblTimeVisitante;
    private javax.swing.JLabel lblVersus;
    private javax.swing.JList<Jogador> listMarcadoresTimeCasa;
    private javax.swing.JList<Jogador> listMarcadoresTimeVisitante;
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
}
