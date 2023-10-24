package View;

import Controller.TelaPartidaController;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class TelaPartidaView extends javax.swing.JFrame {

    private final TelaPartidaController controller;
    
    public TelaPartidaView() {
        initComponents();
        controller = new TelaPartidaController(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        controller.partida();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPartidaEmAndamento = new javax.swing.JLabel();
        lblTimeCasa = new javax.swing.JLabel();
        lblTimeVisitante = new javax.swing.JLabel();
        lblDataJogo = new javax.swing.JLabel();
        lblVersus = new javax.swing.JLabel();
        spinTimeVisitante = new javax.swing.JSpinner();
        spinTimeCasa = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPartidaEmAndamento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPartidaEmAndamento.setText("Partida em andamento");

        lblTimeCasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimeCasa.setText("Time Casa");

        lblTimeVisitante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimeVisitante.setText("Time Visitante");

        lblDataJogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataJogo.setText("Data do jogo");

        lblVersus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVersus.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblTimeCasa)
                .addGap(18, 18, 18)
                .addComponent(spinTimeCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(lblVersus)
                .addGap(83, 83, 83)
                .addComponent(spinTimeVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTimeVisitante)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblPartidaEmAndamento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(lblDataJogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblPartidaEmAndamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDataJogo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimeCasa)
                    .addComponent(lblTimeVisitante)
                    .addComponent(lblVersus)
                    .addComponent(spinTimeVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinTimeCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel lblDataJogo;
    private javax.swing.JLabel lblPartidaEmAndamento;
    private javax.swing.JLabel lblTimeCasa;
    private javax.swing.JLabel lblTimeVisitante;
    private javax.swing.JLabel lblVersus;
    private javax.swing.JSpinner spinTimeCasa;
    private javax.swing.JSpinner spinTimeVisitante;
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
    
    

    
    
}

