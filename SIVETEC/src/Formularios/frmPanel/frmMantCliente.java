package Formularios.frmPanel;

import Datos.Conexion;
import Formularios.GenerarCodigos;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmMantCliente extends javax.swing.JPanel {

    DefaultTableModel model;

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public frmMantCliente() {
        initComponents();
        bloquear();
        cargar("");
    }

    void bloquear() {
        txtCodigo.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtRuc.setEnabled(false);
        txtDni.setEnabled(false);
        cboGenero.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnCalcelar.setEnabled(false);
        btnActualizar.setEnabled(false);

    }

    void limpiar() {
        txtCodigo.setText("");
        txtNombres.setText("");
        txtDireccion.setText("");
        txtDni.setText("");
        txtEmail.setText("");
        txtDni.setText("");
        txtRuc.setText("");
        txtTelefono.setText("");
        txtApellidos.setText("");

    }

    void desbloquear() {
        txtCodigo.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtRuc.setEnabled(true);
        txtDni.setEnabled(true);
        cboGenero.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnCalcelar.setEnabled(true);
        btnActualizar.setEnabled(false);
    }

    void cargar(String valor) {
        String mostrar = "SELECT * FROM cliente WHERE CONCAT(cod_cli,nom_cli,ape_cli,dni_cli,ruc_cli) LIKE '%" + valor + "%'";
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Sexo", "DNI", "Telefono", "RUC", "Email", "Direccion"};
        String[] Registros = new String[9];
        model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            while (rs.next()) {
                Registros[0] = rs.getString("cod_cli");
                Registros[1] = rs.getString("nom_cli");
                Registros[2] = rs.getString("ape_cli");
                Registros[3] = rs.getString("sexo_cli");
                Registros[4] = rs.getString("dni_cli");
                Registros[5] = rs.getString("tel_cli");
                Registros[6] = rs.getString("ruc_cli");
                Registros[7] = rs.getString("email_cli");
                Registros[8] = rs.getString("dir_cli");
                model.addRow(Registros);
            }
            tblClientes.setModel(model);
        } catch (SQLException ex) {
            //Logger.getLogger(IngresoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void codigosclientes() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(cod_cli) from cliente";
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
                txtCodigo.setText("CC0001");
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
                txtCodigo.setText("CC" + gen.serie());

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
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cboGenero = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtBuscarCliente = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JLabel();
        btnCalcelar = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
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

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(156, 100, 15));
        txtCodigo.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 120, 190, 30));

        txtNombres.setBackground(new java.awt.Color(156, 100, 15));
        txtNombres.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);
        txtNombres.setOpaque(false);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 173, 180, 30));

        txtApellidos.setBackground(new java.awt.Color(156, 100, 15));
        txtApellidos.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        txtApellidos.setOpaque(false);
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 174, 180, 30));

        cboGenero.setEditable(true);
        cboGenero.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cboGenero.setBorder(null);
        add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 226, 194, 30));

        txtTelefono.setBackground(new java.awt.Color(156, 100, 15));
        txtTelefono.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 227, 188, 30));

        txtDni.setBackground(new java.awt.Color(156, 100, 15));
        txtDni.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.setOpaque(false);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 278, 234, 30));

        txtRuc.setBackground(new java.awt.Color(156, 100, 15));
        txtRuc.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtRuc.setForeground(new java.awt.Color(255, 255, 255));
        txtRuc.setBorder(null);
        txtRuc.setOpaque(false);
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });
        add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 230, 30));

        txtEmail.setBackground(new java.awt.Color(156, 100, 15));
        txtEmail.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 332, 214, 30));

        txtDireccion.setBackground(new java.awt.Color(156, 100, 15));
        txtDireccion.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        txtDireccion.setOpaque(false);
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 333, 180, 30));

        txtBuscarCliente.setBackground(new java.awt.Color(236, 239, 244));
        txtBuscarCliente.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtBuscarCliente.setForeground(new java.awt.Color(34, 45, 49));
        txtBuscarCliente.setBorder(null);
        txtBuscarCliente.setOpaque(false);
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyTyped(evt);
            }
        });
        add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 410, 208, 30));

        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 136, 44));

        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 136, 44));

        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 136, 44));

        btnCalcelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcelarMouseClicked(evt);
            }
        });
        add(btnCalcelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 308, 136, 44));

        btnMostrarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 404, 186, 44));

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
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblClientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 840, 150));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frmMantCliente.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarClienteKeyTyped

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE cliente SET nom_cli='"
                    + txtNombres.getText() + "',ape_cli='"
                    + txtApellidos.getText() + "',sexo_cli='"
                    + cboGenero.getSelectedItem() + "',dni_cli='"
                    + txtDni.getText() + "',tel_cli='"
                    + txtTelefono.getText() + "',ruc_cli='"
                    + txtRuc.getText() + "',email_cli='"
                    + txtEmail.getText() + "',dir_cli='"
                    + txtDireccion.getText() + "' WHERE cod_cli='" + txtCodigo.getText() + "'");
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
        codigosclientes();
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnCalcelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcelarMouseClicked
        bloquear();
    }//GEN-LAST:event_btnCalcelarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        String cod, dir, nom, ape, tel, sex, dni, email, ruc;
        String sql = "";
        cod = txtCodigo.getText();
        nom = txtNombres.getText();
        ape = txtApellidos.getText();
        dir = txtDireccion.getText();
        tel = txtTelefono.getText();
        sex = cboGenero.getSelectedItem().toString();
        ruc = txtRuc.getText();
        email = txtEmail.getText();
        dni = txtDni.getText();

        sql = "INSERT INTO cliente (cod_cli,nom_cli,ape_cli,sexo_cli,dni_cli,tel_cli,ruc_cli,email_cli,dir_cli) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, cod);
            pst.setString(2, nom);
            pst.setString(3, ape);
            pst.setString(4, sex);
            pst.setString(5, dni);
            pst.setString(6, tel);
            pst.setString(7, ruc);
            pst.setString(8, email);
            pst.setString(9, dir);

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

    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        cargar(txtBuscarCliente.getText());
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void mnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmodificarActionPerformed
        // TODO add your handling code here:
        desbloquear();
        btnActualizar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        int filamodificar = tblClientes.getSelectedRow();
        if (filamodificar >= 0) {
            txtCodigo.setText(tblClientes.getValueAt(filamodificar, 0).toString());
            txtNombres.setText(tblClientes.getValueAt(filamodificar, 1).toString());
            txtApellidos.setText(tblClientes.getValueAt(filamodificar, 2).toString());
            cboGenero.setSelectedItem(tblClientes.getValueAt(filamodificar, 3).toString());
            txtDni.setText(tblClientes.getValueAt(filamodificar, 4).toString());
            txtTelefono.setText(tblClientes.getValueAt(filamodificar, 5).toString());
            txtRuc.setText(tblClientes.getValueAt(filamodificar, 6).toString());
            txtEmail.setText(tblClientes.getValueAt(filamodificar, 7).toString());
            txtDireccion.setText(tblClientes.getValueAt(filamodificar, 8).toString());

        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ");
        }
    }//GEN-LAST:event_mnmodificarActionPerformed

    private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblClientes.getSelectedRow();
        String cod = "";
        cod = tblClientes.getValueAt(fila, 0).toString();
        if (fila >= 0) {
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM cliente WHERE cod_cli='" + cod + "'");
                pst.executeUpdate();
                cargar("");
            } catch (SQLException ex) {
                //Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha selecionada ninguna fila");
        }

    }//GEN-LAST:event_mneliminarActionPerformed

    private void tblClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblClientesMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnCalcelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnMostrarTodos;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnmodificar;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
