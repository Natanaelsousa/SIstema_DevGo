
package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Departamento;



/**
 *
 * @author Natanael 
 */
public class DepartamentoDAO extends GenericaDAO {
   public void insert(Departamento depto) throws SQLException {
        String insert = "INSERT INTO DEPARTAMENTO (setor) VALUES(?)";
        insert(insert, depto.getSetor());
    }

    public void update(Departamento depto) throws SQLException {
        String update = "UPDATE DEPARTAMENTO SET setor = ?, nome = ? WHERE cod_depto = ?";
        update(update,depto.getSetor());
    } 
     public List<Departamento> findDeptos() throws SQLException {
        List<Departamento> deptos = new ArrayList<Departamento>();

        String select = "SELECT * FROM DEPARTAMENTO";

        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Departamento departamento = new Departamento();
            departamento.setCodDepartamento(rs.getLong("cod_depto"));
            departamento.setSetor(rs.getString("setor"));
          
            deptos.add(departamento);
        }

        rs.close();
        stmt.close();

        return deptos;
    }
}
