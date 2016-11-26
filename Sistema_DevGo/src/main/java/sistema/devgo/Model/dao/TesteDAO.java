package sistema.devgo.Model.dao;



import java.sql.SQLException;

import sistema.devgo.java.Cliente;
import sistema.devgo.java.UsuarioSistema;

/**
 *
 * @author Erik
 */
public class TesteDAO {
    
        public static void main(String[] args) throws SQLException {
            String nome= "leandro";
            String senha = null;
            long departamento = 0;
          
            PermissaoDAO p = new PermissaoDAO();
            
          long cod = p.verificaUser(nome);
          
            System.out.println(cod);
           
        }
     
}