package Formularios.frmPanel;

import Datos.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class frmConsulProductos extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public frmConsulProductos() {
        initComponents();
        mostrartodosproductos();
    }

    void mostrartodosproductos() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CODIGO", "DESCRIPCION", "PRECIO"};
        tabla.setColumnIdentifiers(titulos);
        this.tblProductos.setModel(tabla);
        String consulta = "SELECT * FROM producto";
        String[] Datos = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("cod_pro");
                Datos[1] = rs.getString("descripcion");
                Datos[2] = rs.getString("precio");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescripcion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescripcion.setBackground(new java.awt.Color(236, 239, 244));
        txtDescripcion.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 147, 380, 44));

        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 218, 130, 56));

        btnMostrarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarTodosMouseClicked(evt);
            }
        });
        add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 216, 194, 56));

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
        tblProductos.setRowHeight(30);
        tblProductos.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 740, 290));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmConsulProductos.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnMostrarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarTodosMouseClicked
        txtDescripcion.setText("");
        txtDescripcion.requestFocus();
        mostrartodosproductos();
    }//GEN-LAST:event_btnMostrarTodosMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String buscar = txtDescripcion.getText();
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CODIGO", "DESCRIPCION", "PRECIO"};
        tabla.setColumnIdentifiers(titulos);
        this.tblProductos.setModel(tabla);
        String consulta = "SELECT * FROM producto WHERE descripcion  LIKE '%" + buscar + "%'";
        String[] Datos = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("cod_pro");
                Datos[1] = rs.getString("descripcion");
                Datos[2] = rs.getString("precio");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnMostrarTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
