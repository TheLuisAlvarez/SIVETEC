package Formularios.frmJDialog;

import Datos.Conexion;
import Formularios.frmPanel.frmBoleta;
import java.sql.*;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarClienteB extends javax.swing.JDialog {

    DefaultTableModel modelo;
    Conexion cc= new Conexion();
    Connection cn = cc.conexion();

    public BuscarClienteB(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo-White.png")).getImage());
        mostrarclientes("");
    }

    void mostrarclientes(String valor) {
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Sexo", "DNI", "Telefono", "RUC", "Email", "Direccion"};
        String[] Registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        String Sql = "SELECT * FROM cliente WHERE CONCAT(cod_cli,nom_cli,ape_cli,dni_cli) LIKE '%" + valor + "%'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
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
                modelo.addRow(Registros);
            }
            tblClientes.setModel(modelo);
        } catch (SQLException ex) {
            //Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        btnEnviarDatos = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 79, 300, 23));

        btnEnviarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarDatosMouseClicked(evt);
            }
        });
        getContentPane().add(btnEnviarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 250, 50, 50));

        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 72, 150, 34));

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
        tblClientes.setRowHeight(20);
        tblClientes.setSelectionBackground(new java.awt.Color(243, 156, 25));
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 600, 110));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarCliente.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnEnviarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarDatosMouseClicked
     String cod="",nom="",ape="",dni="",dir="",ruc="";
    int fila = tblClientes.getSelectedRow();
    try {
        if(fila==-1)
        {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún dato");
                  
        }
        else
        {
         cod =  (String)tblClientes.getValueAt(fila, 0);
         nom =  (String)tblClientes.getValueAt(fila, 1);
         ape =  (String)tblClientes.getValueAt(fila, 2);
         dni =  (String)tblClientes.getValueAt(fila, 4);
         ruc =  (String)tblClientes.getValueAt(fila, 6);
         dir=  (String)tblClientes.getValueAt(fila, 8);
         
         frmBoleta.txtCodCliente.setText(cod);
         frmBoleta.txtSrA.setText(nom+"   "+ape);
         frmBoleta.txtDireccion.setText(dir);
         frmBoleta.txtDNI.setText(dni);
        
         this.dispose();
         
        }
    } catch (Exception e) {
    }        
    }//GEN-LAST:event_btnEnviarDatosMouseClicked

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        mostrarclientes("");
    }//GEN-LAST:event_btnMostrarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrarclientes(txtBuscar.getText());
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
            java.util.logging.Logger.getLogger(BuscarClienteB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarClienteB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarClienteB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarClienteB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarClienteB dialog = new BuscarClienteB(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
