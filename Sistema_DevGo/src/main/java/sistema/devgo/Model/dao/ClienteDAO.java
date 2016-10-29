package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.devgo.java.Cliente;

/**
 * @author Sibele
 */

public class ClienteDAO {
    public ClienteDAO(){
        
    }
    public void CadastrarCliente(Cliente cliente){
        try {
            String sql ="insert into CLIENTE(CNPJ, RAZAO_SOCIAL, CIDADE, TELEFONE1, "
                    + " TELEFONE2, RUA, EMAIL, ESTADO, NUMERO, BAIRRO, CEP) values(?, ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?);";
            PreparedStatement stm= ConexaoBD.getConnection().prepareStatement(sql);
            stm.setString(1, cliente.getCNPJ());
            stm.setString(2,  cliente.getRazaoSocial());
            stm.setString(3,  cliente.getCidade());
            stm.setString(4,  cliente.getTelefone1());
            stm.setString(5,  cliente.getTelefone2());
            stm.setString(6,  cliente.getRua());
            stm.setString(7,  cliente.getEmail());
            stm.setString(8,  cliente.getEstado());
            stm.setString(9,  cliente.getNumero());
            stm.setString(10,  cliente.getBairro());
            stm.setString(11,  cliente.getCep());
            
            stm.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente" +e.getMessage());
                
        }
    }

    
}
