package View;

import Controller.RankingController;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class RankingView extends javax.swing.JFrame {

    private final RankingController controller;

    public RankingView() {
        initComponents();

        controller = new RankingController(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Ranking");
        controller.rankingArtilheiro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRankingJogadores = new javax.swing.JTable();
        lblFiltroRanking = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        brnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblRankingJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posição", "Nome ", "Gols Marcados", "Melhor Jogador", "Gol Mais Bonito"
            }
        ));
        jScrollPane1.setViewportView(tblRankingJogadores);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tblRankingJogadores.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        tblRankingJogadores.setDefaultRenderer(Object.class, centerRenderer);

        lblFiltroRanking.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiltroRanking.setText("Filtrar ranking: ");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artilheiro", "Titulos de melhor jogador", "Titulos de gol mais bonito" }));

        brnFiltrar.setText("Filtrar");
        brnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lblFiltroRanking)
                .addGap(18, 18, 18)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(brnFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltroRanking)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnFiltrar))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnFiltrarActionPerformed

        if (this.cbFiltro.getSelectedItem().toString().equals("Artilheiro")) {
            controller.rankingArtilheiro();
        } else if (this.cbFiltro.getSelectedItem().toString().equals("Titulos de melhor jogador")) {
            controller.rankingMelhorJogador();
        } else {
            controller.rankingMelhorGol();
        }
    }//GEN-LAST:event_brnFiltrarActionPerformed

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
            java.util.logging.Logger.getLogger(RankingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankingView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnFiltrar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltroRanking;
    private javax.swing.JTable tblRankingJogadores;
    // End of variables declaration//GEN-END:variables

    public JTable getTblRankingJogadores() {
        return tblRankingJogadores;
    }

    public void setTblRankingJogadores(JTable tblRankingJogadores) {
        this.tblRankingJogadores = tblRankingJogadores;
    }

}
