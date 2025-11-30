package Menu;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Reportes extends javax.swing.JFrame {
    
    private String dniUsuario;
    private String contrasenaUsuario;
    private boolean esRefresco = false;

    
    public Reportes(String dniUsuario, String contrasenaUsuario) {
        initComponents();
        cargarCombos();
        configurarEventos();
        this.setLocationRelativeTo(null);
        this.dniUsuario = dniUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        if (!(dniUsuario.equals("75284260") && contrasenaUsuario.equals("Overw@tch73"))) {
        EmpleadosVentana.setVisible(false);
        }
    }

    private void cargarCombos() {
        // Periodos disponibles
        PeriododeTiempo.removeAllItems();
        PeriododeTiempo.addItem("Día");
        PeriododeTiempo.addItem("Semana");
        PeriododeTiempo.addItem("Mes");
        PeriododeTiempo.addItem("Año");
        // Dias (1–31)
        DiaInicial.removeAllItems();
        DiaFinal.removeAllItems();
        for (int i = 1; i <= 31; i++) {
        DiaInicial.addItem(String.valueOf(i));
        DiaFinal.addItem(String.valueOf(i));
        }
        // Meses (1–12)
        MesInicial.removeAllItems();
        MesFinal.removeAllItems();
        for (int i = 1; i <= 12; i++) {
        MesInicial.addItem(String.valueOf(i));
        MesFinal.addItem(String.valueOf(i));
        }
        // Años (2020–2035)
        AñoInicial.removeAllItems();
        AñoFinal.removeAllItems();
        for (int i = 2020; i <= 2035; i++) {
        AñoInicial.addItem(String.valueOf(i));
        AñoFinal.addItem(String.valueOf(i));
        }
    }

    private void configurarEventos() {
        PeriododeTiempo.addActionListener(e -> actualizarVisibilidadSegunPeriodo());
        // Cuando cambia mes inicial → ajustar mes final automático
        MesInicial.addActionListener(e -> {
        if (PeriododeTiempo.getSelectedItem().equals("Mes")) {
        MesFinal.setSelectedItem(MesInicial.getSelectedItem());
        }
        });
        AñoInicial.addActionListener(e -> {
        if (PeriododeTiempo.getSelectedItem().equals("Mes") || PeriododeTiempo.getSelectedItem().equals("Año")) {
        AñoFinal.setSelectedItem(AñoInicial.getSelectedItem());
        }
        });
    }

    private void actualizarVisibilidadSegunPeriodo() {
        String periodo = PeriododeTiempo.getSelectedItem().toString();
        switch (periodo) {
        case "Día":
        habilitarDia();
        break;
        case "Semana":
        habilitarSemana();
        break;
        case "Mes":
        habilitarMes();
        break;
        case "Año":
        habilitarAño();
        break;
        }
    }

    private void habilitarDia() {
    // Inicial habilitado
    DiaInicial.setEnabled(true);
    MesInicial.setEnabled(true);
    AñoInicial.setEnabled(true);

    // Final deshabilitado
    DiaFinal.setEnabled(false);
    MesFinal.setEnabled(false);
    AñoFinal.setEnabled(false);
    }

    private void habilitarSemana() {

    DiaInicial.setEnabled(true);
    MesInicial.setEnabled(true);
    AñoInicial.setEnabled(true);

    DiaFinal.setEnabled(false);
    MesFinal.setEnabled(false);
    AñoFinal.setEnabled(false);
    }

    private void habilitarMes() {

    // Solo mes y año
    DiaInicial.setEnabled(false);
    DiaFinal.setEnabled(false);

    MesInicial.setEnabled(true);
    AñoInicial.setEnabled(true);

    MesFinal.setEnabled(true);
    AñoFinal.setEnabled(true);
    }

    private void habilitarAño() {

    // Solo años
    AñoInicial.setEnabled(true);
    AñoFinal.setEnabled(true);

    // Deshabilitar días y meses
    DiaInicial.setEnabled(false);
    MesInicial.setEnabled(false);

    DiaFinal.setEnabled(false);
    MesFinal.setEnabled(false);
    }
    
    private ReportData obtenerDatosReporte(String fechaInicio, String fechaFin) {
        
        ReportData data = new ReportData();
        
            String sql = """
            SELECT e.id_estacionamiento, e.dni, e.nombre, e.apellido, e.celular, e.placa, e.marca, e.espacio, e.fecha_ingreso, e.fecha_salida, e.estado, e.cobro, c.efectivo, c.vuelto, c.empleado
            FROM estacionamiento e
            LEFT JOIN cobros c ON e.id_estacionamiento = c.id_estacionamiento
            WHERE DATE(e.fecha_ingreso) >= ? AND DATE(e.fecha_ingreso) <= ?
            """;
            
            try (Connection con = Conexion.getInstance(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, fechaInicio);
            ps.setString(2, fechaFin);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
            Registro r = new Registro();
                r.id = rs.getInt("id_estacionamiento");
                r.dni = rs.getString("dni");
                r.nombre = rs.getString("nombre");
                r.apellido = rs.getString("apellido");
                r.celular = rs.getString("celular");
                r.placa = rs.getString("placa");
                r.marca = rs.getString("marca");
                r.espacio = rs.getString("espacio");
                r.fechaIngreso = rs.getTimestamp("fecha_ingreso");
                r.fechaSalida = rs.getTimestamp("fecha_salida");
                r.estado = rs.getString("estado");
                r.cobro = rs.getDouble("cobro");
                // Nuevos campos desde la tabla cobros (pueden ser 0 si null)
                
            try {
            r.efectivo = rs.getDouble("efectivo");
            } catch (Exception ex) {
            r.efectivo = 0;
            }
            try {
            r.vuelto = rs.getDouble("vuelto");
            } catch (Exception ex) {
            r.vuelto = 0;
            }
            r.empleado = rs.getString("empleado");
            if (r.estado != null && r.estado.equalsIgnoreCase("CANCELADO")) {
            data.eliminados.add(r);
            } else {
            data.registros.add(r);
            }
            }
            } catch (Exception ex) {
            ex.printStackTrace();
            }
            return data;
    }

    private void calcularEstadisticas(ReportData data) {
        int totalEspacios = 12;
        int ocupados = 0;
        double ingresosTotales = 0;
        int vehiculosAtendidos = 0;
        long tiempoTotalEstanciaMinutos = 0;
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        for (Registro r : data.registros) {
        if (r.estado != null && r.estado.equalsIgnoreCase("ACTIVO")) {
        ocupados++;
        }
        // Consideramos vehículos finalizados (tienen salida) para ingresos/tiempo
        if (r.fechaSalida != null && r.cobro > 0) {
        ingresosTotales += r.cobro;
        vehiculosAtendidos++;
        long diffMs = r.fechaSalida.getTime() - r.fechaIngreso.getTime();
        long diffMin = diffMs / 60000L; // minutos
        if (diffMin < 0) diffMin = 0;
        tiempoTotalEstanciaMinutos += diffMin;
        if (r.cobro > mayor) mayor = r.cobro;
        if (r.cobro < menor) menor = r.cobro;
        }
        }
        data.tasaOcupacion = (ocupados * 100.0) / totalEspacios;
        data.ingresoTotal = ingresosTotales;
        data.tiempoPromedioEstancia = vehiculosAtendidos == 0 ? 0 : tiempoTotalEstanciaMinutos / vehiculosAtendidos;
        data.ingresoPromedioVehiculo = vehiculosAtendidos == 0 ? 0 : ingresosTotales / vehiculosAtendidos;
        data.mayorIngreso = vehiculosAtendidos == 0 ? 0 : mayor;
        data.menorIngreso = vehiculosAtendidos == 0 ? 0 : menor;
    }

    private void generarPDF(ReportData data, String fechaInicio, String fechaFin, String tipo) {
        try {
            
        
        // ========= 1. DOCUMENTO =========
            Document doc = new Document(PageSize.A4, 40, 40, 40, 40);
            String userHome = System.getProperty("user.home");
            String desktopPath = userHome + File.separator + "Desktop";
            String fileName = "Reporte_Estacionamiento_" + tipo + "_" + System.currentTimeMillis() + ".pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(desktopPath + File.separator + fileName));
            doc.open();
        // ========= 2. FUENTES =========
            Font tituloGrande = new Font(Font.FontFamily.HELVETICA, 26, Font.BOLD);
            Font encabezadoNegrita = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font encabezadoNormal = new Font(Font.FontFamily.HELVETICA, 12);
            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Font subTituloFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
            Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
            Font textoFont = new Font(Font.FontFamily.HELVETICA, 11);
            Font estadFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        // ===== ENCABEZADO PERSONALIZADO =====
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
            infoEmpresa.add(new Phrase("Correo electrónico: ", encabezadoNegrita));
            infoEmpresa.add(new Phrase("tauro.estacionamiento@gmail.com\n", encabezadoNormal));
            infoEmpresa.add(new Phrase("Celular: ", encabezadoNegrita));
            infoEmpresa.add(new Phrase("912987354\n", encabezadoNormal));
            infoEmpresa.setSpacingAfter(20);
            doc.add(infoEmpresa);
            Paragraph titulo = new Paragraph("REPORTE DEL ESTACIONAMIENTO", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(20);
            doc.add(titulo);
            Paragraph periodo = new Paragraph("Periodo: " + fechaInicio + " → " + fechaFin, subTituloFont);
            periodo.setAlignment(Element.ALIGN_CENTER);
            periodo.setSpacingAfter(25);
            doc.add(periodo);
            LineSeparator separator = new LineSeparator();
            separator.setOffset(-2);
            doc.add(new Chunk(separator));
            doc.add(new Paragraph(" "));
            // Dependiendo del tipo, generamos tablas distintas
            if ("ELIMINADOS".equalsIgnoreCase(tipo)) {
            // Tabla eliminados
            PdfPTable tablaEliminados = new PdfPTable(5);
            tablaEliminados.setWidthPercentage(100);
            tablaEliminados.setWidths(new float[]{2, 3, 2, 3, 3});
            String[] headEli = {"DNI", "Nombre", "Placa", "Ingreso", "Salida"};
            BaseColor headColor = new BaseColor(150, 50, 50);
            for (String h : headEli) {
            PdfPCell c = new PdfPCell(new Phrase(h, headerFont));
            c.setBackgroundColor(headColor);
            c.setPadding(6);
            c.setHorizontalAlignment(Element.ALIGN_CENTER);
            tablaEliminados.addCell(c);
            }
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            for (Registro r : data.eliminados) {
            tablaEliminados.addCell(celda(r.dni, textoFont));
            tablaEliminados.addCell(celda(r.nombre + " " + r.apellido, textoFont));
            tablaEliminados.addCell(celda(r.placa, textoFont));
            LocalDateTime ingreso = r.fechaIngreso != null ? r.fechaIngreso.toLocalDateTime() : null;
            LocalDateTime salida = r.fechaSalida != null ? r.fechaSalida.toLocalDateTime() : null;
            String fechaIngStr = ingreso != null ? ingreso.format(formato) : "—";
            String fechaSalStr = salida != null ? salida.format(formato) : "—";
            tablaEliminados.addCell(celda(fechaIngStr, textoFont));
            tablaEliminados.addCell(celda(fechaSalStr, textoFont));
            }
            doc.add(tablaEliminados);
            } else {
            // Tabla principal para ingresos/valores/full
                PdfPTable tabla = new PdfPTable(7);
                tabla.setWidthPercentage(100);
                tabla.setWidths(new float[]{2, 3, 2, 3, 3, 2, 2});
                String[] columnas = {"DNI", "Nombre", "Placa", "Ingreso", "Salida", "Efectivo", "Cobro"};
                BaseColor headerColor = new BaseColor(60, 90, 150);
                for (String col : columnas) {
                PdfPCell h = new PdfPCell(new Phrase(col, headerFont));
                h.setBackgroundColor(headerColor);
                h.setHorizontalAlignment(Element.ALIGN_CENTER);
                h.setPadding(8);
                tabla.addCell(h);
                }
                for (Registro r : data.registros) {
                tabla.addCell(celda(r.dni, textoFont));
                tabla.addCell(celda(r.nombre + " " + r.apellido, textoFont));
                tabla.addCell(celda(r.placa, textoFont));
                tabla.addCell(celda(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(r.fechaIngreso), textoFont));
                tabla.addCell(celda(r.fechaSalida == null ? "—" : new SimpleDateFormat("dd/MM/yyyy HH:mm").format(r.fechaSalida), textoFont));
                tabla.addCell(celda(String.format("S/ %.2f", r.efectivo), textoFont));
                tabla.addCell(celda(String.format("S/ %.2f", r.cobro), textoFont));
                }
                doc.add(tabla);


                // Estadísticas (solo para tipos que las requieran)
                if ("FULL".equalsIgnoreCase(tipo)) {
                Paragraph estadTitulo = new Paragraph("Estadísticas del Periodo", subTituloFont);
                estadTitulo.setSpacingBefore(10);
                estadTitulo.setSpacingAfter(10);
                doc.add(estadTitulo);
                PdfPTable estadisticas = new PdfPTable(2);
                estadisticas.setWidthPercentage(100);
                estadisticas.setSpacingBefore(5);
                estadisticas.setWidths(new float[]{4, 2});
                estadisticas.addCell(celdaEstad("Ingreso Total:", String.format("S/ %.2f", data.ingresoTotal), estadFont));
                estadisticas.addCell(celdaEstad("Vehículos Atendidos:", String.valueOf(data.registros.size()), estadFont));
                estadisticas.addCell(celdaEstad("Ingreso Promedio por Vehículo:", String.format("S/ %.2f", data.ingresoPromedioVehiculo), estadFont));
                estadisticas.addCell(celdaEstad("Mayor ingreso (por vehículo):", String.format("S/ %.2f", data.mayorIngreso), estadFont));
                estadisticas.addCell(celdaEstad("Menor ingreso (por vehículo):", String.format("S/ %.2f", data.menorIngreso), estadFont));
                estadisticas.addCell(celdaEstad("Tiempo Promedio de Estancia:", data.tiempoPromedioEstancia + " min", estadFont));
                estadisticas.addCell(celdaEstad("Tasa de Ocupación:", String.format("%.2f %%", data.tasaOcupacion), estadFont));
                estadisticas.addCell(celdaEstad("Tasa de Ocupación:", String.format("%.2f %%", data.tasaOcupacion), estadFont));
                doc.add(estadisticas);
                }
                if ("INDICADORES".equalsIgnoreCase(tipo)) {
                Paragraph estadTitulo = new Paragraph("Estadísticas del Periodo", subTituloFont);
                estadTitulo.setSpacingBefore(10);
                estadTitulo.setSpacingAfter(10);
                doc.add(estadTitulo);
                PdfPTable estadisticas = new PdfPTable(2);
                estadisticas.setWidthPercentage(100);
                estadisticas.setSpacingBefore(5);
                estadisticas.setWidths(new float[]{4, 2});
                estadisticas.addCell(celdaEstad("Ingreso Total:", String.format("S/ %.2f", data.ingresoTotal), estadFont));
                estadisticas.addCell(celdaEstad("Vehículos Atendidos:", String.valueOf(data.registros.size()), estadFont));
                estadisticas.addCell(celdaEstad("Ingreso Promedio por Vehículo:", String.format("S/ %.2f", data.ingresoPromedioVehiculo), estadFont));
                estadisticas.addCell(celdaEstad("Tiempo Promedio de Estancia:", data.tiempoPromedioEstancia + " min", estadFont));
                estadisticas.addCell(celdaEstad("Tasa de Ocupación:", String.format("%.2f %%", data.tasaOcupacion), estadFont));
                estadisticas.addCell(celdaEstad("Tasa de Ocupación:", String.format("%.2f %%", data.tasaOcupacion), estadFont));
                doc.add(estadisticas);
                }
                if ("VALORES".equalsIgnoreCase(tipo)) {
                Paragraph estadTitulo = new Paragraph("Estadísticas del Periodo", subTituloFont);
                estadTitulo.setSpacingBefore(10);
                estadTitulo.setSpacingAfter(10);
                doc.add(estadTitulo);
                PdfPTable estadisticas = new PdfPTable(2);
                estadisticas.setWidthPercentage(100);
                estadisticas.setSpacingBefore(5);
                estadisticas.setWidths(new float[]{4, 2});
                estadisticas.addCell(celdaEstad("Ingreso Total:", String.format("S/ %.2f", data.ingresoTotal), estadFont));
                estadisticas.addCell(celdaEstad("Ingreso Promedio por Vehículo:", String.format("S/ %.2f", data.ingresoPromedioVehiculo), estadFont));
                estadisticas.addCell(celdaEstad("Mayor ingreso (por vehículo):", String.format("S/ %.2f", data.mayorIngreso), estadFont));
                estadisticas.addCell(celdaEstad("Menor ingreso (por vehículo):", String.format("S/ %.2f", data.menorIngreso), estadFont));                
                doc.add(estadisticas);
                }
                if ("INGRESOS".equalsIgnoreCase(tipo)) {
                Paragraph estadTitulo = new Paragraph("Estadísticas del Periodo", subTituloFont);
                estadTitulo.setSpacingBefore(10);
                estadTitulo.setSpacingAfter(10);
                doc.add(estadTitulo);
                PdfPTable estadisticas = new PdfPTable(2);
                estadisticas.setWidthPercentage(100);
                estadisticas.setSpacingBefore(5);
                estadisticas.setWidths(new float[]{4, 2});
                estadisticas.addCell(celdaEstad("Ingreso Total:", String.format("S/ %.2f", data.ingresoTotal), estadFont));
                estadisticas.addCell(celdaEstad("Vehículos Atendidos:", String.valueOf(data.registros.size()), estadFont));
                doc.add(estadisticas);
                }
                
            }
            doc.close();
                JOptionPane.showMessageDialog(null, "Reporte generado correctamente en el escritorio:\n" + fileName);
                } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al generar PDF: " + ex.getMessage());
            }
        }

    
    private PdfPCell celda(String texto, Font font) {
    PdfPCell c = new PdfPCell(new Phrase(texto, font));
    c.setHorizontalAlignment(Element.ALIGN_CENTER);
    c.setPadding(5);
    return c;
    }
    private PdfPCell celdaEstad(String titulo, String valor, Font font) {
    Paragraph p = new Paragraph(titulo + " " + valor, font);
    PdfPCell c = new PdfPCell(p);
    c.setPadding(8);
    c.setHorizontalAlignment(Element.ALIGN_LEFT);
    c.setBackgroundColor(new BaseColor(245, 245, 245));
    return c;
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
        jLabel1 = new javax.swing.JLabel();
        PeriododeTiempo = new javax.swing.JComboBox<>();
        FechaFinal = new javax.swing.JLabel();
        FechaInicial = new javax.swing.JLabel();
        AñoInicial = new javax.swing.JComboBox<>();
        DiaInicial = new javax.swing.JComboBox<>();
        MesInicial = new javax.swing.JComboBox<>();
        DiaFinal = new javax.swing.JComboBox<>();
        MesFinal = new javax.swing.JComboBox<>();
        AñoFinal = new javax.swing.JComboBox<>();
        GenerarReporteFechas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        GenerarReporteIngresos = new javax.swing.JButton();
        GenerarReporteIndicadores = new javax.swing.JButton();
        GenerarReporteEliminados = new javax.swing.JButton();
        GenerarReporteValores1 = new javax.swing.JButton();

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
                    .addComponent(HistorialVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(SalidaVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(EmpleadosVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(EspaciosVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 1, 24)); // NOI18N
        jLabel1.setText("Generar Reportes:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        PeriododeTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(PeriododeTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 280, 30));

        FechaFinal.setText("Fecha Final:");
        jPanel2.add(FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        FechaInicial.setText("Fecha Incial:");
        jPanel2.add(FechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        AñoInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(AñoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        DiaInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(DiaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        MesInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(MesInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        DiaFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(DiaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        MesFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(MesFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, -1, -1));

        AñoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(AñoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, -1, -1));

        GenerarReporteFechas.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 1, 24)); // NOI18N
        GenerarReporteFechas.setText("Por fechas");
        GenerarReporteFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteFechasActionPerformed(evt);
            }
        });
        jPanel2.add(GenerarReporteFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 260, 60));

        jLabel2.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 1, 24)); // NOI18N
        jLabel2.setText("Seleccione un periodo de tiempo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentY(5.5F);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 680, 10));

        GenerarReporteIngresos.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 0, 24)); // NOI18N
        GenerarReporteIngresos.setText("Ingresos");
        GenerarReporteIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteIngresosActionPerformed(evt);
            }
        });
        jPanel2.add(GenerarReporteIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 260, 60));

        GenerarReporteIndicadores.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 0, 24)); // NOI18N
        GenerarReporteIndicadores.setText("Indicadores");
        GenerarReporteIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteIndicadoresActionPerformed(evt);
            }
        });
        jPanel2.add(GenerarReporteIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 260, 60));

        GenerarReporteEliminados.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 0, 24)); // NOI18N
        GenerarReporteEliminados.setText("Eliminados");
        GenerarReporteEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteEliminadosActionPerformed(evt);
            }
        });
        jPanel2.add(GenerarReporteEliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 260, 60));

        GenerarReporteValores1.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 0, 24)); // NOI18N
        GenerarReporteValores1.setText("Valores");
        GenerarReporteValores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteValores1ActionPerformed(evt);
            }
        });
        jPanel2.add(GenerarReporteValores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 260, 60));

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


    private void GenerarReporteFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteFechasActionPerformed
        // TODO add your handling code here:
        String periodo = PeriododeTiempo.getSelectedItem().toString();
        String fechaInicio = "";
        String fechaFin = "";
        switch (periodo) {
        case "Día":
        int d = Integer.parseInt(DiaInicial.getSelectedItem().toString());
        int m = Integer.parseInt(MesInicial.getSelectedItem().toString());
        int y = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        fechaInicio = String.format("%04d-%02d-%02d", y, m, d);
        fechaFin = fechaInicio;
        break;
        case "Semana":
        int ds = Integer.parseInt(DiaInicial.getSelectedItem().toString());
        int ms = Integer.parseInt(MesInicial.getSelectedItem().toString());
        int ys = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        java.time.LocalDate ini = java.time.LocalDate.of(ys, ms, ds);
        java.time.LocalDate fin = ini.plusDays(7);
        fechaInicio = ini.toString();
        fechaFin = fin.toString();
        break;
        case "Mes":
        int mes = Integer.parseInt(MesInicial.getSelectedItem().toString());
        int año = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        fechaInicio = String.format("%04d-%02d-01", año, mes);
        fechaFin = String.format("%04d-%02d-%02d", año, mes, UltimoDiaMes(mes, año));
        break;
        case "Año":
        int ay = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        fechaInicio = ay + "-01-01";
        fechaFin = ay + "-12-31";
        break;
        }
        ReportData data = obtenerDatosReporte(fechaInicio, fechaFin);
        calcularEstadisticas(data);
        generarPDF(data, fechaInicio, fechaFin, "FULL");
    }//GEN-LAST:event_GenerarReporteFechasActionPerformed

    private void GenerarReporteIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteIndicadoresActionPerformed
        // TODO add your handling code here:
        // Genera un PDF con solo la sección de indicadores/estadísticas
        String[] fechas = construirFechasDesdeUI();
        String fechaInicio = fechas[0];
        String fechaFin = fechas[1];
        ReportData data = obtenerDatosReporte(fechaInicio, fechaFin);
        calcularEstadisticas(data);
        // Usamos tipo INDICADORES para que el PDF muestre solo estadísticas relevantes
        generarPDF(data, fechaInicio, fechaFin, "INDICADORES");
    }//GEN-LAST:event_GenerarReporteIndicadoresActionPerformed

    private void GenerarReporteEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteEliminadosActionPerformed
        // TODO add your handling code here:
        // Genera un PDF que contiene únicamente los registros eliminados (estado = CANCELADO)
        String[] fechas = construirFechasDesdeUI();
        String fechaInicio = fechas[0];
        String fechaFin = fechas[1];
        ReportData data = obtenerDatosReporte(fechaInicio, fechaFin);
        // No necesitamos calcular indicadores para la lista de eliminados, pero lo hacemos por consistencia
        calcularEstadisticas(data);
        generarPDF(data, fechaInicio, fechaFin, "ELIMINADOS");
    }//GEN-LAST:event_GenerarReporteEliminadosActionPerformed

    private void GenerarReporteValores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteValores1ActionPerformed
        // TODO add your handling code here:
        // Valores: mayor, menor cobro y promedio por vehículo (PDF con esas métricas)
        String[] fechas = construirFechasDesdeUI();
        String fechaInicio = fechas[0];
        String fechaFin = fechas[1];
        ReportData data = obtenerDatosReporte(fechaInicio, fechaFin);
        calcularEstadisticas(data);
        // Tipo VALORES -> mostrará mayor, menor, promedio y lista detallada
        generarPDF(data, fechaInicio, fechaFin, "VALORES");
        
    }//GEN-LAST:event_GenerarReporteValores1ActionPerformed

    private void GenerarReporteIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteIngresosActionPerformed
        // Ingresos: lista de ingresos por vehículo y total
        String[] fechas = construirFechasDesdeUI();
        String fechaInicio = fechas[0];
        String fechaFin = fechas[1];
        ReportData data = obtenerDatosReporte(fechaInicio, fechaFin);
        calcularEstadisticas(data);
        generarPDF(data, fechaInicio, fechaFin, "INGRESOS");
    }//GEN-LAST:event_GenerarReporteIngresosActionPerformed

    private String[] construirFechasDesdeUI() {
        String periodo = PeriododeTiempo.getSelectedItem().toString();
        String fechaInicio = "";
        String fechaFin = "";
        switch (periodo) {
        case "Día":
        int d = Integer.parseInt(DiaInicial.getSelectedItem().toString());
        int m = Integer.parseInt(MesInicial.getSelectedItem().toString());
        int y = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        fechaInicio = String.format("%04d-%02d-%02d", y, m, d);
        fechaFin = fechaInicio;
        break;
        case "Semana":
        int ds = Integer.parseInt(DiaInicial.getSelectedItem().toString());
        int ms = Integer.parseInt(MesInicial.getSelectedItem().toString());
        int ys = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        java.time.LocalDate ini = java.time.LocalDate.of(ys, ms, ds);
        java.time.LocalDate fin = ini.plusDays(7);
        fechaInicio = ini.toString();
        fechaFin = fin.toString();
        break;
        case "Mes":
        int mes = Integer.parseInt(MesInicial.getSelectedItem().toString());
        int año = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        fechaInicio = String.format("%04d-%02d-01", año, mes);
        fechaFin = String.format("%04d-%02d-%02d", año, mes, UltimoDiaMes(mes, año));
        break;
        case "Año":
        int ay = Integer.parseInt(AñoInicial.getSelectedItem().toString());
        fechaInicio = ay + "-01-01";
        fechaFin = ay + "-12-31";
        break;
        }
        return new String[]{fechaInicio, fechaFin};
        }


        private int UltimoDiaMes(int mes, int año) {
        java.time.YearMonth ym = java.time.YearMonth.of(año, mes);
        return ym.lengthOfMonth();
        }
        // -------------------- CLASES AUX --------------------
        class ReportData {
        ArrayList<Registro> registros = new ArrayList<>();
        ArrayList<Registro> eliminados = new ArrayList<>();
        double tasaOcupacion;
        double ingresoTotal;
        double ingresoPromedioVehiculo;
        long tiempoPromedioEstancia; // en minutos
        double mayorIngreso;
        double menorIngreso;
        }


        class Registro {
        int id;
        String dni, nombre, apellido, celular, placa, marca, espacio, estado, empleado;
        Timestamp fechaIngreso, fechaSalida;
        double cobro;
        double efectivo;
        double vuelto;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AñoFinal;
    private javax.swing.JComboBox<String> AñoInicial;
    private javax.swing.JComboBox<String> DiaFinal;
    private javax.swing.JComboBox<String> DiaInicial;
    private javax.swing.JButton EmpleadosVentana;
    private javax.swing.JButton EspaciosVentana;
    private javax.swing.JLabel FechaFinal;
    private javax.swing.JLabel FechaInicial;
    private javax.swing.JButton GenerarReporteEliminados;
    private javax.swing.JButton GenerarReporteFechas;
    private javax.swing.JButton GenerarReporteIndicadores;
    private javax.swing.JButton GenerarReporteIngresos;
    private javax.swing.JButton GenerarReporteValores1;
    private javax.swing.JButton HistorialVentana;
    private javax.swing.JButton IngresoVentana;
    private javax.swing.JComboBox<String> MesFinal;
    private javax.swing.JComboBox<String> MesInicial;
    private javax.swing.JComboBox<String> PeriododeTiempo;
    private javax.swing.JButton SalidaVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
