/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.frmPanel;

import Datos.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class frmConsulCliente extends javax.swing.JPanel {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public frmConsulCliente() {
        initComponents();
        txtBuscarDni.setEnabled(false);
        Cargarlistaclientes();
    }

    void Cargarlistaclientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] Titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "SEXO", "DNI", "TELEFONO", "RUC", "EMAIL", "DIRECCION"};
        modelo.setColumnIdentifiers(Titulos);
        this.tblClientes.setModel(modelo);
        try {

            String ConsultaSQL = "SELECT * FROM cliente";

            String[] registros = new String[9];

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("cod_cli");
                registros[1] = rs.getString("nom_cli");
                registros[2] = rs.getString("ape_cli");
                registros[3] = rs.getString("sexo_cli");
                registros[4] = rs.getString("dni_cli");
                registros[5] = rs.getString("tel_cli");
                registros[6] = rs.getString("ruc_cli");
                registros[7] = rs.getString("email_cli");
                registros[8] = rs.getString("dir_cli");
                modelo.addRow(registros);

            }
            tblClientes.setModel(modelo);
            //txtcant.setText(""+tblClientes.getRowCount());
        } catch (SQLException ex) {
            //Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdgenero = new javax.swing.JRadioButton();
        rdDni = new javax.swing.JRadioButton();
        cboGenero = new javax.swing.JComboBox<>();
        txtBuscarDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdgenero.setBackground(new java.awt.Color(255, 255, 255));
        rdgenero.setForeground(new java.awt.Color(255, 255, 255));
        rdgenero.setSelected(true);
        rdgenero.setOpaque(false);
        rdgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgeneroActionPerformed(evt);
            }
        });
        add(rdgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 166, -1, -1));

        rdDni.setBackground(new java.awt.Color(255, 255, 255));
        rdDni.setForeground(new java.awt.Color(255, 255, 255));
        rdDni.setOpaque(false);
        rdDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDniActionPerformed(evt);
            }
        });
        add(rdDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        cboGenero.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Masculino", "Femenino" }));
        cboGenero.setBorder(null);
        cboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGeneroActionPerformed(evt);
            }
        });
        add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 156, 270, 40));

        txtBuscarDni.setBackground(new java.awt.Color(236, 239, 244));
        txtBuscarDni.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtBuscarDni.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarDni.setBorder(null);
        txtBuscarDni.setOpaque(false);
        txtBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarDniActionPerformed(evt);
            }
        });
        txtBuscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDniKeyTyped(evt);
            }
        });
        add(txtBuscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 300, 40));

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

        tblClientes.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblClientes.setGridColor(new java.awt.Color(129, 127, 128));
        tblClientes.setRowHeight(30);
        tblClientes.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 810, 270));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmConsulCliente.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarDniActionPerformed

    private void txtBuscarDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDniKeyTyped

    }//GEN-LAST:event_txtBuscarDniKeyTyped

    private void txtBuscarDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDniKeyPressed

    }//GEN-LAST:event_txtBuscarDniKeyPressed

    private void txtBuscarDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDniKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarDniKeyReleased

    private void btnMostrarTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarTodosMouseClicked

        String sexo = cboGenero.getSelectedItem().toString();
        String dni = txtBuscarDni.getText();

        if (rdgenero.isSelected() == true) {

            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "SEXO", "DNI", "TELEFONO", "RUC", "EMAIL", "DIRECCION"};
            modelo.setColumnIdentifiers(Titulos);
            this.tblClientes.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM cliente WHERE sexo_cli='" + sexo + "'";

                String[] registros = new String[9];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("cod_cli");
                    registros[1] = rs.getString("nom_cli");
                    registros[2] = rs.getString("ape_cli");
                    registros[3] = rs.getString("sexo_cli");
                    registros[4] = rs.getString("dni_cli");
                    registros[5] = rs.getString("tel_cli");
                    registros[6] = rs.getString("ruc_cli");
                    registros[7] = rs.getString("email_cli");
                    registros[8] = rs.getString("dir_cli");
                    modelo.addRow(registros);

                }
                tblClientes.setModel(modelo);
                //txtcant.setText(""+tblClientes.getRowCount());
            } catch (SQLException ex) {
                //Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rdDni.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "SEXO", "DNI", "TELEFONO", "RUC", "EMAIL", "DIRECCION"};
            modelo.setColumnIdentifiers(Titulos);
            this.tblClientes.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM cliente WHERE dni_cli='" + dni + "'";

                String[] registros = new String[9];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("cod_cli");
                    registros[1] = rs.getString("nom_cli");
                    registros[2] = rs.getString("ape_cli");
                    registros[3] = rs.getString("sexo_cli");
                    registros[4] = rs.getString("dni_cli");
                    registros[5] = rs.getString("tel_cli");
                    registros[6] = rs.getString("ruc_cli");
                    registros[7] = rs.getString("email_cli");
                    registros[8] = rs.getString("dir_cli");
                    modelo.addRow(registros);

                }
                tblClientes.setModel(modelo);
                //txtcant.setText(""+tblClientes.getRowCount());
            } catch (SQLException ex) {
                //Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnMostrarTodosMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        Cargarlistaclientes();
        txtBuscarDni.setText("");
        txtBuscarDni.setEnabled(false);
        rdgenero.setSelected(false);
        rdDni.setSelected(false);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void cboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneroActionPerformed

    }//GEN-LAST:event_cboGeneroActionPerformed

    private void rdDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDniActionPerformed
        // TODO add your handling code here:
        if (rdDni.isSelected() == true) {

            cboGenero.setSelectedItem(0);
            cboGenero.setEnabled(false);
            rdgenero.setSelected(false);
            txtBuscarDni.setEnabled(true);
            txtBuscarDni.requestFocus();
        }
    }//GEN-LAST:event_rdDniActionPerformed

    private void rdgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgeneroActionPerformed
        if (rdgenero.isSelected() == true) {

            cboGenero.setSelectedItem(0);
            cboGenero.setEnabled(true);
            rdDni.setSelected(false);
            txtBuscarDni.setEnabled(false);
            txtBuscarDni.setText("");
        }
    }//GEN-LAST:event_rdgeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnMostrarTodos;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JRadioButton rdDni;
    private javax.swing.JRadioButton rdgenero;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscarDni;
    // End of variables declaration//GEN-END:variables
}
