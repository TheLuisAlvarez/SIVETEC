/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.frmPanel;

import Datos.Conexion;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Formularios.GenerarNumero;
import Formularios.frmJDialog.BuscarClienteF;
import Formularios.frmJDialog.BuscarProductosF;
import java.awt.Frame;

public class frmFactura extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    private Frame frmInicio;

    public frmFactura() {
        initComponents();
        //txtFacturaV.setEnabled(false);
        txtFecha.setEnabled(false);
        txtFecha.setDisabledTextColor(Color.WHITE);
        txtFecha.setText(fechaactual());
        numeros();
    }

    void descontarstock(String codi, String can) {
        int des = Integer.parseInt(can);
        String cap = "";
        int desfinal;
        String consul = "SELECT * FROM producto WHERE  cod_pro='" + codi + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                cap = rs.getString(4);
            }

        } catch (Exception e) {
        }
        desfinal = Integer.parseInt(cap) - des;
        String modi = "UPDATE producto SET Stock='" + desfinal + "' WHERE cod_pro = '" + codi + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(modi);
            pst.executeUpdate();
        } catch (Exception e) {
        }

    }

    void numeros() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(num_fac) from factura";
        // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                txtFacturaV.setText("00000001");
            } else {
                j = Integer.parseInt(c);
                GenerarNumero gen = new GenerarNumero();
                gen.generar(j);
                txtFacturaV.setText(gen.serie());

            }

        } catch (SQLException ex) {
            //Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void calcular() {
        String pre;
        String can;
        double igv = 0;
        double total = 0;
        double subtotal = 0;
        double precio;
        int cantidad;
        double imp = 0.0;

        /*can=Integer.parseInt(cant);
            imp=pre*can;
            dato[4]=Float.toString(imp);*/
        for (int i = 0; i < tblDetalleFactura.getRowCount(); i++) {
            pre = tblDetalleFactura.getValueAt(i, 2).toString();
            can = tblDetalleFactura.getValueAt(i, 3).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            subtotal = subtotal + imp;
            igv = subtotal * 0.18;
            total = subtotal + igv;
            // txtcod.setText(""+Math.rint(c*100)/100)
            tblDetalleFactura.setValueAt(Math.rint(imp * 100) / 100, i, 4);

        }
        txtSubTotal.setText(Double.toString(subtotal));
        txtIGV.setText("" + Math.rint(igv * 100) / 100);
        txtTotal.setText("" + Math.rint(total * 100) / 100);

    }

    void factura() {
        String InsertarSQL = "INSERT INTO factura (num_fac,cod_cli,ruc_cli,subtotal,igv,total,fec_fac) VALUES (?,?,?,?,?,?,?)";
        String numfac = txtFacturaV.getText();
        String codcli = txtCodCliente.getText();
        String ruccli = txtRUC.getText();
        String subtotal = txtSubTotal.getText();
        String igv = txtIGV.getText();
        String total = txtTotal.getText();
        String fecha = txtFecha.getText();
        try {
            PreparedStatement pst = cn.prepareStatement(InsertarSQL);
            pst.setString(1, numfac);
            pst.setString(2, codcli);
            pst.setString(3, ruccli);
            pst.setString(4, subtotal);
            pst.setString(5, igv);
            pst.setString(6, total);
            pst.setString(7, fecha);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Los datos se guardaron correctamente");
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void detallefactura() {
        for (int i = 0; i < tblDetalleFactura.getRowCount(); i++) {
            String InsertarSQL = "INSERT INTO detallefactura(num_fac,cod_pro,des_pro,cant_pro,pre_unit,pre_tot) VALUES (?,?,?,?,?,?)";
            String numfac = txtFacturaV.getText();
            String codpro = tblDetalleFactura.getValueAt(i, 0).toString();
            String despro = tblDetalleFactura.getValueAt(i, 1).toString();
            String cantpro = tblDetalleFactura.getValueAt(i, 3).toString();
            String preunit = tblDetalleFactura.getValueAt(i, 2).toString();
            String importe = tblDetalleFactura.getValueAt(i, 4).toString();

            try {
                PreparedStatement pst = cn.prepareStatement(InsertarSQL);
                pst.setString(1, numfac);
                pst.setString(2, codpro);
                pst.setString(3, despro);
                pst.setString(4, cantpro);
                pst.setString(5, preunit);
                pst.setString(6, importe);

                pst.executeUpdate();

            } catch (SQLException ex) {
                //Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSubTotal = new javax.swing.JTextField();
        txtIGV = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JLabel();
        btnRealizarVenta = new javax.swing.JLabel();
        btnRealizarCal = new javax.swing.JLabel();
        txtFacturaV = new javax.swing.JTextField();
        btnArticulo = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        btnCliente = new javax.swing.JLabel();
        txtSrA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleFactura = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtSubTotal.setBorder(null);
        txtSubTotal.setOpaque(false);
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 98, 23));

        txtIGV.setEditable(false);
        txtIGV.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtIGV.setBorder(null);
        txtIGV.setOpaque(false);
        txtIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGVActionPerformed(evt);
            }
        });
        add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 80, 23));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setOpaque(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 100, 23));

        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 490, 152, 44));

        btnRealizarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarVentaMouseClicked(evt);
            }
        });
        add(btnRealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 414, 152, 43));

        btnRealizarCal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarCalMouseClicked(evt);
            }
        });
        add(btnRealizarCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 337, 148, 43));

        txtFacturaV.setEditable(false);
        txtFacturaV.setBackground(new java.awt.Color(236, 239, 244));
        txtFacturaV.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtFacturaV.setForeground(new java.awt.Color(255, 255, 255));
        txtFacturaV.setBorder(null);
        txtFacturaV.setOpaque(false);
        txtFacturaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaVActionPerformed(evt);
            }
        });
        add(txtFacturaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 215, 104, 24));

        btnArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArticuloMouseClicked(evt);
            }
        });
        add(btnArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 218, 119, 50));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(236, 239, 244));
        txtDireccion.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        txtDireccion.setOpaque(false);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 231, 210, 23));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(236, 239, 244));
        txtFecha.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setBorder(null);
        txtFecha.setOpaque(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 188, 130, 23));

        txtDNI.setEditable(false);
        txtDNI.setBackground(new java.awt.Color(236, 239, 244));
        txtDNI.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(255, 255, 255));
        txtDNI.setBorder(null);
        txtDNI.setOpaque(false);
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 188, 120, 23));

        txtCodCliente.setEditable(false);
        txtCodCliente.setBackground(new java.awt.Color(236, 239, 244));
        txtCodCliente.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodCliente.setBorder(null);
        txtCodCliente.setOpaque(false);
        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });
        add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 188, 90, 23));

        txtRUC.setEditable(false);
        txtRUC.setBackground(new java.awt.Color(236, 239, 244));
        txtRUC.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtRUC.setForeground(new java.awt.Color(255, 255, 255));
        txtRUC.setBorder(null);
        txtRUC.setOpaque(false);
        txtRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUCActionPerformed(evt);
            }
        });
        add(txtRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 145, 130, 24));

        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 30, 30));

        txtSrA.setEditable(false);
        txtSrA.setBackground(new java.awt.Color(236, 239, 244));
        txtSrA.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtSrA.setForeground(new java.awt.Color(255, 255, 255));
        txtSrA.setBorder(null);
        txtSrA.setOpaque(false);
        txtSrA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSrAActionPerformed(evt);
            }
        });
        add(txtSrA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 145, 270, 24));

        tblDetalleFactura.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "PRECIO", "CANTIDAD", "IMPORTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDetalleFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDetalleFactura.setGridColor(new java.awt.Color(129, 127, 128));
        tblDetalleFactura.setRowHeight(30);
        tblDetalleFactura.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblDetalleFactura);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 640, 220));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmFactura.png"))); // NOI18N
        lblFondo.setText("R");
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSrAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSrAActionPerformed

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUCActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtFacturaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaVActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        BuscarClienteF BuscarCli = new BuscarClienteF(frmInicio, true);
        BuscarCli.setVisible(true);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArticuloMouseClicked
        BuscarProductosF BuscarProd = new BuscarProductosF(frmInicio, true);
        BuscarProd.setVisible(true);
    }//GEN-LAST:event_btnArticuloMouseClicked

    private void btnRealizarCalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarCalMouseClicked
        if (tblDetalleFactura.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Ingrese algún producto");
        } else {
            calcular();
        }
    }//GEN-LAST:event_btnRealizarCalMouseClicked

    private void btnRealizarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarVentaMouseClicked
        if ((txtCodCliente.getText().equals("")) || (txtSubTotal.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Ingrese cliente, producto o realice operación");
        } else {
            String capcod = "", capcan = "";
            for (int i = 0; i < tblDetalleFactura.getRowCount(); i++) {
                capcod = tblDetalleFactura.getValueAt(i, 0).toString();
                capcan = tblDetalleFactura.getValueAt(i, 3).toString();
                descontarstock(capcod, capcan);

            }
            factura();
            detallefactura();

            txtCodCliente.setText("");
            txtSrA.setText("");
            txtDireccion.setText("");
            txtDNI.setText("");
            txtIGV.setText("");
            txtSubTotal.setText("");
            txtRUC.setText("");
            txtTotal.setText("");

            DefaultTableModel modelo = (DefaultTableModel) tblDetalleFactura.getModel();
            int a = tblDetalleFactura.getRowCount() - 1;
            int i;
            for (i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }

            numeros();
        }
    }//GEN-LAST:event_btnRealizarVentaMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tblDetalleFactura.getModel();
        int fila = tblDetalleFactura.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Tabla vacía o no seleccionó ninguna fila");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnArticulo;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnRealizarCal;
    private javax.swing.JLabel btnRealizarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JTable tblDetalleFactura;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFacturaV;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIGV;
    public static javax.swing.JTextField txtRUC;
    public static javax.swing.JTextField txtSrA;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
