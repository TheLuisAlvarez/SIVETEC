package Formularios.frmPanel;

import Datos.Conexion;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Formularios.GenerarCodigos;

public class frmMantUsuario extends javax.swing.JPanel {

    DefaultTableModel model;

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public frmMantUsuario() {
        initComponents();
        bloquear();
        cargar("");
    }

    void bloquear() {
        txtId.setEnabled(false);
        txtNombre.setEnabled(false);
        txtDomicilio.setEnabled(false);
        txtTelefono.setEnabled(false);
        cboTipoUsu.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtContraseña.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }

    void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");
        cboTipoUsu.setSelectedIndex(0);
        txtUsuario.setText("");
        txtContraseña.setText("");
    }

    void desbloquear() {
        txtId.setEnabled(true);
        txtNombre.setEnabled(true);
        txtDomicilio.setEnabled(true);
        txtTelefono.setEnabled(true);
        cboTipoUsu.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtContraseña.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnCancelar.setEnabled(true);
    }

    void cargar(String valor) {
        String mostrar = "SELECT * FROM usuario WHERE CONCAT(cod_usu,nombre,domicilio,telefono,tipo_usu,usuario,contraseña) LIKE '%" + valor + "%'";
        String[] titulos = {"Codigo", "Nombres", "Domicilio", "Telefono", "Tipo", "Usuario", "Contraseña"};
        String[] Registros = new String[7];
        model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registros[0] = rs.getString("cod_usu");
                Registros[1] = rs.getString("nombre");
                Registros[2] = rs.getString("domicilio");
                Registros[3] = rs.getString("telefono");
                Registros[4] = rs.getString("tipo_usu");
                Registros[5] = rs.getString("usuario");
                Registros[6] = rs.getString("contraseña");
                model.addRow(Registros);
            }
            tblUsuarios.setModel(model);
        } catch (SQLException ex) {
            //Logger.getLogger(IngresoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void codigosUsuarios() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(cod_usu) from usuario";
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
                txtId.setText("CU0001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                String r = "";
                r = "" + r1 + r2 + r3 + r4;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                txtId.setText("CU" + gen.serie());

            }

        } catch (SQLException ex) {
            //Logger.getLogger(IngresoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnmodificar = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        cboTipoUsu = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        lblFondo = new javax.swing.JLabel();

        mnmodificar.setText("Modificar");
        mnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmodificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnmodificar);

        mneliminar.setText("Eliminar");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 470, 490));

        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 519, 136, 45));

        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 519, 137, 45));

        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 587, 138, 45));

        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 587, 138, 45));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(156, 100, 15));
        txtId.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        txtId.setOpaque(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 116, 240, 30));

        txtNombre.setBackground(new java.awt.Color(156, 100, 15));
        txtNombre.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 170, 250, 30));

        txtDomicilio.setBackground(new java.awt.Color(156, 100, 15));
        txtDomicilio.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        txtDomicilio.setBorder(null);
        txtDomicilio.setOpaque(false);
        add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 224, 240, 30));

        txtTelefono.setBackground(new java.awt.Color(156, 100, 15));
        txtTelefono.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 276, 240, 30));

        txtUsuario.setBackground(new java.awt.Color(156, 100, 15));
        txtUsuario.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 383, 250, 30));

        cboTipoUsu.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        cboTipoUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Usuario", "Administrador" }));
        cboTipoUsu.setBorder(null);
        add(cboTipoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 330, 190, 30));

        txtContraseña.setBackground(new java.awt.Color(156, 100, 15));
        txtContraseña.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(false);
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 436, 216, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmMantUsuarios.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE usuario SET nombre='"
                    + txtNombre.getText() + "',domicilio='"
                    + txtDomicilio.getText() + "',tipo_usu='"
                    + cboTipoUsu.getSelectedItem() + "',telefono='"
                    + txtTelefono.getText() + "',usuario='"
                    + txtUsuario.getText() + "',contraseña='"
                    + txtContraseña.getText() + "' WHERE cod_usu='" + txtId.getText() + "'");
            pst.executeUpdate();
            cargar("");
            bloquear();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        desbloquear();
        limpiar();
        codigosUsuarios();
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        bloquear();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        String cod, nom, domi, tel, tipoU, usu, contra;
        String sql = "";
        cod = txtId.getText();
        nom = txtNombre.getText();
        domi = txtDomicilio.getText();
        tel = txtTelefono.getText();
        tipoU = cboTipoUsu.getSelectedItem().toString();
        usu = txtUsuario.getText();
        contra = txtContraseña.getText();

        sql = "INSERT INTO usuario (cod_usu,nombre,domicilio,telefono,tipo_usu,usuario,contraseña) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, cod);
            pst.setString(2, nom);
            pst.setString(3, domi);
            pst.setString(4, tel);
            pst.setString(5, tipoU);
            pst.setString(6, usu);
            pst.setString(7, contra);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
                bloquear();
            }
            cargar("");
        } catch (SQLException ex) {
            //Logger.getLogger(IngresoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void mnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmodificarActionPerformed
        // TODO add your handling code here:
        desbloquear();
        btnActualizar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        int filamodificar = tblUsuarios.getSelectedRow();
        if (filamodificar >= 0) {
            txtId.setText(tblUsuarios.getValueAt(filamodificar, 0).toString());
            txtNombre.setText(tblUsuarios.getValueAt(filamodificar, 1).toString());
            txtDomicilio.setText(tblUsuarios.getValueAt(filamodificar, 2).toString());
            txtTelefono.setText(tblUsuarios.getValueAt(filamodificar, 3).toString());
            cboTipoUsu.setSelectedItem(tblUsuarios.getValueAt(filamodificar, 4).toString());
            txtUsuario.setText(tblUsuarios.getValueAt(filamodificar, 5).toString());
            txtContraseña.setText(tblUsuarios.getValueAt(filamodificar, 6).toString());

        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ");
        }
    }//GEN-LAST:event_mnmodificarActionPerformed

    private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblUsuarios.getSelectedRow();
        String cod = "";
        cod = tblUsuarios.getValueAt(fila, 0).toString();
        if (fila >= 0) {
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM usuario WHERE cod_usu='" + cod + "'");
                pst.executeUpdate();
                cargar("");
            } catch (SQLException ex) {
                //Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha selecionada ninguna fila");
        }
    }//GEN-LAST:event_mneliminarActionPerformed

    private void tblUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblUsuariosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JComboBox<String> cboTipoUsu;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnmodificar;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
