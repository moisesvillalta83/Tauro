package Menu;

import java.awt.Color;

public class Espacios extends javax.swing.JFrame {
    
    private String dniUsuario;
    private String contrasenaUsuario;
    
    public Espacios(String dniUsuario, String contrasenaUsuario) {
        this.setLocationRelativeTo(null);
        this.dniUsuario = dniUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        initComponents();
        if (!(dniUsuario.equals("75284260") && contrasenaUsuario.equals("Overw@tch73"))) {
            EmpleadosVentana.setVisible(false);
        }
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ocupacion8 = new javax.swing.JLabel();
        Espacio8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        EmpleadosVentana = new javax.swing.JButton();
        IngresoVentana = new javax.swing.JButton();
        SalidaVentana = new javax.swing.JButton();
        HistorialVentana = new javax.swing.JButton();
        EspaciosVentana = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ocupacion1 = new javax.swing.JLabel();
        Espacio1 = new javax.swing.JButton();
        Espacio2 = new javax.swing.JButton();
        Espacio3 = new javax.swing.JButton();
        Espacio4 = new javax.swing.JButton();
        Espacio5 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        Espacio6 = new javax.swing.JButton();
        Espacio7 = new javax.swing.JButton();
        Espacio9 = new javax.swing.JButton();
        Espacio10 = new javax.swing.JButton();
        Espacio11 = new javax.swing.JButton();
        Espacio12 = new javax.swing.JButton();
        Espacio13 = new javax.swing.JButton();
        Ocupacion14 = new javax.swing.JLabel();
        Ocupacion15 = new javax.swing.JLabel();
        Ocupacion16 = new javax.swing.JLabel();
        Ocupacion17 = new javax.swing.JLabel();
        Ocupacion18 = new javax.swing.JLabel();
        Ocupacion19 = new javax.swing.JLabel();
        Ocupacion20 = new javax.swing.JLabel();
        Ocupacion21 = new javax.swing.JLabel();
        Ocupacion22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ocupacion23 = new javax.swing.JLabel();
        Ocupacion24 = new javax.swing.JLabel();

        Ocupacion8.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion8.setForeground(new java.awt.Color(51, 204, 0));
        Ocupacion8.setText("Desocupado");

        Espacio8.setBackground(new java.awt.Color(0, 153, 204));
        Espacio8.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio8.setForeground(new java.awt.Color(255, 255, 255));
        Espacio8.setText("Espacio 6");
        Espacio8.setBorder(null);
        Espacio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio8ActionPerformed(evt);
            }
        });

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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 180, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 180, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 180, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 180, 10));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 180, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 180, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 180, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 180, 140));

        jLabel1.setFont(new java.awt.Font("Roboto ExtraBold", 1, 36)); // NOI18N
        jLabel1.setText("Caseta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 180, 120));

        Ocupacion1.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion1.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion1.setText("Espacio 6");
        jPanel2.add(Ocupacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        Espacio1.setBackground(new java.awt.Color(0, 153, 204));
        Espacio1.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio1.setForeground(new java.awt.Color(255, 255, 255));
        Espacio1.setText("Información");
        Espacio1.setBorder(null);
        Espacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio1ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, 130, 30));

        Espacio2.setBackground(new java.awt.Color(0, 153, 204));
        Espacio2.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio2.setForeground(new java.awt.Color(255, 255, 255));
        Espacio2.setText("Información");
        Espacio2.setBorder(null);
        Espacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio2ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 130, 30));

        Espacio3.setBackground(new java.awt.Color(0, 153, 204));
        Espacio3.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio3.setForeground(new java.awt.Color(255, 255, 255));
        Espacio3.setText("Información");
        Espacio3.setBorder(null);
        Espacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio3ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, 130, 30));

        Espacio4.setBackground(new java.awt.Color(0, 153, 204));
        Espacio4.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio4.setForeground(new java.awt.Color(255, 255, 255));
        Espacio4.setText("Información");
        Espacio4.setBorder(null);
        Espacio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio4ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 130, 30));

        Espacio5.setBackground(new java.awt.Color(0, 153, 204));
        Espacio5.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio5.setForeground(new java.awt.Color(255, 255, 255));
        Espacio5.setText("Información");
        Espacio5.setBorder(null);
        Espacio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio5ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 130, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 180, 140));

        Espacio6.setBackground(new java.awt.Color(0, 153, 204));
        Espacio6.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio6.setForeground(new java.awt.Color(255, 255, 255));
        Espacio6.setText("Información");
        Espacio6.setBorder(null);
        Espacio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio6ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 130, 30));

        Espacio7.setBackground(new java.awt.Color(0, 153, 204));
        Espacio7.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio7.setForeground(new java.awt.Color(255, 255, 255));
        Espacio7.setText("Información");
        Espacio7.setBorder(null);
        Espacio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio7ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 130, 30));

        Espacio9.setBackground(new java.awt.Color(0, 153, 204));
        Espacio9.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio9.setForeground(new java.awt.Color(255, 255, 255));
        Espacio9.setText("Información");
        Espacio9.setBorder(null);
        Espacio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio9ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 130, 30));

        Espacio10.setBackground(new java.awt.Color(0, 153, 204));
        Espacio10.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio10.setForeground(new java.awt.Color(255, 255, 255));
        Espacio10.setText("Información");
        Espacio10.setBorder(null);
        Espacio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio10ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, 30));

        Espacio11.setBackground(new java.awt.Color(0, 153, 204));
        Espacio11.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio11.setForeground(new java.awt.Color(255, 255, 255));
        Espacio11.setText("Información");
        Espacio11.setBorder(null);
        Espacio11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio11ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 130, 30));

        Espacio12.setBackground(new java.awt.Color(0, 153, 204));
        Espacio12.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio12.setForeground(new java.awt.Color(255, 255, 255));
        Espacio12.setText("Información");
        Espacio12.setBorder(null);
        Espacio12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio12ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 140, 30));

        Espacio13.setBackground(new java.awt.Color(0, 153, 204));
        Espacio13.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        Espacio13.setForeground(new java.awt.Color(255, 255, 255));
        Espacio13.setText("Información");
        Espacio13.setBorder(null);
        Espacio13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio13ActionPerformed(evt);
            }
        });
        jPanel2.add(Espacio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 140, 30));

        Ocupacion14.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion14.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion14.setText("Espacio 1");
        jPanel2.add(Ocupacion14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, -1, -1));

        Ocupacion15.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion15.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion15.setText("Espacio 1");
        jPanel2.add(Ocupacion15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, -1, -1));

        Ocupacion16.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion16.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion16.setText("Espacio 1");
        jPanel2.add(Ocupacion16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, -1, -1));

        Ocupacion17.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion17.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion17.setText("Espacio 5");
        jPanel2.add(Ocupacion17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        Ocupacion18.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion18.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion18.setText("Espacio 4");
        jPanel2.add(Ocupacion18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, -1));

        Ocupacion19.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion19.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion19.setText("Espacio 8");
        jPanel2.add(Ocupacion19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        Ocupacion20.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion20.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion20.setText("Espacio 9");
        jPanel2.add(Ocupacion20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        Ocupacion21.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion21.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion21.setText("Espacio 10");
        jPanel2.add(Ocupacion21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        Ocupacion22.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion22.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion22.setText("Espacio 11");
        jPanel2.add(Ocupacion22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Logotipo Pension Estacionamiento Profesional Azul (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 550, 370));

        Ocupacion23.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion23.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion23.setText("Espacio 12");
        jPanel2.add(Ocupacion23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        Ocupacion24.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        Ocupacion24.setForeground(new java.awt.Color(97, 133, 184));
        Ocupacion24.setText("Espacio 7");
        jPanel2.add(Ocupacion24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Espacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio1ActionPerformed
        InfoEspacio info = new InfoEspacio("1");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio1ActionPerformed

    private void Espacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio2ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("2");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio2ActionPerformed

    private void Espacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio3ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("3");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio3ActionPerformed

    private void Espacio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio4ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("4");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio4ActionPerformed

    private void Espacio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio5ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("5");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio5ActionPerformed

    private void Espacio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio6ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("6");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio6ActionPerformed

    private void Espacio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio7ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("7");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio7ActionPerformed

    private void Espacio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio8ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("8");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio8ActionPerformed

    private void Espacio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio9ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("9");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio9ActionPerformed

    private void Espacio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio10ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("10");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio10ActionPerformed

    private void Espacio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio11ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("11");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio11ActionPerformed

    private void Espacio12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio12ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("12");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio12ActionPerformed

    private void Espacio13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio13ActionPerformed
        // TODO add your handling code here:
        InfoEspacio info = new InfoEspacio("13");
        info.setVisible(true);
    }//GEN-LAST:event_Espacio13ActionPerformed

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
    }//GEN-LAST:event_EspaciosVentanaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpleadosVentana;
    private javax.swing.JButton Espacio1;
    private javax.swing.JButton Espacio10;
    private javax.swing.JButton Espacio11;
    private javax.swing.JButton Espacio12;
    private javax.swing.JButton Espacio13;
    private javax.swing.JButton Espacio2;
    private javax.swing.JButton Espacio3;
    private javax.swing.JButton Espacio4;
    private javax.swing.JButton Espacio5;
    private javax.swing.JButton Espacio6;
    private javax.swing.JButton Espacio7;
    private javax.swing.JButton Espacio8;
    private javax.swing.JButton Espacio9;
    private javax.swing.JButton EspaciosVentana;
    private javax.swing.JButton HistorialVentana;
    private javax.swing.JButton IngresoVentana;
    private javax.swing.JLabel Ocupacion1;
    private javax.swing.JLabel Ocupacion14;
    private javax.swing.JLabel Ocupacion15;
    private javax.swing.JLabel Ocupacion16;
    private javax.swing.JLabel Ocupacion17;
    private javax.swing.JLabel Ocupacion18;
    private javax.swing.JLabel Ocupacion19;
    private javax.swing.JLabel Ocupacion20;
    private javax.swing.JLabel Ocupacion21;
    private javax.swing.JLabel Ocupacion22;
    private javax.swing.JLabel Ocupacion23;
    private javax.swing.JLabel Ocupacion24;
    private javax.swing.JLabel Ocupacion8;
    private javax.swing.JButton SalidaVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
