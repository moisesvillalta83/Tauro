package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static String url = "jdbc:mysql://localhost:3306/parqueadero";
    static String user = "root";
    static String pass = "Overw@tch7300";
    
    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión Exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}
