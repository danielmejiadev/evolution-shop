
package Vista;

import Logica.LogicaProducto;
import Modelo.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ModificarArticulo extends javax.swing.JDialog {

    private VistaAdministrador vv;
    private LogicaProducto lp = new LogicaProducto();
    private Producto productomodif;
    
    public ModificarArticulo(VistaAdministrador parent, boolean modal, Producto producto) {
        super(parent, modal);
        vv = parent;
        productomodif = producto;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft - Modificar Articulo");
        llenarCampos(producto);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldReferenciaArticulo = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTalla = new javax.swing.JComboBox<String>();
        jFormattedTextFieldCantidadActual = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldValorVenta = new javax.swing.JFormattedTextField();
        jComboBoxMarcaModif = new javax.swing.JComboBox<String>();
        jButtonModifrArticulo = new javax.swing.JButton();
        jButtonCancelarOperacion = new javax.swing.JButton();
        jFormattedTextFieldCantiAgregar = new javax.swing.JFormattedTextField();
        jButtonAgregarCantidad = new javax.swing.JButton();
        jComboBoxTallaNueva = new javax.swing.JComboBox<String>();
        jComboBoxMarcaModifNueva = new javax.swing.JComboBox<String>();
        jFormattedTextFieldValorVentaNueva = new javax.swing.JFormattedTextField();
        jTextFieldDescripcionNueva = new javax.swing.JTextField();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("MODIFICAR ARTICULO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 15, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Referencia * ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, -1, -1));

        jTextFieldReferenciaArticulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldReferenciaArticulo.setEnabled(false);
        getContentPane().add(jTextFieldReferenciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 62, 293, -1));

        jTextFieldDescripcion.setEditable(false);
        jTextFieldDescripcion.setFocusable(false);
        getContentPane().add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 88, 132, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripción *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 91, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Talla *");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 117, -1, -1));

        jComboBoxTalla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        jComboBoxTalla.setEnabled(false);
        jComboBoxTalla.setFocusable(false);
        getContentPane().add(jComboBoxTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 114, 132, -1));

        jFormattedTextFieldCantidadActual.setText("0");
        jFormattedTextFieldCantidadActual.setEnabled(false);
        getContentPane().add(jFormattedTextFieldCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 140, 132, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 143, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Marca");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 172, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Precio/u");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 198, -1, -1));

        try {
            jFormattedTextFieldValorVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldValorVenta.setFocusable(false);
        getContentPane().add(jFormattedTextFieldValorVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 195, 132, -1));

        jComboBoxMarcaModif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dynamo", "By Loko NY", "Monkey" }));
        jComboBoxMarcaModif.setEnabled(false);
        jComboBoxMarcaModif.setFocusable(false);
        getContentPane().add(jComboBoxMarcaModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 169, 132, -1));

        jButtonModifrArticulo.setText("Agregar");
        jButtonModifrArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifrArticuloActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModifrArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 246, -1, -1));

        jButtonCancelarOperacion.setText("Cancelar");
        jButtonCancelarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarOperacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 246, -1, -1));

        jFormattedTextFieldCantiAgregar.setText("0");
        jFormattedTextFieldCantiAgregar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCantiAgregarFocusGained(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCantiAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 140, 100, -1));

        jButtonAgregarCantidad.setText("+");
        jButtonAgregarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 140, -1, -1));

        jComboBoxTallaNueva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        jComboBoxTallaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTallaNuevaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTallaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 114, 151, -1));

        jComboBoxMarcaModifNueva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dynamo", "By Loko NY", "Monkey" }));
        getContentPane().add(jComboBoxMarcaModifNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 169, 151, -1));

        jFormattedTextFieldValorVentaNueva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldValorVentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 195, 151, -1));
        getContentPane().add(jTextFieldDescripcionNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 88, 151, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -20, 770, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModifrArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifrArticuloActionPerformed
        try {
            if(modificar()){
                JOptionPane.showMessageDialog(rootPane, "Articulo modificado con éxito.");
                this.setVisible(false);
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Articulo no modificado.");
            }
        } catch (Exception ex) {
            Logger.getLogger(ModificarArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModifrArticuloActionPerformed

    private void jButtonCancelarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarOperacionActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarOperacionActionPerformed

    private void jButtonAgregarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCantidadActionPerformed
        try{
            int a = Integer.parseInt(jFormattedTextFieldCantiAgregar.getText());
            int b = productomodif.getCantidadunidades();
            if((a+b) < 0){ 
                JOptionPane.showMessageDialog(rootPane, "La cantidad de artículos que desea dar de baja del inventario es mayor al "
                        + "saldo actual. ");
            }else{
                productomodif.setCantidadunidades((a+b));
                jFormattedTextFieldCantiAgregar.setText((a+b)+"");
                jButtonModifrArticulo.setEnabled(true);
                jFormattedTextFieldCantiAgregar.setFocusable(false);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Ingrese una Cantidad válida.");
        }
    }//GEN-LAST:event_jButtonAgregarCantidadActionPerformed

    private void jFormattedTextFieldCantiAgregarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCantiAgregarFocusGained
        jButtonModifrArticulo.setEnabled(false);
        jFormattedTextFieldCantiAgregar.setText("");
    }//GEN-LAST:event_jFormattedTextFieldCantiAgregarFocusGained

    private void jComboBoxTallaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTallaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTallaNuevaActionPerformed

    public void llenarCampos(Producto producto){
        jTextFieldReferenciaArticulo.setText(producto.getIdproducto()+"");
        jTextFieldDescripcion.setText(producto.getDescripcion());
        jComboBoxTalla.setSelectedItem(producto.getTalla());
        jFormattedTextFieldCantidadActual.setText(producto.getCantidadunidades()+"");
        jComboBoxTalla.setSelectedItem(producto.getMarca());
        jFormattedTextFieldValorVenta.setText(producto.getPrecio()+"");
        
        //llenando lso campos que se pueden modificar
        jTextFieldDescripcionNueva.setText(producto.getDescripcion());
        jComboBoxTallaNueva.setSelectedItem(producto.getTalla());
        jComboBoxTallaNueva.setSelectedItem(producto.getMarca());
        jFormattedTextFieldValorVentaNueva.setText(producto.getPrecio()+"");
    }
    
    public boolean modificar() throws Exception
    {
        boolean b=false;
        try{
            productomodif.setDescripcion(jTextFieldDescripcionNueva.getText());
            productomodif.setMarca(jComboBoxMarcaModifNueva.getSelectedItem().toString());
            productomodif.setPrecio(Math.abs(Integer.parseInt(jFormattedTextFieldValorVentaNueva.getText().trim())));
            productomodif.setTalla(jComboBoxTallaNueva.getSelectedItem().toString());
            lp.actualizar(productomodif);
            b=true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Valores vacíos o erroneos.");
        }
        
        return b;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCantidad;
    private javax.swing.JButton jButtonCancelarOperacion;
    private javax.swing.JButton jButtonModifrArticulo;
    private javax.swing.JComboBox<String> jComboBoxMarcaModif;
    private javax.swing.JComboBox<String> jComboBoxMarcaModifNueva;
    private javax.swing.JComboBox<String> jComboBoxTalla;
    private javax.swing.JComboBox<String> jComboBoxTallaNueva;
    private javax.swing.JFormattedTextField jFormattedTextFieldCantiAgregar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCantidadActual;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorVenta;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorVentaNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDescripcionNueva;
    private javax.swing.JTextField jTextFieldReferenciaArticulo;
    // End of variables declaration//GEN-END:variables
}
