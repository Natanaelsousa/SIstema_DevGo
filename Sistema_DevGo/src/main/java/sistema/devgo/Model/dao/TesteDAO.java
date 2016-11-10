package sistema.devgo.Model.dao;



import java.sql.SQLException;

import sistema.devgo.java.Cliente;

/**
 *
 * @author Erik
 */
public class TesteDAO {
    
        public static void main(String[] args) throws SQLException {
        
            PermissaoDAO p = new PermissaoDAO();
            
            System.out.println(p.buscarId());
           
        }
     
}