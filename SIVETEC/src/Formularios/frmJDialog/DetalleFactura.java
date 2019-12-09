/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.frmJDialog;

import javax.swing.ImageIcon;

/**
 *
 * @author ALVAREZ
 */
public class DetalleFactura extends javax.swing.JDialog {

    /**
     * Creates new form DetalleFactura
     */
    public DetalleFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo-White.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSubtotal = new javax.swing.JTextField();
        txtIGV = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        tblDetalleFactura = new javax.swing.JScrollPane();
        tblDetalleFact = new javax.swing.JTable();
        txtFecha = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtSubtotal.setBorder(null);
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 459, 150, 35));

        txtIGV.setEditable(false);
        txtIGV.setBackground(new java.awt.Color(255, 255, 255));
        txtIGV.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtIGV.setBorder(null);
        txtIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGVActionPerformed(evt);
            }
        });
        getContentPane().add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 459, 110, 35));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtTotal.setBorder(null);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 459, 140, 35));

        tblDetalleFact.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblDetalleFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "PRECIO VENTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDetalleFact.setSelectionBackground(new java.awt.Color(243, 156, 25));
        tblDetalleFactura.setViewportView(tblDetalleFact);

        getContentPane().add(tblDetalleFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 930, 170));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(156, 100, 15));
        txtFecha.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setBorder(null);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 168, 195, 35));

        txtRUC.setEditable(false);
        txtRUC.setBackground(new java.awt.Color(156, 100, 15));
        txtRUC.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtRUC.setForeground(new java.awt.Color(255, 255, 255));
        txtRUC.setBorder(null);
        getContentPane().add(txtRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 168, 190, 35));

        txtCodCliente.setEditable(false);
        txtCodCliente.setBackground(new java.awt.Color(156, 100, 15));
        txtCodCliente.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodCliente.setBorder(null);
        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 168, 150, 35));

        txtFactura.setEditable(false);
        txtFactura.setBackground(new java.awt.Color(156, 100, 15));
        txtFactura.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtFactura.setBorder(null);
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 110, 180, 35));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DetalleFactura.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalleFactura dialog = new DetalleFactura(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JTable tblDetalleFact;
    private javax.swing.JScrollPane tblDetalleFactura;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtFactura;
    public static javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtIGV;
    public static javax.swing.JTextField txtRUC;
    public static javax.swing.JTextField txtSubtotal;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
