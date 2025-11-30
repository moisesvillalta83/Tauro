package Menu;

import java.sql.*;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;


public class Salida extends javax.swing.JFrame {
    
    private String dniUsuario;
    private String contrasenaUsuario;
    private boolean esRefresco = false;

    
    public Salida(String dniUsuario, String contrasenaUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dniUsuario = dniUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        if (!(dniUsuario.equals("75284260") && contrasenaUsuario.equals("Overw@tch73"))) {
            EmpleadosVentana.setVisible(false);
        }
        jToggleButtonBuscadorPorPlaca.addActionListener(e -> buscarPorPlaca());
        // 🔹 Placeholders: limpiar texto al hacer clic
        jTextFieldBuscadorPorPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (jTextFieldBuscadorPorPlaca.getText().equals("Placa")) {
                jTextFieldBuscadorPorPlaca.setText("");
                jTextFieldBuscadorPorPlaca.setForeground(new java.awt.Color(0, 0, 0)); // texto negro
            }
        }
    });

        Efectivo1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (Efectivo1.getText().equals("Efectivo")) {
                    Efectivo1.setText("");
                    Efectivo1.setForeground(new java.awt.Color(0, 0, 0)); // texto negro
                }
            }
        });
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
        jTextFieldBuscadorPorPlaca = new javax.swing.JTextField();
        jToggleButtonBuscadorPorPlaca = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInformacion = new javax.swing.JTable();
        jButtonCobrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Efectivo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Vuelto = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

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

        jTextFieldBuscadorPorPlaca.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldBuscadorPorPlaca.setText("Placa");
        jTextFieldBuscadorPorPlaca.setBorder(null);
        jTextFieldBuscadorPorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscadorPorPlacaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldBuscadorPorPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 320, 30));

        jToggleButtonBuscadorPorPlaca.setBackground(new java.awt.Color(0, 153, 255));
        jToggleButtonBuscadorPorPlaca.setFont(new java.awt.Font("Roboto Condensed ExtraBold", 0, 14)); // NOI18N
        jToggleButtonBuscadorPorPlaca.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonBuscadorPorPlaca.setText("Buscar");
        jPanel2.add(jToggleButtonBuscadorPorPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, 30));

        jTableInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Placa", "Ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableInformacion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 730, 50));

        jButtonCobrar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCobrar.setFont(new java.awt.Font("Roboto ExtraBold", 1, 36)); // NOI18N
        jButtonCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCobrar.setText("Cobrar");
        jButtonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCobrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 230, 60));

        jLabel1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        jLabel1.setText("Total A Pagar:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto ExtraBold", 1, 48)); // NOI18N
        jLabel2.setText("S/.00,00");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        Efectivo1.setForeground(new java.awt.Color(204, 204, 204));
        Efectivo1.setText("Efectivo");
        Efectivo1.setBorder(null);
        jPanel2.add(Efectivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 240, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed ExtraBold", 1, 36)); // NOI18N
        jLabel3.setText("Vuelto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 120, 30));

        Vuelto.setFont(new java.awt.Font("Roboto ExtraBold", 1, 36)); // NOI18N
        Vuelto.setText("S/.00,00");
        jPanel2.add(Vuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 150, 50));

        Calcular.setBackground(new java.awt.Color(0, 153, 255));
        Calcular.setFont(new java.awt.Font("Roboto Condensed ExtraBold", 1, 14)); // NOI18N
        Calcular.setForeground(new java.awt.Color(255, 255, 255));
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel2.add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 330, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpleadosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosVentanaActionPerformed
        // TODO add your handling code here:
        Empleados newframe = new Empleados(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosVentanaActionPerformed

    private void IngresoVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoVentanaActionPerformed
        // TODO add your handling code here:
        Ingreso newframe = new Ingreso(dniUsuario, contrasenaUsuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngresoVentanaActionPerformed

    private void SalidaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaVentanaActionPerformed
        // TODO add your handling code here:
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

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        try {
        String totalTexto = jLabel2.getText().replace("S/.", "").replace(",", ".");
        double total = Double.parseDouble(totalTexto);
        double efectivo = Double.parseDouble(Efectivo1.getText());

        double vuelto = efectivo - total;
        if (vuelto < 0) {
            JOptionPane.showMessageDialog(this, "El monto ingresado es insuficiente.");
            return;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        Vuelto.setText("S/." + df.format(vuelto));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error en el cálculo: " + e.getMessage());
    }
    }//GEN-LAST:event_CalcularActionPerformed

    private void jTextFieldBuscadorPorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscadorPorPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscadorPorPlacaActionPerformed

    private void buscarPorPlaca() {
    String placa = jTextFieldBuscadorPorPlaca.getText().trim();
    if (placa.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese una placa para buscar.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) jTableInformacion.getModel();
    model.setRowCount(0);

    try (Connection cn = Conexion.getInstance();
         PreparedStatement ps = cn.prepareStatement(
            "SELECT dni, nombre, apellido, placa, fecha_ingreso " +
            "FROM estacionamiento WHERE placa = ? AND estado = 'Ocupado'")) {

        ps.setString(1, placa);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = {
                rs.getString("dni"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("placa"),
                rs.getTimestamp("fecha_ingreso")
            };
            model.addRow(fila);
        }

        if (!esRefresco && model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No se encontró registro con esa placa o ya fue cobrado.");
    }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al buscar: " + ex.getMessage());
    }
    }  
    private void jButtonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCobrarActionPerformed
        // TODO add your handling code here:
            int fila = jTableInformacion.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un registro primero.");
        return;
    }

    String dni = jTableInformacion.getValueAt(fila, 0).toString();
    String placa = jTableInformacion.getValueAt(fila, 3).toString();
    Timestamp ingreso = Timestamp.valueOf(jTableInformacion.getValueAt(fila, 4).toString());
    LocalDateTime fechaIngreso = ingreso.toLocalDateTime();
    LocalDateTime fechaSalida = LocalDateTime.now();

    Duration duracion = Duration.between(fechaIngreso, fechaSalida);
    double horas = duracion.toMinutes() / 60.0;

    // ---- Calcular total a pagar ----
    double total;
    if (horas <= 1) {
        total = 5.00;
    } else {
        int horasCompletas = (int) horas;
        boolean tieneFraccion = (horas - horasCompletas) > 0;
        total = (horasCompletas * 5.0) + (tieneFraccion ? 2.5 : 0);
    }

    DecimalFormat df = new DecimalFormat("0.00");
    jLabel2.setText("S/." + df.format(total));

    double efectivo;
    try {
        efectivo = Double.parseDouble(Efectivo1.getText());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ingrese un monto de efectivo válido.");
        return;
    }

    double vuelto = efectivo - total;
    if (vuelto < 0) {
        JOptionPane.showMessageDialog(this, "El efectivo es insuficiente.");
        return;
    }

    Vuelto.setText("S/." + df.format(vuelto));

    try (Connection cn = Conexion.getInstance();) {

        // ---------------------------------------------------------
        // 1️⃣ OBTENER id_estacionamiento
        // ---------------------------------------------------------
        int idEstacionamiento = 0;

        PreparedStatement psID = cn.prepareStatement(
            "SELECT id_estacionamiento FROM estacionamiento WHERE placa=? AND estado='Ocupado'"
        );
        psID.setString(1, placa);
        ResultSet rs = psID.executeQuery();
        if (rs.next()) {
            idEstacionamiento = rs.getInt("id_estacionamiento");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el ID del estacionamiento.");
            return;
        }

        // ---------------------------------------------------------
        // 2️⃣ INSERTAR REGISTRO EN LA TABLA COBROS
        // ---------------------------------------------------------
        PreparedStatement psCobro = cn.prepareStatement(
            "INSERT INTO cobros (id_estacionamiento, dni, hora_ingreso, hora_salida, cobro, efectivo, vuelto, empleado) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
        );

        psCobro.setInt(1, idEstacionamiento);
        psCobro.setString(2, dni);
        psCobro.setTimestamp(3, ingreso);
        psCobro.setTimestamp(4, Timestamp.valueOf(fechaSalida));
        psCobro.setDouble(5, total);
        psCobro.setDouble(6, efectivo);
        psCobro.setDouble(7, vuelto);
        psCobro.setString(8, dniUsuario); // empleado que atendió

        psCobro.executeUpdate();

        // ---------------------------------------------------------
        // 3️⃣ ACTUALIZAR ESTACIONAMIENTO
        // ---------------------------------------------------------
        PreparedStatement ps = cn.prepareStatement(
            "UPDATE estacionamiento SET fecha_salida=?, estado='Finalizado', cobro=? WHERE placa=? AND estado='Ocupado'"
        );

        ps.setTimestamp(1, Timestamp.valueOf(fechaSalida));
        ps.setDouble(2, total);
        ps.setString(3, placa);
        ps.executeUpdate();

        // ---------------------------------------------------------
        // 4️⃣ ACTUALIZAR HISTORIAL
        // ---------------------------------------------------------
        

        JOptionPane.showMessageDialog(this, "Cobro registrado correctamente.");
        
        try {
        // ============================
        // 1. DOCUMENTO
        // ============================
        Document doc = new Document(PageSize.A4, 40, 40, 40, 40);

        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + File.separator + "Desktop";

        String fileName = "Ticket_Estacionamiento_" + placa + "_" + System.currentTimeMillis() + ".pdf";

        PdfWriter.getInstance(doc, new FileOutputStream(desktopPath + File.separator + fileName));
        doc.open();

        // ============================
        // 2. FUENTES
        // ============================
        Font tituloGrande = new Font(Font.FontFamily.HELVETICA, 26, Font.BOLD);
        Font encabezadoNegrita = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font encabezadoNormal = new Font(Font.FontFamily.HELVETICA, 12);
        Font tituloFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
        Font subTituloFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
        Font textoFont = new Font(Font.FontFamily.HELVETICA, 13);

        // ============================
        // 3. ENCABEZADO
        // ============================
        Paragraph tituloPrincipal = new Paragraph("TAURO", tituloGrande);
        tituloPrincipal.setAlignment(Element.ALIGN_CENTER);
        tituloPrincipal.setSpacingAfter(8);
        doc.add(tituloPrincipal);

        Paragraph infoEmpresa = new Paragraph();
        infoEmpresa.setAlignment(Element.ALIGN_LEFT);

        infoEmpresa.add(new Phrase("Empresa: ", encabezadoNegrita));
        infoEmpresa.add(new Phrase("TAURO S.A.C.\n", encabezadoNormal));

        infoEmpresa.add(new Phrase("RUC: ", encabezadoNegrita));
        infoEmpresa.add(new Phrase("78547896213\n", encabezadoNormal));

        infoEmpresa.add(new Phrase("Dirección: ", encabezadoNegrita));
        infoEmpresa.add(new Phrase("Av. Arenales 1923, Lince\n", encabezadoNormal));

        infoEmpresa.add(new Phrase("Correo: ", encabezadoNegrita));
        infoEmpresa.add(new Phrase("tauro.estacionamiento@gmail.com\n", encabezadoNormal));

        infoEmpresa.add(new Phrase("Celular: ", encabezadoNegrita));
        infoEmpresa.add(new Phrase("912987354\n", encabezadoNormal));

        infoEmpresa.setSpacingAfter(20);
        doc.add(infoEmpresa);

        // ============================
        // 4. TÍTULO
        // ============================
        Paragraph titulo = new Paragraph("REPORTE DEL ESTACIONAMIENTO", tituloFont);
        titulo.setAlignment(Element.ALIGN_CENTER);
        titulo.setSpacingAfter(20);
        doc.add(titulo);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        // ============================
        // 5. SECCIÓN DE DATOS EN COLUMNA
        // ============================
        Paragraph datos = new Paragraph();
        datos.setAlignment(Element.ALIGN_LEFT);
        datos.setSpacingBefore(10);
        datos.setSpacingAfter(10);

        datos.add(new Phrase("DNI: ", encabezadoNegrita));
        datos.add(new Phrase(dni + "\n", textoFont));

        // Obtener nombre + apellido
        String nombre = "";
        String apellido = "";

        try (Connection cn2 = Conexion.getInstance()) {
            PreparedStatement psDatos = cn2.prepareStatement(
                "SELECT nombre, apellido FROM estacionamiento WHERE placa = ? LIMIT 1"
            );
            psDatos.setString(1, placa);
            ResultSet rs2 = psDatos.executeQuery();
            if (rs2.next()) {
                nombre = rs2.getString("nombre");
                apellido = rs2.getString("apellido");
            }
        }


        datos.add(new Phrase("Nombre: ", encabezadoNegrita));
        datos.add(new Phrase(nombre + " " + apellido + "\n", textoFont));

        datos.add(new Phrase("Placa: ", encabezadoNegrita));
        datos.add(new Phrase(placa + "\n", textoFont));

        datos.add(new Phrase("Ingreso: ", encabezadoNegrita));
        datos.add(new Phrase(sdf.format(ingreso) + "\n", textoFont));

        datos.add(new Phrase("Salida: ", encabezadoNegrita));
        datos.add(new Phrase(sdf.format(Timestamp.valueOf(fechaSalida)) + "\n", textoFont));

        datos.add(new Phrase("Efectivo: ", encabezadoNegrita));
        datos.add(new Phrase("S/ " + df.format(efectivo) + "\n", textoFont));

        datos.add(new Phrase("Cobro: ", encabezadoNegrita));
        datos.add(new Phrase("S/ " + df.format(total) + "\n", textoFont));

        doc.add(datos);

        // ============================
        // 6. DESPEDIDA
        // ============================
        Paragraph gracias = new Paragraph("¡Gracias por su visita!", subTituloFont);
        gracias.setAlignment(Element.ALIGN_CENTER);
        gracias.setSpacingBefore(25);
        doc.add(gracias);

        doc.close();
        // Abrir automáticamente el PDF
        try {
            File pdfFile = new File(desktopPath + File.separator + fileName);
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    JOptionPane.showMessageDialog(this, "El entorno no permite abrir el archivo automáticamente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el archivo PDF.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al abrir el PDF: " + e.getMessage());
        }


        JOptionPane.showMessageDialog(this, "PDF generado en el Escritorio:\n" + fileName);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al generar PDF: " + ex.getMessage());
    }


    esRefresco = true;
    buscarPorPlaca();
    esRefresco = false;


    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al registrar cobro: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButtonCobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Efectivo1;
    private javax.swing.JButton EmpleadosVentana;
    private javax.swing.JButton EspaciosVentana;
    private javax.swing.JButton HistorialVentana;
    private javax.swing.JButton IngresoVentana;
    private javax.swing.JButton SalidaVentana;
    private javax.swing.JLabel Vuelto;
    private javax.swing.JButton jButtonCobrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableInformacion;
    private javax.swing.JTextField jTextFieldBuscadorPorPlaca;
    private javax.swing.JToggleButton jToggleButtonBuscadorPorPlaca;
    // End of variables declaration//GEN-END:variables
}
