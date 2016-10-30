package sistema.devgo.Model.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Cliente;


/**
 * @author Erik
 */

public class ClienteDAO extends GenericaDAO {
    
      
    public void salvar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente(CNPJ, RAZAO_SOCIAL,CIDADE,TELEFONE1,TELEFONE2,RUA,EMAIL,ESTADO,NUMERO,BAIRRO,CEP) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        insert(sql, cliente.getCNPJ(),cliente.getRazaoSocial(),cliente.getCidade(),cliente.getTelefone1(),cliente.getTelefone2(),
        cliente.getRua(),cliente.getEmail(),cliente.getEstado(),cliente.getNumero(),cliente.getBairro(),cliente.getCep());
    }
    
    public void editar(Cliente cliente) throws SQLException{
        
           String sql = "UPDATE cliente " +
                   "SET RAZAO_SOCIAL = ?, CIDADE = ?, TELEFONE1 = ?,  "
                   + "TELEFONE2 = ?,RUA = ?,EMAIL = ?,ESTADO = ?, NUMERO = ?, BAIRRO = ?,CEP = ? "
                   + "WHERE CNPJ = ?";
           
           update(sql, cliente.getCNPJ(),cliente.getRazaoSocial(),cliente.getCidade(),cliente.getTelefone1(),cliente.getTelefone2(),
                   cliente.getRua(),cliente.getEmail(),cliente.getEstado(),cliente.getNumero(),cliente.getBairro(),cliente.getCep());
        
    }
    
    public List<Cliente> findCliente() throws SQLException {
        List<Cliente> clientes = new ArrayList <Cliente>();

        String sql = "SELECT * FROM cliente";

        PreparedStatement stmt = 
			getConnection().prepareStatement(sql);
			
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodCliente(rs.getLong("COD_CLIENTE"));
            cliente.setCNPJ(rs.getString("CNPJ"));
            cliente.setRazaoSocial(rs.getString("RAZAO_SOCIAL"));
            cliente.setCidade(rs.getString("CIDADE"));
            cliente.setTelefone1(rs.getString("TELEFONE1"));
            cliente.setTelefone2(rs.getString("TELEFONE2"));
            cliente.setRua(rs.getString("RUA"));
            cliente.setEmail(rs.getString("EMAIL"));
            cliente.setEstado(rs.getString("ESTADO"));
            cliente.setNumero(rs.getString("NUMERO"));
            cliente.setBairro(rs.getString("BAIRRO"));
            cliente.setCep(rs.getString("CEP"));
                    
            clientes.add(cliente);
        }

        rs.close();
        stmt.close();

        return clientes;
    }
    
      public Cliente findByName(String cnpj) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE CNPJ = ?";
        Cliente cliente = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(sql);
			
        stmt.setString(1, cnpj);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            cliente.setCodCliente(rs.getLong("COD_CLIENTE"));
            cliente.setCNPJ(rs.getString("CNPJ"));
            cliente.setRazaoSocial(rs.getString("RAZAO_SOCIAL"));
            cliente.setCidade(rs.getString("CIDADE"));
            cliente.setTelefone1(rs.getString("TELEFONE1"));
            cliente.setTelefone2(rs.getString("TELEFONE2"));
            cliente.setRua(rs.getString("RUA"));
            cliente.setEmail(rs.getString("EMAIL"));
            cliente.setEstado(rs.getString("ESTADO"));
            cliente.setNumero(rs.getString("NUMERO"));
            cliente.setBairro(rs.getString("BAIRRO"));
            cliente.setCep(rs.getString("CEP"));
        }

        rs.close();
        stmt.close();
        return cliente;
    }

    
    
}
