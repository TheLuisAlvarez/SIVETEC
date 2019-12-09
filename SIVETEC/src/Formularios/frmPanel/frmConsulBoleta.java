package Formularios.frmPanel;

import Datos.Conexion;
import Formularios.frmJDialog.DetalleBoleta;
import java.awt.Frame;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmConsulBoleta extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    private Frame frmInicio;

    public frmConsulBoleta() {
        initComponents();
        cargartodasBoletas();
        jDateChooser1.setEnabled(false);
    }

    void cargartodasBoletas() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"NUMERO", "COD. CLIENTE", "TOTAL A PAGAR", "FECHA"};
        tabla.setColumnIdentifiers(titulos);
        this.tblBoletas.setModel(tabla);
        String consulta = "SELECT * FROM boleta";
        String[] Datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("num_bol");
                Datos[1] = rs.getString("cod_cli");
                Datos[2] = rs.getString("pre_tot");
                Datos[3] = rs.getString("fecha");

                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasBoletas.class.getName()).log(Level.SEVERE, null, ex);
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
        txtMostrarTodas = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtMostrarNumb = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoletas = new javax.swing.JTable();
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

        txtMostrarTodas.setBackground(new java.awt.Color(236, 239, 244));
        txtMostrarTodas.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtMostrarTodas.setForeground(new java.awt.Color(255, 255, 255));
        txtMostrarTodas.setBorder(null);
        txtMostrarTodas.setOpaque(false);
        txtMostrarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarTodasActionPerformed(evt);
            }
        });
        add(txtMostrarTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 410, 45));

        jDateChooser1.setBackground(new java.awt.Color(133, 80, 1));
        jDateChooser1.setFocusable(false);
        jDateChooser1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jDateChooser1.setOpaque(false);
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 320, 40));

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
        add(txtMostrarNumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 155, 300, 45));

        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 216, 194, 56));

        btnMostrarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarTodosMouseClicked(evt);
            }
        });
        add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 153, 130, 56));

        tblBoletas.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblBoletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBoletas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblBoletas.setGridColor(new java.awt.Color(129, 127, 128));
        tblBoletas.setRowHeight(30);
        tblBoletas.setSelectionBackground(new java.awt.Color(243, 156, 25));
        tblBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBoletasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBoletas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 840, 270));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmConsulBoleta.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMostrarNumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarNumbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarNumbActionPerformed

    private void txtMostrarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarTodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarTodasActionPerformed

    private void txtMostrarNumbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMostrarNumbKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMostrarNumbKeyTyped

    private void rdbnnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnnumeroActionPerformed
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
        jDateChooser1.setEnabled(false);
        jDateChooser1.setDate(null);
        txtMostrarNumb.setText("");
        txtMostrarNumb.setEnabled(false);
        rdbbnfecha.setSelected(false);
        rdbnnumero.setSelected(false);
        cargartodasBoletas();

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnMostrarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarTodosMouseClicked
        String num = txtMostrarNumb.getText();

        String consulta = "";
        if (rdbnnumero.isSelected() == true) {
            consulta = "SELECT * FROM boleta WHERE num_bol='" + num + "'";
        }
        if (rdbbnfecha.isSelected() == true) {
            java.util.Date fecha = jDateChooser1.getDate();
            SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
            String fec = "" + formatofecha.format(fecha);
            consulta = "SELECT * FROM boleta WHERE fecha='" + fec + "'";
        }

        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"NUMERO", "COD. CLIENTE", "TOTAL A PAGAR", "FECHA"};
        tabla.setColumnIdentifiers(titulos);
        tblBoletas.setModel(tabla);

        String[] Datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("num_bol");
                Datos[1] = rs.getString("cod_cli");
                Datos[2] = rs.getString("pre_tot");
                Datos[3] = rs.getString("fecha");

                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasBoletas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnMostrarTodosMouseClicked

    private void tblBoletasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBoletasMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblBoletasMouseReleased

    private void mnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnverActionPerformed
        // TODO add your handling code here:
        int filasele = tblBoletas.getSelectedRow();
        if (filasele == -1) {
            JOptionPane.showMessageDialog(null, "No Seleciono ninguna fila");
        } else {
            
            DetalleBoleta detalle = new DetalleBoleta(frmInicio, false);
            detalle.setVisible(true);
            
            String numbol = tblBoletas.getValueAt(filasele, 0).toString();
            String cod = tblBoletas.getValueAt(filasele, 1).toString();
            String total = tblBoletas.getValueAt(filasele, 2).toString();
            String fecha = tblBoletas.getValueAt(filasele, 3).toString();
            DetalleBoleta.txtBoleta.setText(numbol);
            DetalleBoleta.txtCodCliente.setText(cod);
            DetalleBoleta.txtTotal.setText(total);
            DetalleBoleta.txtFecha.setText(fecha);
            DefaultTableModel model = (DefaultTableModel) DetalleBoleta.tblDetalleBoleta.getModel();
            String ver = "SELECT * FROM detalleboleta WHERE num_bol='" + numbol + "'";
            String[] datos = new String[5];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ver);
                while (rs.next()) {
                    datos[0] = rs.getString("cod_pro");
                    datos[1] = rs.getString("des_pro");
                    datos[2] = rs.getString("cant_pro");
                    datos[3] = rs.getString("pre_unit");
                    datos[4] = rs.getString("pre_venta");
                    model.addRow(datos);

                }
                DetalleBoleta.tblDetalleBoleta.setModel(model);
            } catch (SQLException ex) {
                //Logger.getLogger(ConsultasBoletas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_mnverActionPerformed

    private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblBoletas.getSelectedRow();
        if (fila >= 0) {
            String cod = tblBoletas.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM boleta WHERE num_bol='" + cod + "'");
                pst.executeUpdate();
                cargartodasBoletas();
            } catch (SQLException ex) {
                //Logger.getLogger(ConsultasBoletas.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
        }
    }//GEN-LAST:event_mneliminarActionPerformed


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
    private javax.swing.JTable tblBoletas;
    private javax.swing.JTextField txtMostrarNumb;
    private javax.swing.JTextField txtMostrarTodas;
    // End of variables declaration//GEN-END:variables
}
