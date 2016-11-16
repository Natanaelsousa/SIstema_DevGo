package sistema.devgo.Model.dao;

import java.sql.SQLException;
import sistema.devgo.java.Venda;

/**
 *
 * @author Erik
 */
public class VendaDAO extends GenericaDAO {

    public void insert(Venda venda) throws SQLException {
        String insert = "INSERT INTO venda(COD_PLANO, COD_CLIENTE,QTDE_ALUNO,VALOR_VENDA,DATA_VENDA) "
                + "VALUES(?,?,?,?,?)";
        insert(insert, venda.getCodPlano(), venda.getCodCliente(),venda.getQuantidadeAluno(), venda.getValorVenda(),venda.getDataVenda());
    }

}
