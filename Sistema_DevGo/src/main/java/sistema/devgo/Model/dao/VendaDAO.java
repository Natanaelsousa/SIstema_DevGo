
package sistema.devgo.Model.dao;

import java.sql.SQLException;
import sistema.devgo.java.Venda;

/**
 *
 * @author Erik
 */
public class VendaDAO extends GenericaDAO {
    
    public void salvar(Venda venda) throws SQLException {
        String sql = "INSERT INTO venda(COD_PLANO, COD_CLIENTE,COD_FUNCIONARIO,QTDE_ALUNO,VALOR_VENDA,DT_VENDA) "
                + "VALUES(?,?,?,?,?,?)";
        insert(sql, venda.getCodPlano(),venda.getCodCliente(),venda.getCodFuncionario(),
                venda.getQuantidadeAluno(),venda.getValorVenda(),venda.getDataVenda() );
    }
    
}
