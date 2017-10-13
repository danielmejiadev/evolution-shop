
package Vista;

import Logica.LogicaUsuario;
import Modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DetallesUsuario extends javax.swing.JDialog {

    private VistaAdministrador framePadre;
    
    public DetallesUsuario(VistaAdministrador parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        framePadre = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft - Agregar Usuario");
        llenarCampos(usuario);
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jTextFieldApellidoUsuario = new javax.swing.JTextField();
        jTextFieldDireccionUsuario = new javax.swing.JTextField();
        jFormattedTextFieldIdUsuario = new javax.swing.JFormattedTextField();
        jTextFieldLoginUsuario = new javax.swing.JTextField();
        jFormattedTextFieldTelefonoUsuario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jComboBoxEstadoUsuario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNombreUsuario.setFocusable(false);
        getContentPane().add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 89, 205, -1));

        jTextFieldApellidoUsuario.setFocusable(false);
        getContentPane().add(jTextFieldApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 115, 205, -1));

        jTextFieldDireccionUsuario.setFocusable(false);
        getContentPane().add(jTextFieldDireccionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 141, 205, -1));

        jFormattedTextFieldIdUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldIdUsuario.setFocusable(false);
        getContentPane().add(jFormattedTextFieldIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, 205, -1));

        jTextFieldLoginUsuario.setFocusable(false);
        getContentPane().add(jTextFieldLoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 165, 205, -1));

        jFormattedTextFieldTelefonoUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldTelefonoUsuario.setFocusable(false);
        getContentPane().add(jFormattedTextFieldTelefonoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 191, 205, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre (s)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 92, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellido (s) ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 118, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Login ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 168, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificación ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 220, -1, -1));

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 334, -1, -1));

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Administrador" }));
        jComboBoxTipoUsuario.setEnabled(false);
        jComboBoxTipoUsuario.setFocusable(false);
        getContentPane().add(jComboBoxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 296, 205, -1));

        jComboBoxEstadoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxEstadoUsuario.setEnabled(false);
        jComboBoxEstadoUsuario.setFocusable(false);
        getContentPane().add(jComboBoxEstadoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 269, 205, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tipo ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 296, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estado: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 269, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Contraseña  ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 246, -1, -1));

        jTextFieldContraseña.setFocusable(false);
        getContentPane().add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 243, 205, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("DETALLES USUARIO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 32, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -20, 810, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    public void llenarCampos(Usuario usuario){
        jTextFieldApellidoUsuario.setText(usuario.getApellidosusuario());
        jTextFieldContraseña.setText(usuario.getContraseña());
        jTextFieldDireccionUsuario.setText(usuario.getDireccion());
        jTextFieldLoginUsuario.setText(usuario.getLogin());
        jTextFieldNombreUsuario.setText(usuario.getNombreusuario());
        jFormattedTextFieldIdUsuario.setText(usuario.getIdentificacionusuario());
        jFormattedTextFieldTelefonoUsuario.setText(usuario.getTelefonousuario());
        String estado="Inactivo";
        if(usuario.getEstado()){
            estado="Activo";
        }
        jComboBoxEstadoUsuario.setSelectedItem(estado);
        jComboBoxTipoUsuario.setSelectedItem(usuario.getTipo());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JComboBox<String> jComboBoxEstadoUsuario;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdUsuario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefonoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JTextField jTextFieldApellidoUsuario;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldDireccionUsuario;
    private javax.swing.JTextField jTextFieldLoginUsuario;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
