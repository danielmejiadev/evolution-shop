
package Vista;

import Logica.LogicaCliente;
import Logica.LogicaDevolucion;
import Logica.LogicaProducto;
import Logica.LogicaUsuario;
import Logica.LogicaVenta;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Venta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VistaAdministrador extends javax.swing.JFrame {
    private LogicaCliente logicaCliente = new LogicaCliente();
    private List<Cliente> listaClientes = logicaCliente.consultarClientes();
    private LogicaProducto lp = new LogicaProducto();
    private LogicaUsuario lu = new LogicaUsuario();
    
    
    public VistaAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("EvolucionSoft - Administrador");
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneVistaAdministrador = new javax.swing.JTabbedPane();
        jPanelInventarioVendedor = new javax.swing.JPanel();
        jTextFieldReferenciaArticuloAdmin = new javax.swing.JTextField();
        jLabelReferenciaArticulo = new javax.swing.JLabel();
        jLabelDescripcionArticulo = new javax.swing.JLabel();
        jLabelTallaArticulo = new javax.swing.JLabel();
        jComboBoxTallasAdmin = new javax.swing.JComboBox<String>();
        jTextFieldDescripcionArticuloAdmin = new javax.swing.JTextField();
        jLabelPrecioArticulo = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelCantidadArticulos = new javax.swing.JLabel();
        jFormattedTextFieldMinCantidadAdmin = new javax.swing.JFormattedTextField();
        jFormattedTextFieldMaxCantidadAdmin = new javax.swing.JFormattedTextField();
        jComboBoxMarcaAdmin = new javax.swing.JComboBox<String>();
        jFormattedTextFieldMinPrecioAdmin = new javax.swing.JFormattedTextField();
        jFormattedTextFieldMaxPrecioAdmin = new javax.swing.JFormattedTextField();
        jButtonBúsquedaArticulosAdmin = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableArticulosAdmin = new javax.swing.JTable();
        jButtonModificarArticuloAdmin = new javax.swing.JButton();
        jButtonDetallesArticuloAdmin = new javax.swing.JButton();
        jButtonAgregarArticuloAdmin = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButtonSalirInventario = new javax.swing.JButton();
        jButtonCargarProductos = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();
        jPanelAdministrar = new javax.swing.JPanel();
        jButtonVerReporteInventario = new javax.swing.JButton();
        fechainicioventas = new javax.swing.JFormattedTextField();
        fechafinventas = new javax.swing.JFormattedTextField();
        fechainiciodevolucion = new javax.swing.JFormattedTextField();
        fechafindevolucion = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonSalirReportes = new javax.swing.JButton();
        botonreporteinventario = new javax.swing.JButton();
        botonreporteventas = new javax.swing.JButton();
        botonreportedevoluciones = new javax.swing.JButton();
        botonreportevendedor = new javax.swing.JButton();
        botonreportecliente = new javax.swing.JButton();
        reporteventasvendedor = new javax.swing.JTextField();
        reportecomprascliente = new javax.swing.JTextField();
        botonbuscarcliente = new javax.swing.JButton();
        botonbuscarusuario = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        jTextFieldBusquedaUsuarios = new javax.swing.JTextField();
        jButtonBusquedaUsuario = new javax.swing.JButton();
        jButtonAgregarUsuario = new javax.swing.JButton();
        jButtonDetallesUsuario = new javax.swing.JButton();
        jButtonModificarUsuario = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonSalirUsuarios = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButtonCargar = new javax.swing.JButton();
        jLabelFondo3 = new javax.swing.JLabel();
        jPanelClientesVendedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextFieldBusquedaClientes = new javax.swing.JTextField();
        jButtonBusquedaAdmin = new javax.swing.JButton();
        jButtonAgregarClienteAdmin = new javax.swing.JButton();
        jButtonDetallesClienteAdmin = new javax.swing.JButton();
        jButtonModificarClienteAdmin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientesAdmin = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButtonCargarTabla = new javax.swing.JButton();
        jLabelFondo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInventarioVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldReferenciaArticuloAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReferenciaArticuloAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jTextFieldReferenciaArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 106, 102, -1));

        jLabelReferenciaArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReferenciaArticulo.setText("Referencia");
        jPanelInventarioVendedor.add(jLabelReferenciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 109, -1, -1));

        jLabelDescripcionArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcionArticulo.setText("Descripción");
        jPanelInventarioVendedor.add(jLabelDescripcionArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 157, -1, -1));

        jLabelTallaArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTallaArticulo.setText("Talla");
        jPanelInventarioVendedor.add(jLabelTallaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 205, -1, -1));

        jComboBoxTallasAdmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Talla", "XS", "S", "M", "L", "XL", "XLL", " " }));
        jPanelInventarioVendedor.add(jComboBoxTallasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 202, 100, -1));
        jPanelInventarioVendedor.add(jTextFieldDescripcionArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 154, 100, -1));

        jLabelPrecioArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioArticulo.setText("Precio");
        jPanelInventarioVendedor.add(jLabelPrecioArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 205, -1, -1));

        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Marca");
        jPanelInventarioVendedor.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 157, -1, -1));

        jLabelCantidadArticulos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidadArticulos.setText("Cantidad");
        jPanelInventarioVendedor.add(jLabelCantidadArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jFormattedTextFieldMinCantidadAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jPanelInventarioVendedor.add(jFormattedTextFieldMinCantidadAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 60, -1));

        jFormattedTextFieldMaxCantidadAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jPanelInventarioVendedor.add(jFormattedTextFieldMaxCantidadAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 60, -1));

        jComboBoxMarcaAdmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca", "Dynamo", "By Loko NY", "Monkey" }));
        jComboBoxMarcaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jComboBoxMarcaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, -1));

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

        jTableArticulosAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableArticulosAdmin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableArticulosAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableArticulosAdminFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(jTableArticulosAdmin);

        jPanelInventarioVendedor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 610, 130));

        jButtonModificarArticuloAdmin.setText("Modificar");
        jButtonModificarArticuloAdmin.setEnabled(false);
        jButtonModificarArticuloAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarArticuloAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonModificarArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jButtonDetallesArticuloAdmin.setText("Detalles");
        jButtonDetallesArticuloAdmin.setEnabled(false);
        jButtonDetallesArticuloAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetallesArticuloAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonDetallesArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jButtonAgregarArticuloAdmin.setText("Agregar");
        jButtonAgregarArticuloAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarArticuloAdminActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonAgregarArticuloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("INVENTARIO");
        jPanelInventarioVendedor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jButtonSalirInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButtonSalirInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirInventarioActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonSalirInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 50, 40));

        jButtonCargarProductos.setText("Cargar");
        jButtonCargarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarProductosActionPerformed(evt);
            }
        });
        jPanelInventarioVendedor.add(jButtonCargarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jPanelInventarioVendedor.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 700, 490));

        jTabbedPaneVistaAdministrador.addTab("Inventario", jPanelInventarioVendedor);

        jPanelAdministrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVerReporteInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pdf.png"))); // NOI18N
        jButtonVerReporteInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerReporteInventarioActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(jButtonVerReporteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 27, -1));

        fechainicioventas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/y"))));
        fechainicioventas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fechainicioventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechainicioventasActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(fechainicioventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 70, 30));

        fechafinventas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/y"))));
        fechafinventas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanelAdministrar.add(fechafinventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 70, 30));

        fechainiciodevolucion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/y"))));
        fechainiciodevolucion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanelAdministrar.add(fechainiciodevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, 30));

        fechafindevolucion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/y"))));
        fechafindevolucion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanelAdministrar.add(fechafindevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 70, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reporte de estado de inventario");
        jPanelAdministrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reporte de clientes");
        jPanelAdministrar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporte de ventas");
        jPanelAdministrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reporte de devoluciones");
        jPanelAdministrar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reporte de ventas por vendedor");
        jPanelAdministrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reporte de compras por cliente");
        jPanelAdministrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REPORTES");
        jPanelAdministrar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jButtonSalirReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButtonSalirReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirReportesActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(jButtonSalirReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 50, 40));

        botonreporteinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pdf.png"))); // NOI18N
        botonreporteinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreporteinventarioActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonreporteinventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 27, -1));

        botonreporteventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pdf.png"))); // NOI18N
        botonreporteventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreporteventasActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonreporteventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 27, -1));

        botonreportedevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pdf.png"))); // NOI18N
        botonreportedevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreportedevolucionesActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonreportedevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 27, -1));

        botonreportevendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pdf.png"))); // NOI18N
        botonreportevendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreportevendedorActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonreportevendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 27, -1));

        botonreportecliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/pdf.png"))); // NOI18N
        botonreportecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreporteclienteActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonreportecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 27, -1));
        jPanelAdministrar.add(reporteventasvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 110, 30));
        jPanelAdministrar.add(reportecomprascliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 110, 30));

        botonbuscarcliente.setText("->");
        botonbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarclienteActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonbuscarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, 30));

        botonbuscarusuario.setText("->");
        botonbuscarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarusuarioActionPerformed(evt);
            }
        });
        jPanelAdministrar.add(botonbuscarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel14");
        jPanelAdministrar.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 450));

        jTabbedPaneVistaAdministrador.addTab("Administrar", jPanelAdministrar);

        jPanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelUsuarios.add(jTextFieldBusquedaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 66, 152, -1));

        jButtonBusquedaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/buscarSmall.jpg"))); // NOI18N
        jButtonBusquedaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaUsuarioActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jButtonBusquedaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 40, 36));

        jButtonAgregarUsuario.setText("Agregar");
        jButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jButtonAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 106, -1, -1));

        jButtonDetallesUsuario.setText("Detalles");
        jButtonDetallesUsuario.setEnabled(false);
        jButtonDetallesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetallesUsuarioActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jButtonDetallesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 106, -1, -1));

        jButtonModificarUsuario.setText("Modificar");
        jButtonModificarUsuario.setEnabled(false);
        jButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarUsuarioActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jButtonModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 106, -1, -1));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableUsuariosFocusGained(evt);
            }
        });
        jScrollPane4.setViewportView(jTableUsuarios);

        jPanelUsuarios.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 156, 591, 251));

        jButtonSalirUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButtonSalirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirUsuariosActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jButtonSalirUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 50, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("USUARIOS");
        jPanelUsuarios.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 18, -1, -1));

        jButtonCargar.setText("Cargar");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 106, -1, -1));

        jLabelFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jPanelUsuarios.add(jLabelFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 710, 480));

        jTabbedPaneVistaAdministrador.addTab("Usuarios", jPanelUsuarios);

        jPanelClientesVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/botonSalir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 50, 40));
        jPanelClientesVendedor.add(jTextFieldBusquedaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 170, -1));

        jButtonBusquedaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/buscarSmall.jpg"))); // NOI18N
        jButtonBusquedaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaAdminActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonBusquedaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 40, 36));

        jButtonAgregarClienteAdmin.setText("Agregar");
        jButtonAgregarClienteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarClienteAdminActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonAgregarClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jButtonDetallesClienteAdmin.setText("Detalles");
        jButtonDetallesClienteAdmin.setEnabled(false);
        jButtonDetallesClienteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetallesClienteAdminActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonDetallesClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jButtonModificarClienteAdmin.setText("Modificar");
        jButtonModificarClienteAdmin.setEnabled(false);
        jButtonModificarClienteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarClienteAdminActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonModificarClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jTableClientesAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableClientesAdmin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableClientesAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableClientesAdminFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClientesAdmin);

        jPanelClientesVendedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 147, 627, 258));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CLIENTES");
        jPanelClientesVendedor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButtonCargarTabla.setText("Cargar");
        jButtonCargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarTablaActionPerformed(evt);
            }
        });
        jPanelClientesVendedor.add(jButtonCargarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabelFondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        jPanelClientesVendedor.add(jLabelFondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 710, 480));

        jTabbedPaneVistaAdministrador.addTab("Clientes", jPanelClientesVendedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSalirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirUsuariosActionPerformed
        salir();
    }//GEN-LAST:event_jButtonSalirUsuariosActionPerformed

    private void jButtonAgregarClienteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarClienteAdminActionPerformed
        jButtonDetallesClienteAdmin.setEnabled(false);
        jButtonModificarClienteAdmin.setEnabled(false);
        AgregarCliente ac = new AgregarCliente(this, true);
        ac.setVisible(true);
        llenarTablaClientes(logicaCliente.consultarClientes(),jTableClientesAdmin);
    }//GEN-LAST:event_jButtonAgregarClienteAdminActionPerformed

    private void jButtonAgregarArticuloAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarArticuloAdminActionPerformed
        jButtonModificarArticuloAdmin.setEnabled(false);
        jButtonDetallesArticuloAdmin.setEnabled(false);
        AgregarArticulo aa = new AgregarArticulo(this, true);
        aa.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarArticuloAdminActionPerformed

    private void jButtonSalirInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirInventarioActionPerformed
        salir();
    }//GEN-LAST:event_jButtonSalirInventarioActionPerformed

    private void jButtonModificarClienteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteAdminActionPerformed
        jButtonDetallesClienteAdmin.setEnabled(false);
        jButtonModificarClienteAdmin.setEnabled(false);
        String idCliente = jTableClientesAdmin.getValueAt(jTableClientesAdmin.getSelectedRow(), 4).toString();
        VentanaModificarCliente(logicaCliente.consultarCliente(idCliente));
        llenarTablaClientes(logicaCliente.consultarClientes(),jTableClientesAdmin);
    }//GEN-LAST:event_jButtonModificarClienteAdminActionPerformed

    private void jButtonModificarArticuloAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarArticuloAdminActionPerformed
        jButtonModificarArticuloAdmin.setEnabled(false);
        jButtonDetallesArticuloAdmin.setEnabled(false);
        Integer idProducto = Integer.parseInt(jTableArticulosAdmin.getValueAt(jTableArticulosAdmin.getSelectedRow(), 0).toString());
        ModificarArticulo ma = new ModificarArticulo(this, true, lp.consultarProducto(idProducto));
        ma.setVisible(true);
        llenarTablaProductos(lp.consultarProductos(),jTableArticulosAdmin);
        desactivarBotones();
    }//GEN-LAST:event_jButtonModificarArticuloAdminActionPerformed

    private void jButtonDetallesClienteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetallesClienteAdminActionPerformed
        jButtonDetallesClienteAdmin.setEnabled(false);
        jButtonModificarClienteAdmin.setEnabled(false);
        String idCliente = jTableClientesAdmin.getValueAt(jTableClientesAdmin.getSelectedRow(), 4).toString();
        VentanaDetallesCliente(logicaCliente.consultarCliente(idCliente));
    }//GEN-LAST:event_jButtonDetallesClienteAdminActionPerformed

    private void jButtonDetallesArticuloAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetallesArticuloAdminActionPerformed
        jButtonModificarArticuloAdmin.setEnabled(false);
        jButtonDetallesArticuloAdmin.setEnabled(false);
        Integer idProducto = Integer.parseInt(jTableArticulosAdmin.getValueAt(jTableArticulosAdmin.getSelectedRow(), 0).toString());
        VentanaDetallesArticulo(lp.consultarProducto(idProducto));
    }//GEN-LAST:event_jButtonDetallesArticuloAdminActionPerformed

    private void jButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioActionPerformed
        jButtonModificarUsuario.setEnabled(false);
       jButtonDetallesUsuario.setEnabled(false);
        Usuario usuario = lu.consultarUsuario(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1).toString());
        ModificarUsuario modificarUsuario = new ModificarUsuario(this, true, usuario);
        modificarUsuario.setVisible(true);
        llenarTablaUsuarios(lu.consultarUsuarios(),jTableUsuarios);
    }//GEN-LAST:event_jButtonModificarUsuarioActionPerformed

    private void jButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarUsuarioActionPerformed
        jButtonModificarUsuario.setEnabled(false);
       jButtonDetallesUsuario.setEnabled(false);
        AgregarUsuario au = new AgregarUsuario(this, true);
        au.setVisible(true); 
        llenarTablaUsuarios(lu.consultarUsuarios(),jTableUsuarios);
    }//GEN-LAST:event_jButtonAgregarUsuarioActionPerformed

    private void jButtonCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTablaActionPerformed
        jButtonDetallesClienteAdmin.setEnabled(false);
        jButtonModificarClienteAdmin.setEnabled(false);
        llenarTablaClientes(logicaCliente.consultarClientes(),jTableClientesAdmin);
    }//GEN-LAST:event_jButtonCargarTablaActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
       llenarTablaUsuarios(lu.consultarUsuarios(),jTableUsuarios);
       jButtonModificarUsuario.setEnabled(false);
       jButtonDetallesUsuario.setEnabled(false);
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonCargarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarProductosActionPerformed
        llenarTablaProductos(lp.consultarProductos(),jTableArticulosAdmin);
        jButtonModificarArticuloAdmin.setEnabled(false);
        jButtonDetallesArticuloAdmin.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCargarProductosActionPerformed

    private void jButtonBúsquedaArticulosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBúsquedaArticulosAdminActionPerformed
        jButtonModificarArticuloAdmin.setEnabled(false);
        jButtonDetallesArticuloAdmin.setEnabled(false);
        desactivarBotones();
        if(!jTextFieldReferenciaArticuloAdmin.getText().equals(""))
        {
            List<Producto> lista = new ArrayList();
            if(lp.consultarProducto(Integer.parseInt(jTextFieldReferenciaArticuloAdmin.getText())) != null)
            {
                lista.add(lp.consultarProducto(Integer.parseInt(jTextFieldReferenciaArticuloAdmin.getText())));
            } 
            llenarTablaProductos(lista,jTableArticulosAdmin);     
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
            llenarTablaProductos(lp.consultarProducto(descripcion,talla,cmin,cmax,marca,pmin,pmax),jTableArticulosAdmin);
        }

        
    }//GEN-LAST:event_jButtonBúsquedaArticulosAdminActionPerformed

    private void jButtonDetallesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetallesUsuarioActionPerformed
        jButtonModificarUsuario.setEnabled(false);
       jButtonDetallesUsuario.setEnabled(false);
        Usuario usuario = lu.consultarUsuario(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1).toString());
        DetallesUsuario detalleUsuario = new DetallesUsuario(this, true, usuario);
        detalleUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonDetallesUsuarioActionPerformed

    private void jTableUsuariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableUsuariosFocusGained
        jButtonDetallesUsuario.setEnabled(true);
        jButtonModificarUsuario.setEnabled(true);   
    }//GEN-LAST:event_jTableUsuariosFocusGained

    private void jButtonBusquedaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaUsuarioActionPerformed
       jButtonModificarUsuario.setEnabled(false);
       jButtonDetallesUsuario.setEnabled(false);
       buscarUsuarios(jTextFieldBusquedaUsuarios.getText(),jTableUsuarios);
    }//GEN-LAST:event_jButtonBusquedaUsuarioActionPerformed

    private void jButtonBusquedaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaAdminActionPerformed
        jButtonDetallesClienteAdmin.setEnabled(false);
        jButtonModificarClienteAdmin.setEnabled(false);
        buscarClientes(jTextFieldBusquedaClientes.getText(),jTableClientesAdmin);
    }//GEN-LAST:event_jButtonBusquedaAdminActionPerformed

    private void jButtonSalirReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirReportesActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirReportesActionPerformed

    private void jTableArticulosAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableArticulosAdminFocusGained
        jButtonModificarArticuloAdmin.setEnabled(true);
        jButtonDetallesArticuloAdmin.setEnabled(true);
    }//GEN-LAST:event_jTableArticulosAdminFocusGained

    private void jTableClientesAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableClientesAdminFocusGained
        jButtonDetallesClienteAdmin.setEnabled(true);
        jButtonModificarClienteAdmin.setEnabled(true);
    }//GEN-LAST:event_jTableClientesAdminFocusGained

    private void fechainicioventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechainicioventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainicioventasActionPerformed

    private void botonreporteventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreporteventasActionPerformed
         try {
            
            if(!(fechainicioventas.getText().equals("") || fechafinventas.getText().equals("")))
            {
                LogicaVenta lv = new LogicaVenta();
                SimpleDateFormat sdf= new SimpleDateFormat("d/M/y");
                Date fechainicio= sdf.parse(fechainicioventas.getText()); 
                Date fechafin= sdf.parse(fechafinventas.getText()); 
                lv.reporteVentas(fechainicio, fechafin);
                fechainicioventas.setText("");
                fechafinventas.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Por favor ingrese un rango de fecha valido");
            }    
        } catch (ParseException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonreporteventasActionPerformed

    private void botonreporteinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreporteinventarioActionPerformed
          LogicaProducto lp = new LogicaProducto();
          lp.reporteInventario();
    }//GEN-LAST:event_botonreporteinventarioActionPerformed

    private void botonreportedevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreportedevolucionesActionPerformed
         try {
            
            if(!(fechainiciodevolucion.getText().equals("") || fechafindevolucion.getText().equals("")))
            {
                LogicaDevolucion ld = new LogicaDevolucion();
                SimpleDateFormat sdf= new SimpleDateFormat("d/M/y");
                Date fechainicio= sdf.parse(fechainiciodevolucion.getText()); 
                Date fechafin= sdf.parse(fechafindevolucion.getText()); 
                ld.reporteDevoluciones(fechainicio, fechafin);
                fechainiciodevolucion.setText("");
                fechafindevolucion.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Por favor ingrese un rango de fecha valido");
            }    
        } catch (ParseException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonreportedevolucionesActionPerformed

    private void botonreporteclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreporteclienteActionPerformed
       LogicaCliente lc = new LogicaCliente();
       Cliente cliente = lc.consultarCliente(reportecomprascliente.getText());
       if(cliente != null)
       {
           if(cliente.getVentaList().isEmpty())
           {
             JOptionPane.showMessageDialog(null,"El cliente: "+cliente.getNombrecliente() +" no ha realizado ninguna compra");
           }else
           {
            lc.reporteVentasCliente(reportecomprascliente.getText());
           } 
       }
       else
       {
         JOptionPane.showMessageDialog(null,"Ingrese un cliente valido");
       }  
       reportecomprascliente.setText("");
    }//GEN-LAST:event_botonreporteclienteActionPerformed

    private void botonreportevendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreportevendedorActionPerformed
       LogicaUsuario lu = new LogicaUsuario();
       Usuario usuario = lu.consultarUsuario(reporteventasvendedor.getText());
        if(usuario != null)
        {
           if(usuario.getVentaList().isEmpty())
           {
           JOptionPane.showMessageDialog(null,"El Vendedor: "+usuario.getNombreusuario()+" no ha realizado ninguna venta");
           }else
           {
              lu.reporteVentasVendedor(reporteventasvendedor.getText());
           } 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese un vendedor valido");
        }
       
       
        reporteventasvendedor.setText("");  
    }//GEN-LAST:event_botonreportevendedorActionPerformed

    private void jButtonVerReporteInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerReporteInventarioActionPerformed
       LogicaCliente lc = new LogicaCliente();
       lc.reporteClientes();
    }//GEN-LAST:event_jButtonVerReporteInventarioActionPerformed

    private void botonbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarclienteActionPerformed
        Buscar buscar = new Buscar(this,false,false);
        buscar.setVisible(true);
    }//GEN-LAST:event_botonbuscarclienteActionPerformed

    private void botonbuscarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarusuarioActionPerformed
       Buscar buscar = new Buscar(this,false,true);
       buscar.setVisible(true);
    }//GEN-LAST:event_botonbuscarusuarioActionPerformed

    private void jComboBoxMarcaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaAdminActionPerformed

    private void jTextFieldReferenciaArticuloAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReferenciaArticuloAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReferenciaArticuloAdminActionPerformed

    public static void main(String args[]) {
     

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }
    
    public void salir(){
        this.setVisible(false);
        Inicio in = new Inicio();
        in.setVisible(true);
    }
    
    public void VentanacrearCliente(){
         AgregarCliente ac = new AgregarCliente(this, true);
         ac.setVisible(true);
     }
     
     public void VentanaModificarCliente(Cliente cliente){
        ModificarCliente mc = new ModificarCliente(this, true, cliente);
         mc.setVisible(true);
     }
     
     public void VentanaDetallesCliente(Cliente cliente){ 
         DetallesCliente dc = new DetallesCliente(this, true, cliente);
         dc.setVisible(true);
     }
    
     
     public void VentanaDetallesArticulo(Producto producto){
         DetallesArticulo da = new DetallesArticulo(this, true, producto);
         da.setVisible(true);
     }
     
     public void llenarTablaClientes(List<Cliente> listaClientes, JTable tabla)
     {
        DefaultTableModel dtm = new DefaultTableModel();
        tabla.setModel(dtm);
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
     
     public void llenarTablaUsuarios(List<Usuario> listaUsuarios, JTable tabla)
     {
        DefaultTableModel dtm = new DefaultTableModel();
        tabla.setModel(dtm);
        dtm.addColumn("NOMBRE");
        dtm.addColumn("IDENTIFICACIÓN");
        dtm.addColumn("TELÉFONO");
        dtm.addColumn("DIRECCION");
        dtm.addColumn("LOGIN");
        dtm.addColumn("TIPO");
        dtm.addColumn("ESTADO");
        dtm.addColumn("VENTAS($)");
        
        String[] fila = new String[8];
        for (int i = 0; i < listaUsuarios.size(); i++) {
           fila[0]=listaUsuarios.get(i).getNombreusuario()+ " " + listaUsuarios.get(i).getApellidosusuario();
           fila[1]=listaUsuarios.get(i).getIdentificacionusuario();
           fila[2]=listaUsuarios.get(i).getTelefonousuario();
           fila[3]=listaUsuarios.get(i).getDireccion();
           fila[4]=listaUsuarios.get(i).getLogin();
           fila[5]=listaUsuarios.get(i).getTipo();
           String s= "Inactivo";
           if(listaUsuarios.get(i).getEstado()){
               s= "Activo";
           }
           fila[6]=s;
           fila[7]=calcularVentasUsuario(listaUsuarios.get(i).getVentaList()) + "";
           dtm.addRow(fila);
        }
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
        for (int i = 0; i < listaProducto.size(); i++) 
        {
           fila[0]=listaProducto.get(i).getIdproducto()+"";
           fila[1]=listaProducto.get(i).getDescripcion();
           fila[2]=listaProducto.get(i).getTalla();
           fila[3]=listaProducto.get(i).getCantidadunidades()+"";
           fila[4]=listaProducto.get(i).getMarca();
           fila[5]=Math.round(listaProducto.get(i).getPrecio())+"";
           dtm.addRow(fila);
        }
    }
     
     public void desactivarBotones(){
         jButtonDetallesArticuloAdmin.setEnabled(false);
         jButtonDetallesClienteAdmin.setEnabled(false);
         jButtonDetallesUsuario.setEnabled(false);
         jButtonModificarUsuario.setEnabled(false);
         jButtonModificarClienteAdmin.setEnabled(false);
         jButtonModificarArticuloAdmin.setEnabled(false);
     }
     
    public void buscarUsuarios(String parametro,JTable tabla)
    {
         List<Usuario> listaBusqueda = lu.consultarUsuarios();
         List<Usuario> listaResultado = new ArrayList<>();
         for (int i = 0; i < listaBusqueda.size(); i++) 
         {
            if(listaBusqueda.get(i).getNombreusuario().equalsIgnoreCase(parametro)
                    || listaBusqueda.get(i).getApellidosusuario().equalsIgnoreCase(parametro)
                    || listaBusqueda.get(i).getIdentificacionusuario().equalsIgnoreCase(parametro))
            {
                listaResultado.add(listaBusqueda.get(i));
            }
         }
         llenarTablaUsuarios(listaResultado,tabla);
    }
    
    public void buscarClientes(String parametro,JTable tabla){
         List<Cliente> listaBusqueda = logicaCliente.consultarClientes();
         List<Cliente> listaResultado = new ArrayList<>();
         for (int i = 0; i < listaBusqueda.size(); i++) 
         {
            if(listaBusqueda.get(i).getNombrecliente().equalsIgnoreCase(parametro)
                    || listaBusqueda.get(i).getApellidoscliente().equalsIgnoreCase(parametro)
                    || listaBusqueda.get(i).getIdentificacioncliente().equalsIgnoreCase(parametro))
            {
                listaResultado.add(listaBusqueda.get(i));
            }
        }
         llenarTablaClientes(listaResultado,tabla);
    }
    
    public Integer calcularVentasUsuario(List<Venta> listaVenta)
    {
        Integer ventas=0;  
        for (int i = 0; i < listaVenta.size(); i++) 
        {
            ventas+=listaVenta.get(i).getMontototal();
        }      
        return ventas;
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
    
    public void llenarbusquedausuario(String busqueda)
    {
        reporteventasvendedor.setText(busqueda);
    }
    
    public void llenarbusquedacliente(String busqueda)
    {
        reportecomprascliente.setText(busqueda);
    }
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscarcliente;
    private javax.swing.JButton botonbuscarusuario;
    private javax.swing.JButton botonreportecliente;
    private javax.swing.JButton botonreportedevoluciones;
    private javax.swing.JButton botonreporteinventario;
    private javax.swing.JButton botonreportevendedor;
    private javax.swing.JButton botonreporteventas;
    private javax.swing.JFormattedTextField fechafindevolucion;
    private javax.swing.JFormattedTextField fechafinventas;
    private javax.swing.JFormattedTextField fechainiciodevolucion;
    private javax.swing.JFormattedTextField fechainicioventas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarArticuloAdmin;
    private javax.swing.JButton jButtonAgregarClienteAdmin;
    private javax.swing.JButton jButtonAgregarUsuario;
    private javax.swing.JButton jButtonBusquedaAdmin;
    private javax.swing.JButton jButtonBusquedaUsuario;
    private javax.swing.JButton jButtonBúsquedaArticulosAdmin;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonCargarProductos;
    private javax.swing.JButton jButtonCargarTabla;
    private javax.swing.JButton jButtonDetallesArticuloAdmin;
    private javax.swing.JButton jButtonDetallesClienteAdmin;
    private javax.swing.JButton jButtonDetallesUsuario;
    private javax.swing.JButton jButtonModificarArticuloAdmin;
    private javax.swing.JButton jButtonModificarClienteAdmin;
    private javax.swing.JButton jButtonModificarUsuario;
    private javax.swing.JButton jButtonSalirInventario;
    private javax.swing.JButton jButtonSalirReportes;
    private javax.swing.JButton jButtonSalirUsuarios;
    private javax.swing.JButton jButtonVerReporteInventario;
    private javax.swing.JComboBox<String> jComboBoxMarcaAdmin;
    private javax.swing.JComboBox<String> jComboBoxTallasAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMaxCantidadAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMaxPrecioAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMinCantidadAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldMinPrecioAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCantidadArticulos;
    private javax.swing.JLabel jLabelDescripcionArticulo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelFondo3;
    private javax.swing.JLabel jLabelFondo4;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPrecioArticulo;
    private javax.swing.JLabel jLabelReferenciaArticulo;
    private javax.swing.JLabel jLabelTallaArticulo;
    private javax.swing.JPanel jPanelAdministrar;
    private javax.swing.JPanel jPanelClientesVendedor;
    private javax.swing.JPanel jPanelInventarioVendedor;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneVistaAdministrador;
    private javax.swing.JTable jTableArticulosAdmin;
    private javax.swing.JTable jTableClientesAdmin;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldBusquedaClientes;
    private javax.swing.JTextField jTextFieldBusquedaUsuarios;
    private javax.swing.JTextField jTextFieldDescripcionArticuloAdmin;
    private javax.swing.JTextField jTextFieldReferenciaArticuloAdmin;
    private javax.swing.JTextField reportecomprascliente;
    private javax.swing.JTextField reporteventasvendedor;
    // End of variables declaration//GEN-END:variables
}
