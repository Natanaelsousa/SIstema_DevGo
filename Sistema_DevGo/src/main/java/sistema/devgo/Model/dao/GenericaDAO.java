package sistema.devgo.Model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Erik
 * 
 * A classe teve como base o site http://www.mballem.com/
 * 
 * 
 */
public class GenericaDAO {
    


public abstract class GenericaDao {
    private final Connection connection;

    protected GenericaDao() {
        this.connection = ConexaoBD.getConnection();
    }

    protected Connection getConnection() {
        return connection;
    }

    protected void insert(String insertSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
    }

    protected void update(String updateSql, Object id, Object... parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(updateSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
    }

    protected void delete(String deleteSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(deleteSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
    }
 }
    
}
