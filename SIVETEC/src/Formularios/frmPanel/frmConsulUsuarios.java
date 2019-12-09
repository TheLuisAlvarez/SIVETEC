package Formularios.frmPanel;

import Datos.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class frmConsulUsuarios extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public frmConsulUsuarios() {
        initComponents();
        CargarlistaUsuarios();
    }

    void CargarlistaUsuarios() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] Titulos = {"CODIGO", "NOMBRES", "DOMICILIO", "TELEFONO", "TIPO", "USUARIO", "CONTRASEÑA"};
        modelo.setColumnIdentifiers(Titulos);
        this.tblUsuarios.setModel(modelo);
        try {

            String ConsultaSQL = "SELECT * FROM usuario";

            String[] registros = new String[7];

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("cod_usu");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("domicilio");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("tipo_usu");
                registros[5] = rs.getString("usuario");
                registros[6] = rs.getString("contraseña");
                modelo.addRow(registros);

            }
            tblUsuarios.setModel(modelo);
            //txtcant.setText(""+tblClientes.getRowCount());
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(236, 239, 244));
        txtUsuario.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 147, 600, 44));

        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
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

        tblUsuarios.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblUsuarios.setGridColor(new java.awt.Color(129, 127, 128));
        tblUsuarios.setRowHeight(30);
        tblUsuarios.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 740, 290));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmConsulUsuarios.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnMostrarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarTodosMouseClicked
        CargarlistaUsuarios();
    }//GEN-LAST:event_btnMostrarTodosMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked

        String NombreUsu = txtUsuario.getText();

        DefaultTableModel modelo = new DefaultTableModel();
        String[] Titulos = {"CODIGO", "NOMBRES", "DOMICILIO", "TELEFONO", "TIPO", "USUARIO", "CONTRASEÑA"};
        modelo.setColumnIdentifiers(Titulos);
        this.tblUsuarios.setModel(modelo);
        try {

            String ConsultaSQL = "SELECT * FROM usuario WHERE nombre='" + NombreUsu + "'";

            String[] registros = new String[7];

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("cod_usu");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("domicilio");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("tipo_usu");
                registros[5] = rs.getString("usuario");
                registros[6] = rs.getString("contraseña");
                modelo.addRow(registros);

            }
            tblUsuarios.setModel(modelo);
            //txtcant.setText(""+tblClientes.getRowCount());
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnMostrarTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
