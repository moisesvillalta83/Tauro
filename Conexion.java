package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Datos de conexión (constantes)
    private static final String URL = "jdbc:mysql://localhost:3306/parqueadero";
    private static final String USER = "root";
    private static final String PASS = "Overw@tch7300";

    // Instancia única de conexión (Singleton)
    private static Connection instancia = null;

    // Constructor privado: evita instanciación externa
    private Conexion() { }

    public static synchronized Connection getInstance() {
        try {
            if (instancia == null || instancia.isClosed()) {
                instancia = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("✅ Conexión establecida correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar con la base de datos: " + e.getMessage());
        }
        return instancia;
    }

    public static void cerrarConexion() {
        try {
            if (instancia != null && !instancia.isClosed()) {
                instancia.close();
                System.out.println("🔒 Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("⚠️ Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
