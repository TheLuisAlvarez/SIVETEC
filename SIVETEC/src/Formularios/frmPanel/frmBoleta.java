package Formularios.frmPanel;

import Datos.Conexion;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Formularios.GenerarNumero;
import Formularios.frmJDialog.BuscarClienteB;
import Formularios.frmJDialog.BuscarProductosB;
import java.awt.Frame;

public class frmBoleta extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    private Frame frmInicio;

    public frmBoleta() {
        initComponents();
        txtFecha.setDisabledTextColor(Color.blue);
        txtFecha.setText(fechaact());
        txtBoletaV.setDisabledTextColor(Color.red);
        txtCodCliente.setDisabledTextColor(Color.blue);
        txtDireccion.setDisabledTextColor(Color.blue);
        txtDNI.setDisabledTextColor(Color.blue);
        txtSrA.setDisabledTextColor(Color.blue);
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

        String c = "";
        String SQL = "select max(num_bol) from boleta";
        //String SQL="select count(*) from boleta";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }
            if (c == null) {
                txtBoletaV.setText("00000001");
            } else {
                int j = Integer.parseInt(c);
                GenerarNumero gen = new GenerarNumero();
                gen.generar(j);
                txtBoletaV.setText(gen.serie());
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Boleta.class.getName()).log(Level.SEVERE, null, ex);
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
        for (int i = 0; i < tblDetalleBoleta.getRowCount(); i++) {
            pre = tblDetalleBoleta.getValueAt(i, 2).toString();
            can = tblDetalleBoleta.getValueAt(i, 3).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            subtotal = subtotal + imp;

            tblDetalleBoleta.setValueAt(Math.rint(imp * 100) / 100, i, 4);

        }

        txtTotal.setText("" + Math.rint(subtotal * 100) / 100);

    }

    void boleta() {
        String InsertarSQL = "INSERT INTO boleta(num_bol,cod_cli,pre_tot,fecha) VALUES (?,?,?,?)";
        String numbol = txtBoletaV.getText();
        String codcli = txtCodCliente.getText();

        String total = txtTotal.getText();
        String fecha = txtFecha.getText();
        try {
            PreparedStatement pst = cn.prepareStatement(InsertarSQL);
            pst.setString(1, numbol);
            pst.setString(2, codcli);
            pst.setString(3, total);
            pst.setString(4, fecha);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Los datos se guardaron correctamente");
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void detalleboleta() {
        for (int i = 0; i < tblDetalleBoleta.getRowCount(); i++) {
            String InsertarSQL = "INSERT INTO detalleboleta(num_bol,cod_pro,des_pro,cant_pro,pre_unit,pre_venta) VALUES (?,?,?,?,?,?)";
            String numbol = txtBoletaV.getText();
            String codpro = tblDetalleBoleta.getValueAt(i, 0).toString();
            String despro = tblDetalleBoleta.getValueAt(i, 1).toString();
            String cantpro = tblDetalleBoleta.getValueAt(i, 3).toString();
            String preunit = tblDetalleBoleta.getValueAt(i, 2).toString();
            String importe = tblDetalleBoleta.getValueAt(i, 4).toString();

            try {
                PreparedStatement pst = cn.prepareStatement(InsertarSQL);
                pst.setString(1, numbol);
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

    public static String fechaact() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JLabel();
        btnRealizarVenta = new javax.swing.JLabel();
        btnRealizarCal = new javax.swing.JLabel();
        txtBoletaV = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnArticulo = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        btnCliente = new javax.swing.JLabel();
        txtSrA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleBoleta = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 152, 44));

        btnRealizarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarVentaMouseClicked(evt);
            }
        });
        add(btnRealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 414, 152, 43));

        btnRealizarCal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarCalMouseClicked(evt);
            }
        });
        add(btnRealizarCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 337, 148, 43));

        txtBoletaV.setEditable(false);
        txtBoletaV.setBackground(new java.awt.Color(236, 239, 244));
        txtBoletaV.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtBoletaV.setForeground(new java.awt.Color(255, 255, 255));
        txtBoletaV.setBorder(null);
        txtBoletaV.setOpaque(false);
        txtBoletaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoletaVActionPerformed(evt);
            }
        });
        add(txtBoletaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 215, 100, 24));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.setOpaque(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 100, 23));

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
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 231, 236, 23));

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
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 188, 133, 23));

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
        add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 188, 114, 23));

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
        add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 188, 114, 23));

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
        add(txtSrA, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 144, 290, 23));

        tblDetalleBoleta.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblDetalleBoleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "PRECIO UNITARIO", "CANTIDAD", "PRECIO VENTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDetalleBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDetalleBoleta.setGridColor(new java.awt.Color(129, 127, 128));
        tblDetalleBoleta.setRowHeight(30);
        tblDetalleBoleta.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblDetalleBoleta);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 640, 220));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmBoleta.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSrAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSrAActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtBoletaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoletaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoletaVActionPerformed

    private void btnRealizarCalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarCalMouseClicked
        if (tblDetalleBoleta.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Ingrese algún producto");
        } else {
            calcular();
        }
    }//GEN-LAST:event_btnRealizarCalMouseClicked

    private void btnRealizarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarVentaMouseClicked
        if ((txtCodCliente.getText().equals("")) || (txtTotal.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Ingrese cliente, producto o realice operación");
        } else {
            String capcod = "", capcan = "";
            for (int i = 0; i < tblDetalleBoleta.getRowCount(); i++) {
                capcod = tblDetalleBoleta.getValueAt(i, 0).toString();
                capcan = tblDetalleBoleta.getValueAt(i, 3).toString();
                descontarstock(capcod, capcan);

            }
            boleta();
            detalleboleta();
            txtCodCliente.setText("");
            txtSrA.setText("");

            txtDNI.setText("");
            txtDireccion.setText("");

            txtDireccion.setText("");

            DefaultTableModel modelo = (DefaultTableModel) tblDetalleBoleta.getModel();
            int a = tblDetalleBoleta.getRowCount() - 1;
            int i;
            for (i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
            numeros();
        }
    }//GEN-LAST:event_btnRealizarVentaMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDetalleBoleta.getModel();
        int fila = tblDetalleBoleta.getSelectedRow();
        if (fila >= 0) {
            model.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Tabla vacía o no seleccionó ninguna fila");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        BuscarClienteB BuscarCli = new BuscarClienteB(frmInicio, true);
        BuscarCli.setVisible(true);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArticuloMouseClicked
        BuscarProductosB BuscarProd = new BuscarProductosB(frmInicio, true);
        BuscarProd.setVisible(true);
    }//GEN-LAST:event_btnArticuloMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnArticulo;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnRealizarCal;
    private javax.swing.JLabel btnRealizarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JTable tblDetalleBoleta;
    private javax.swing.JTextField txtBoletaV;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtSrA;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
