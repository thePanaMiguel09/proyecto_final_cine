/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

    import Logica.Cine;
public class iguEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form iguEmpleado
     */
    public iguEmpleado() {
        initComponents();
        DeskopEmpleado.setVisible(true);
        
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_registroCliente = new javax.swing.JButton();
        b_venderBoleta = new javax.swing.JButton();
        b_reserva = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        DeskopEmpleado = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CINEMOVIES-EMPLEADO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, 364, 32));

        b_registroCliente.setBackground(new java.awt.Color(0, 255, 255));
        b_registroCliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        b_registroCliente.setText("REGISTRAR CLIENTE");
        b_registroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registroClienteActionPerformed(evt);
            }
        });
        jPanel1.add(b_registroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 179, -1, -1));

        b_venderBoleta.setBackground(new java.awt.Color(0, 255, 255));
        b_venderBoleta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        b_venderBoleta.setText("VENDER BOLETA");
        jPanel1.add(b_venderBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 142, 177, -1));

        b_reserva.setBackground(new java.awt.Color(0, 255, 255));
        b_reserva.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        b_reserva.setText("RESERVAR SILLA");
        jPanel1.add(b_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 216, 177, -1));

        b_salir.setBackground(new java.awt.Color(0, 255, 255));
        b_salir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        b_salir.setText("SALIR");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        jPanel1.add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 259, -1, -1));

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 55, -1, -1));

        javax.swing.GroupLayout DeskopEmpleadoLayout = new javax.swing.GroupLayout(DeskopEmpleado);
        DeskopEmpleado.setLayout(DeskopEmpleadoLayout);
        DeskopEmpleadoLayout.setHorizontalGroup(
            DeskopEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        DeskopEmpleadoLayout.setVerticalGroup(
            DeskopEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel1.add(DeskopEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 330, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        dispose();
        iguLogIn abrir = new iguLogIn();
        abrir.setVisible(true);
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_registroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registroClienteActionPerformed
       Registrar registroCliente = new Registrar();
       registroCliente.setVisible(true);
       DeskopEmpleado.add(registroCliente);
       
       
    }//GEN-LAST:event_b_registroClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(iguEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iguEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iguEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iguEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iguEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskopEmpleado;
    private javax.swing.JButton b_registroCliente;
    private javax.swing.JButton b_reserva;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_venderBoleta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
