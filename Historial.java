package Menu;
import Menu.Login;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Historial extends javax.swing.JFrame {

    private String dniUsuario;
    private String contrasenaUsuario;
    
    public Historial(String dniUsuario, String contrasenaUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarClientes();
        this.dniUsuario = dniUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        if (!(dniUsuario.equals("75284260") && contrasenaUsuario.equals("Overw@tch73"))) {
            EmpleadosVentana.setVisible(false);
        }
        configurarTextFields();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        IngresoVentana1 = new javax.swing.JButton();
        SalidaVentana1 = new javax.swing.JButton();
        HistorialVentana1 = new javax.swing.JButton();
        EspaciosVentana1 = new javax.swing.JButton();
        EmpleadosVentana1 = new javax.swing.JButton();
        NombreTF = new javax.swing.JTextField();
        DNITF = new javax.swing.JTextField();
        CelularTF = new javax.swing.JTextField();
        ApellidoTF = new javax.swing.JTextField();
        Placa = new javax.swing.JTextField();
        MarcaTF = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jTextFieldBuscadorPorPlaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInformacion = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 243, 238));

        EmpleadosVentana.setBackground(new java.awt.Color(248, 243, 238));
        EmpleadosVentana.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        EmpleadosVentana.setForeground(new java.awt.Color(97, 133, 184));
        EmpleadosVentana.setText("    Empleados");
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
        IngresoVentana.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(248, 243, 238));

        IngresoVentana1.setBackground(new java.awt.Color(248, 243, 238));
        IngresoVentana1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        IngresoVentana1.setForeground(new java.awt.Color(97, 133, 184));
        IngresoVentana1.setText("    Ingreso");
        IngresoVentana1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IngresoVentana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresoVentana1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IngresoVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoVentana1ActionPerformed(evt);
            }
        });

        SalidaVentana1.setBackground(new java.awt.Color(248, 243, 238));
        SalidaVentana1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        SalidaVentana1.setForeground(new java.awt.Color(97, 133, 184));
        SalidaVentana1.setText("    Salida");
        SalidaVentana1.setBorder(null);
        SalidaVentana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalidaVentana1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalidaVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaVentana1ActionPerformed(evt);
            }
        });

        HistorialVentana1.setBackground(new java.awt.Color(248, 243, 238));
        HistorialVentana1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        HistorialVentana1.setForeground(new java.awt.Color(97, 133, 184));
        HistorialVentana1.setText("    Historial");
        HistorialVentana1.setBorder(null);
        HistorialVentana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HistorialVentana1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HistorialVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialVentana1ActionPerformed(evt);
            }
        });

        EspaciosVentana1.setBackground(new java.awt.Color(248, 243, 238));
        EspaciosVentana1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        EspaciosVentana1.setForeground(new java.awt.Color(97, 133, 184));
        EspaciosVentana1.setText("    Espacios");
        EspaciosVentana1.setBorder(null);
        EspaciosVentana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EspaciosVentana1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EspaciosVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspaciosVentana1ActionPerformed(evt);
            }
        });

        EmpleadosVentana1.setBackground(new java.awt.Color(248, 243, 238));
        EmpleadosVentana1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        EmpleadosVentana1.setForeground(new java.awt.Color(97, 133, 184));
        EmpleadosVentana1.setText("    Empleados");
        EmpleadosVentana1.setBorder(null);
        EmpleadosVentana1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpleadosVentana1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmpleadosVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosVentana1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IngresoVentana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HistorialVentana1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(SalidaVentana1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(EmpleadosVentana1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(EspaciosVentana1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(IngresoVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalidaVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(HistorialVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspaciosVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmpleadosVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 650));

        NombreTF.setForeground(new java.awt.Color(204, 204, 204));
        NombreTF.setText("Nombre");
        NombreTF.setBorder(null);
        NombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTFActionPerformed(evt);
            }
        });
        jPanel3.add(NombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 340, 30));

        DNITF.setForeground(new java.awt.Color(204, 204, 204));
        DNITF.setText("DNI");
        DNITF.setBorder(null);
        DNITF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNITFActionPerformed(evt);
            }
        });
        jPanel3.add(DNITF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 340, 30));

        CelularTF.setForeground(new java.awt.Color(204, 204, 204));
        CelularTF.setText("Celular");
        CelularTF.setBorder(null);
        CelularTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularTFActionPerformed(evt);
            }
        });
        jPanel3.add(CelularTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 340, 30));

        ApellidoTF.setForeground(new java.awt.Color(204, 204, 204));
        ApellidoTF.setText("Apellido");
        ApellidoTF.setBorder(null);
        ApellidoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTFActionPerformed(evt);
            }
        });
        jPanel3.add(ApellidoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 340, 30));

        Placa.setForeground(new java.awt.Color(204, 204, 204));
        Placa.setText("Placa");
        Placa.setBorder(null);
        Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaActionPerformed(evt);
            }
        });
        jPanel3.add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 340, 30));

        MarcaTF.setForeground(new java.awt.Color(204, 204, 204));
        MarcaTF.setText("Marca");
        MarcaTF.setBorder(null);
        MarcaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaTFActionPerformed(evt);
            }
        });
        jPanel3.add(MarcaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 340, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 340, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 340, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 340, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 340, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 340, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 340, 10));

        jTextFieldBuscadorPorPlaca.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldBuscadorPorPlaca.setText("Placa");
        jTextFieldBuscadorPorPlaca.setBorder(null);
        jPanel3.add(jTextFieldBuscadorPorPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 340, 30));

        jTableInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°Estacionamiento", "DNI", "Nombre", "Apellido", "Celular", "Placa", "Marca", "Ingreso", "Salida", "Espacio", "Cobro", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableInformacion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 870, 310));

        Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel3.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, -1, -1));

        Editar.setBackground(new java.awt.Color(255, 204, 0));
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPanel3.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, -1, -1));

        Buscar.setBackground(new java.awt.Color(0, 102, 255));
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel3.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 340, 10));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTFActionPerformed

    private void DNITFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNITFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNITFActionPerformed

    private void CelularTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularTFActionPerformed

    private void ApellidoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTFActionPerformed

    private void PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaActionPerformed

    private void MarcaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTFActionPerformed

    private void EspaciosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspaciosVentanaActionPerformed
        // TODO add your handling code here:
        Espacios newframe = new Espacios(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EspaciosVentanaActionPerformed

    private void HistorialVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialVentanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HistorialVentanaActionPerformed

    private void SalidaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaVentanaActionPerformed
        // TODO add your handling code here:
        Salida newframe = new Salida(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalidaVentanaActionPerformed

    private void IngresoVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoVentanaActionPerformed
        // TODO add your handling code here:
        Ingreso newframe = new Ingreso(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngresoVentanaActionPerformed

    private void EmpleadosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosVentanaActionPerformed
        Empleados newframe = new Empleados(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosVentanaActionPerformed

    private void EmpleadosVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosVentana1ActionPerformed
        // TODO add your handling code here:
        Empleados newframe = new Empleados(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosVentana1ActionPerformed

    private void EspaciosVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspaciosVentana1ActionPerformed
        // TODO add your handling code here:
        Espacios newframe = new Espacios(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EspaciosVentana1ActionPerformed

    private void HistorialVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialVentana1ActionPerformed
        // TODO add your handling code here:
        Historial newframe = new Historial(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialVentana1ActionPerformed

    private void SalidaVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaVentana1ActionPerformed
        // TODO add your handling code here:
        Salida newframe = new Salida(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalidaVentana1ActionPerformed

    private void IngresoVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoVentana1ActionPerformed
        // TODO add your handling code here:
        Ingreso newframe = new Ingreso(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngresoVentana1ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String placa = jTextFieldBuscadorPorPlaca.getText().trim();
    DefaultTableModel model = (DefaultTableModel) jTableInformacion.getModel();
    model.setRowCount(0);

    try (Connection conn = Conexion.getInstance()) {
        String sql = """
            SELECT id_estacionamiento, dni, nombre, apellido, celular, placa, marca,
                   fecha_ingreso, fecha_salida, espacio, cobro, estado
            FROM estacionamiento
            WHERE placa LIKE ?
            """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + placa + "%");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = new Object[]{
                rs.getInt("id_estacionamiento"),
                rs.getString("dni"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("celular"),
                rs.getString("placa"),
                rs.getString("marca"),
                rs.getTimestamp("fecha_ingreso"),
                rs.getTimestamp("fecha_salida"),
                rs.getString("espacio"),
                rs.getBigDecimal("cobro"),
                rs.getString("estado")
            };
            model.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage());
    }
    }//GEN-LAST:event_BuscarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

    int fila = jTableInformacion.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para editar");
        return;
    }

    int idEstacionamiento = (int) jTableInformacion.getValueAt(fila, 0);
    String dni = DNITF.getText();
    String nombre = NombreTF.getText();
    String apellido = ApellidoTF.getText();
    String celular = CelularTF.getText();
    String placa = Placa.getText();
    String marca = MarcaTF.getText();

    if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() ||
        celular.isEmpty() || placa.isEmpty() || marca.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor completa todos los campos antes de editar.");
        return;
    }

    try (Connection conn = Conexion.getInstance()) {
        String sql = """
            UPDATE estacionamiento
            SET dni=?, nombre=?, apellido=?, celular=?, placa=?, marca=?
            WHERE id_estacionamiento=?
            """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, dni);
        ps.setString(2, nombre);
        ps.setString(3, apellido);
        ps.setString(4, celular);
        ps.setString(5, placa);
        ps.setString(6, marca);
        ps.setInt(7, idEstacionamiento);

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
            cargarClientes();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar: " + e.getMessage());
    }
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    int fila = jTableInformacion.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un registro para eliminar");
        return;
    }

    int idEstacionamiento = (int) jTableInformacion.getValueAt(fila, 0);

    int confirm = JOptionPane.showConfirmDialog(
            this,
            "¿Seguro que deseas eliminar este registro?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION
    );

    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    try (Connection conn = Conexion.getInstance()) {
        String sql = "UPDATE estacionamiento SET estado = 'CANCELADO' WHERE id_estacionamiento = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idEstacionamiento);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Registro eliminado (lógicamente).");
            cargarClientes();  // 🔄 refresca la tabla
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar: " + e.getMessage());
    }
    }//GEN-LAST:event_EliminarActionPerformed

    // =================== CARGAR ESTACIONAMIENTOS ===================
    private void cargarClientes() {
    DefaultTableModel model = (DefaultTableModel) jTableInformacion.getModel();
    model.setRowCount(0);

    String sql = """
        SELECT id_estacionamiento, dni, nombre, apellido, celular, placa, marca,
               fecha_ingreso, fecha_salida, espacio, cobro, estado
        FROM estacionamiento
        WHERE estado IN ('Finalizado', 'Ocupado')
    """;

    try (Connection conn = Conexion.getInstance();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_estacionamiento"),
                rs.getString("dni"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("celular"),
                rs.getString("placa"),
                rs.getString("marca"),
                rs.getTimestamp("fecha_ingreso"),
                rs.getTimestamp("fecha_salida"),
                rs.getString("espacio"),
                rs.getBigDecimal("cobro"),
                rs.getString("estado")
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    }
    jTableInformacion.addMouseListener(new java.awt.event.MouseAdapter() { public void mouseClicked(java.awt.event.MouseEvent evt) { jTableInformacionMouseClicked(evt); } }); 
    }

    private void jTableInformacionMouseClicked(java.awt.event.MouseEvent evt) {                                               
    int fila = jTableInformacion.getSelectedRow();
    if (fila != -1) {
        DNITF.setText(jTableInformacion.getValueAt(fila, 1).toString());
        NombreTF.setText(jTableInformacion.getValueAt(fila, 2).toString());
        ApellidoTF.setText(jTableInformacion.getValueAt(fila, 3).toString());
        CelularTF.setText(jTableInformacion.getValueAt(fila, 4).toString());
        Placa.setText(jTableInformacion.getValueAt(fila, 5).toString());
        MarcaTF.setText(jTableInformacion.getValueAt(fila, 6).toString());
    }
    }
    private void configurarTextFields() {
    JTextField[] campos = {DNITF, NombreTF, ApellidoTF, CelularTF, Placa, MarcaTF, jTextFieldBuscadorPorPlaca};

    for (JTextField campo : campos) {
        campo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo.setForeground(Color.BLACK);
                if (campo.getText().equals("Nombre") || campo.getText().equals("Apellido") ||
                    campo.getText().equals("DNIi") || campo.getText().equals("Celular") ||
                    campo.getText().equals("Placa") || campo.getText().equals("Marca")) {
                    campo.setText("");
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campo.getText().trim().isEmpty()) {
                    campo.setForeground(new Color(204, 204, 204));
                    if (campo == NombreTF) campo.setText("Nombre");
                    else if (campo == ApellidoTF) campo.setText("Apellido");
                    else if (campo == DNITF) campo.setText("DNI");
                    else if (campo == CelularTF) campo.setText("Celular");
                    else if (campo == Placa) campo.setText("Placa");
                    else if (campo == MarcaTF) campo.setText("Marca");
                }
            }
        });
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTF;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField CelularTF;
    private javax.swing.JTextField DNITF;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EmpleadosVentana;
    private javax.swing.JButton EmpleadosVentana1;
    private javax.swing.JButton EspaciosVentana;
    private javax.swing.JButton EspaciosVentana1;
    private javax.swing.JButton HistorialVentana;
    private javax.swing.JButton HistorialVentana1;
    private javax.swing.JButton IngresoVentana;
    private javax.swing.JButton IngresoVentana1;
    private javax.swing.JTextField MarcaTF;
    private javax.swing.JTextField NombreTF;
    private javax.swing.JTextField Placa;
    private javax.swing.JButton SalidaVentana;
    private javax.swing.JButton SalidaVentana1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTableInformacion;
    private javax.swing.JTextField jTextFieldBuscadorPorPlaca;
    // End of variables declaration//GEN-END:variables
}
