package org.example.conexion;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FactoriaConexion {
    private static Connection conn;

    static {
        try (InputStream input = FactoriaConexion.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties properties = new Properties();
            if (input == null) {
                System.out.println("No se encontro el archivo db.properties");
            }
            properties.load(input);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión a la base de datos exitosa.");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
