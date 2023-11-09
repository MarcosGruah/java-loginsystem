package mapa.core.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Almeida - https://github.com/MarcosGruah
 */

public class ConnectionJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                return connection;
            } else {
                return connection;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar ao banco de dados");
            return null;
        }
    }
}
