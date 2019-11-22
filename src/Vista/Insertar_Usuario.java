/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlUsuario;
import Modelo.Imagen;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhonny Londoño G
 */
public class Insertar_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Insertar_Usuario
     */
    public Insertar_Usuario() {
        initComponents();
        
        int x  = jPanel1.getWidth();
        int y = jPanel1.getHeight();
        
        String archivo = "/img/fondo 3.png";
        
        Imagen img =  new Imagen(x, y, archivo);
        
        jPanel1.add(img);
        jPanel1.repaint();
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
        jLabel1 = new javax.swing.JLabel();
        Jidusuario = new javax.swing.JLabel();
        Tidusuario = new javax.swing.JTextField();
        Jusuario = new javax.swing.JLabel();
        Tusuario = new javax.swing.JTextField();
        Jcontraseña = new javax.swing.JLabel();
        Tcontrasenia = new javax.swing.JTextField();
        Jnombre1 = new javax.swing.JLabel();
        Tnombre1 = new javax.swing.JTextField();
        Jnombre2 = new javax.swing.JLabel();
        Tnombre2 = new javax.swing.JTextField();
        Japellido1 = new javax.swing.JLabel();
        Tapellido1 = new javax.swing.JTextField();
        Japellido2 = new javax.swing.JLabel();
        Tapellido2 = new javax.swing.JTextField();
        Jtelefono = new javax.swing.JLabel();
        Ttelefono = new javax.swing.JTextField();
        Jcorreo = new javax.swing.JLabel();
        Tcorreo = new javax.swing.JTextField();
        Jestatura = new javax.swing.JLabel();
        Testatura = new javax.swing.JTextField();
        Jpeso = new javax.swing.JLabel();
        Tpeso = new javax.swing.JTextField();
        Jedad = new javax.swing.JLabel();
        Tedad = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        Ir_a_Modificar_Usuario = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Insertar_Usuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Insertar los datos del usuario");

        Jidusuario.setText("IdUsaurio *");

        Jusuario.setText("Usuario *");
        Jusuario.setToolTipText("");

        Jcontraseña.setText("Contraseña *");

        Tcontrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcontraseniaActionPerformed(evt);
            }
        });

        Jnombre1.setText("Nombre 1 *");

        Jnombre2.setText("Nombre 2");

        Japellido1.setText("Apellido 1*");

        Japellido2.setText("Apellido 2");

        Jtelefono.setText("Telefono *");

        Jcorreo.setText("Correo *");
        Jcorreo.setToolTipText("");

        Tcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcorreoActionPerformed(evt);
            }
        });

        Jestatura.setText("Estatura * ");

        Jpeso.setText("Peso *");

        Jedad.setText("Edad *");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Ir_a_Modificar_Usuario.setText("Ir a Modificar Usuario");
        Ir_a_Modificar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_a_Modificar_UsuarioActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Insertar_Usuario.setText("Insertar Usuario");
        Insertar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insertar_UsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jnombre1)
                                    .addComponent(Jnombre2)
                                    .addComponent(Jcontraseña))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tapellido1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(Tnombre2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                                    .addComponent(Tnombre1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Japellido1)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jidusuario)
                                            .addComponent(Jusuario))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Tidusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(Tusuario))))
                                .addGap(132, 132, 132))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Insertar_Usuario)
                        .addGap(60, 60, 60)
                        .addComponent(Limpiar)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Japellido2)
                                .addGap(18, 18, 18)
                                .addComponent(Tapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jtelefono)
                                .addGap(18, 18, 18)
                                .addComponent(Ttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jcorreo)
                                .addGap(18, 18, 18)
                                .addComponent(Tcorreo)))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jestatura)
                                    .addComponent(Jpeso)
                                    .addComponent(Jedad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Testatura)
                                    .addComponent(Tpeso)
                                    .addComponent(Tedad)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Ir_a_Modificar_Usuario)
                                .addGap(39, 39, 39)
                                .addComponent(Volver)))
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jidusuario)
                    .addComponent(Tidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Japellido2)
                    .addComponent(Tapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jusuario)
                    .addComponent(Tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtelefono)
                    .addComponent(Ttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jcontraseña)
                    .addComponent(Jcorreo)
                    .addComponent(Tcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnombre1)
                    .addComponent(Tnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jestatura)
                    .addComponent(Testatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnombre2)
                    .addComponent(Tnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpeso)
                    .addComponent(Tpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Japellido1)
                    .addComponent(Tapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jedad)
                    .addComponent(Tedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(Ir_a_Modificar_Usuario)
                    .addComponent(Limpiar)
                    .addComponent(Insertar_Usuario))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcorreoActionPerformed

    private void Insertar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insertar_UsuarioActionPerformed
        
        
         try {
            String IdUsuario;
            String Usuario;
            String Contrasenia;
            String Nombre1;
            String Nombre2;
            String Apellido1;
            String Apellido2;
            String telefono;
            String Correo;
            double Estatura;
            double Peso;
            int Edad;

            IdUsuario = Tidusuario.getText();
            Usuario = Tusuario.getText();
            Contrasenia = Tcontrasenia.getText();
            Nombre1 = Tnombre1.getText();
            Nombre2 = Tnombre2.getText();
            Apellido1 = Tapellido1.getText();
            Apellido2 = Tapellido2.getText();
            telefono = Ttelefono.getText();
            Correo = Tcorreo.getText();
            Estatura = Double.parseDouble(Testatura.getText());
            Peso = Double.parseDouble(Tpeso.getText());
            Edad = Integer.parseInt(Tedad.getText());

            ControlUsuario cu = new ControlUsuario();
            Usuario u = new Usuario(IdUsuario, Usuario, Contrasenia, Nombre1, Nombre2, Apellido1, Apellido2, telefono, Correo, Estatura, Peso, Edad);
            boolean f = cu.insertarUsuario(u);

            if (f) {
                System.out.println("se inserto el usuario");
            } else {
                System.out.println("no se inserto el usuario");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insertar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_Insertar_UsuarioActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Tidusuario.setText("");
        Tusuario.setText("");
        Tnombre1.setText("");
        Tnombre2.setText("");
        Tcontrasenia.setText("");
        Tpeso.setText("");
        Tapellido1.setText("");
        Tapellido2.setText("");
        Ttelefono.setText("");
        Tcorreo.setText("");
        Testatura.setText("");
        Tedad.setText("");
        Tedad.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
       
        Main obj = new Main();
        obj.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_VolverActionPerformed

    private void Ir_a_Modificar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_a_Modificar_UsuarioActionPerformed
       
        Modificar_Usuario obj = new Modificar_Usuario();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Ir_a_Modificar_UsuarioActionPerformed

    private void TcontraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcontraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcontraseniaActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insertar_Usuario;
    private javax.swing.JButton Ir_a_Modificar_Usuario;
    private javax.swing.JLabel Japellido1;
    private javax.swing.JLabel Japellido2;
    private javax.swing.JLabel Jcontraseña;
    private javax.swing.JLabel Jcorreo;
    private javax.swing.JLabel Jedad;
    private javax.swing.JLabel Jestatura;
    private javax.swing.JLabel Jidusuario;
    private javax.swing.JLabel Jnombre1;
    private javax.swing.JLabel Jnombre2;
    private javax.swing.JLabel Jpeso;
    private javax.swing.JLabel Jtelefono;
    private javax.swing.JLabel Jusuario;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Tapellido1;
    private javax.swing.JTextField Tapellido2;
    private javax.swing.JTextField Tcontrasenia;
    private javax.swing.JTextField Tcorreo;
    private javax.swing.JTextField Tedad;
    private javax.swing.JTextField Testatura;
    private javax.swing.JTextField Tidusuario;
    private javax.swing.JTextField Tnombre1;
    private javax.swing.JTextField Tnombre2;
    private javax.swing.JTextField Tpeso;
    private javax.swing.JTextField Ttelefono;
    private javax.swing.JTextField Tusuario;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
