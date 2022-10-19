/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import conections.ConnectionSQL;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import logic.AddImage;
import logic.Classes;

/**
 *
 * @author Esdras Abel Sapón Díaz
 */
public class FrmLogin extends javax.swing.JFrame {

    private int intentos = 0;

 

    int xMouse, yMouse;
    

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
        AddImage.SetImageLabel(lblImage1, "src/images/admin2.jpg");
        AddImage.SetImageLabel(lblIcon, "src/images/formain.png");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage1 = new javax.swing.JLabel();
        jPanelBlue = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        fldUsuario = new javax.swing.JTextField();
        sptUsuario = new javax.swing.JSeparator();
        lblUsuario1 = new javax.swing.JLabel();
        fldContrasenia = new javax.swing.JPasswordField();
        botonSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage1.setToolTipText("");
        getContentPane().add(lblImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 0, 260, 650));

        jPanelBlue.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 650));

        lblIniciarSesion.setFont(new java.awt.Font("Roboto Cn", 1, 48)); // NOI18N
        lblIniciarSesion.setText("Iniciar Sesión");
        lblIniciarSesion.setToolTipText("");
        getContentPane().add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 346, 50));

        lblContrasenia.setFont(new java.awt.Font("Roboto Bk", 1, 30)); // NOI18N
        lblContrasenia.setText("Contraseña:");
        getContentPane().add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        fldUsuario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        fldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        fldUsuario.setText("Ingrese su nombre de usuario...");
        fldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fldUsuarioMousePressed(evt);
            }
        });
        fldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(fldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 540, 40));

        sptUsuario.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(sptUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 540, 20));

        lblUsuario1.setFont(new java.awt.Font("Roboto Bk", 1, 30)); // NOI18N
        lblUsuario1.setText("Usuario:");
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        fldContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fldContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        fldContrasenia.setText("********");
        fldContrasenia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fldContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fldContraseniaMousePressed(evt);
            }
        });
        getContentPane().add(fldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 540, 40));

        botonSalir.setBackground(new java.awt.Color(255, 102, 102));
        botonSalir.setForeground(new java.awt.Color(102, 102, 255));
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalirMouseExited(evt);
            }
        });

        lblSalir.setBackground(new java.awt.Color(0, 0, 0));
        lblSalir.setFont(new java.awt.Font("Roboto Cn", 1, 24)); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.setToolTipText("");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonSalirLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblSalir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 200, 80));

        botonIngresar.setBackground(new java.awt.Color(153, 255, 153));
        botonIngresar.setForeground(new java.awt.Color(102, 102, 255));
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIngresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIngresarMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 24)); // NOI18N
        jLabel2.setText("Ingresar");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout botonIngresarLayout = new javax.swing.GroupLayout(botonIngresar);
        botonIngresar.setLayout(botonIngresarLayout);
        botonIngresarLayout.setHorizontalGroup(
            botonIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonIngresarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        botonIngresarLayout.setVerticalGroup(
            botonIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonIngresarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 200, 80));

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
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 306, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candado.png"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUsuarioActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        //poder guardar los ejes x e y del mouse.
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse); //codigo para poder mover la ventana del programa
    }//GEN-LAST:event_headerMouseDragged

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0); //salir del programa cuando se le de al boton salir
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseEntered
        botonIngresar.setBackground(Color.green); //color verde a boton ingresar cuando el mouse se coloque arriba
    }//GEN-LAST:event_botonIngresarMouseEntered

    private void botonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseExited
        botonIngresar.setBackground(new Color(153, 255, 153)); //color original del boton ingresar
    }//GEN-LAST:event_botonIngresarMouseExited

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setBackground(Color.red); //color rojo a boton salir cuando el mouse se coloque arriba
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setBackground(new Color(255, 102, 102)); //color original a boton salir
    }//GEN-LAST:event_botonSalirMouseExited

    private void fldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fldUsuarioMousePressed
        if (fldUsuario.getText().equals("Ingrese su nombre de usuario...")) {
            fldUsuario.setText("");
            fldUsuario.setForeground(Color.black);
        }
        if (String.valueOf(fldContrasenia.getPassword()).equals("********")) {
            fldContrasenia.setText("********");
            fldContrasenia.setForeground(new Color(204, 204, 204));
        } //codigo para arreglar el error de la letra de usuario
    }//GEN-LAST:event_fldUsuarioMousePressed

    private void fldContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fldContraseniaMousePressed
        if (String.valueOf(fldContrasenia.getPassword()).equals("********")) {
            fldContrasenia.setText("");
            fldContrasenia.setForeground(Color.black);
        }
        if (fldUsuario.getText().isEmpty()) {
            fldUsuario.setText("Ingrese su nombre de usuario...");
            fldUsuario.setForeground(new Color(204, 204, 204));
        } //codigo para arreglar el error de la letra de contraseña
        
        //Te amo mi princesa Ashley <3


    }//GEN-LAST:event_fldContraseniaMousePressed

    private void botonIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMousePressed
        LoginUser();
    }//GEN-LAST:event_botonIngresarMousePressed

    private void LoginUser() {

        int resultado = 0;
        String password = String.valueOf(fldContrasenia.getPassword()); //dar valor de nuestro field contraseña
        String user = fldUsuario.getText(); //dar el valor de nuestro field Usuario
        String SQL = "select * from user where user='" + user + "' and password='" + password + "'";

        try {
            Statement st = ConnectionSQL.getConnectionSQL().Conexion().createStatement();
            ResultSet rs = st.executeQuery(SQL);

            if (rs.next()) {
                resultado = 1;

                if (resultado == 1) {
                    Classes.ExecuteMenuOptions();
                    JOptionPane.showMessageDialog(null, "Datos correctos. Bienvenido al sistema Formain");
                    this.dispose();
                }

            } else {
                
                JOptionPane.showMessageDialog(null, "Error, el usuario o contraseña son incorrectos...");
                intentos++;

                if (intentos == 3) {
                    JOptionPane.showMessageDialog(null, "Sus datos fueron incorrectos, se ha cerrado el programa por seguridad");
                    this.dispose();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonIngresar;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JPasswordField fldContrasenia;
    private javax.swing.JTextField fldUsuario;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JSeparator sptUsuario;
    // End of variables declaration//GEN-END:variables
}
