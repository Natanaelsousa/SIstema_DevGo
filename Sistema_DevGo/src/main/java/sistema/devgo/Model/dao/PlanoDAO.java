
package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Funcionario;
import sistema.devgo.java.Plano;

/**
 * @author Natanael */
public class PlanoDAO extends GenericaDAO {

    //Inserção de dados
    public void insert(Plano plano) throws SQLException {
        String insert = "INSERT INTO PLANO(nm_plano, preco, cod_idioma, cod_periodo) VALUES(?,?,?,?)";
        insert(insert, plano.getNomePlano(), plano.getPreco(),plano.getCod_idioma(),plano.getCod_periodo());
    }

    //Atualização de dados
    public void update(Plano plano) throws SQLException {
        String update = "UPDATE plano "
                + "SET nm_plano = ?, preco = ?, cod_periodo = ?, cod_idioma = ?";
        update(update, plano.getNomePlano(), plano.getPreco(),plano.getCod_periodo(),plano.getCod_idioma());
    }

    //Lista de planos cadastrados
    public List<Plano> findPlano() throws SQLException {
        List<Plano> planos = new ArrayList<Plano>();

        String select = "SELECT * FROM PLANO";

        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Plano plano = new Plano();
            
            plano.setCod_plano(rs.getLong("cod_plano"));
            plano.setCod_idioma(rs.getLong("cod_idioma"));
            plano.setNomePlano(rs.getString("nm_plano"));
            plano.setPreco(rs.getDouble("preco"));
            plano.setCod_Periodo(rs.getLong("cod_periodo"));
            
            
            planos.add(plano);
        }

        rs.close();
        stmt.close();

        return planos;
    }
    public Plano findByName(String nomePlano) throws SQLException {
        String select = "SELECT * FROM PLANO WHERE nm_plano = ?";
        Plano plano = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
   
			
        stmt.setString(1,nomePlano );
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
          plano.setCod_plano(rs.getLong("cod_plano"));
          plano.setCod_idioma(rs.getLong("cod_idioma"));
          plano.setNomePlano(rs.getString("nm_plano"));
          plano.setPreco(rs.getDouble("preco"));
          plano.setCod_Periodo(rs.getLong("cod_periodo"));
        }

        rs.close();
        stmt.close();
        return plano;
    }
}
