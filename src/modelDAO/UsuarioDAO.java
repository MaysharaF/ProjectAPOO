/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import database.Database;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author wirll
 */
public class UsuarioDAO {
    public void insert(Usuario u) throws ClassNotFoundException, SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        

        stmt = conn.prepareStatement("INSERT INTO usuarios(nome, email, senha) VALUES (?, ?, ?)");
        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.executeUpdate();
        Database.closeConnection(conn, stmt);
    }
    
    public Usuario findByEmailAndSenha(String email, String senha) throws ClassNotFoundException, SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario u = null;

        stmt = conn.prepareStatement("SELECT * FROM usuarios where email = ? and senha = ?");
        stmt.setString(1, email);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();
        while (rs.next()) {
            u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("senha"));
        }
        Database.closeConnection(conn, stmt, rs);
        return u;
    }
    
    public Usuario findByEmail(String email) throws ClassNotFoundException, SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario u = null;

        stmt = conn.prepareStatement("SELECT * FROM usuarios where email = ?");
        stmt.setString(1, email);
        rs = stmt.executeQuery();
        while (rs.next()) {
            u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("senha"));
        }
        Database.closeConnection(conn, stmt, rs);
        return u;
    }
}
