/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static sistema.devgo.Model.dao.ConexaoBD.getConnection;

/**
 *
 * @author Erik
 */
public class TesteDAO {
    
        public static void main(String[] args) throws SQLException {
        
       
  String sql = "INSERT INTO PLANO(COD_IDIOMA,NM_PLANO) VALUES(1,'Gold')";
  insert(sql);
   
    
    
}
    
  static void insert(String insertSql) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(insertSql);

        
        pstmt.execute();
        pstmt.close();
    }
}

