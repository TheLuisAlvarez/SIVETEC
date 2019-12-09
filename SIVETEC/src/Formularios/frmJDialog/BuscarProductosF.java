
package Formularios.frmJDialog;

import Datos.Conexion;
import Formularios.frmPanel.frmFactura;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class BuscarProductosF extends javax.swing.JDialog {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    DefaultTableModel tabla;

    public BuscarProductosF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo-White.png")).getImage());
        cargarlistaproductos("");
    }

    String comparar(String cod) {
        String cant = "";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE cod_pro='" + cod + "'");
            while (rs.next()) {
                cant = rs.getString(4);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;

    }

    void cargarlistaproductos(String dato) {
        String[] Titulo = {"Codigo", "Descripcion", "Precio", "Stock"};
        tabla = new DefaultTableModel(null, Titulo);
        String[] Registro = new String[4];
        String mostrar = "SELECT * FROM producto WHERE CONCAT (cod_pro,'',descripcion) LIKE '%" + dato + "%'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registro[0] = rs.getString("cod_pro");
                Registro[1] = rs.getString("Descripcion");
                Registro[2] = rs.getString("precio");
                Registro[3] = rs.getString("Stock");
                tabla.addRow(Registro);
            }
            tblProductos.setModel(tabla);
        } catch (SQLException ex) {
            //Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnviarDatos = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnviarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarDatosMouseClicked(evt);
            }
        });
        getContentPane().add(btnEnviarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 60, 50));

        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 74, 150, 34));

        txtBuscar.setBackground(new java.awt.Color(236, 239, 244));
        txtBuscar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 81, 270, 23));

        tblProductos.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProductos.setGridColor(new java.awt.Color(129, 127, 128));
        tblProductos.setRowHeight(20);
        tblProductos.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 600, 100));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarProductos.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 700, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarDatosMouseClicked
        try {
            
        DefaultTableModel tabladet = (DefaultTableModel) frmFactura.tblDetalleFactura.getModel();
        String[] dato = new String[5];

        int fila = tblProductos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún registro");
        } else {
            String codins = tblProductos.getValueAt(fila, 0).toString();
            String desins = tblProductos.getValueAt(fila, 1).toString();
            String preins = tblProductos.getValueAt(fila, 2).toString();
            int c = 0;
            int j = 0;
            String cant = JOptionPane.showInputDialog("Ingrese cantidad");
            if ((cant.equals("")) || (cant.equals("0"))) {
                JOptionPane.showMessageDialog(this, "Debe ingresar algún valor mayor que 0");
            } else {
                int canting = Integer.parseInt(cant);
                int comp = Integer.parseInt(comparar(codins));
                if (canting > comp) {
                    JOptionPane.showMessageDialog(this, "Ud. no cuenta con el stock apropiado");
                } else {
                    for (int i = 0; i < frmFactura.tblDetalleFactura.getRowCount(); i++) {
                        Object com = frmFactura.tblDetalleFactura.getValueAt(i, 0);
                        if (codins.equals(com)) {
                            j = i;
                            frmFactura.tblDetalleFactura.setValueAt(cant, i, 3);
                            c = c + 1;

                        }

                    }
                    if (c == 0) {

                        dato[0] = codins;
                        dato[1] = desins;
                        dato[2] = preins;
                        dato[3] = cant;

                        tabladet.addRow(dato);

                        frmFactura.tblDetalleFactura.setModel(tabladet);

                    }
                }

            }

        }
    } catch (Exception e) {
    }
    }//GEN-LAST:event_btnEnviarDatosMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        cargarlistaproductos("");
    }//GEN-LAST:event_btnMostrarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargarlistaproductos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(BuscarProductosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProductosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProductosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProductosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarProductosF dialog = new BuscarProductosF(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel btnEnviarDatos;
    private javax.swing.JLabel btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
