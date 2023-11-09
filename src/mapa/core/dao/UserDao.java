package mapa.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mapa.core.dao.connection.ConnectionJDBC;
import mapa.core.entity.User;

/**
 *
 * @author Marcos Almeida - https://github.com/MarcosGruah
 */

public class UserDao {

    public void addUser(User user) {

        String sqlQuery = "INSERT INTO mapa.usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = ConnectionJDBC.getConnection().prepareStatement(sqlQuery);
            ps.setString(1, user.getName());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getEmail());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados ao banco de dados");

        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public User findUserByLogin(String loginInput, String passwordInput) {

        String sqlQuery = "SELECT id, nome, login, senha, email FROM mapa.usuario WHERE login = ? AND senha = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = ConnectionJDBC.getConnection().prepareStatement(sqlQuery);
            ps.setString(1, loginInput);
            ps.setString(2, passwordInput);

            rs = ps.executeQuery();

            if (rs.next()) {
                Integer id = rs.getInt("ID");
                String name = rs.getString("NOME");
                String login = rs.getString("LOGIN");
                String password = rs.getString("SENHA");
                String email = rs.getString("EMAIL");

                User user = new User(name, login, password, email, id);
                ps.close();
                return user;
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário.");
        } finally {

            try {
                ps.close();
                rs.close();

            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
