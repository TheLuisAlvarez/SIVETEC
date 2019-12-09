/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.frmPanel;

import Datos.Conexion;
import Formularios.frmJDialog.DetalleFactura;
import java.awt.Frame;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmConsulFactura extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    private Frame frmInicio;

    public frmConsulFactura() {
        initComponents();
        cargartodasfacturas();
        jDateChooser1.setEnabled(false);
    }

    void cargartodasfacturas() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"NUMERO", "COD. CLIENTE", "RUC CLIENTE", "SUBTOTAL", "IGV", "TOTAL", "FECHA"};
        tabla.setColumnIdentifiers(titulos);
        this.tblFacturas.setModel(tabla);
        String consulta = "SELECT * FROM factura";
        String[] Datos = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("num_fac");
                Datos[1] = rs.getString("cod_cli");
                Datos[2] = rs.getString("ruc_cli");
                Datos[3] = rs.getString("subtotal");
                Datos[4] = rs.getString("igv");
                Datos[5] = rs.getString("total");
                Datos[6] = rs.getString("fec_fac");

                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnver = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        rdbnnumero = new javax.swing.JRadioButton();
        rdbbnfecha = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JLabel();
        txtMostrarNumb = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        mnver.setText("Ver Detalle");
        mnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnverActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnver);

        mneliminar.setText("Eliminar");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdbnnumero.setSelected(true);
        rdbnnumero.setOpaque(false);
        rdbnnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbnnumeroActionPerformed(evt);
            }
        });
        add(rdbnnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        rdbbnfecha.setOpaque(false);
        rdbbnfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbnfechaActionPerformed(evt);
            }
        });
        add(rdbbnfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 153, 130, 56));

        btnMostrarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarTodosMouseClicked(evt);
            }
        });
        add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 216, 194, 56));

        txtMostrarNumb.setBackground(new java.awt.Color(236, 239, 244));
        txtMostrarNumb.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtMostrarNumb.setForeground(new java.awt.Color(255, 255, 255));
        txtMostrarNumb.setBorder(null);
        txtMostrarNumb.setOpaque(false);
        txtMostrarNumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarNumbActionPerformed(evt);
            }
        });
        txtMostrarNumb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMostrarNumbKeyTyped(evt);
            }
        });
        add(txtMostrarNumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 155, 290, 45));

        jDateChooser1.setBackground(new java.awt.Color(133, 80, 1));
        jDateChooser1.setFocusable(false);
        jDateChooser1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jDateChooser1.setOpaque(false);
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 320, 40));

        tblFacturas.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblFacturas.setGridColor(new java.awt.Color(129, 127, 128));
        tblFacturas.setRowHeight(30);
        tblFacturas.setSelectionBackground(new java.awt.Color(243, 156, 25));
        tblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblFacturasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblFacturas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 840, 270));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmConsulFactura.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMostrarNumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarNumbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarNumbActionPerformed

    private void txtMostrarNumbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMostrarNumbKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMostrarNumbKeyTyped

    private void rdbnnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnnumeroActionPerformed
        // TODO add your handling code here:
        if (rdbnnumero.isSelected() == true) {
            txtMostrarNumb.setEnabled(true);
            txtMostrarNumb.requestFocus();
            jDateChooser1.setDate(null);
            jDateChooser1.setEnabled(false);
            rdbbnfecha.setSelected(false);
        } else {
            txtMostrarNumb.setEnabled(false);
        }
    }//GEN-LAST:event_rdbnnumeroActionPerformed

    private void rdbbnfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbnfechaActionPerformed
        // TODO add your handling code here:
        if (rdbbnfecha.isSelected() == true) {
            jDateChooser1.setEnabled(true);
            txtMostrarNumb.setEnabled(false);
            txtMostrarNumb.setText("");
            rdbnnumero.setSelected(false);
        } else {
            jDateChooser1.setEnabled(false);
        }
    }//GEN-LAST:event_rdbbnfechaActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String num = txtMostrarNumb.getText();

        String consulta = "";
        if (rdbnnumero.isSelected() == true) {
            consulta = "SELECT * FROM factura WHERE num_fac='" + num + "'";
        }
        if (rdbbnfecha.isSelected() == true) {
            java.util.Date fecha = jDateChooser1.getDate();
            SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
            String fec = "" + formatofecha.format(fecha);
            consulta = "SELECT * FROM factura WHERE fec_fac='" + fec + "'";
        }

        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"NUMERO", "COD. CLIENTE", "RUC CLIENTE", "SUBTOTAL", "IGV", "TOTAL", "FECHA"};
        tabla.setColumnIdentifiers(titulos);
        this.tblFacturas.setModel(tabla);

        String[] Datos = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("num_fac");
                Datos[1] = rs.getString("cod_cli");
                Datos[2] = rs.getString("ruc_cli");
                Datos[3] = rs.getString("subtotal");
                Datos[4] = rs.getString("igv");
                Datos[5] = rs.getString("total");
                Datos[6] = rs.getString("fec_fac");

                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnMostrarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarTodosMouseClicked

        jDateChooser1.setEnabled(false);
        jDateChooser1.setDate(null);
        txtMostrarNumb.setText("");
        txtMostrarNumb.setEnabled(false);
        rdbbnfecha.setSelected(false);
        rdbnnumero.setSelected(false);
        cargartodasfacturas();

    }//GEN-LAST:event_btnMostrarTodosMouseClicked

    private void mnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnverActionPerformed

        int filasele = tblFacturas.getSelectedRow();
        if (filasele == -1) {
            JOptionPane.showMessageDialog(null, "No Seleciono ninguna fila");
        } else {
            DetalleFactura detalle = new DetalleFactura(frmInicio, false);
            detalle.setVisible(true);

            String numfac = tblFacturas.getValueAt(filasele, 0).toString();
            String cod = tblFacturas.getValueAt(filasele, 1).toString();
            String ruc = tblFacturas.getValueAt(filasele, 2).toString();
            String subtotal = tblFacturas.getValueAt(filasele, 3).toString();
            String igv = tblFacturas.getValueAt(filasele, 4).toString();
            String total = tblFacturas.getValueAt(filasele, 5).toString();
            String fecha = tblFacturas.getValueAt(filasele, 6).toString();
            DetalleFactura.txtFactura.setText(numfac);
            DetalleFactura.txtCodCliente.setText(cod);
            DetalleFactura.txtRUC.setText(ruc);
            DetalleFactura.txtSubtotal.setText(subtotal);
            DetalleFactura.txtIGV.setText(igv);
            DetalleFactura.txtTotal.setText(total);
            DetalleFactura.txtFecha.setText(fecha);
            DefaultTableModel model = (DefaultTableModel) DetalleFactura.tblDetalleFact.getModel();
            String ver = "SELECT * FROM detallefactura WHERE num_fac='" + numfac + "'";
            String[] datos = new String[5];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ver);
                while (rs.next()) {
                    datos[0] = rs.getString("cod_pro");
                    datos[1] = rs.getString("des_pro");
                    datos[2] = rs.getString("cant_pro");
                    datos[3] = rs.getString("pre_unit");
                    datos[4] = rs.getString("pre_tot");
                    model.addRow(datos);

                }
                DetalleFactura.tblDetalleFact.setModel(model);
            } catch (SQLException ex) {
                //Logger.getLogger(ConsultasFacturas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_mnverActionPerformed

    private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed

        int fila = tblFacturas.getSelectedRow();
        if (fila >= 0) {
            String cod = tblFacturas.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM factura WHERE num_fac='" + cod + "'");
                pst.executeUpdate();
            } catch (SQLException ex) {
                //Logger.getLogger(ConsultasBoletas.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargartodasfacturas();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
        }
    }//GEN-LAST:event_mneliminarActionPerformed

    private void tblFacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturasMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblFacturasMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnMostrarTodos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnver;
    private javax.swing.JRadioButton rdbbnfecha;
    private javax.swing.JRadioButton rdbnnumero;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtMostrarNumb;
    // End of variables declaration//GEN-END:variables
}
