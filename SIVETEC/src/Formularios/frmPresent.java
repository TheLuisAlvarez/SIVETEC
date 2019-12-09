package Formularios;

import javax.swing.ImageIcon;

public class frmPresent extends javax.swing.JFrame {

    public frmPresent() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo-White.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbllord = new javax.swing.JLabel();
        lblCargando = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbllord.setText("0%");
        getContentPane().add(lbllord, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        lblCargando.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCargando.setText("Cargando...");
        getContentPane().add(lblCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        progressBar.setBackground(new java.awt.Color(243, 156, 25));
        progressBar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        progressBar.setForeground(new java.awt.Color(243, 156, 25));
        progressBar.setBorderPainted(false);
        progressBar.setRequestFocusEnabled(false);
        progressBar.setString("");
        progressBar.setStringPainted(true);
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 400, 30));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 220, 70));

        jLabel1.setText("Ver. 1.2.9");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        lblFondo.setBackground(new java.awt.Color(255, 255, 255));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPresent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPresent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPresent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPresent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        frmPresent ho = new frmPresent();
        ho.setVisible(true);

        try {
            int x = 0;

            while (x < 100) {
                x++;
                Thread.sleep(50);

                frmPresent.lbllord.setText(Integer.toString(x) + "%");
                frmPresent.progressBar.setValue(x);
            }

            if (x > 99) {
                frmLogin frm = new frmLogin();
                frm.setVisible(true);
                ho.dispose();
            }

        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmPresent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargando;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    public static javax.swing.JLabel lbllord;
    public static javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
