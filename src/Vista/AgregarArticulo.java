
package Vista;

import Logica.LogicaProducto;
import Modelo.Producto;
import javax.swing.JOptionPane;


public class AgregarArticulo extends javax.swing.JDialog {

   private VistaAdministrador vv = new VistaAdministrador();
    public AgregarArticulo(VistaAdministrador parent, boolean modal) {
        super(parent, modal);
        vv = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSof t- Agregar Articulo");
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDescripcion = new javax.swing.JTextField();
        jComboBoxTalla = new javax.swing.JComboBox<>();
        jFormattedTextFieldCantidad = new javax.swing.JFormattedTextField();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jFormattedTextFieldValorVenta = new javax.swing.JFormattedTextField();
        jButtonAgregarArticuloNuevo = new javax.swing.JButton();
        jButtonCancelarOperacion = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonNuevaTalla = new javax.swing.JButton();
        jFormattedTextFieldIdProducto = new javax.swing.JFormattedTextField();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 91, 172, -1));

        jComboBoxTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(jComboBoxTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 118, 120, -1));
        getContentPane().add(jFormattedTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 146, 172, -1));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dynamo", "By Loko NY", "Monkey" }));
        getContentPane().add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 173, 121, -1));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 172, -1, -1));

        jFormattedTextFieldValorVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldValorVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 201, 127, -1));

        jButtonAgregarArticuloNuevo.setText("Agregar");
        jButtonAgregarArticuloNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarArticuloNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarArticuloNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 239, -1, -1));

        jButtonCancelarOperacion.setText("Cancelar");
        jButtonCancelarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarOperacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 239, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("AGREGAR ARTICULO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 18, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Referencia * ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 71, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripción *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Talla *");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 121, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 149, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Marca");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 176, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Precio/unidad (Valor venta)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 204, -1, -1));

        jButtonNuevaTalla.setText("+");
        jButtonNuevaTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaTallaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevaTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 117, -1, -1));
        getContentPane().add(jFormattedTextFieldIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 65, 172, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -110, 810, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = JOptionPane.showInputDialog("Ingrese el nombre de la nueva Marca");
        JOptionPane.showMessageDialog(rootPane, "La nueva marca "+ s +" se ha adicionado con éxito.");
        jComboBoxMarca.addItem(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonNuevaTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaTallaActionPerformed
        String s = JOptionPane.showInputDialog("Ingrese el nombre de la nueva Talla");
        JOptionPane.showMessageDialog(rootPane, "La nueva talla "+ s +" se ha adicionado con éxito.");
        jComboBoxTalla.addItem(s);
    }//GEN-LAST:event_jButtonNuevaTallaActionPerformed

    private void jButtonAgregarArticuloNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarArticuloNuevoActionPerformed
        try {
            
            Producto p = new Producto();
            p.setCantidadunidades(Integer.parseInt(jFormattedTextFieldCantidad.getText()));
            p.setDescripcion(jTextFieldDescripcion.getText());
            p.setIdproducto(Integer.parseInt(jFormattedTextFieldIdProducto.getText()));
            p.setMarca(jComboBoxMarca.getSelectedItem().toString());
            p.setPrecio(Integer.parseInt(jFormattedTextFieldValorVenta.getText()));
            p.setTalla(jComboBoxTalla.getSelectedItem().toString());
            LogicaProducto la = new LogicaProducto();
       
            if(la.registrarProducto(p)){
               JOptionPane.showMessageDialog(rootPane, "Articulo Agregado con éxito");
               this.setVisible(false);
                }
            } catch (Exception ex) {
           JOptionPane.showMessageDialog(rootPane, "Diligencie correctamente los campos");
           //Logger.getLogger(AgregarArticulo.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_jButtonAgregarArticuloNuevoActionPerformed

    private void jButtonCancelarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarOperacionActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Operación cancelada.");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarOperacionActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarArticuloNuevo;
    private javax.swing.JButton jButtonCancelarOperacion;
    private javax.swing.JButton jButtonNuevaTalla;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxTalla;
    private javax.swing.JFormattedTextField jFormattedTextFieldCantidad;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdProducto;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JTextField jTextFieldDescripcion;
    // End of variables declaration//GEN-END:variables
}
