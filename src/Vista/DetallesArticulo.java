
package Vista;

import Modelo.Producto;


public class DetallesArticulo extends javax.swing.JDialog {

   private VistaAdministrador vv = new VistaAdministrador();
   
    public DetallesArticulo(VistaAdministrador parent, boolean modal, Producto producto) {
        super(parent, modal);
        vv = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft - Detalles Articulo");
        llenarCampos(producto);
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldReferenciaArticulo = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jComboBoxTalla = new javax.swing.JComboBox<>();
        jFormattedTextFieldCantidad = new javax.swing.JFormattedTextField();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jFormattedTextPrecio = new javax.swing.JFormattedTextField();
        jButtonAgregarArticuloNuevo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldReferenciaArticulo.setFocusable(false);
        getContentPane().add(jTextFieldReferenciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 65, 168, -1));

        jTextFieldDescripcion.setFocusable(false);
        getContentPane().add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 91, 168, -1));

        jComboBoxTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        jComboBoxTalla.setEnabled(false);
        jComboBoxTalla.setFocusable(false);
        getContentPane().add(jComboBoxTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 117, 168, -1));

        jFormattedTextFieldCantidad.setFocusable(false);
        getContentPane().add(jFormattedTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 143, 168, -1));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dynamo", "By Loko NY", "Monkey" }));
        jComboBoxMarca.setEnabled(false);
        jComboBoxMarca.setFocusable(false);
        getContentPane().add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 169, 168, -1));

        jFormattedTextPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextPrecio.setFocusable(false);
        getContentPane().add(jFormattedTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 195, 168, -1));

        jButtonAgregarArticuloNuevo.setText("Aceptar");
        jButtonAgregarArticuloNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarArticuloNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarArticuloNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 244, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("DETALLES ARTICULO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 18, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Referencia ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 68, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripción ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Talla ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 146, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Marca");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 172, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Precio/unidad ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 198, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -90, 810, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarArticuloNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarArticuloNuevoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAgregarArticuloNuevoActionPerformed

    public void llenarCampos(Producto producto){
        jTextFieldReferenciaArticulo.setText(producto.getIdproducto()+"");
        jTextFieldDescripcion.setText(producto.getDescripcion());
        jComboBoxTalla.setSelectedItem(producto.getTalla());
        jFormattedTextFieldCantidad.setText(producto.getCantidadunidades()+"");
        jComboBoxMarca.setSelectedItem(producto.getMarca());
        jFormattedTextPrecio.setText(producto.getPrecio()+"");
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarArticuloNuevo;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxTalla;
    private javax.swing.JFormattedTextField jFormattedTextFieldCantidad;
    private javax.swing.JFormattedTextField jFormattedTextPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldReferenciaArticulo;
    // End of variables declaration//GEN-END:variables
}
