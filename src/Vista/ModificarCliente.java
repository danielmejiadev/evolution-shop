
package Vista;

import Logica.LogicaCliente;
import Modelo.Cliente;
import javax.swing.JOptionPane;


public class ModificarCliente extends javax.swing.JDialog {

    private VistaAdministrador framePadre;
    private LogicaCliente lc = new LogicaCliente();
    private Cliente clienteModif;
    public ModificarCliente(VistaAdministrador parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        framePadre = parent;
        clienteModif = cliente;
        initComponents();
        this.setTitle("Modificar Cliente");
        this.setLocationRelativeTo(null);
        llenarCampos(cliente);
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
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 89, 205, -1));
        getContentPane().add(jTextFieldApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 115, 205, -1));
        getContentPane().add(jTextFieldDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 141, 205, -1));

        try {
            jFormattedTextFieldIdCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIdCliente.setFocusable(false);
        getContentPane().add(jFormattedTextFieldIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, 205, -1));
        getContentPane().add(jTextFieldCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 165, 205, -1));

        jFormattedTextFieldTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 191, 205, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre (s)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 92, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellido (s)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 118, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 168, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificación");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 220, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 255, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 255, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("MODIFICAR CLIENTE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 31, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -20, 760, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(modificar(this.clienteModif)){
            JOptionPane.showMessageDialog(rootPane, "Se ha modificado el Cliente con Exito.");
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se ha modificado el Cliente, verifique los valores ingresados");
        }
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public void llenarCampos(Cliente cliente){
        this.jTextFieldNombreCliente.setText(cliente.getNombrecliente());
        jTextFieldApellidoCliente.setText(cliente.getApellidoscliente());
        jTextFieldDireccionCliente.setText(cliente.getDireccion());
        jTextFieldCorreoCliente.setText(cliente.getCorreoelectronico());
        jFormattedTextFieldTelefonoCliente.setText(cliente.getTelefono());
        jFormattedTextFieldIdCliente.setText(cliente.getIdentificacioncliente());
    }
    
    public boolean modificar(Cliente cliente){
        boolean b=false;
         try{
            cliente.setNombrecliente(jTextFieldNombreCliente.getText());
            cliente.setApellidoscliente(jTextFieldApellidoCliente.getText());
            cliente.setCorreoelectronico(jTextFieldCorreoCliente.getText());
            cliente.setDireccion(jTextFieldDireccionCliente.getText());
            cliente.setTelefono(jFormattedTextFieldTelefonoCliente.getText());
       
                if(lc.validarCliente(cliente)){
                    lc.modificarCliente(cliente);
                    b=true;
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Errores al modificar el cliente");
            }
        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefonoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JTextField jTextFieldApellidoCliente;
    private javax.swing.JTextField jTextFieldCorreoCliente;
    private javax.swing.JTextField jTextFieldDireccionCliente;
    private javax.swing.JTextField jTextFieldNombreCliente;
    // End of variables declaration//GEN-END:variables
}
