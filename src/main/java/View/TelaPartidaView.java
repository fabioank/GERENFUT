package View;

import Controller.TelaPartidaController;
import Model.Jogador;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;

public class TelaPartidaView extends javax.swing.JFrame {

    private final TelaPartidaController controller;
    
    public TelaPartidaView() {
        initComponents();
        controller = new TelaPartidaController(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        controller.partida();
        controller.addJogadorTimeCasa();
        controller.addJogadorTimeVisitante();
        setSize(900, 700);
        setLocationRelativeTo(null);
        
        setTitle("Tela da partida");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnFinalizarPartida = new javax.swing.JButton();

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
        lblDataJogo.setBounds(402, 77, 85, 20);

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

        btnFinalizarPartida.setText("Finalizar partida");
        getContentPane().add(btnFinalizarPartida);
        btnFinalizarPartida.setBounds(381, 313, 116, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMarcadorCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcadorCasaActionPerformed
        controller.addMarcadorTimeCasa();
    }//GEN-LAST:event_btnAddMarcadorCasaActionPerformed

    private void btnAddMarcadorVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcadorVisitanteActionPerformed
        controller.addMarcadorTimeVisitante();
    }//GEN-LAST:event_btnAddMarcadorVisitanteActionPerformed

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
    private javax.swing.JButton btnFinalizarPartida;
    private javax.swing.JComboBox<String> cbMarcadorTimeCasa;
    private javax.swing.JComboBox<String> cbMarcadorTimeVisitante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataJogo;
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

