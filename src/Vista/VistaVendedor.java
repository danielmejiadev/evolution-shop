
package Vista;

import Logica.LogicaCliente;
import Logica.LogicaProducto;
import Logica.LogicaUsuario;
import Logica.LogicaVenta;
import Logica.LogicaVentaProducto;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Venta;
import Modelo.Ventaproducto;
import Modelo.VentaproductoPK;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaVendedor extends javax.swing.JFrame{
    
    private VistaAdministrador va;// = new VistaAdministrador();
    private LogicaUsuario lu = new LogicaUsuario();
    private LogicaCliente lc = new LogicaCliente();
    private LogicaProducto lp = new LogicaProducto();
    private LogicaVentaProducto lvp = new LogicaVentaProducto();
    private LogicaVenta lv = new LogicaVenta();
    private List<Usuario> listaUsuarios;// = lu.consultarUsuarios();
    private List<Producto> listaProductos;// =lp.consultarProductos();
    private List<Producto> listaProductosVenta = new ArrayList<>(); //Almacena de forma temporal los productos de una venta
    private List<Integer> listaCantidades = new ArrayList<>(); //Almacena de forma temporal la cantidad de productos que se van a vender en una determinada venta
    private List<Venta> listaVentas;// = lv.consultarVentas(); //
    private List<Ventaproducto> listaVentaProducto = new ArrayList<>();
    private int ID_VENTA;
    private Usuario usuarioActual = new Usuario();
    
    public VistaVendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft-Vendedor");
        //cargarVendedores();
        //ID_VENTA = (listaVentas.size());
        this.setResizable(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        jPanelFactura = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jComboBoxVendedores = new javax.swing.JComboBox<String>();
        jButtonLoguearVendedor = new javax.swing.JButton();
        jButtonDevolucion = new javax.swing.JButton();
        jButtonValidarCliente = new javax.swing.JButton();
        jButtonIngresarArticuloFactura = new javax.swing.JButton();
        jButtonAgrearCliente = new javax.swing.JButton();
        jPasswordFieldPinVendedor = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaFactura = new javax.swing.JTable();
        jButtonImprimir = new javax.swing.JButton();
        jButtonCancelarFactura = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextFieldReferenciaArticulo = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCantidadArticulos = new javax.swing.JFormattedTextField();
        jFormattedTextFieldIdCliente = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldDescuento1 = new javax.swing.JFormattedTextField();
        jLabelFondo = new javax.swing.JLabel();
        jPanelInventarioVendedor = new javax.swing.JPanel();
        jButtonSalirDeInventario = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldReferenciaArticuloAdmin = new javax.swing.JTextField();
        jLabelReferenciaArticulo = new javax.swing.JLabel();
        jLabelDescripcionArticulo = new javax.swing.JLabel();
        jTextFieldDescripcionArticuloAdmin = new javax.swing.JTextField();
        jComboBoxTallasAdmin = new javax.swing.JComboBox<String>();
        jLabelTallaArticulo = new javax.swing.JLabel();
        jFormattedTextFieldMinPrecioAdmin = new javax.swing.JFormattedTextField();
        jFormattedTextFieldMaxPrecioAdmin = new javax.swing.JFormattedTextField();
        jButtonBúsquedaArticulosAdmin = new javax.swing.JButton();
        jComboBoxMarcaAdmin = new javax.swing.JComboBox<String>();
        jLabelCantidadArticulos = new javax.swing.JLabel();
        jFormattedTextFieldMinCantidadAdmin = new javax.swing.JFormattedTextField();
        jFormattedTextFieldMaxCantidadAdmin = new javax.swing.JFormattedTextField();
        jLabelPrecioArticulo = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablevendedor = new javax.swing.JTable();
        jLabelFondo1 = new javax.swing.JLabel();
        jPanelClientesVendedor = new javax.swing.JPanel();
        jButtonModificarCliente = new javax.swing.JButton();
        jButtonDetallesCliente = new javax.swing.JButton();
        jButtonCrearCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextFieldBusquedaClientesVendedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 50, 40));

        jComboBoxVendedores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVendedoresItemStateChanged(evt);
            }
        });
        jPanelFactura.add(jComboBoxVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 90, 117, 30));

        jButtonLoguearVendedor.setText("->");
        jButtonLoguearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoguearVendedorActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonLoguearVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 30));

        jButtonDevolucion.setText("Devolución");
        jButtonDevolucion.setEnabled(false);
        jButtonDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolucionActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 30));

        jButtonValidarCliente.setText("->");
        jButtonValidarCliente.setEnabled(false);
        jButtonValidarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarClienteActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonValidarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 30));

        jButtonIngresarArticuloFactura.setText("->");
        jButtonIngresarArticuloFactura.setEnabled(false);
        jButtonIngresarArticuloFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarArticuloFacturaActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonIngresarArticuloFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 49, 30));

        jButtonAgrearCliente.setText("+");
        jButtonAgrearCliente.setEnabled(false);
        jButtonAgrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgrearClienteActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonAgrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 49, 30));

        jPasswordFieldPinVendedor.setText("bertha");
        jPasswordFieldPinVendedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPinVendedorFocusGained(evt);
            }
        });
        jPasswordFieldPinVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPinVendedorActionPerformed(evt);
            }
        });
        jPanelFactura.add(jPasswordFieldPinVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 90, 100, 30));

        jTableTablaFactura.setBackground(new java.awt.Color(204, 204, 0));
        jTableTablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTablaFactura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableTablaFactura);

        jPanelFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 540, 180));

        jButtonImprimir.setText("Imprimir");
        jButtonImprimir.setEnabled(false);
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jButtonCancelarFactura.setText("Cancelar");
        jButtonCancelarFactura.setEnabled(false);
        jButtonCancelarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarFacturaActionPerformed(evt);
            }
        });
        jPanelFactura.add(jButtonCancelarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Evolucion Soft");
        jPanelFactura.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 27, -1, -1));

        jFormattedTextFieldReferenciaArticulo.setForeground(new java.awt.Color(102, 102, 102));
        jFormattedTextFieldReferenciaArticulo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldReferenciaArticulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelFactura.add(jFormattedTextFieldReferenciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, 30));

        jFormattedTextFieldCantidadArticulos.setForeground(new java.awt.Color(102, 102, 102));
        jFormattedTextFieldCantidadArticulos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldCantidadArticulos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCantidadArticulos.setText("1");
        jFormattedTextFieldCantidadArticulos.setEnabled(false);
        jFormattedTextFieldCantidadArticulos.setFocusable(false);
        jFormattedTextFieldCantidadArticulos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCantidadArticulosFocusGained(evt);
            }
        });
        jPanelFactura.add(jFormattedTextFieldCantidadArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 45, 30));

        jFormattedTextFieldIdCliente.setForeground(new java.awt.Color(102, 102, 102));
        jFormattedTextFieldIdCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldIdCliente.setEnabled(false);
        jFormattedTextFieldIdCliente.setFocusable(false);
        jFormattedTextFieldIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldIdClienteFocusGained(evt);
            }
        });
        jPanelFactura.add(jFormattedTextFieldIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id. Cliente");
        jPanelFactura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabelNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        jPanelFactura.add(jLabelNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 160, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ref. Articulo");
        jPanelFactura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descuento");
        jPanelFactura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, 10));

        jFormattedTextFieldDescuento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldDescuento1.setText("0");
        jFormattedTextFieldDescuento1.setEnabled(false);
        jFormattedTextFieldDescuento1.setMaximumSize(new java.awt.Dimension(100000000, 100000000));
        jFormattedTextFieldDescuento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDescuento1FocusGained(evt);
            }
        });
        jPanelFactura.add(jFormattedTextFieldDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 85, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jPanelFactura.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 490));

        jTabbedPaneVistaVendedor.addTab("Factura", jPanelFactura);

        jPanelInventarioVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalirDeInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButtonSalirDeInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirDeInventarioActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonSalirDeInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 50, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("INVENTARIO");
        jPanelInventarioVendedor.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));
        jPanelInventarioVendedor.add(jTextFieldReferenciaArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 106, 102, -1));

        jLabelReferenciaArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReferenciaArticulo.setText("Referencia");
        jPanelInventarioVendedor.add(jLabelReferenciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 109, -1, -1));

        jLabelDescripcionArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcionArticulo.setText("Descripción");
        jPanelInventarioVendedor.add(jLabelDescripcionArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 157, -1, -1));
        jPanelInventarioVendedor.add(jTextFieldDescripcionArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 154, 100, -1));

        jComboBoxTallasAdmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Talla", "XS", "S", "M", "L", "XL", "XLL", " " }));
        jPanelInventarioVendedor.add(jComboBoxTallasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 202, 100, -1));

        jLabelTallaArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTallaArticulo.setText("Talla");
        jPanelInventarioVendedor.add(jLabelTallaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 205, -1, -1));

        jFormattedTextFieldMinPrecioAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jPanelInventarioVendedor.add(jFormattedTextFieldMinPrecioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 80, -1));

        jFormattedTextFieldMaxPrecioAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jPanelInventarioVendedor.add(jFormattedTextFieldMaxPrecioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 80, -1));

        jButtonBúsquedaArticulosAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/buscar.jpg"))); // NOI18N
        jButtonBúsquedaArticulosAdmin.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonBúsquedaArticulosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBúsquedaArticulosAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonBúsquedaArticulosAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 60, 50));

        jComboBoxMarcaAdmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca", "Dynamo", "By Loko NY", "Monkey" }));
        jComboBoxMarcaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jComboBoxMarcaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, -1));

        jLabelCantidadArticulos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidadArticulos.setText("Cantidad");
        jPanelInventarioVendedor.add(jLabelCantidadArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jFormattedTextFieldMinCantidadAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jPanelInventarioVendedor.add(jFormattedTextFieldMinCantidadAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 60, -1));

        jFormattedTextFieldMaxCantidadAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jPanelInventarioVendedor.add(jFormattedTextFieldMaxCantidadAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 60, -1));

        jLabelPrecioArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioArticulo.setText("Precio");
        jPanelInventarioVendedor.add(jLabelPrecioArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 205, -1, -1));

        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Marca");
        jPanelInventarioVendedor.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 157, -1, -1));

        jTablevendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTablevendedor);

        jPanelInventarioVendedor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 530, 130));

        jLabelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jPanelInventarioVendedor.add(jLabelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        jTabbedPaneVistaVendedor.addTab("Inventario", jPanelInventarioVendedor);

        jPanelClientesVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonModificarCliente.setText("Modificar");
        jButtonModificarCliente.setEnabled(false);
        jButtonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarClienteActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 92, -1, -1));

        jButtonDetallesCliente.setText("Detalles");
        jButtonDetallesCliente.setEnabled(false);
        jButtonDetallesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetallesClienteActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonDetallesCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 92, -1, -1));

        jButtonCrearCliente.setText("Crear");
        jButtonCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearClienteActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 92, -1, -1));

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClientes);

        jPanelClientesVendedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 133, 603, 278));
        jPanelClientesVendedor.add(jTextFieldBusquedaClientesVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 52, 160, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/buscarSmall.jpg"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(73, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 40, 36));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 50, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CLIENTES");
        jPanelClientesVendedor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 11, -1, -1));

        jButton3.setText("Cargar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 92, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jPanelClientesVendedor.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 710, 480));

        jTabbedPaneVistaVendedor.addTab("Clientes", jPanelClientesVendedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        llenarTablaClientes(lc.consultarClientes());
        jButtonModificarCliente.setEnabled(false);
        jButtonDetallesCliente.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        salir();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarClientes(jTextFieldBusquedaClientesVendedor.getText());
        jButtonModificarCliente.setEnabled(false);
        jButtonDetallesCliente.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        jButtonModificarCliente.setEnabled(true);
        jButtonDetallesCliente.setEnabled(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearClienteActionPerformed
        va.VentanacrearCliente();
    }//GEN-LAST:event_jButtonCrearClienteActionPerformed

    private void jButtonDetallesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetallesClienteActionPerformed
        jButtonModificarCliente.setEnabled(false);
        jButtonDetallesCliente.setEnabled(false);
        String idCliente = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 4).toString();
        va.VentanaDetallesCliente(lc.consultarCliente(idCliente));
    }//GEN-LAST:event_jButtonDetallesClienteActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        jButtonModificarCliente.setEnabled(false);
        jButtonDetallesCliente.setEnabled(false);
        String idCliente = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 4).toString();
        va.VentanaModificarCliente(lc.consultarCliente(idCliente));
    }//GEN-LAST:event_jButtonModificarClienteActionPerformed

    private void jButtonSalirDeInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirDeInventarioActionPerformed
        salir();
    }//GEN-LAST:event_jButtonSalirDeInventarioActionPerformed

    private void jFormattedTextFieldDescuento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDescuento1FocusGained
        jFormattedTextFieldDescuento1.setText("");
    }//GEN-LAST:event_jFormattedTextFieldDescuento1FocusGained

    private void jFormattedTextFieldIdClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIdClienteFocusGained
        jFormattedTextFieldIdCliente.setText("");
    }//GEN-LAST:event_jFormattedTextFieldIdClienteFocusGained

    private void jFormattedTextFieldCantidadArticulosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCantidadArticulosFocusGained
        jFormattedTextFieldCantidadArticulos.setText("");
    }//GEN-LAST:event_jFormattedTextFieldCantidadArticulosFocusGained

    private void jButtonCancelarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarFacturaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Compra CANCELADA");
        deshabilitarBotones();
        //desloguear vendedor y limpiar tabla
        deshabilitarBotones();
                jComboBoxVendedores.setEnabled(true);
                jPasswordFieldPinVendedor.setEnabled(true);
                jFormattedTextFieldCantidadArticulos.setText("1");
                jFormattedTextFieldReferenciaArticulo.setText("");
                jFormattedTextFieldDescuento1.setEnabled(false);
                jFormattedTextFieldDescuento1.setText("0");
                listaProductosVenta.clear();
                listaCantidades.clear();
                listaVentaProducto.clear();
                llenarTablaFactura();
    }//GEN-LAST:event_jButtonCancelarFacturaActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        try {
            if(vender())
            {
                JOptionPane.showMessageDialog(rootPane, "Venta exitosa... Imprimiendo Factura");
                deshabilitarBotones();
                jComboBoxVendedores.setEnabled(true);
                jPasswordFieldPinVendedor.setEnabled(true);
                jFormattedTextFieldCantidadArticulos.setText("1");
                jFormattedTextFieldReferenciaArticulo.setText("");
                listaProductosVenta.clear();
                listaCantidades.clear();
                listaVentaProducto.clear();
                jFormattedTextFieldDescuento1.setEnabled(false);
                jFormattedTextFieldDescuento1.setText("0");
                llenarTablaFactura();
            }else{
                JOptionPane.showMessageDialog(rootPane, "El descuento excede el valor de la compra. Ingrese un nuevo descuento");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al lanzar el método vender");
            jFormattedTextFieldReferenciaArticulo.setText("");
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jPasswordFieldPinVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPinVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPinVendedorActionPerformed

    private void jPasswordFieldPinVendedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPinVendedorFocusGained
        jPasswordFieldPinVendedor.setText("bertha");
    }//GEN-LAST:event_jPasswordFieldPinVendedorFocusGained

    private void jButtonAgrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgrearClienteActionPerformed
        va.VentanacrearCliente();
    }//GEN-LAST:event_jButtonAgrearClienteActionPerformed

    private void jButtonIngresarArticuloFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarArticuloFacturaActionPerformed
        try{
            if(lp.consultarProducto(Integer.parseInt(jFormattedTextFieldReferenciaArticulo.getText()))==null
                || validarProducto())
            {
                jFormattedTextFieldReferenciaArticulo.setBackground(Color.red);
            }else{
                Producto p = lp.consultarProducto(Integer.parseInt(jFormattedTextFieldReferenciaArticulo.getText()));
                listaProductosVenta.add(p);
                listaCantidades.add(Integer.parseInt(jFormattedTextFieldCantidadArticulos.getText()));
                jFormattedTextFieldReferenciaArticulo.setText("");
                jFormattedTextFieldReferenciaArticulo.setBackground(Color.WHITE);
                llenarTablaFactura();
            }
        }  catch(java.lang.NumberFormatException ex)
        {
            jFormattedTextFieldReferenciaArticulo.setBackground(Color.red);
            jFormattedTextFieldReferenciaArticulo.setText("");
        }

    }//GEN-LAST:event_jButtonIngresarArticuloFacturaActionPerformed

    private void jButtonValidarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarClienteActionPerformed
        String idCliente = jFormattedTextFieldIdCliente.getText();
        if(lc.consultarCliente(idCliente)==null){
            jFormattedTextFieldIdCliente.setBackground(Color.red);
        }else{
            jLabelNombreCliente.setText(lc.consultarCliente(idCliente).getNombrecliente() +" "
                + lc.consultarCliente(idCliente).getApellidoscliente());
            jFormattedTextFieldIdCliente.setFocusable(false);
            jFormattedTextFieldIdCliente.setBackground(Color.green);
            jButtonAgrearCliente.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarClienteActionPerformed

    private void jButtonDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolucionActionPerformed
        VistaDevolucion dv = new VistaDevolucion(this, true, usuarioActual);
        dv.setVisible(true);
        deshabilitarBotones();
        jComboBoxVendedores.setEnabled(true);
        jPasswordFieldPinVendedor.setEnabled(true);
    }//GEN-LAST:event_jButtonDevolucionActionPerformed

    private void jButtonLoguearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoguearVendedorActionPerformed
        String usuario = jComboBoxVendedores.getSelectedItem().toString();
        boolean b=false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).getLogin().equalsIgnoreCase(usuario) &&
                listaUsuarios.get(i).getContraseña().equalsIgnoreCase(jPasswordFieldPinVendedor.getText()) &&
                listaUsuarios.get(i).getEstado()){
                habilitarBotones();
                jComboBoxVendedores.setEnabled(false);
                jPasswordFieldPinVendedor.setEnabled(false);
                jButtonLoguearVendedor.setEnabled(false);
                usuarioActual = listaUsuarios.get(i);
                jFormattedTextFieldDescuento1.setEnabled(true);
                b=true;
            }

        }
        if(!b){
            JOptionPane.showMessageDialog(rootPane, "Login o contraseña incorrectos");
        }

    }//GEN-LAST:event_jButtonLoguearVendedorActionPerformed

    private void jComboBoxVendedoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVendedoresItemStateChanged
        deshabilitarBotones();
    }//GEN-LAST:event_jComboBoxVendedoresItemStateChanged

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        salir();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBúsquedaArticulosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBúsquedaArticulosAdminActionPerformed

        if(!jTextFieldReferenciaArticuloAdmin.getText().equals(""))
        {
            List<Producto> lista = new ArrayList();
            if(lp.consultarProducto(Integer.parseInt(jTextFieldReferenciaArticuloAdmin.getText())) != null)
            {
                lista.add(lp.consultarProducto(Integer.parseInt(jTextFieldReferenciaArticuloAdmin.getText())));
            }
             llenarTablaProductos(lista,jTablevendedor);
        }
        else
        {
            String descripcion = jTextFieldDescripcionArticuloAdmin.getText();
            String talla = jComboBoxTallasAdmin.getSelectedItem().toString();
            String marca = jComboBoxMarcaAdmin.getSelectedItem().toString();
            Integer cmin = null;
            Integer cmax = null;
            if(jFormattedTextFieldMinCantidadAdmin.getText().equals("") || jFormattedTextFieldMaxCantidadAdmin.getText().equals(""))
            {
                cmin=-1;
                cmax=-1;
            }else
            {
                if(Integer.parseInt(jFormattedTextFieldMinCantidadAdmin.getText()) > Integer.parseInt( jFormattedTextFieldMaxCantidadAdmin.getText()))
                {
                    JOptionPane.showMessageDialog(null,"Ingrese un rango de cantidad valido");
                }
                else
                {
                    cmin = Integer.parseInt(jFormattedTextFieldMinCantidadAdmin.getText());
                    cmax = Integer.parseInt(jFormattedTextFieldMaxCantidadAdmin.getText());
                }
            }
            Integer pmin = null;
            Integer pmax = null;
            if(jFormattedTextFieldMinPrecioAdmin.getText().equals("") || jFormattedTextFieldMaxPrecioAdmin.getText().equals(""))
            {
                pmin=-1;
                pmax=-1;
            }else
            {
                if(Integer.parseInt(jFormattedTextFieldMinPrecioAdmin.getText()) > Integer.parseInt( jFormattedTextFieldMaxPrecioAdmin.getText()))
                {
                    JOptionPane.showMessageDialog(null,"Ingrese un rango de precio valido");
                }
                else
                {
                    pmin = Integer.parseInt(jFormattedTextFieldMinPrecioAdmin.getText());
                    pmax = Integer.parseInt(jFormattedTextFieldMaxPrecioAdmin.getText());
                }
            }
            llenarTablaProductos(lp.consultarProducto(descripcion,talla,cmin,cmax,marca,pmin,pmax),jTablevendedor);
        }

    }//GEN-LAST:event_jButtonBúsquedaArticulosAdminActionPerformed

    private void jComboBoxMarcaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaAdminActionPerformed


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
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVendedor().setVisible(true);
            }
        });
    }
    
     public void salir(){
        this.setVisible(false);
        Inicio in = new Inicio();
        in.setVisible(true);
    }
     
     public void deshabilitarBotones(){
        jButtonAgrearCliente.setEnabled(false);
        jButtonValidarCliente.setEnabled(false);
        jButtonIngresarArticuloFactura.setEnabled(false);
        jButtonDevolucion.setEnabled(false);
        jButtonImprimir.setEnabled(false);
        jButtonCancelarFactura.setEnabled(false);
        jButtonDetallesCliente.setEnabled(false);
        jButtonDevolucion.setEnabled(false);
        jPasswordFieldPinVendedor.setText("");
        jFormattedTextFieldReferenciaArticulo.setText("");
        jFormattedTextFieldReferenciaArticulo.setBackground(Color.WHITE);
        jFormattedTextFieldReferenciaArticulo.setEnabled(false);
        jFormattedTextFieldIdCliente.setText("");
        jFormattedTextFieldIdCliente.setBackground(Color.WHITE);
        jFormattedTextFieldIdCliente.setEnabled(false);
        jButtonLoguearVendedor.setEnabled(true);
     }
     
     public void habilitarBotones(){
         jButtonAgrearCliente.setEnabled(true);
         jButtonValidarCliente.setEnabled(true);
         jButtonIngresarArticuloFactura.setEnabled(true);
         jButtonDevolucion.setEnabled(true);
         jButtonImprimir.setEnabled(true);
         jButtonCancelarFactura.setEnabled(true);
         jFormattedTextFieldIdCliente.setFocusable(true);
         jFormattedTextFieldIdCliente.setEnabled(true);
         jFormattedTextFieldReferenciaArticulo.setFocusable(true);
         jFormattedTextFieldReferenciaArticulo.setEnabled(true);
         jFormattedTextFieldCantidadArticulos.setEnabled(true);
         jFormattedTextFieldCantidadArticulos.setFocusable(true);
         jButtonDetallesCliente.setEnabled(true);
         jButtonDevolucion.setEnabled(true);
     }
      public void llenarTablaProductos(List<Producto> listaProducto,JTable tabla)
     {
        LogicaProducto lp = new LogicaProducto();
        DefaultTableModel dtm = new DefaultTableModel();
        tabla.setModel(dtm);
        dtm.addColumn("REFERENCIA");
        dtm.addColumn("DESCRIPCIÓN");
        dtm.addColumn("TALLA");
        dtm.addColumn("CANTIDAD");
        dtm.addColumn("MARCA");
        dtm.addColumn("PRECIO");
        
        String[] fila = new String[7];
        for (int i = 0; i < listaProducto.size(); i++) {
           fila[0]=listaProducto.get(i).getIdproducto()+"";
           fila[1]=listaProducto.get(i).getDescripcion();
           fila[2]=listaProducto.get(i).getTalla();
           fila[3]=listaProducto.get(i).getCantidadunidades()+"";
           fila[4]=listaProducto.get(i).getMarca();
           fila[5]=Math.round(listaProducto.get(i).getPrecio())+"";
           dtm.addRow(fila);
        }
    }
      
     public void cargarVendedores(){
         //List<Usuario> listaUsuarios = lu.consultarUsuarios();
         List<Usuario> listaVendedores = new ArrayList<>();
         
         for (int i = 0; i < listaUsuarios.size(); i++) {
             if(listaUsuarios.get(i).getTipo().equalsIgnoreCase("vendedor") && listaUsuarios.get(i).getEstado()){
                 listaVendedores.add(listaUsuarios.get(i));
             }
                    
         }
         for (int i = 0; i < listaVendedores.size(); i++) {
             jComboBoxVendedores.addItem(listaVendedores.get(i).getLogin());
         }
     }
     
     public void llenarTablaClientes(List<Cliente> listaClientes){
        DefaultTableModel dtm = new DefaultTableModel();
        jTableClientes.setModel(dtm);
        dtm.addColumn("NOMBRE");
        dtm.addColumn("TELEFONO");
        dtm.addColumn("DIRECCION");
        dtm.addColumn("CORREO");
        dtm.addColumn("IDENTIFICACION");
        dtm.addColumn("VALOR COMPRAS");
        String[] fila = new String[6];
        for (int i = 0; i < listaClientes.size(); i++) {
           fila[0]=listaClientes.get(i).getNombrecliente() + " " + listaClientes.get(i).getApellidoscliente();
           fila[1]=listaClientes.get(i).getTelefono();
           fila[2]=listaClientes.get(i).getDireccion();
           fila[3]=listaClientes.get(i).getCorreoelectronico();
           fila[4]=listaClientes.get(i).getIdentificacioncliente();
           fila[5]=calcularVentasCliente(listaClientes.get(i).getVentaList()) +"";
           dtm.addRow(fila);
        }
    }
     
     public boolean vender()
     { 
        boolean b=false;
        Integer descuento;
        
        try{
        if(jFormattedTextFieldDescuento1.getText().isEmpty()){
            descuento=0;
        }else
        {
            descuento = Integer.parseInt(jFormattedTextFieldDescuento1.getText());
        }
       
        Integer montoTotal = calcularMontoTotal(descuento);
        if(descuento <= (montoTotal)){
            ID_VENTA++;
            Venta venta = new Venta();
            venta.setIdventa(ID_VENTA);
            venta.setFecha(new Date());
            venta.setDescuento(descuento);
            
            //Si no se ingresa un cliente a una venta, por defecto se asignará el cliente default, con idCliente=1
            if(validarCliente())
            {
                venta.setIdentificacioncliente(lc.consultarCliente(jFormattedTextFieldIdCliente.getText()));
            }else
            {
                venta.setIdentificacioncliente(lc.consultarCliente("default"));
            }
            
            venta.setIdentificacionusuario(lu.consultarUsuario(usuarioActual.getIdentificacionusuario()));
            venta.setVentaproductoList(null);
            venta.setMontototal(0);
            lv.registrarVenta(venta); //Se registra la venta en la base de Datos
            
            venta.setMontototal(montoTotal);
            agregarProductos(ID_VENTA);
            venta.setVentaproductoList(listaVentaProducto);
            lv.actualizarVenta(venta); //Se actualiza la venta con la lista de VentaProducto y montoTotal
            actualizarInventario();
            b=true;
        }  
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(rootPane, "Verifica los valores Ingresados");
        }
        
        return b;
     }
     
     public void agregarProductos(Integer idVenta) throws Exception{
         
         for (int i = 0; i < listaProductosVenta.size(); i++) {
                Ventaproducto vp = new Ventaproducto();
                vp.setCantidadvendida(listaCantidades.get(i));
                vp.setPrecioproducto(listaProductosVenta.get(i).getPrecio());
                vp.setProducto(listaProductosVenta.get(i));
                vp.setVenta(lv.consultarVenta(ID_VENTA));  
                vp.setVentaproductoPK(new VentaproductoPK(vp.getVenta().getIdventa(), listaProductosVenta.get(i).getIdproducto()));
                lvp.crear(vp);
                listaVentaProducto.add(vp);
         }
         
     
     }
     
     public Integer calcularMontoTotal(Integer descuento)
     {
        Integer montototal=0;
        for (int i = 0; i < listaProductosVenta.size(); i++) 
        {
            montototal += montototal + listaProductosVenta.get(i).getPrecio()* listaCantidades.get(i);
        }
        return (montototal - descuento);
    }
     
    public void llenarTablaFactura()
    {
        Integer total=0;
        DefaultTableModel dtm = new DefaultTableModel();
        jTableTablaFactura.setModel(dtm);
        dtm.addColumn("DESCRIP");
        dtm.addColumn("P/U");
        dtm.addColumn("CANT");
        dtm.addColumn("IVA");
        dtm.addColumn("TOTAL");
        String[] fila = new String[5];
        for (int i = 0; i < listaProductosVenta.size(); i++) {
           fila[0]=listaProductosVenta.get(i).getDescripcion();
           fila[1]=listaProductosVenta.get(i).getPrecio()- (listaProductosVenta.get(i).getPrecio()*0.16) +""+"";
           fila[2]=listaCantidades.get(i)+"";
           fila[3]=listaProductosVenta.get(i).getPrecio()*0.16+"";
           fila[4]=listaProductosVenta.get(i).getPrecio()*listaCantidades.get(i)+"";
           total += listaProductosVenta.get(i).getPrecio()*listaCantidades.get(i);
           dtm.addRow(fila);
        }
           
           fila[0]="TOTAL";
           fila[1]="";
           fila[2]="";
           fila[3]="";
           fila[4]=total+"";
           dtm.addRow(fila);
        
    }
    
    
    //Función que determina si cierta cantidad de un partículo puede agregarse a una factura, teniendo en cuenta la
    //cantidad disponible en stock.
    public boolean validarProducto(){
        boolean b = false;
        listaProductos = lp.consultarProductos();//Actualizando la lista de productos
        Producto producutoVenta = lp.consultarProducto(Integer.parseInt(jFormattedTextFieldReferenciaArticulo.getText()));
        
        if(producutoVenta.getCantidadunidades() < Integer.parseInt(jFormattedTextFieldCantidadArticulos.getText())){
            JOptionPane.showMessageDialog(rootPane, "El producto no tiene suficiente Stock");
            b=true;
        }
        return b;
    }
    
    //Función que actualiza el inventario después de realizar una venta de manera exitosa. 
    public void actualizarInventario() throws Exception{
        for (int i = 0; i < listaVentaProducto.size(); i++) {
            Producto p = lp.consultarProducto(listaVentaProducto.get(i).getProducto().getIdproducto());
            p.setCantidadunidades(p.getCantidadunidades() - listaCantidades.get(i));
            lp.actualizar(p);
        }
    }
    
    public boolean validarCliente()
    {
        boolean b=true;
        if(lc.consultarCliente(jFormattedTextFieldIdCliente.getText())==null)
        {
            b=false;
        }
        return b;
    }
    
    public void buscarClientes(String parametro){
         List<Cliente> listaBusqueda = lc.consultarClientes();
         List<Cliente> listaResultado = new ArrayList<>();
         for (int i = 0; i < listaBusqueda.size(); i++) 
         {
            if(listaBusqueda.get(i).getNombrecliente().equalsIgnoreCase(parametro)
                    || listaBusqueda.get(i).getApellidoscliente().equalsIgnoreCase(parametro)
                    || listaBusqueda.get(i).getIdentificacioncliente().equalsIgnoreCase(parametro)){
                listaResultado.add(listaBusqueda.get(i));
            }
        }
         llenarTablaClientes(listaResultado);
       
    }
    
    public Integer calcularVentasCliente(List<Venta> listaVenta)
    {
        Integer ventas=0;
        
        for (int i = 0; i < listaVenta.size(); i++) 
        {
            ventas+=listaVenta.get(i).getMontototal();
        }
        return ventas;
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgrearCliente;
    private javax.swing.JButton jButtonBúsquedaArticulosAdmin;
    private javax.swing.JButton jButtonCancelarFactura;
    private javax.swing.JButton jButtonCrearCliente;
    private javax.swing.JButton jButtonDetallesCliente;
    private javax.swing.JButton jButtonDevolucion;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonIngresarArticuloFactura;
    private javax.swing.JButton jButtonLoguearVendedor;
    private javax.swing.JButton jButtonModificarCliente;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalirDeInventario;
    private javax.swing.JButton jButtonValidarCliente;
    private javax.swing.JComboBox<String> jComboBoxMarcaAdmin;
    private javax.swing.JComboBox<String> jComboBoxTallasAdmin;
    private javax.swing.JComboBox<String> jComboBoxVendedores;
    private javax.swing.JFormattedTextField jFormattedTextFieldCantidadArticulos;
    private javax.swing.JFormattedTextField jFormattedTextFieldDescuento1;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldMaxCantidadAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMaxPrecioAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMinCantidadAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMinPrecioAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldReferenciaArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCantidadArticulos;
    private javax.swing.JLabel jLabelDescripcionArticulo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelPrecioArticulo;
    private javax.swing.JLabel jLabelReferenciaArticulo;
    private javax.swing.JLabel jLabelTallaArticulo;
    private javax.swing.JPanel jPanelClientesVendedor;
    private javax.swing.JPanel jPanelFactura;
    private javax.swing.JPanel jPanelInventarioVendedor;
    private javax.swing.JPasswordField jPasswordFieldPinVendedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneVistaVendedor;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableTablaFactura;
    private javax.swing.JTable jTablevendedor;
    private javax.swing.JTextField jTextFieldBusquedaClientesVendedor;
    private javax.swing.JTextField jTextFieldDescripcionArticuloAdmin;
    private javax.swing.JTextField jTextFieldReferenciaArticuloAdmin;
    // End of variables declaration//GEN-END:variables

    
}
