
package Vista;

import Modelo.Cliente;
import Modelo.Usuario;
import javax.swing.JOptionPane;


public class Buscar extends javax.swing.JDialog {

    
    private VistaAdministrador framePadre;
    private boolean tipo;
    public Buscar(VistaAdministrador parent, boolean modal,boolean tipo) 
    {
        super(parent, modal);
        framePadre = parent;
        this.tipo = tipo;
        initComponents();
        this.setTitle("Buscar");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        campobusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablebuscar = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BUSCAR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 100, 30));
        getContentPane().add(campobusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));

        jtablebuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtablebuscar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 500, 130));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 30));

        jLabelFondo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -50, 760, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        
        if(tipo)
        {
            framePadre.llenarbusquedausuario(jtablebuscar.getValueAt(jtablebuscar.getSelectedRow(), 1).toString());
        }
        else
        {
            framePadre.llenarbusquedacliente(jtablebuscar.getValueAt(jtablebuscar.getSelectedRow(), 4).toString());
        }
        this.setVisible(false);           
    }//GEN-LAST:event_aceptarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
         if(tipo)
        {
             framePadre.buscarUsuarios(campobusqueda.getText(),jtablebuscar);
        }
        else
        {
            framePadre.buscarClientes(campobusqueda.getText(), jtablebuscar);
        } 
       
    }//GEN-LAST:event_buscarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField campobusqueda;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablebuscar;
    // End of variables declaration//GEN-END:variables
}
