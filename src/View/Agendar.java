/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendaController;
import Model.DAO.Banco;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Day
 */
public class Agendar extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form agenda
     */
      public Agendar(){
        initComponents();
        this.controller = new AgendaController(this);
        Banco.inicia();
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Voltar = new javax.swing.JButton();
        jBAgendar = new javax.swing.JButton();
        jCServico = new javax.swing.JComboBox<>();
        jTValor = new javax.swing.JTextField();
        jLCliente = new javax.swing.JLabel();
        jLServico = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLHorario = new javax.swing.JLabel();
        jObservacao = new javax.swing.JLabel();
        jCCliente = new javax.swing.JComboBox<>();
        jTId = new javax.swing.JTextField();
        TextFormatedData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservacao = new javax.swing.JTextPane();
        TextFormatedHora = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Voltar.setBackground(new java.awt.Color(255, 255, 255));
        Voltar.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        Voltar.setForeground(new java.awt.Color(255, 161, 169));
        Voltar.setText("Voltar");
        Voltar.setBorder(null);
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 30));

        jBAgendar.setBackground(new java.awt.Color(255, 161, 169));
        jBAgendar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBAgendar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgendar.setText("Agendar!");
        jBAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 190, 30));

        jCServico.setBorder(null);
        jCServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(jCServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 210, 30));

        jTValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 210, 30));

        jLCliente.setText("Cliente:");
        getContentPane().add(jLCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLServico.setText("Serviço:");
        getContentPane().add(jLServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLValor.setText("Valor R$:");
        getContentPane().add(jLValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jData.setText("Data:");
        getContentPane().add(jData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLId.setText("ID:");
        getContentPane().add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLHorario.setText("Horário");
        getContentPane().add(jLHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jObservacao.setText("Observação:");
        getContentPane().add(jObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jCCliente.setBorder(null);
        jCCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jCCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 210, 30));

        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 30));

        TextFormatedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 210, 30));

        jScrollPane1.setViewportView(jTObservacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 330, 200));

        TextFormatedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 210, 30));

        jTTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane2.setViewportView(jTTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 790, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/interface agenda.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdActionPerformed

    private void jBAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgendarActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_jBAgendarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.controller.voltarParaMenu();
    }//GEN-LAST:event_VoltarActionPerformed

    private void jCClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCClienteActionPerformed

    private void jTValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTValorActionPerformed
       
    }//GEN-LAST:event_jTValorActionPerformed

    private void jCServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCServicoItemStateChanged
        
        this.controller.atualizaValor();
    }//GEN-LAST:event_jCServicoItemStateChanged

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
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TextFormatedData;
    private javax.swing.JFormattedTextField TextFormatedHora;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jBAgendar;
    private javax.swing.JComboBox<String> jCCliente;
    private javax.swing.JComboBox<String> jCServico;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLHorario;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLServico;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jObservacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextPane jTObservacao;
    private javax.swing.JTable jTTable;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables

 private void iniciar(){
     this.controller.AtuliazaTabela();
     this.controller.atualizarCliente();
     this.controller.atualizaServico();
     this.controller.atualizaValor();
  
     

 }

    public JTable getjTTable() {
        return jTTable;
    }

    public void setjTTable(JTable jTTable) {
        this.jTTable = jTTable;
    }

    public JComboBox<String> getjCCliente() {
        return jCCliente;
    }

    public void setjCCliente(JComboBox<String> jCCliente) {
        this.jCCliente = jCCliente;
    }

    public JComboBox<String> getjCServico() {
        return jCServico;
    }

    public void setjCServico(JComboBox<String> jCServico) {
        this.jCServico = jCServico;
    }

    public JTextField getjTValor() {
        return jTValor;
    }

    public void setjTValor(JTextField jTValor) {
        this.jTValor = jTValor;
    }

    public JFormattedTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JFormattedTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JFormattedTextField getTextFormatedHora() {
        return TextFormatedHora;
    }

    public void setTextFormatedHora(JFormattedTextField TextFormatedHora) {
        this.TextFormatedHora = TextFormatedHora;
    }

    public JTextField getTextId() {
        return jTId;
    }
    public JTextField getjTId() {
        return jTId;
    }

    public void setjTId(JTextField jTId) {
        this.jTId = jTId;
    }

    public JTextPane getjTObservacao() {
        return jTObservacao;
    }

    public void setjTObservacao(JTextPane jTObservacao) {
        this.jTObservacao = jTObservacao;
    }

    
    
    
}
