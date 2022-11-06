/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Model.AddImage;

/**
 *
 * @author Esdras Abel Sapón Díaz
 */
public class FrmMenuOptions extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    /**
     * Creates new form test
     */
    public FrmMenuOptions() {
        initComponents();
        this.setLocationRelativeTo(this);
        AddImage.SetImageLabel(ImgFormain, "src/images/formain.png");
        AddImage.SetImageLabel(ImgClientes, "src/images/clientes.png");
        AddImage.SetImageLabel(ImgProveedores, "src/images/proveedores.png");
        AddImage.SetImageLabel(ImgProductos, "src/images/productos.png");
        AddImage.SetImageLabel(ImgMarcasProd, "src/images/marcas de productos.png");
        AddImage.SetImageLabel(ImgMedidasProd, "src/images/medidas de productos.png");
        AddImage.SetImageLabel(ImgFormasPago, "src/images/metodos de pago.png");
        AddImage.SetImageLabel(ImgFamiliaProd, "src/images/familias de productos.png");
        AddImage.SetImageLabel(ImgSeccionesProd, "src/images/secciones de productos.png");
        AddImage.SetImageLabel(ImgUsuariosDR, "src/images/usuarios con derechos y restricciones.png");
        AddImage.SetImageLabel(ImgSalir, "src/images/salir.png");
        AddImage.SetImageLabel(ImgListado, "src/images/listado.png");
        AddImage.SetImageLabel(imgCompras, "src/images/compra.png");
        AddImage.SetImageLabel(imgVentas, "src/images/venta.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        ImgFormain = new javax.swing.JLabel();
        ImgClientes = new javax.swing.JLabel();
        PnlClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ImgProveedores = new javax.swing.JLabel();
        PnlProveedores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ImgProductos = new javax.swing.JLabel();
        PnlProductos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ImgMarcasProd = new javax.swing.JLabel();
        PnlMarcasProd = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ImgMedidasProd = new javax.swing.JLabel();
        PnlMedidasProd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ImgFormasPago = new javax.swing.JLabel();
        PnlFormasPago = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ImgFamiliaProd = new javax.swing.JLabel();
        PnlFamiliaProd = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ImgSeccionesProd = new javax.swing.JLabel();
        PnlSeccionesProd = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ImgUsuariosDR = new javax.swing.JLabel();
        PnlUsuariosDR = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ImgSalir = new javax.swing.JLabel();
        PnlSalir = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        ImgListado = new javax.swing.JLabel();
        pnlVentas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        imgVentas = new javax.swing.JLabel();
        imgCompras = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pnlCompras = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(960, 644));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 644));

        lblMenu.setFont(new java.awt.Font("Roboto Cn", 1, 48)); // NOI18N
        lblMenu.setText("MENÚ DE OPCIONES");
        getContentPane().add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));
        getContentPane().add(ImgFormain, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 220, 100));
        getContentPane().add(ImgClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 80, 80));

        PnlClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlClientesMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("Clientes");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlClientesLayout = new javax.swing.GroupLayout(PnlClientes);
        PnlClientes.setLayout(PnlClientesLayout);
        PnlClientesLayout.setHorizontalGroup(
            PnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlClientesLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        PnlClientesLayout.setVerticalGroup(
            PnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlClientesLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, 60));
        getContentPane().add(ImgProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, 80, 80));

        PnlProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlProveedoresMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Proveedores");

        javax.swing.GroupLayout PnlProveedoresLayout = new javax.swing.GroupLayout(PnlProveedores);
        PnlProveedores.setLayout(PnlProveedoresLayout);
        PnlProveedoresLayout.setHorizontalGroup(
            PnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlProveedoresLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        PnlProveedoresLayout.setVerticalGroup(
            PnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlProveedoresLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, 150, 60));
        getContentPane().add(ImgProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 80, 80));

        PnlProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlProductosMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Productos");

        javax.swing.GroupLayout PnlProductosLayout = new javax.swing.GroupLayout(PnlProductos);
        PnlProductos.setLayout(PnlProductosLayout);
        PnlProductosLayout.setHorizontalGroup(
            PnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        PnlProductosLayout.setVerticalGroup(
            PnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlProductosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(PnlProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 130, 60));
        getContentPane().add(ImgMarcasProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 80, 80));

        PnlMarcasProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlMarcasProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlMarcasProdMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("Marcas de Productos");

        javax.swing.GroupLayout PnlMarcasProdLayout = new javax.swing.GroupLayout(PnlMarcasProd);
        PnlMarcasProd.setLayout(PnlMarcasProdLayout);
        PnlMarcasProdLayout.setHorizontalGroup(
            PnlMarcasProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMarcasProdLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        PnlMarcasProdLayout.setVerticalGroup(
            PnlMarcasProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMarcasProdLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlMarcasProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 240, 60));
        getContentPane().add(ImgMedidasProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, 90, 90));

        PnlMedidasProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlMedidasProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlMedidasProdMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Medidas de Productos");

        javax.swing.GroupLayout PnlMedidasProdLayout = new javax.swing.GroupLayout(PnlMedidasProd);
        PnlMedidasProd.setLayout(PnlMedidasProdLayout);
        PnlMedidasProdLayout.setHorizontalGroup(
            PnlMedidasProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMedidasProdLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        PnlMedidasProdLayout.setVerticalGroup(
            PnlMedidasProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMedidasProdLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        getContentPane().add(PnlMedidasProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 410, 250, 60));
        getContentPane().add(ImgFormasPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 80, 80));

        PnlFormasPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlFormasPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlFormasPagoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setText("Formas de Pago");

        javax.swing.GroupLayout PnlFormasPagoLayout = new javax.swing.GroupLayout(PnlFormasPago);
        PnlFormasPago.setLayout(PnlFormasPagoLayout);
        PnlFormasPagoLayout.setHorizontalGroup(
            PnlFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFormasPagoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        PnlFormasPagoLayout.setVerticalGroup(
            PnlFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFormasPagoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlFormasPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 190, 60));
        getContentPane().add(ImgFamiliaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 80, 80));

        PnlFamiliaProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlFamiliaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlFamiliaProdMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setText("Categorías/Familias Productos");

        javax.swing.GroupLayout PnlFamiliaProdLayout = new javax.swing.GroupLayout(PnlFamiliaProd);
        PnlFamiliaProd.setLayout(PnlFamiliaProdLayout);
        PnlFamiliaProdLayout.setHorizontalGroup(
            PnlFamiliaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFamiliaProdLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        PnlFamiliaProdLayout.setVerticalGroup(
            PnlFamiliaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFamiliaProdLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlFamiliaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 350, 60));
        getContentPane().add(ImgSeccionesProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 80, 80));

        PnlSeccionesProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlSeccionesProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlSeccionesProdMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel8.setText("Secciones de Productos");

        javax.swing.GroupLayout PnlSeccionesProdLayout = new javax.swing.GroupLayout(PnlSeccionesProd);
        PnlSeccionesProd.setLayout(PnlSeccionesProdLayout);
        PnlSeccionesProdLayout.setHorizontalGroup(
            PnlSeccionesProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSeccionesProdLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        PnlSeccionesProdLayout.setVerticalGroup(
            PnlSeccionesProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSeccionesProdLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlSeccionesProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 280, 60));
        getContentPane().add(ImgUsuariosDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 100, 80));

        PnlUsuariosDR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlUsuariosDR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlUsuariosDRMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel9.setText("Usuarios con derechos y");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel11.setText("restricciones");

        javax.swing.GroupLayout PnlUsuariosDRLayout = new javax.swing.GroupLayout(PnlUsuariosDR);
        PnlUsuariosDR.setLayout(PnlUsuariosDRLayout);
        PnlUsuariosDRLayout.setHorizontalGroup(
            PnlUsuariosDRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUsuariosDRLayout.createSequentialGroup()
                .addGroup(PnlUsuariosDRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnlUsuariosDRLayout.setVerticalGroup(
            PnlUsuariosDRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUsuariosDRLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(PnlUsuariosDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 280, 100));
        getContentPane().add(ImgSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 70, 70));

        PnlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlSalirMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setText("Salir");

        javax.swing.GroupLayout PnlSalirLayout = new javax.swing.GroupLayout(PnlSalir);
        PnlSalir.setLayout(PnlSalirLayout);
        PnlSalirLayout.setHorizontalGroup(
            PnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSalirLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        PnlSalirLayout.setVerticalGroup(
            PnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSalirLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PnlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 520, 70, 60));

        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1380, 30));
        getContentPane().add(ImgListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, 110));

        pnlVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVentasMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Ventas");

        javax.swing.GroupLayout pnlVentasLayout = new javax.swing.GroupLayout(pnlVentas);
        pnlVentas.setLayout(pnlVentasLayout);
        pnlVentasLayout.setHorizontalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnlVentasLayout.setVerticalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentasLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        getContentPane().add(pnlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 150, 50));
        getContentPane().add(imgVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 80, 80));
        getContentPane().add(imgCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 80, 80));

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel16.setText("Compras");

        pnlCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlComprasMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Compras");

        javax.swing.GroupLayout pnlComprasLayout = new javax.swing.GroupLayout(pnlCompras);
        pnlCompras.setLayout(pnlComprasLayout);
        pnlComprasLayout.setHorizontalGroup(
            pnlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnlComprasLayout.setVerticalGroup(
            pnlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComprasLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PnlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSalirMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_PnlSalirMouseClicked

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); //Guardar eje x y eje y       
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse); //codigo para poder mover la ventana del programa        // TODO add your handling code here:
    }//GEN-LAST:event_HeaderMouseDragged

    private void PnlFamiliaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlFamiliaProdMouseClicked
        Model.Classes.ExecuteCatProd();
        this.dispose();
    }//GEN-LAST:event_PnlFamiliaProdMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Model.Classes.ExecuteClients();
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void PnlFormasPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlFormasPagoMouseClicked
        Model.Classes.ExecuteMethodPayment();
        this.dispose();
    }//GEN-LAST:event_PnlFormasPagoMouseClicked

    private void PnlSeccionesProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSeccionesProdMouseClicked
        Model.Classes.ExecuteSectionProd();
        this.dispose();
    }//GEN-LAST:event_PnlSeccionesProdMouseClicked

    private void PnlMarcasProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlMarcasProdMouseClicked
        Model.Classes.ExecuteBrandProd();
        this.dispose();
    }//GEN-LAST:event_PnlMarcasProdMouseClicked

    private void PnlClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlClientesMouseClicked
        Model.Classes.ExecuteClients();
        this.dispose();
    }//GEN-LAST:event_PnlClientesMouseClicked

    private void PnlMedidasProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlMedidasProdMouseClicked
        Model.Classes.ExecuteMeasureProd();
        this.dispose();
    }//GEN-LAST:event_PnlMedidasProdMouseClicked

    private void PnlProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlProveedoresMouseClicked
        Model.Classes.ExecuteProviders();
        this.dispose();
    }//GEN-LAST:event_PnlProveedoresMouseClicked

    private void PnlProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlProductosMouseClicked
        Model.Classes.ExecuteProducts();
        this.dispose();
    }//GEN-LAST:event_PnlProductosMouseClicked

    private void PnlUsuariosDRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlUsuariosDRMouseClicked
        Model.Classes.ExecuteUsers();
        this.dispose();
    }//GEN-LAST:event_PnlUsuariosDRMouseClicked

    private void pnlVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVentasMouseClicked
        Model.Classes.ExecuteSales();
        this.dispose();
    }//GEN-LAST:event_pnlVentasMouseClicked

    private void pnlComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprasMouseClicked
        Model.Classes.ExecuteShopping();
        this.dispose();
    }//GEN-LAST:event_pnlComprasMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImgClientes;
    private javax.swing.JLabel ImgFamiliaProd;
    private javax.swing.JLabel ImgFormain;
    private javax.swing.JLabel ImgFormasPago;
    private javax.swing.JLabel ImgListado;
    private javax.swing.JLabel ImgMarcasProd;
    private javax.swing.JLabel ImgMedidasProd;
    private javax.swing.JLabel ImgProductos;
    private javax.swing.JLabel ImgProveedores;
    private javax.swing.JLabel ImgSalir;
    private javax.swing.JLabel ImgSeccionesProd;
    private javax.swing.JLabel ImgUsuariosDR;
    private javax.swing.JPanel PnlClientes;
    private javax.swing.JPanel PnlFamiliaProd;
    private javax.swing.JPanel PnlFormasPago;
    private javax.swing.JPanel PnlMarcasProd;
    private javax.swing.JPanel PnlMedidasProd;
    private javax.swing.JPanel PnlProductos;
    private javax.swing.JPanel PnlProveedores;
    private javax.swing.JPanel PnlSalir;
    private javax.swing.JPanel PnlSeccionesProd;
    private javax.swing.JPanel PnlUsuariosDR;
    private javax.swing.JLabel imgCompras;
    private javax.swing.JLabel imgVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlCompras;
    private javax.swing.JPanel pnlVentas;
    // End of variables declaration//GEN-END:variables
}