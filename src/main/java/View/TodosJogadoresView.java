/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TodosJogadoresController;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class TodosJogadoresView extends javax.swing.JFrame {

    private final TodosJogadoresController controller;

    public TodosJogadoresView() {
        initComponents();
        setTitle("Listagem de jogadores");
        controller = new TodosJogadoresController(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        controller.todosJogadores();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJogadores = new javax.swing.JTable();
        btnTodosJogadores = new javax.swing.JButton();
        lblFiltro = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btlSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID JOGADOR", "NOME", "NUMERO", "POSIÇÃO", "SITUAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJogadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJogadores);

        btnTodosJogadores.setText("Carregar Jogadores");
        btnTodosJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosJogadoresActionPerformed(evt);
            }
        });

        lblFiltro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFiltro.setText("Filtrar: ");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os jogadores", "Goleiro", "Lateral Esquerdo", "Lateral Direito ", "Zagueiro", "Volante", "Meio campo", "Atacante" }));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btlSair.setText("Sair");
        btlSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTodosJogadores)
                .addGap(137, 137, 137)
                .addComponent(btnNovo)
                .addGap(40, 40, 40)
                .addComponent(btlSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFiltro)
                    .addComponent(btnTodosJogadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFiltro)
                    .addComponent(btnNovo)
                    .addComponent(btlSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodosJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosJogadoresActionPerformed
        controller.todosJogadores();
    }//GEN-LAST:event_btnTodosJogadoresActionPerformed

    private void tblJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJogadoresMouseClicked
        controller.duploClick(evt);    
    }//GEN-LAST:event_tblJogadoresMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        CadastrarJogadoresView cadastrarJogadoresView = new CadastrarJogadoresView(null);
        cadastrarJogadoresView.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btlSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSairActionPerformed
        dispose();
    }//GEN-LAST:event_btlSairActionPerformed

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
            java.util.logging.Logger.getLogger(TodosJogadoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodosJogadoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodosJogadoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodosJogadoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodosJogadoresView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlSair;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnTodosJogadores;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JTable tblJogadores;
    // End of variables declaration//GEN-END:variables

    public JTable getTblJogadores() {
        return tblJogadores;
    }

    public void setTblJogadores(JTable tblJogadores) {
        this.tblJogadores = tblJogadores;
    }

    public JComboBox<String> getCbFiltro() {
        return cbFiltro;
    }

    public void setCbFiltro(JComboBox<String> cbFiltro) {
        this.cbFiltro = cbFiltro;
    }
    

}
