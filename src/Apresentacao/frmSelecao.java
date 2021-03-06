/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Carro;
import Modelo.Estaticos;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class frmSelecao extends javax.swing.JDialog
{

    /**
     * Creates new form frmSelecao
     */
    public frmSelecao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisarCarro = new javax.swing.JTable();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPesquisarCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "FABRICANTE", "MODELO", "COR", "ANO DE FABRICAÇÃO", "VALOR"
            }
        ));
        tblPesquisarCarro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPesquisarCarro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblPesquisarCarroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPesquisarCarro);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tblPesquisarCarro.getModel();
        modelo.setNumRows(0);
        for (Carro c : Estaticos.listaCarro)
        {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getFabricante(),
                c.getModelo(),
                c.getCor(),
                c.getAnoFabricao(),
                c.getValor()
            });
        }
    }
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOKActionPerformed
    {//GEN-HEADEREND:event_btnOKActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void tblPesquisarCarroMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblPesquisarCarroMouseClicked
    {//GEN-HEADEREND:event_tblPesquisarCarroMouseClicked
        int linha = tblPesquisarCarro.getSelectedRow();
        Estaticos.carro.setId((int) tblPesquisarCarro.getValueAt(linha, 0));
        Estaticos.carro.setFabricante((String) tblPesquisarCarro.getValueAt(linha, 1));
        Estaticos.carro.setModelo((String) tblPesquisarCarro.getValueAt(linha, 2));
        Estaticos.carro.setCor((String) tblPesquisarCarro.getValueAt(linha, 3));
        Estaticos.carro.setAnoFabricao((Integer) tblPesquisarCarro.getValueAt(linha, 4));
        Estaticos.carro.setValor((Float) tblPesquisarCarro.getValueAt(linha, 5));
    }//GEN-LAST:event_tblPesquisarCarroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmSelecao dialog = new frmSelecao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisarCarro;
    // End of variables declaration//GEN-END:variables
}
