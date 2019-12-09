
package Formularios.frmJDialog;

import javax.swing.ImageIcon;


public class DetalleBoleta extends javax.swing.JDialog {

    /**
     * Creates new form DetalleBoleta
     */
    public DetalleBoleta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo-White.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTotal = new javax.swing.JTextField();
        tblDetalleBolet = new javax.swing.JScrollPane();
        tblDetalleBoleta = new javax.swing.JTable();
        txtFecha = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        txtBoleta = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setOpaque(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 170, 35));

        tblDetalleBoleta.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblDetalleBoleta.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDetalleBoleta.setSelectionBackground(new java.awt.Color(243, 156, 25));
        tblDetalleBolet.setViewportView(tblDetalleBoleta);

        getContentPane().add(tblDetalleBolet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 910, 180));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(156, 100, 15));
        txtFecha.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setBorder(null);
        txtFecha.setOpaque(false);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 105, 190, 35));

        txtCodCliente.setEditable(false);
        txtCodCliente.setBackground(new java.awt.Color(156, 100, 15));
        txtCodCliente.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodCliente.setBorder(null);
        txtCodCliente.setOpaque(false);
        getContentPane().add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 105, 150, 35));

        txtBoleta.setEditable(false);
        txtBoleta.setBackground(new java.awt.Color(156, 100, 15));
        txtBoleta.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtBoleta.setForeground(new java.awt.Color(255, 255, 255));
        txtBoleta.setBorder(null);
        txtBoleta.setOpaque(false);
        txtBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoletaActionPerformed(evt);
            }
        });
        getContentPane().add(txtBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 105, 130, 35));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DetalleBoleta.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoletaActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalleBoleta dialog = new DetalleBoleta(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane tblDetalleBolet;
    public static javax.swing.JTable tblDetalleBoleta;
    public static javax.swing.JTextField txtBoleta;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
