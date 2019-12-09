package Formularios;

import Datos.Conexion;
import Formularios.frmPanel.frmMantCliente;
import Formularios.frmPanel.frmMantUsuario;
import Formularios.frmPanel.frmMantProducto;
import Formularios.frmPanel.frmFactura;
import Formularios.frmPanel.frmBoleta;
import Formularios.frmPanel.frmConsulUsuarios;
import Formularios.frmPanel.frmConsulProductos;
import Formularios.frmPanel.frmConsulCliente;
import Formularios.frmPanel.frmConsulFactura;
import Formularios.frmPanel.frmConsulBoleta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class frmInicio extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    int x, y;

    public frmInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo-White.png")).getImage());
        OcultarSubItems();
        OdenarOpciones();
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(18, 22, 25));
    }

    void setColorNaranga(JPanel panel) {
        panel.setBackground(new Color(243, 156, 25));
    }

    void setReset(JPanel panel) {
        panel.setBackground(new Color(34, 45, 49));
    }

    void setResetSombra(JPanel panel) {
        panel.setBackground(new Color(22, 30, 32));
    }

    void OcultarSubItems() {
        pnlReportUsuarios.setVisible(false);
        pnlReportProductos.setVisible(false);
        pnlReportClientes.setVisible(false);
        pnlReportFacturas.setVisible(false);
        pnlReportBoletas.setVisible(false);

        pnlVentFactura.setVisible(false);
        pnlVentBoleta.setVisible(false);

        pnlMantUsuarios.setVisible(false);
        pnlMantClientes.setVisible(false);
        pnlMantProductos.setVisible(false);

        pnlConsulUsuarios.setVisible(false);
        pnlConsulProductos.setVisible(false);
        pnlConsulClientes.setVisible(false);
        pnlConsulFacturas.setVisible(false);
        pnlConsulBoletas.setVisible(false);
    }

    void OdenarOpciones() {
        pnlControles.add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, -1));
        pnlControles.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 250, -1));
        pnlControles.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 250, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlControles = new javax.swing.JPanel();
        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlVentas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlConsultas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlReportes = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlCerrarSesion = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlSubItemss = new javax.swing.JPanel();
        pnlConsulUsuarios = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pnlConsulProductos = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pnlConsulClientes = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        pnlConsulFacturas = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        pnlConsulBoletas = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        pnlReportUsuarios = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        pnlReportProductos = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        pnlReportClientes = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        pnlReportFacturas = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        pnlReportBoletas = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        pnlVentBoleta = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pnlVentFactura = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pnlMantClientes = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pnlMantProductos = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pnlMantUsuarios = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIVETEC");
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setPreferredSize(new java.awt.Dimension(1250, 653));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlControles.setBackground(new java.awt.Color(34, 45, 49));
        pnlControles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMantenimiento.setBackground(new java.awt.Color(34, 45, 49));
        pnlMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMantenimientoMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/laptop.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mantenimiento");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout pnlMantenimientoLayout = new javax.swing.GroupLayout(pnlMantenimiento);
        pnlMantenimiento.setLayout(pnlMantenimientoLayout);
        pnlMantenimientoLayout.setHorizontalGroup(
            pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMantenimientoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
        );
        pnlMantenimientoLayout.setVerticalGroup(
            pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlControles.add(pnlMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, -1));

        pnlVentas.setBackground(new java.awt.Color(34, 45, 49));
        pnlVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlVentasMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ventas");
        jLabel12.setToolTipText("");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlVentasLayout = new javax.swing.GroupLayout(pnlVentas);
        pnlVentas.setLayout(pnlVentasLayout);
        pnlVentasLayout.setHorizontalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pnlVentasLayout.setVerticalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControles.add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, -1));

        pnlConsultas.setBackground(new java.awt.Color(34, 45, 49));
        pnlConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsultasMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pros-y-contras.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Consultas");
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout pnlConsultasLayout = new javax.swing.GroupLayout(pnlConsultas);
        pnlConsultas.setLayout(pnlConsultasLayout);
        pnlConsultasLayout.setHorizontalGroup(
            pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        pnlConsultasLayout.setVerticalGroup(
            pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControles.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, -1));

        pnlReportes.setBackground(new java.awt.Color(34, 45, 49));
        pnlReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlReportesMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estadistica.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Reportes");
        jLabel16.setToolTipText("");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReportesLayout = new javax.swing.GroupLayout(pnlReportes);
        pnlReportes.setLayout(pnlReportesLayout);
        pnlReportesLayout.setHorizontalGroup(
            pnlReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlReportesLayout.setVerticalGroup(
            pnlReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControles.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logotipo.png"))); // NOI18N
        pnlControles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        pnlCerrarSesion.setBackground(new java.awt.Color(34, 45, 49));
        pnlCerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnlCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCerrarSesionMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cerrar Sesión");
        jLabel18.setToolTipText("");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarSesionLayout = new javax.swing.GroupLayout(pnlCerrarSesion);
        pnlCerrarSesion.setLayout(pnlCerrarSesionLayout);
        pnlCerrarSesionLayout.setHorizontalGroup(
            pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarSesionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlCerrarSesionLayout.setVerticalGroup(
            pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCerrarSesionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControles.add(pnlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 608, 210, 70));

        pnlSubItemss.setBackground(new java.awt.Color(255, 255, 255));

        pnlConsulUsuarios.setBackground(new java.awt.Color(22, 30, 32));
        pnlConsulUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsulUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlConsulUsuariosMouseMoved(evt);
            }
        });
        pnlConsulUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsulUsuariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsulUsuariosMousePressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_male_user_24px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Usuarios");
        jLabel22.setToolTipText("");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlConsulUsuariosLayout = new javax.swing.GroupLayout(pnlConsulUsuarios);
        pnlConsulUsuarios.setLayout(pnlConsulUsuariosLayout);
        pnlConsulUsuariosLayout.setHorizontalGroup(
            pnlConsulUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsulUsuariosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlConsulUsuariosLayout.setVerticalGroup(
            pnlConsulUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsulUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsulUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlConsulProductos.setBackground(new java.awt.Color(22, 30, 32));
        pnlConsulProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsulProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsulProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsulProductosMousePressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_workstation_26px.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Productos");
        jLabel34.setToolTipText("");

        javax.swing.GroupLayout pnlConsulProductosLayout = new javax.swing.GroupLayout(pnlConsulProductos);
        pnlConsulProductos.setLayout(pnlConsulProductosLayout);
        pnlConsulProductosLayout.setHorizontalGroup(
            pnlConsulProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsulProductosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlConsulProductosLayout.setVerticalGroup(
            pnlConsulProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsulProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsulProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlConsulClientes.setBackground(new java.awt.Color(22, 30, 32));
        pnlConsulClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsulClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsulClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsulClientesMousePressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_account_30px.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Clientes");
        jLabel32.setToolTipText("");

        javax.swing.GroupLayout pnlConsulClientesLayout = new javax.swing.GroupLayout(pnlConsulClientes);
        pnlConsulClientes.setLayout(pnlConsulClientesLayout);
        pnlConsulClientesLayout.setHorizontalGroup(
            pnlConsulClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsulClientesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlConsulClientesLayout.setVerticalGroup(
            pnlConsulClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsulClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsulClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlConsulFacturas.setBackground(new java.awt.Color(22, 30, 32));
        pnlConsulFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsulFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsulFacturasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsulFacturasMousePressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_purchase_order_32px.png"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Facturas");
        jLabel36.setToolTipText("");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlConsulFacturasLayout = new javax.swing.GroupLayout(pnlConsulFacturas);
        pnlConsulFacturas.setLayout(pnlConsulFacturasLayout);
        pnlConsulFacturasLayout.setHorizontalGroup(
            pnlConsulFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsulFacturasLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnlConsulFacturasLayout.setVerticalGroup(
            pnlConsulFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsulFacturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsulFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlConsulBoletas.setBackground(new java.awt.Color(22, 30, 32));
        pnlConsulBoletas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsulBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsulBoletasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsulBoletasMousePressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_purchase_order_26px.png"))); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Boletas");
        jLabel38.setToolTipText("");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlConsulBoletasLayout = new javax.swing.GroupLayout(pnlConsulBoletas);
        pnlConsulBoletas.setLayout(pnlConsulBoletasLayout);
        pnlConsulBoletasLayout.setHorizontalGroup(
            pnlConsulBoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsulBoletasLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pnlConsulBoletasLayout.setVerticalGroup(
            pnlConsulBoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsulBoletasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsulBoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlReportUsuarios.setBackground(new java.awt.Color(22, 30, 32));
        pnlReportUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportUsuariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlReportUsuariosMousePressed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_male_user_24px.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Usuarios");
        jLabel40.setToolTipText("");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReportUsuariosLayout = new javax.swing.GroupLayout(pnlReportUsuarios);
        pnlReportUsuarios.setLayout(pnlReportUsuariosLayout);
        pnlReportUsuariosLayout.setHorizontalGroup(
            pnlReportUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportUsuariosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlReportUsuariosLayout.setVerticalGroup(
            pnlReportUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReportUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlReportProductos.setBackground(new java.awt.Color(22, 30, 32));
        pnlReportProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlReportProductosMousePressed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_workstation_26px.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Productos");
        jLabel42.setToolTipText("");

        javax.swing.GroupLayout pnlReportProductosLayout = new javax.swing.GroupLayout(pnlReportProductos);
        pnlReportProductos.setLayout(pnlReportProductosLayout);
        pnlReportProductosLayout.setHorizontalGroup(
            pnlReportProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportProductosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlReportProductosLayout.setVerticalGroup(
            pnlReportProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReportProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlReportClientes.setBackground(new java.awt.Color(22, 30, 32));
        pnlReportClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlReportClientesMousePressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_account_30px.png"))); // NOI18N
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Clientes");
        jLabel44.setToolTipText("");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReportClientesLayout = new javax.swing.GroupLayout(pnlReportClientes);
        pnlReportClientes.setLayout(pnlReportClientesLayout);
        pnlReportClientesLayout.setHorizontalGroup(
            pnlReportClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportClientesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlReportClientesLayout.setVerticalGroup(
            pnlReportClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReportClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlReportFacturas.setBackground(new java.awt.Color(22, 30, 32));
        pnlReportFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportFacturasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlReportFacturasMousePressed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_purchase_order_32px.png"))); // NOI18N
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Facturas");
        jLabel46.setToolTipText("");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReportFacturasLayout = new javax.swing.GroupLayout(pnlReportFacturas);
        pnlReportFacturas.setLayout(pnlReportFacturasLayout);
        pnlReportFacturasLayout.setHorizontalGroup(
            pnlReportFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportFacturasLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnlReportFacturasLayout.setVerticalGroup(
            pnlReportFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportFacturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReportFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlReportBoletas.setBackground(new java.awt.Color(22, 30, 32));
        pnlReportBoletas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportBoletasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlReportBoletasMousePressed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_purchase_order_26px.png"))); // NOI18N
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Boletas");
        jLabel48.setToolTipText("");
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReportBoletasLayout = new javax.swing.GroupLayout(pnlReportBoletas);
        pnlReportBoletas.setLayout(pnlReportBoletasLayout);
        pnlReportBoletasLayout.setHorizontalGroup(
            pnlReportBoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportBoletasLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pnlReportBoletasLayout.setVerticalGroup(
            pnlReportBoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportBoletasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReportBoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlVentBoleta.setBackground(new java.awt.Color(22, 30, 32));
        pnlVentBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlVentBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVentBoletaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlVentBoletaMousePressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_purchase_order_26px.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Boleta");
        jLabel28.setToolTipText("");

        javax.swing.GroupLayout pnlVentBoletaLayout = new javax.swing.GroupLayout(pnlVentBoleta);
        pnlVentBoleta.setLayout(pnlVentBoletaLayout);
        pnlVentBoletaLayout.setHorizontalGroup(
            pnlVentBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentBoletaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        pnlVentBoletaLayout.setVerticalGroup(
            pnlVentBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentBoletaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlVentBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlVentFactura.setBackground(new java.awt.Color(22, 30, 32));
        pnlVentFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlVentFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVentFacturaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlVentFacturaMousePressed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_purchase_order_32px.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Factura");
        jLabel30.setToolTipText("");

        javax.swing.GroupLayout pnlVentFacturaLayout = new javax.swing.GroupLayout(pnlVentFactura);
        pnlVentFactura.setLayout(pnlVentFacturaLayout);
        pnlVentFacturaLayout.setHorizontalGroup(
            pnlVentFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentFacturaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlVentFacturaLayout.setVerticalGroup(
            pnlVentFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlVentFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlMantClientes.setBackground(new java.awt.Color(22, 30, 32));
        pnlMantClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMantClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMantClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMantClientesMousePressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_account_30px.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Clientes");
        jLabel26.setToolTipText("");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlMantClientesLayout = new javax.swing.GroupLayout(pnlMantClientes);
        pnlMantClientes.setLayout(pnlMantClientesLayout);
        pnlMantClientesLayout.setHorizontalGroup(
            pnlMantClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantClientesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlMantClientesLayout.setVerticalGroup(
            pnlMantClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMantClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMantClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlMantProductos.setBackground(new java.awt.Color(22, 30, 32));
        pnlMantProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMantProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMantProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMantProductosMousePressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_workstation_26px.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Productos");
        jLabel24.setToolTipText("");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlMantProductosLayout = new javax.swing.GroupLayout(pnlMantProductos);
        pnlMantProductos.setLayout(pnlMantProductosLayout);
        pnlMantProductosLayout.setHorizontalGroup(
            pnlMantProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantProductosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlMantProductosLayout.setVerticalGroup(
            pnlMantProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMantProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMantProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlMantUsuarios.setBackground(new java.awt.Color(22, 30, 32));
        pnlMantUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMantUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMantUsuariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMantUsuariosMousePressed(evt);
            }
        });
        pnlMantUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlMantUsuariosKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_male_user_24px.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Usuarios");
        jLabel20.setToolTipText("");

        javax.swing.GroupLayout pnlMantUsuariosLayout = new javax.swing.GroupLayout(pnlMantUsuarios);
        pnlMantUsuarios.setLayout(pnlMantUsuariosLayout);
        pnlMantUsuariosLayout.setHorizontalGroup(
            pnlMantUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantUsuariosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlMantUsuariosLayout.setVerticalGroup(
            pnlMantUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMantUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMantUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSubItemssLayout = new javax.swing.GroupLayout(pnlSubItemss);
        pnlSubItemss.setLayout(pnlSubItemssLayout);
        pnlSubItemssLayout.setHorizontalGroup(
            pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubItemssLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsulUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsulBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsulFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsulClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsulProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlReportUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlReportFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlReportBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlReportClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlReportProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVentFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVentBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMantUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMantClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSubItemssLayout.setVerticalGroup(
            pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSubItemssLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addComponent(pnlMantUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(pnlMantClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnlMantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlVentFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnlVentBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addComponent(pnlConsulUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSubItemssLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(pnlConsulBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSubItemssLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(pnlConsulFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlConsulClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnlConsulProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addComponent(pnlReportUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(pnlSubItemssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSubItemssLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(pnlReportFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSubItemssLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(pnlReportBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlReportClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSubItemssLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnlReportProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlControles.add(pnlSubItemss, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 320, -1, 205));

        pnlFondo.add(pnlControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 720));

        pnlTitulo.setBackground(new java.awt.Color(243, 156, 25));
        pnlTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTituloMouseDragged(evt);
            }
        });
        pnlTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTituloMousePressed(evt);
            }
        });

        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(930, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 0, 1010, -1));

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        pnlFondo.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 1000, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnlTituloMousePressed

    private void pnlTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloMouseDragged

    }//GEN-LAST:event_pnlTituloMouseDragged

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "SIVETEC", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void pnlMantenimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantenimientoMousePressed
        setColor(pnlMantenimiento);
        setReset(pnlVentas);
        setReset(pnlConsultas);
        setReset(pnlReportes);

        pnlMantUsuarios.setVisible(true);
        pnlMantClientes.setVisible(true);

        pnlVentas.setVisible(true);

        pnlControles.add(pnlMantUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, -1));
        pnlControles.add(pnlMantProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 250, -1));
        pnlControles.add(pnlMantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 250, -1));

        pnlControles.add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 250, -1));
        pnlControles.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 250, -1));
        pnlControles.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, -1));

        pnlMantProductos.setVisible(true);
        pnlVentFactura.setVisible(false);
        pnlVentBoleta.setVisible(false);
        pnlConsulUsuarios.setVisible(false);
        pnlConsulProductos.setVisible(false);
        pnlConsulClientes.setVisible(false);
        pnlConsulFacturas.setVisible(false);
        pnlConsulBoletas.setVisible(false);
        pnlReportUsuarios.setVisible(false);
        pnlReportProductos.setVisible(false);
        pnlReportClientes.setVisible(false);
        pnlReportFacturas.setVisible(false);
        pnlReportBoletas.setVisible(false);
    }//GEN-LAST:event_pnlMantenimientoMousePressed

    private void pnlVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVentasMousePressed

        pnlControles.add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, -1));

        pnlControles.add(pnlVentFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 250, -1));
        pnlControles.add(pnlVentBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 250, -1));

        pnlControles.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 250, -1));
        pnlControles.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 250, -1));

        setColor(pnlVentas);
        setReset(pnlMantenimiento);
        setReset(pnlConsultas);
        setReset(pnlReportes);
        pnlVentFactura.setVisible(true);
        pnlVentBoleta.setVisible(true);
        pnlMantUsuarios.setVisible(false);
        pnlMantClientes.setVisible(false);
        pnlMantProductos.setVisible(false);
        pnlConsulUsuarios.setVisible(false);
        pnlConsulProductos.setVisible(false);
        pnlConsulClientes.setVisible(false);
        pnlConsulFacturas.setVisible(false);
        pnlConsulBoletas.setVisible(false);
        pnlReportUsuarios.setVisible(false);
        pnlReportProductos.setVisible(false);
        pnlReportClientes.setVisible(false);
        pnlReportFacturas.setVisible(false);
        pnlReportBoletas.setVisible(false);

    }//GEN-LAST:event_pnlVentasMousePressed

    private void pnlConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultasMousePressed

        pnlControles.add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, -1));
        pnlControles.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 250, -1));

        pnlControles.add(pnlConsulUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 250, -1));
        pnlControles.add(pnlConsulProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 250, -1));
        pnlControles.add(pnlConsulClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 250, -1));
        pnlControles.add(pnlConsulFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, -1));
        pnlControles.add(pnlConsulBoletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 464, 250, -1));
        pnlControles.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 518, 250, -1));

        setColor(pnlConsultas);
        setReset(pnlMantenimiento);
        setReset(pnlVentas);
        setReset(pnlReportes);

        pnlConsulUsuarios.setVisible(true);
        pnlConsulProductos.setVisible(true);
        pnlConsulClientes.setVisible(true);
        pnlConsulFacturas.setVisible(true);
        pnlConsulBoletas.setVisible(true);
        pnlMantUsuarios.setVisible(false);
        pnlMantClientes.setVisible(false);
        pnlMantProductos.setVisible(false);
        pnlVentFactura.setVisible(false);
        pnlVentBoleta.setVisible(false);
        pnlReportUsuarios.setVisible(false);
        pnlReportProductos.setVisible(false);
        pnlReportClientes.setVisible(false);
        pnlReportFacturas.setVisible(false);
        pnlReportBoletas.setVisible(false);

    }//GEN-LAST:event_pnlConsultasMousePressed

    private void pnlReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportesMousePressed

        pnlControles.add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, -1));
        pnlControles.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 250, -1));

        pnlControles.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 250, -1));
        pnlControles.add(pnlReportUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 250, -1));
        pnlControles.add(pnlReportProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 250, -1));
        pnlControles.add(pnlReportClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, -1));
        pnlControles.add(pnlReportFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 464, 250, -1));
        pnlControles.add(pnlReportBoletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 518, 250, -1));

        setColor(pnlReportes);
        setReset(pnlMantenimiento);
        setReset(pnlVentas);
        setReset(pnlConsultas);

        pnlReportUsuarios.setVisible(true);
        pnlReportProductos.setVisible(true);
        pnlReportClientes.setVisible(true);
        pnlReportFacturas.setVisible(true);
        pnlReportBoletas.setVisible(true);

        pnlVentFactura.setVisible(false);
        pnlVentBoleta.setVisible(false);
        pnlMantUsuarios.setVisible(false);
        pnlMantClientes.setVisible(false);
        pnlMantProductos.setVisible(false);
        pnlConsulUsuarios.setVisible(false);
        pnlConsulProductos.setVisible(false);
        pnlConsulClientes.setVisible(false);
        pnlConsulFacturas.setVisible(false);
        pnlConsulBoletas.setVisible(false);
    }//GEN-LAST:event_pnlReportesMousePressed

    private void pnlMantUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantUsuariosMousePressed
        setColorNaranga(pnlMantUsuarios);

        setResetSombra(pnlMantClientes);
        setResetSombra(pnlMantProductos);

        setResetSombra(pnlVentFactura);
        setResetSombra(pnlVentBoleta);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlMantUsuariosMousePressed

    private void pnlMantProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantProductosMousePressed
        setColorNaranga(pnlMantProductos);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentFactura);
        setResetSombra(pnlVentBoleta);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlMantProductosMousePressed

    private void pnlMantClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantClientesMousePressed
        setColorNaranga(pnlMantClientes);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);

        setResetSombra(pnlVentFactura);
        setResetSombra(pnlVentBoleta);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlMantClientesMousePressed

    private void pnlVentBoletaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVentBoletaMousePressed
        setColorNaranga(pnlVentBoleta);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlVentBoletaMousePressed

    private void pnlVentFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVentFacturaMousePressed
        setColorNaranga(pnlVentFactura);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlVentFacturaMousePressed

    private void pnlConsulClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulClientesMousePressed
        setColorNaranga(pnlConsulClientes);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlConsulClientesMousePressed

    private void pnlConsulProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulProductosMousePressed
        setColorNaranga(pnlConsulProductos);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlConsulProductosMousePressed

    private void pnlConsulUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulUsuariosMousePressed
        setColorNaranga(pnlConsulUsuarios);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlConsulUsuariosMousePressed

    private void pnlConsulFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulFacturasMousePressed
        setColorNaranga(pnlConsulFacturas);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlConsulFacturasMousePressed

    private void pnlConsulBoletasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulBoletasMousePressed
        setColorNaranga(pnlConsulBoletas);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlConsulBoletasMousePressed

    private void pnlReportUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportUsuariosMousePressed
        setColorNaranga(pnlReportUsuarios);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlReportUsuariosMousePressed

    private void pnlReportProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportProductosMousePressed
        setColorNaranga(pnlReportProductos);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlReportProductosMousePressed

    private void pnlReportClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportClientesMousePressed
        setColorNaranga(pnlReportClientes);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportFacturas);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlReportClientesMousePressed

    private void pnlReportFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportFacturasMousePressed
        setColorNaranga(pnlReportFacturas);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportBoletas);
    }//GEN-LAST:event_pnlReportFacturasMousePressed

    private void pnlReportBoletasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportBoletasMousePressed
        setColorNaranga(pnlReportBoletas);

        setResetSombra(pnlMantUsuarios);
        setResetSombra(pnlMantProductos);
        setResetSombra(pnlMantClientes);

        setResetSombra(pnlVentBoleta);
        setResetSombra(pnlVentFactura);

        setResetSombra(pnlConsulUsuarios);
        setResetSombra(pnlConsulProductos);
        setResetSombra(pnlConsulClientes);
        setResetSombra(pnlConsulFacturas);
        setResetSombra(pnlConsulBoletas);

        setResetSombra(pnlReportUsuarios);
        setResetSombra(pnlReportProductos);
        setResetSombra(pnlReportClientes);
        setResetSombra(pnlReportFacturas);
    }//GEN-LAST:event_pnlReportBoletasMousePressed

    private void pnlMantUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantUsuariosMouseClicked

        frmMantUsuario pnlMUsu = new frmMantUsuario();
        pnlMUsu.setSize(1000, 670); //Tamaño del Panel
        pnlMUsu.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlMUsu, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();

        //pnlMUsu.CboTipoUsu.setUI(Propiedades.createUI(rootPane));

    }//GEN-LAST:event_pnlMantUsuariosMouseClicked

    private void pnlConsulUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulUsuariosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlConsulUsuariosMouseMoved

    private void pnlMantUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlMantUsuariosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMantUsuariosKeyPressed

    private void pnlCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarSesionMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de cerrar sesión?",
                "SIVETEC", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            frmLogin Login = new frmLogin();
            Login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_pnlCerrarSesionMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de cerrar sesión?",
                "SIVETEC", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            frmLogin Login = new frmLogin();
            Login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de cerrar sesión?",
                "SIVETEC", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            frmLogin Login = new frmLogin();
            Login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void pnlMantClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantClientesMouseClicked
        frmMantCliente pnlMClie = new frmMantCliente();
        pnlMClie.setSize(1000, 670); //Tamaño del Panel
        pnlMClie.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlMClie, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlMantClientesMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void pnlMantProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMantProductosMouseClicked
        frmMantProducto pnlMProduct = new frmMantProducto();
        pnlMProduct.setSize(1000, 670); //Tamaño del Panel
        pnlMProduct.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlMProduct, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlMantProductosMouseClicked

    private void pnlVentFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVentFacturaMouseClicked
        frmFactura pnlFact = new frmFactura();
        pnlFact.setSize(1000, 670); //Tamaño del Panel
        pnlFact.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlFact, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlVentFacturaMouseClicked

    private void pnlVentBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVentBoletaMouseClicked
        frmBoleta pnlBoleta = new frmBoleta();
        pnlBoleta.setSize(1000, 670); //Tamaño del Panel
        pnlBoleta.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlBoleta, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlVentBoletaMouseClicked

    private void pnlConsulProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulProductosMouseClicked
        frmConsulProductos pnlConsulProduct = new frmConsulProductos();
        pnlConsulProduct.setSize(1000, 670); //Tamaño del Panel
        pnlConsulProduct.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlConsulProduct, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlConsulProductosMouseClicked

    private void pnlConsulClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulClientesMouseClicked
        frmConsulCliente pnlConsulCli = new frmConsulCliente();
        pnlConsulCli.setSize(1000, 670); //Tamaño del Panel
        pnlConsulCli.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlConsulCli, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlConsulClientesMouseClicked

    private void pnlConsulFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulFacturasMouseClicked
        frmConsulFactura pnlConsulFat = new frmConsulFactura();
        pnlConsulFat.setSize(1000, 670); //Tamaño del Panel
        pnlConsulFat.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlConsulFat, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlConsulFacturasMouseClicked

    private void pnlConsulBoletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulBoletasMouseClicked
        frmConsulBoleta pnlConsulBol = new frmConsulBoleta();
        pnlConsulBol.setSize(1000, 670); //Tamaño del Panel
        pnlConsulBol.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlConsulBol, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlConsulBoletasMouseClicked

    private void pnlConsulUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulUsuariosMouseClicked
        frmConsulUsuarios pnlConsulUsu = new frmConsulUsuarios();
        pnlConsulUsu.setSize(1000, 670); //Tamaño del Panel
        pnlConsulUsu.setLocation(0, 0); //Posicion dentro del panel contenedor

        pnlContenedor.removeAll();
        pnlContenedor.add(pnlConsulUsu, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_pnlConsulUsuariosMouseClicked

    private void pnlReportClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportClientesMouseClicked
        try {
            JasperReport reporte = null;
            //String ruta = "src\\Reportes\\reportClientes.jasper";
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportClientes.jasper"));
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_pnlReportClientesMouseClicked

    private void pnlReportProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportProductosMouseClicked
        try {
            JasperReport reporte = null;
            //String ruta = "src\\Reportes\\reportProductos.jasper";
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportProductos.jasper"));
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_pnlReportProductosMouseClicked

    private void pnlReportFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportFacturasMouseClicked
        try {
            JasperReport reporte = null;
            //String ruta = "src\\Reportes\\reportFacturas.jasper";
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportFacturas.jasper"));
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_pnlReportFacturasMouseClicked

    private void pnlReportBoletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportBoletasMouseClicked
        try {
            JasperReport reporte = null;
            //String ruta = "src\\Reportes\\reportBoletas.jasper";
            //reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportBoletas.jasper"));
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_pnlReportBoletasMouseClicked

    private void pnlReportUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportUsuariosMouseClicked
        try {
            JasperReport reporte = null;
            //String ruta = "src\\Reportes\\reportUsuarios.jasper";
            //reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportUsuarios.jasper"));
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_pnlReportUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlCerrarSesion;
    private javax.swing.JPanel pnlConsulBoletas;
    private javax.swing.JPanel pnlConsulClientes;
    private javax.swing.JPanel pnlConsulFacturas;
    private javax.swing.JPanel pnlConsulProductos;
    private javax.swing.JPanel pnlConsulUsuarios;
    private javax.swing.JPanel pnlConsultas;
    public static javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlControles;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlMantClientes;
    private javax.swing.JPanel pnlMantProductos;
    private javax.swing.JPanel pnlMantUsuarios;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JPanel pnlReportBoletas;
    private javax.swing.JPanel pnlReportClientes;
    private javax.swing.JPanel pnlReportFacturas;
    private javax.swing.JPanel pnlReportProductos;
    private javax.swing.JPanel pnlReportUsuarios;
    private javax.swing.JPanel pnlReportes;
    private javax.swing.JPanel pnlSubItemss;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlVentBoleta;
    private javax.swing.JPanel pnlVentFactura;
    private javax.swing.JPanel pnlVentas;
    // End of variables declaration//GEN-END:variables

}
