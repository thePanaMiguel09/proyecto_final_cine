/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author pc
 */
public class PanelRegistroClientes extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegistroClientes
     */
    public PanelRegistroClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_cell = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        type_sex = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        t_user = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordCliente = new javax.swing.JPasswordField();
        b_registrar_cliente = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(267, 168));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRO DE CLIENTES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 6, -1, -1));

        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, -1, -1));
        add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 28, 216, -1));

        jLabel3.setText("Correo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, -1, -1));
        add(t_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 56, 216, -1));

        jLabel4.setText("Celular");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, -1, -1));
        add(t_cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 84, 216, -1));

        jLabel5.setText("Edad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, -1, -1));
        add(t_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 112, -1, -1));

        jLabel6.setText("Sexo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 115, -1, -1));

        type_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " " }));
        add(type_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 112, -1, -1));

        jLabel7.setText("Usuario");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, -1, -1));
        add(t_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 140, 216, -1));

        jLabel8.setText("Contraseña");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, -1, -1));
        add(passwordCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 168, -1, -1));

        b_registrar_cliente.setText("REGISTRAR");
        add(b_registrar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 168, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_registrar_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField passwordCliente;
    private javax.swing.JTextField t_age;
    private javax.swing.JTextField t_cell;
    private javax.swing.JTextField t_mail;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_user;
    private javax.swing.JComboBox<String> type_sex;
    // End of variables declaration//GEN-END:variables
}
