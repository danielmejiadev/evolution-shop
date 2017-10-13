
package Vista;

import Logica.LogicaCliente;
import Modelo.Cliente;
import javax.swing.JOptionPane;


public class AgregarCliente extends javax.swing.JDialog {

    private VistaAdministrador framePadre;
    
    public AgregarCliente(VistaAdministrador parent, boolean modal) {
        super(parent, modal);
        framePadre = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft - Agregar Cliente");
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldApellidoCliente = new javax.swing.JTextField();
        jTextFieldDireccionCliente = new javax.swing.JTextField();
        jFormattedTextFieldIdCliente = new javax.swing.JFormattedTextField();
        jTextFieldCorreoCliente = new javax.swing.JTextField();
        jFormattedTextFieldTelefonoCliente = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 89, 205, -1));
        getContentPane().add(jTextFieldApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 115, 205, -1));
        getContentPane().add(jTextFieldDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 141, 205, -1));

        jFormattedTextFieldIdCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, 205, -1));
        getContentPane().add(jTextFieldCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 165, 205, -1));

        jFormattedTextFieldTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 191, 205, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre (s)  *");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 92, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellido (s)  *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 118, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("E-mail  *");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 168, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificación  *");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 220, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 273, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 273, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("*  Campos obligatorios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 248, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("AGREGAR CLIENTE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 42, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -80, 810, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Cliente c = new Cliente();
        c.setNombrecliente(jTextFieldNombreCliente.getText());
        c.setApellidoscliente(jTextFieldApellidoCliente.getText());
        c.setCorreoelectronico(jTextFieldCorreoCliente.getText());
        c.setDireccion(jTextFieldDireccionCliente.getText());
        c.setTelefono(jFormattedTextFieldTelefonoCliente.getText());
        c.setIdentificacioncliente(jFormattedTextFieldIdCliente.getText());
        
       LogicaCliente lc = new LogicaCliente();
        try {
            
            if(lc.validarCliente(c)){
                lc.registrar(c);
                JOptionPane.showMessageDialog(rootPane, "Cliente creado:"
                + "\nNombre: " + jTextFieldNombreCliente.getText()
                + "\nApellido:  " + jTextFieldApellidoCliente.getText()
                + "\nIdentificacion:  " + jFormattedTextFieldIdCliente.getText()
                + "\nTelefono:  " + jFormattedTextFieldTelefonoCliente.getText()
                + "\nDireccion:  " + jTextFieldDireccionCliente.getText()
                + "\nCorreo:  " + jTextFieldCorreoCliente.getText());
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Por favor diligencie bien los datos");
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Por favor diligencie bien los datos");
            //Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefonoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JTextField jTextFieldApellidoCliente;
    private javax.swing.JTextField jTextFieldCorreoCliente;
    private javax.swing.JTextField jTextFieldDireccionCliente;
    private javax.swing.JTextField jTextFieldNombreCliente;
    // End of variables declaration//GEN-END:variables
}
