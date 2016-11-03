
package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Funcionario;
import sistema.devgo.java.Plano;

/**
 *
 * @author Natanael
 */
public class PlanoDAO extends GenericaDAO {

    //Inserção de dados
    public void insert(Plano plano) throws SQLException {
        String insert = "INSERT INTO PLANO(nm_plano, preco,periodo,cod_idioma) VALUES(?,?,?)";
        insert(insert, plano.getNomePlano(), plano.getPreco(),plano.getPeriodo(),plano.getCod_idioma());
    }

    //Atualização de dados
    public void update(Plano plano) throws SQLException {
        String update = "UPDATE CONTATOS "
                + "SET nm_plano = ?, preco = ?, periodo = ?, cod_idioma = ?";
        update(update, plano.getNomePlano(), plano.getPreco(),plano.getPeriodo(),plano.getCod_idioma());
    }

    //Lista de planos cadastrados
    public List<Plano> findPlano() throws SQLException {
        List<Plano> plano = new ArrayList<Plano>();

        String select = "SELECT * FROM PLANO";

        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Plano planos = new Plano();
            
            planos.setId_plano(rs.getLong("cod_plano"));
            planos.setCod_idioma(rs.getLong("cod_idioma"));
            planos.setNomePlano(rs.getString("nm_plano"));
            planos.setPreco(rs.getDouble("preco"));
            planos.setPeriodo(rs.getString("periodo"));
            
            
            plano.add(planos);
        }

        rs.close();
        stmt.close();

        return plano;
    }
    public Plano findByName(String nomePlano) throws SQLException {
        String select = "SELECT * FROM PLANO WHERE nm_plano = ?";
        Plano plano = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
   
			
        stmt.setString(1,nomePlano );
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
          plano.setId_plano(rs.getLong("cod_plano"));
          plano.setCod_idioma(rs.getLong("cod_idioma"));
          plano.setNomePlano(rs.getString("nm_plano"));
          plano.setPreco(rs.getDouble("preco"));
          plano.setPeriodo(rs.getString("periodo"));
        }

        rs.close();
        stmt.close();
        return plano;
    }
}
