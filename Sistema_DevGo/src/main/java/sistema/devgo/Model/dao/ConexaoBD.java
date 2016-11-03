package sistema.devgo.Model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erik
 * 
 *  A classe teve como base o site http://www.mballem.com/
 * 
 */
 
public class ConexaoBD {
    
        private static final String SERVIDOR = "localhost";//caminho do servidor do BD
        private static final String BANCO ="db_curso"; //nome do banco de dados
        private static final String URL = "jdbc:mysql://" + SERVIDOR + "/" + BANCO; //url de conexao
	private static final String DRIVER = "com.mysql.jdbc.Driver"; //driver mysql
	private static final String USUARIO = "root"; //nome do usuário do banco de dados
	private static final String SENHA = "beli1771"; //senha do usuário do banco de dados
        
  	
       public static Connection getConnection() {
           
    		Connection conn = null; 
                
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
    
    
    
}
