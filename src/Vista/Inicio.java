
package Vista;

import Logica.LogicaUsuario;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {

   
    public Inicio() {
        initComponents();
        this.setTitle("Evolucion Software - Inicio");
        this.setSize(700, 500);
        this.crearFondo();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Inicio.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        Inicio.add(jLabel1);
        jLabel1.setBounds(210, 370, 70, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        Inicio.add(jLabel2);
        jLabel2.setBounds(210, 390, 90, 14);
        Inicio.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(300, 360, 160, 25);

        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        Inicio.add(jButtonIngresar);
        jButtonIngresar.setBounds(300, 420, 80, 23);

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        Inicio.add(jButtonSalir);
        jButtonSalir.setBounds(380, 420, 80, 23);
        Inicio.add(jPasswordField1);
        jPasswordField1.setBounds(300, 390, 160, 25);

        getContentPane().add(Inicio);
        Inicio.setBounds(-4, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        LogicaUsuario logicaUsuario = new LogicaUsuario();
        String usuario = jTextFieldUsuario.getText();
        String contraseña = jPasswordField1.getPassword().toString();
        
        switch(logicaUsuario.validarIngreso(usuario, contraseña))
        {
            case 1:
                this.setVisible(false);
                VistaAdministrador vv = new VistaAdministrador();
                vv.setVisible(true);
                break;
            case 2:
                this.setVisible(false);
                VistaVendedor va = new VistaVendedor();
                va.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Datos erroneos, intentalo de nuevo");
                break;
                
        }    
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
        JOptionPane.showMessageDialog(rootPane, "Hasta Pronto!");
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaVendedor va = new VistaVendedor();
                va.setVisible(true);
                //new Inicio().setVisible(true);
            }
        });
    }
    
    public void crearFondo(){
        JLabel fondo = new JLabel(new ImageIcon("fondoInicio.PNG"));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/fondoInicio.png"))); 
        fondo.setText("");
        Inicio.add(fondo);
        fondo.setBounds(0, 0, this.getWidth(), this.getHeight());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
