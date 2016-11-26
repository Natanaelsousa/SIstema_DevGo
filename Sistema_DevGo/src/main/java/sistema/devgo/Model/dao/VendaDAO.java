package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Cliente;
import sistema.devgo.java.Venda;

/**
 *
 * @author Erik
 */
public class VendaDAO extends GenericaDAO {

    public void insert(Venda venda) throws SQLException {
        String insert = "INSERT INTO venda(COD_PLANO, COD_CLIENTE,COD_IDIOMA,QTDE_ALUNO,VALOR_VENDA) "
                + "VALUES(?,?,?,?,?)";
        insert(insert, venda.getCodPlano(), venda.getCodCliente(), venda.getCodIdioma(), venda.getQuantidadeAluno(), venda.getValorVenda());
    }

    //Select te toda os registros da tabela venda
    public List<Venda> findVendaLista() throws SQLException {
        List<Venda> vendas = new ArrayList<Venda>();

        String sql = "SELECT * FROM venda";

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Venda venda = new Venda();
            venda.setCodVenda(rs.getLong("COD_VENDA"));
            venda.setCodCliente(rs.getLong("COD_CLIENTE"));
            venda.setCodIdioma(rs.getLong("COD_IDIOMA"));
            venda.setCodPlano(rs.getLong("COD_PLANO"));
            venda.setQuantidadeAluno(rs.getInt("QTDE_ALUNO"));
            venda.setValorVenda(rs.getDouble("VALOR_VENDA"));

            vendas.add(venda);
        }

        rs.close();
        stmt.close();

        return vendas;
    }

    //Select apenas do ultimo registro
    public List<Venda> findVenda() throws SQLException {
        List<Venda> vendas = new ArrayList<Venda>();

        String sql = "SELECT * FROM venda ORDER BY cod_venda DESC LIMIT 1";

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Venda venda = new Venda();
            venda.setCodVenda(rs.getLong("COD_VENDA"));
            venda.setCodCliente(rs.getLong("COD_CLIENTE"));
            venda.setCodIdioma(rs.getLong("COD_IDIOMA"));
            venda.setCodPlano(rs.getLong("COD_PLANO"));
            venda.setQuantidadeAluno(rs.getInt("QTDE_ALUNO"));
            venda.setValorVenda(rs.getDouble("VALOR_VENDA"));

            vendas.add(venda);
        }

        rs.close();
        stmt.close();

        return vendas;
    }

}
