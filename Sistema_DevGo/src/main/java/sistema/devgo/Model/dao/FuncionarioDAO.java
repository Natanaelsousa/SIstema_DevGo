
package sistema.devgo.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.devgo.java.Funcionario;

/**
 *
 * @author Natanael
 */
public class FuncionarioDAO extends GenericaDAO {

    public void insert(Funcionario funcionario) throws SQLException {
        String insert = "INSERT INTO FUNCIONARIO (cod_depto,nome,sobrenome,telefone,usuario,cpf,"
                + "senha,status,dt_nascimento) VALUES(?,?,?,?,?,?,?,?,?)";
        insert(insert, funcionario.getCodDepartamento(), funcionario.getNome(), funcionario.getSobrenome(), funcionario.getTelefone(),
                funcionario.getUsuario(), funcionario.getCpf(), funcionario.getSenha(), funcionario.getStatus(),
                funcionario.getDtNascimento());
    }

    public void update(Funcionario funcionario) throws SQLException {
        String update = "UPDATE FUNCIONARIO "
                + "SET cod_depto = ?, nome = ?, sobrenome = ?, telefone = ?, usuario = ?, cpf = ?, senha = ?,"
                + "status = ?, dt_nascimento= ? WHERE cod_funcionario = ?";
        update(update, funcionario.getCodDepartamento(), funcionario.getNome(), funcionario.getSobrenome(), funcionario.getTelefone(),
                funcionario.getUsuario(), funcionario.getCpf(), funcionario.getSenha(), funcionario.getStatus(),
                funcionario.getDtNascimento(), funcionario.getCodFuncionario());
    }

    public List<Funcionario> findFuncionario() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        String select = "SELECT * FROM FUNCIONARIO";

        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setCodDepartamento(rs.getLong("cod_departamento"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setSobrenome(rs.getString("sobrenome"));
            funcionario.setTelefone(rs.getString("telefone"));
            funcionario.setUsuario(rs.getString("usuario"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setSenha(rs.getString("senha"));
            funcionario.setStatus(rs.getString("status"));
            funcionario.setDtNascimento(rs.getDate("dt_nascimento"));
            funcionario.setCodFuncionario(rs.getLong("cod_funcionario"));
            funcionarios.add(funcionario);
        }

        rs.close();
        stmt.close();

        return funcionarios;
    }

    public Funcionario findByName(String cpf) throws SQLException {
        String select = "SELECT * FROM FUNCIONARIO WHERE cpf = ?";
        Funcionario funcionario = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            funcionario.setCodFuncionario(rs.getLong("cod_funcionario"));
            funcionario.setCodDepartamento(rs.getLong("cod_departamento"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setSobrenome(rs.getString("sobrenome"));
            funcionario.setTelefone(rs.getString("telefone"));
            funcionario.setUsuario(rs.getString("usuario"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setSenha(rs.getString("senha"));
            funcionario.setStatus(rs.getString("status"));
            funcionario.setDtNascimento(rs.getDate("dt_nascimento"));
        }

        rs.close();
        stmt.close();
        return funcionario;
    }

}
