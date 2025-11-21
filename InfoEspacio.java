package Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class InfoEspacio extends javax.swing.JFrame {

    public InfoEspacio(String espacio) {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatos(espacio);
    }

    private void cargarDatos(String espacio) {

        String sql = "SELECT dni, nombre, apellido, celular, placa, marca FROM estacionamiento WHERE espacio = ? AND estado = 'Ocupado'";

        try (Connection con = Conexion.getInstance();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, espacio);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dniLabel.setText("DNI: " + rs.getString("dni"));
                nombreLabel.setText("Nombre: " + rs.getString("nombre"));
                apellidoLabel.setText("Apellido: " + rs.getString("apellido"));
                celularLabel.setText("Celular: " + rs.getString("celular"));
                placaLabel.setText("Placa: " + rs.getString("placa"));
                marcaLabel.setText("Marca: " + rs.getString("marca"));
            } else {
                JOptionPane.showMessageDialog(this, "Este espacio está desocupado.");
                this.dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setSize(450, 380);
    setResizable(false);

    // Panel principal con fondo suave
    jPanel1 = new javax.swing.JPanel();
    jPanel1.setBackground(new java.awt.Color(245, 247, 250));
    jPanel1.setLayout(new java.awt.BorderLayout(0, 20));
    jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

    // ----- TARJETA -----
    javax.swing.JPanel card = new javax.swing.JPanel();
    card.setBackground(new java.awt.Color(255, 255, 255));  
    card.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220), 1),
            javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)
    ));
    card.setLayout(new java.awt.GridLayout(8, 1, 0, 10)); 

    // Título
    titulo = new javax.swing.JLabel("Información del Espacio");
    titulo.setFont(new java.awt.Font("Segoe UI", 1, 22));
    titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    // Labels estilizados
    dniLabel = new javax.swing.JLabel("DNI: ");
    dniLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));

    nombreLabel = new javax.swing.JLabel("Nombre: ");
    nombreLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));

    apellidoLabel = new javax.swing.JLabel("Apellido: ");
    apellidoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));

    celularLabel = new javax.swing.JLabel("Celular: ");
    celularLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));

    placaLabel = new javax.swing.JLabel("Placa: ");
    placaLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));

    marcaLabel = new javax.swing.JLabel("Marca: ");
    marcaLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));

    // Agregar al card
    card.add(titulo);
    card.add(dniLabel);
    card.add(nombreLabel);
    card.add(apellidoLabel);
    card.add(celularLabel);
    card.add(placaLabel);
    card.add(marcaLabel);

    // Añadir a la ventana
    jPanel1.add(card, java.awt.BorderLayout.CENTER);
    add(jPanel1);

    pack();
}

    private javax.swing.JLabel titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JLabel placaLabel;
    private javax.swing.JLabel marcaLabel;
}