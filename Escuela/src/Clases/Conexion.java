package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String DATABASE = "gestion_estudiantil";
    private static final String URL = "jdbc:mysql://localhost:3306/"+DATABASE;
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    public Conexion() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexion establecida exitosamente.");
            } catch (ClassNotFoundException e) {
                System.err.println("Error: No se pudo cargar el driver JDBC.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.err.println("Error: No se pudo establecer la conexión.");
                e.printStackTrace();
            }
        }
        return connection;
    }
}

