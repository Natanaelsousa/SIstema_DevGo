
package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Periodo;


/**
 *
 * @author Sibele
 */
public class PeriodoDAO extends GenericaDAO{
     
      public void salvar(Periodo periodo) throws SQLException {
        String sql = "INSERT INTO periodo(nm_periodo) "
                + "VALUES(?)";
        insert(sql, periodo.getNm_periodo());
    }
    
    public void editar(Periodo periodo) throws SQLException{
        
           String sql = "UPDATE periodo " +
                   "SET nm_periodo = ? where cod_periodo";
           
           update(sql, periodo.getNm_periodo());
        
    }
    
    public List<Periodo> findPeriodo() throws SQLException {
        List<Periodo> periodos = new ArrayList <Periodo>();

        String sql = "SELECT * FROM periodo";

        PreparedStatement stmt = 
			getConnection().prepareStatement(sql);
			
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Periodo periodo = new Periodo();
            periodo.setCod_periodo(rs.getLong("cod_periodo"));
            periodo.setNm_periodo(rs.getString("nm_periodo"));
         
                    
            periodos.add(periodo);
        }

        rs.close();
        stmt.close();

        return periodos;
    }
        public List<Periodo> buscaPeriodosDoPlanoCadastrado(String nmPlano) throws SQLException {
        List<Periodo> periodos = new ArrayList <Periodo>();

        String sql = "SELECT * FROM PLANO a INNER JOIN PERIODO b ON (a.COD_PERIODO = b.COD_PERIODO) WHERE NM_PLANO= '"+ nmPlano+"'";

        PreparedStatement stmt = 
			getConnection().prepareStatement(sql);
			
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Periodo periodo = new Periodo();
            periodo.setCod_periodo(rs.getLong("COD_PERIODO"));
            periodo.setNm_periodo(rs.getString("NM_PERIODO"));
         
                    
            periodos.add(periodo);
        }

        rs.close();
        stmt.close();

        return periodos;
    }
    
      public Periodo findByName(String nm_periodo) throws SQLException {
        String sql = "SELECT * FROM periodo WHERE nm_periodo = ?";
        Periodo periodo = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(sql);
			
        stmt.setString(1, nm_periodo);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            periodo.setCod_periodo(rs.getLong("cod_periodo"));
            periodo.setNm_periodo(rs.getString("nm_periodo"));
            
        }

        rs.close();
        stmt.close();
        return periodo;
    }

    
  
}
