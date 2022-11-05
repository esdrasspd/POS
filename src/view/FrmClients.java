
package view;

import Model.DeleteData;
import Model.InsertData;
import Model.ShowData;
import Model.UpdateData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Classes;

/**
 *
 * @author Esdras Abel Sapón Díaz
 */
public class FrmClients extends javax.swing.JFrame {
    
    private int xMouse, yMouse;
    
    private List<String> nombreColumnas = new ArrayList<>();
    private List<String> interrogaciones = new ArrayList<>();
    
    private String nombreTabla = "clients";
    private List<String> column = new ArrayList<>();
    private List<String> campos = new ArrayList<>();
    private String id;
    
    private String buscar = "";
    private String campoBuscar = "nombre";

    
    public FrmClients() {
        initComponents();
        
        column.add("Id");
        column.add("Nombre Usuario");
        column.add("NIT");
        column.add("Dirección");
        column.add("Teléfono");
        
        nombreColumnas.add("nombre");
        nombreColumnas.add("nit");
        nombreColumnas.add("direccion");
        nombreColumnas.add("telefono");
        
        Model.AddImage.SetImageLabel(btnSalir, "src/images/atras.png");
        
        mostrarDatos();
        
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCodCatProd = new javax.swing.JLabel();
        lblCodCatProd1 = new javax.swing.JLabel();
        fldAddress = new javax.swing.JTextField();
        lblCodCatProd2 = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        lblCodCatProd3 = new javax.swing.JLabel();
        fldNIT = new javax.swing.JTextField();
        lblCodCatProd4 = new javax.swing.JLabel();
        fldTel = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fldBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1442, 625));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblTitle.setFont(new java.awt.Font("Roboto Cn", 1, 48)); // NOI18N
        lblTitle.setText("CLIENTES");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1100, 420));

        lblCodCatProd.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCodCatProd.setText("Id seleccionado:");
        getContentPane().add(lblCodCatProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, -1, 40));

        lblCodCatProd1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCodCatProd1.setText("NIT:");
        getContentPane().add(lblCodCatProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, -1, 30));

        fldAddress.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        fldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddressActionPerformed(evt);
            }
        });
        getContentPane().add(fldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 410, 260, 50));

        lblCodCatProd2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCodCatProd2.setText("Nombre:");
        getContentPane().add(lblCodCatProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, -1, 30));

        fldName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        fldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNameActionPerformed(evt);
            }
        });
        getContentPane().add(fldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 120, 260, 50));

        lblCodCatProd3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCodCatProd3.setText("Dirección:");
        getContentPane().add(lblCodCatProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 380, -1, 30));

        fldNIT.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        fldNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNITActionPerformed(evt);
            }
        });
        getContentPane().add(fldNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 210, 260, 50));

        lblCodCatProd4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCodCatProd4.setText("Teléfono:");
        getContentPane().add(lblCodCatProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 280, -1, 30));

        fldTel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        fldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldTelActionPerformed(evt);
            }
        });
        getContentPane().add(fldTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 310, 260, 50));

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
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 255, 51));
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

        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 170, 80));

        btnModificar.setBackground(new java.awt.Color(255, 255, 51));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("Modificar");

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(31, 31, 31))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
        );

        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 170, 80));

        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 190, 100));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );

        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 170, 80));

        txtId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 40, 60, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setText("Buscar por nombre del cliente:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, -1, -1));

        fldBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldBuscarActionPerformed(evt);
            }
        });
        fldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fldBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(fldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 210, 30));

        btnBuscar.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 570, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddressActionPerformed

    private void fldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNameActionPerformed

    private void fldNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNITActionPerformed

    private void fldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldTelActionPerformed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); //Guardar eje x y eje y
    }//GEN-LAST:event_headerMousePressed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        agregarCampos();

        int op = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos registrados?", "Confirme los datos registrados",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); //preguntarle si quiere guardar
        if(op == 0)
        {
            InsertData.getInsertData().insertarDatos(nombreTabla, interrogaciones, column, nombreColumnas, campos); //insertar datos
            vaciarCampos();
            mostrarDatos();
        }

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        agregarCampos();
        int op = JOptionPane.showConfirmDialog(null, "¿Desea actualizar los datos?", "Confirme si desea eliminar", 
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(op == 0){
            UpdateData.getUpdateData().actualizarDatos(nombreTabla, nombreColumnas, campos, "id", id);
        vaciarCampos();
        mostrarDatos();
        }
        
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        Classes.ExecuteMenuOptions();
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        //Eliminar datos

        int op = JOptionPane.showConfirmDialog(null, "¿Desea eliminar los datos?", "Confirme si desea eliminar",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(op == 0)
        {
            DeleteData.getDeleteData().eliminarTablaCod(nombreTabla, "id", id);
            vaciarCampos();
            mostrarDatos();
        }

    }//GEN-LAST:event_btnEliminarMouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int fila = jTable1.getSelectedRow();
        if(fila == -1 ) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún dato");
        }
        else{
            id = jTable1.getValueAt(fila, 0).toString();
            String nombre = (String)jTable1.getValueAt(fila, 1);
            String nit = (String)jTable1.getValueAt(fila, 2);
            String direccion = (String)jTable1.getValueAt(fila, 3).toString();
            String telefono = (String)jTable1.getValueAt(fila, 4).toString();
            txtId.setText(""+id);
            fldName.setText(nombre);
            fldNIT.setText(nit);
            fldAddress.setText(direccion);
            fldTel.setText(telefono);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void fldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldBuscarActionPerformed

    }//GEN-LAST:event_fldBuscarActionPerformed

    private void fldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldBuscarKeyReleased
        if(fldBuscar.getText().trim().equals("")){
            mostrarDatos();
        }
    }//GEN-LAST:event_fldBuscarKeyReleased

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscar = fldBuscar.getText();

        mostrarDatos();
    }//GEN-LAST:event_btnBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClients().setVisible(true);
            }
        });
    }
    
    private void agregarCampos(){
        campos.add(fldName.getText());
        campos.add(fldNIT.getText());
        campos.add(fldAddress.getText());
        campos.add(fldTel.getText());
    }
    
    private void vaciarCampos(){
        txtId.setText(null);
        fldName.setText(null);
        fldNIT.setText(null);
        fldAddress.setText(null);
        fldTel.setText(null);
    }
    
    private void mostrarDatos() {
        ShowData.getShowData().mostrarDatos(nombreTabla, jTable1, 5, column, buscar, campoBuscar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JTextField fldAddress;
    private javax.swing.JTextField fldBuscar;
    private javax.swing.JTextField fldNIT;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldTel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodCatProd;
    private javax.swing.JLabel lblCodCatProd1;
    private javax.swing.JLabel lblCodCatProd2;
    private javax.swing.JLabel lblCodCatProd3;
    private javax.swing.JLabel lblCodCatProd4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
