/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import javax.swing.JOptionPane;
import logic.AddImage;

/**
 *
 * @author serho
 */
public class FrmCatProd extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form FrmCatProd
     */
    public FrmCatProd() {
        initComponents();
        AddImage.SetImageLabel(imgSalir, "src/images/salir.png");
        AddImage.SetImageLabel(imgFamProd, "src/images/familias de productos.png");
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCatProds = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblCodCatProd = new javax.swing.JLabel();
        fldCodCatProd = new javax.swing.JTextField();
        lblNomCatProd = new javax.swing.JLabel();
        fldNomCatProd = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        imgSalir = new javax.swing.JLabel();
        imgFamProd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(956, 643));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCatProds.setFont(new java.awt.Font("Roboto Cn", 1, 48)); // NOI18N
        lblCatProds.setText("CATEGORÍAS O FAMILIAS DE PRODUCTOS");
        getContentPane().add(lblCatProds, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 640));

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        lblCodCatProd.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblCodCatProd.setText("Código de la categoría o familia de producto:");
        getContentPane().add(lblCodCatProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 40));

        fldCodCatProd.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        fldCodCatProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldCodCatProdActionPerformed(evt);
            }
        });
        getContentPane().add(fldCodCatProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 670, 50));

        lblNomCatProd.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblNomCatProd.setText("Nombre de la categoría o familia de producto:");
        getContentPane().add(lblNomCatProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, 40));

        fldNomCatProd.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        fldNomCatProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNomCatProdActionPerformed(evt);
            }
        });
        getContentPane().add(fldNomCatProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 670, 50));

        btnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 170, 80));

        btnModificar.setBackground(new java.awt.Color(255, 255, 153));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Modificar");

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 170, 80));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("Eliminar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
        );

        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 170, 80));

        imgSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSalirMouseClicked(evt);
            }
        });
        getContentPane().add(imgSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 100, 100));
        getContentPane().add(imgFamProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 140, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldCodCatProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldCodCatProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldCodCatProdActionPerformed

    private void fldNomCatProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNomCatProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNomCatProdActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        int op = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos registrados?", "Confirme los datos registrados", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void imgSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSalirMouseClicked
          this.dispose();
    }//GEN-LAST:event_imgSalirMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); //Guardar eje x y eje y       
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

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
            java.util.logging.Logger.getLogger(FrmCatProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCatProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JTextField fldCodCatProd;
    private javax.swing.JTextField fldNomCatProd;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgFamProd;
    private javax.swing.JLabel imgSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCatProds;
    private javax.swing.JLabel lblCodCatProd;
    private javax.swing.JLabel lblNomCatProd;
    // End of variables declaration//GEN-END:variables
}