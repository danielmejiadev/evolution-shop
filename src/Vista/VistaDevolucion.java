
package Vista;

import Logica.LogicaDevolucion;
import Logica.LogicaProducto;
import Logica.LogicaVenta;
import Logica.LogicaVentaProducto;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Venta;
import Modelo.Ventaproducto;
import Modelo.Devolucion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaDevolucion extends javax.swing.JDialog {

    private VistaVendedor framePadre;
    private LogicaVentaProducto lvp = new LogicaVentaProducto();
    private LogicaVenta lv = new LogicaVenta();
    private LogicaProducto lp = new LogicaProducto();
    private LogicaDevolucion ld = new LogicaDevolucion();
    private Venta venta;
    private Producto producto;
    private List<Devolucion> listaDevoluciones;
    private Devolucion devolucion = new Devolucion();
    private int ID_DEVOLUCION;
    private Usuario vendedorActual;
    
    
    public VistaDevolucion(VistaVendedor parent, boolean modal, Usuario vendedor)
    {
        super(parent, modal);
        framePadre = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft - Devolución");
        vendedorActual = vendedor;
        listaDevoluciones = ld.buscarDevoluciones();
        ID_DEVOLUCION = listaDevoluciones.size();
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelarDevolucion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRegistrarDevolucion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldNumeroFactura = new javax.swing.JFormattedTextField();
        jFormattedTextFieldReferenciaArticulo = new javax.swing.JFormattedTextField();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarDevolucion.setText("Cancelar");
        jButtonCancelarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarDevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 165, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("No. Factura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 92, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Referencia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 130, -1, -1));

        jButtonRegistrarDevolucion.setText("Aceptar");
        jButtonRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarDevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 165, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("DEVOLUCIÓN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 33, -1, -1));

        jFormattedTextFieldNumeroFactura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldNumeroFacturaFocusGained(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 89, 142, -1));

        jFormattedTextFieldReferenciaArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldReferenciaArticuloFocusGained(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldReferenciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 127, 142, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -20, 770, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarDevolucionActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Ha cancelado la devolución");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarDevolucionActionPerformed

    private void jButtonRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarDevolucionActionPerformed
      
        if(validarDevolucion() && JOptionPane.showConfirmDialog(rootPane, "Confirme que desea devolver el"
                + "siguiente producto: \nDescripción: "+ producto.getDescripcion()+""
                + "\nRef: "+ producto.getIdproducto()+""
                + "\nTalla: "+producto.getTalla()+""
                + "\nPrecio: "+producto.getPrecio()+""
                + "\nFactura No. "+venta.getIdventa())==0)
        {
          ID_DEVOLUCION++;
          
          //Creando el objeto Devolución, guardandolo en la bd 7 actualizando el inventario
          devolucion.setIddevolucion(ID_DEVOLUCION);
          devolucion.setFecha(new Date());
          devolucion.setIdentificacionusuario(vendedorActual);
          devolucion.setIdproducto(producto);
          devolucion.setIdventa(venta);
          
           try {
               ld.crear(devolucion);
               producto.setCantidadunidades(producto.getCantidadunidades()+1); 
               lp.actualizar(producto);
               devolucion.setIdproducto(producto);
               ld.actualizarDevolucion(devolucion);
               JOptionPane.showMessageDialog(rootPane, "Devolución realizada con EXITO."); 
               this.setVisible(false);
           } catch (Exception ex) {
               Logger.getLogger(VistaDevolucion.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       }
        
    }//GEN-LAST:event_jButtonRegistrarDevolucionActionPerformed

    private void jFormattedTextFieldNumeroFacturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumeroFacturaFocusGained
        jFormattedTextFieldNumeroFactura.setText("");    
    }//GEN-LAST:event_jFormattedTextFieldNumeroFacturaFocusGained

    private void jFormattedTextFieldReferenciaArticuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldReferenciaArticuloFocusGained
        jFormattedTextFieldReferenciaArticulo.setText("");
    }//GEN-LAST:event_jFormattedTextFieldReferenciaArticuloFocusGained

    public boolean validarDevolucion(){
        boolean b = false;
        Integer v=0;
        Integer p=0;
        jFormattedTextFieldNumeroFactura.setBackground(Color.white);
        jFormattedTextFieldReferenciaArticulo.setBackground(Color.white);
        try{
            v = Integer.parseInt(jFormattedTextFieldNumeroFactura.getText());
            p = Integer.parseInt(jFormattedTextFieldReferenciaArticulo.getText());
            
            if(lv.consultarVenta(v) == null)
            {
            JOptionPane.showMessageDialog(rootPane, "No se encuentra la factura de número " + v);
            jFormattedTextFieldNumeroFactura.setBackground(Color.red);
            }else 
            {
                if(lp.consultarProducto(p)== null)
                {
                    JOptionPane.showMessageDialog(rootPane, "No se encuentra el articulo de referencia " + p);
                    jFormattedTextFieldReferenciaArticulo.setBackground(Color.red);
                }else
                {
                    venta = lv.consultarVenta(v);
                    producto = lp.consultarProducto(p);
                    List<Ventaproducto> listaVentaProducto = venta.getVentaproductoList();
                    for (int i = 0; i < listaVentaProducto.size(); i++) 
                    {
                        if(listaVentaProducto.get(i).getProducto().equals(producto))
                        {
                            b = true;
                        }
                    }
                    if(!b)
                    {
                       JOptionPane.showMessageDialog(rootPane, "El producto de referencia "+ p+""
                               + " no se vendió en la factura No. "+ v);
                       jFormattedTextFieldReferenciaArticulo.setBackground(Color.red);
                       jFormattedTextFieldNumeroFactura.setBackground(Color.red);
                    }
                }
        }
        }catch(NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(rootPane, "Datos vacíos o erroneos");
            jFormattedTextFieldNumeroFactura.setText("");
            jFormattedTextFieldReferenciaArticulo.setText("");
        }
        
        return b;
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarDevolucion;
    private javax.swing.JButton jButtonRegistrarDevolucion;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumeroFactura;
    private javax.swing.JFormattedTextField jFormattedTextFieldReferenciaArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo2;
    // End of variables declaration//GEN-END:variables
}
