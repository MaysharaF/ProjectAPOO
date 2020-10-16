
package modelDAO;

import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Denuncia;

/**
 *
 * @author shen
 */
public class DenunciaDAO {
     public void insert(Denuncia d) throws ClassNotFoundException, SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement stmt = null;
        

        stmt = conn.prepareStatement("INSERT INTO novaDenun(nome, nome_vitima, nome_autor, tipo, data_denun, descricao) "
                                   + "VALUES (?, ?, ?, ?, ?, ? )");
        stmt.setString(1, d.getNome());
        stmt.setString(2, d.getNome_vitima());
        stmt.setString(3, d.getNome_autor());
        stmt.setInt(4, d.getTipo());
        stmt.setString(5, d.getData_ocorrido());
        stmt.setString(6, d.getDescricao());
        stmt.executeUpdate();
        Database.closeConnection(conn, stmt);
    }
    
}
