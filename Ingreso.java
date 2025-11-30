package Menu;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import controller.IngresoController;
import dao.*;
import java.util.List;

public class Ingreso extends javax.swing.JFrame {

    private String dniUsuario;
    private String contrasenaUsuario;
    
    public Ingreso(String dniUsuario, String contrasenaUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
                                        
        this.dniUsuario = dniUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        // Si el usuario NO es el administrador, ocultamos el botón Empleados
        if (!(dniUsuario.equals("75284260") && contrasenaUsuario.equals("Overw@tch73"))) {
            EmpleadosVentana.setVisible(false);
    }
        cargarEspaciosDisponibles();
        cargarMarcas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        EmpleadosVentana = new javax.swing.JButton();
        IngresoVentana = new javax.swing.JButton();
        SalidaVentana = new javax.swing.JButton();
        HistorialVentana = new javax.swing.JButton();
        EspaciosVentana = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        ApellidojLabel = new javax.swing.JLabel();
        ApellidoTextField = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        DNITextField = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jComboBoxEspacios = new javax.swing.JComboBox<>();
        jLabelPlaca1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jComboBoxMarca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 243, 238));

        EmpleadosVentana.setBackground(new java.awt.Color(248, 243, 238));
        EmpleadosVentana.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        EmpleadosVentana.setForeground(new java.awt.Color(97, 133, 184));
        EmpleadosVentana.setText("    Administración");
        EmpleadosVentana.setBorder(null);
        EmpleadosVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpleadosVentana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmpleadosVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosVentanaActionPerformed(evt);
            }
        });

        IngresoVentana.setBackground(new java.awt.Color(248, 243, 238));
        IngresoVentana.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        IngresoVentana.setForeground(new java.awt.Color(97, 133, 184));
        IngresoVentana.setText("    Ingreso");
        IngresoVentana.setBorder(null);
        IngresoVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresoVentana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IngresoVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoVentanaActionPerformed(evt);
            }
        });

        SalidaVentana.setBackground(new java.awt.Color(248, 243, 238));
        SalidaVentana.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        SalidaVentana.setForeground(new java.awt.Color(97, 133, 184));
        SalidaVentana.setText("    Salida");
        SalidaVentana.setBorder(null);
        SalidaVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalidaVentana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalidaVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaVentanaActionPerformed(evt);
            }
        });

        HistorialVentana.setBackground(new java.awt.Color(248, 243, 238));
        HistorialVentana.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        HistorialVentana.setForeground(new java.awt.Color(97, 133, 184));
        HistorialVentana.setText("    Historial");
        HistorialVentana.setBorder(null);
        HistorialVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HistorialVentana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HistorialVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialVentanaActionPerformed(evt);
            }
        });

        EspaciosVentana.setBackground(new java.awt.Color(248, 243, 238));
        EspaciosVentana.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        EspaciosVentana.setForeground(new java.awt.Color(97, 133, 184));
        EspaciosVentana.setText("    Espacios");
        EspaciosVentana.setBorder(null);
        EspaciosVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EspaciosVentana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EspaciosVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspaciosVentanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IngresoVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HistorialVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(SalidaVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(EmpleadosVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(EspaciosVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(IngresoVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalidaVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(HistorialVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspaciosVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmpleadosVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 650));

        NombreLabel.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        NombreLabel.setText("Nombre:");
        jPanel2.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jLabel2.setText("Registrar Ingreso");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        NombreTextField.setBorder(null);
        NombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 450, 30));

        ApellidojLabel.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        ApellidojLabel.setText("Apellido:");
        jPanel2.add(ApellidojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        ApellidoTextField.setBorder(null);
        jPanel2.add(ApellidoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 450, 30));

        jLabelDNI.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jLabelDNI.setText("DNI:");
        jPanel2.add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        DNITextField.setBorder(null);
        jPanel2.add(DNITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 450, 30));

        jLabelCelular.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jLabelCelular.setText("Celular:");
        jPanel2.add(jLabelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jTextFieldCelular.setBorder(null);
        jPanel2.add(jTextFieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 450, 30));

        jLabelPlaca.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jLabelPlaca.setText("Espacio:");
        jPanel2.add(jLabelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        jTextFieldPlaca.setBorder(null);
        jPanel2.add(jTextFieldPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 140, 30));

        jLabelMarca.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jLabelMarca.setText("Marca:");
        jPanel2.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jComboBoxEspacios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBoxEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspaciosActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxEspacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 130, 40));

        jLabelPlaca1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jLabelPlaca1.setText("Placa:");
        jPanel2.add(jLabelPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 210, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 450, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 450, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 450, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 450, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 140, 10));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspaciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspaciosActionPerformed

    private void EmpleadosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosVentanaActionPerformed
        // TODO add your handling code here:
        Empleados newframe = new Empleados(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosVentanaActionPerformed

    private void IngresoVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoVentanaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_IngresoVentanaActionPerformed

    private void SalidaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaVentanaActionPerformed
        // TODO add your handling code here:
        Salida newframe = new Salida(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalidaVentanaActionPerformed

    private void HistorialVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialVentanaActionPerformed
        // TODO add your handling code here:
        Historial newframe = new Historial(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialVentanaActionPerformed

    private void EspaciosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspaciosVentanaActionPerformed
        // TODO add your handling code here:
        Espacios newframe = new Espacios(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EspaciosVentanaActionPerformed

    private void NombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        IngresoController controller = new IngresoController();
    boolean exito = controller.registrarCliente(
        NombreTextField.getText().trim(),
        ApellidoTextField.getText().trim(),
        DNITextField.getText().trim(),
        jTextFieldCelular.getText().trim(),
        jTextFieldPlaca.getText().trim(),
        jComboBoxMarca.getEditor().getItem().toString().trim(),
        (String) jComboBoxEspacios.getSelectedItem()
    );

    if (exito) {
        // Limpiar campos
        NombreTextField.setText("");
        ApellidoTextField.setText("");
        DNITextField.setText("");
        jTextFieldCelular.setText("");
        jTextFieldPlaca.setText("");
        jComboBoxMarca.setSelectedIndex(-1);
        jComboBoxMarca.getEditor().setItem("");
        jComboBoxEspacios.setSelectedIndex(0);

        // Redirigir al historial
        Historial historial = new Historial(dniUsuario, contrasenaUsuario);
        historial.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void cargarMarcas() {
    jComboBoxMarca.removeAllItems();

    String[] marcas = {
        "Toyota", "Hyundai", "Kia", "Mazda", "Nissan", "Chevrolet",
        "Volkswagen", "Ford", "Honda", "Suzuki", "Subaru",
        "BMW", "Mercedes-Benz", "Audi", "Renault", "Peugeot"
    };

    for (String m : marcas) {
        jComboBoxMarca.addItem(m);
    }

    jComboBoxMarca.setEditable(true); // Permite escribir nuevas marcas
    }

    private void cargarEspaciosDisponibles() {
    jComboBoxEspacios.removeAllItems();
    EstacionamientoDAO dao = new EstacionamientoDAO();
    try {
        List<String> espacios = dao.obtenerEspaciosDisponibles();
        if (espacios.isEmpty()) {
            jComboBoxEspacios.addItem("No hay espacios libres");
            jComboBoxEspacios.setEnabled(false);
        } else {
            for (String esp : espacios) {
                jComboBoxEspacios.addItem(esp);
            }
            jComboBoxEspacios.setEnabled(true);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar espacios: " + e.getMessage());
    }
}

    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTextField;
    private javax.swing.JLabel ApellidojLabel;
    private javax.swing.JTextField DNITextField;
    private javax.swing.JButton EmpleadosVentana;
    private javax.swing.JButton EspaciosVentana;
    private javax.swing.JButton HistorialVentana;
    private javax.swing.JButton IngresoVentana;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JButton SalidaVentana;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxEspacios;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelPlaca1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldPlaca;
    // End of variables declaration//GEN-END:variables
}
