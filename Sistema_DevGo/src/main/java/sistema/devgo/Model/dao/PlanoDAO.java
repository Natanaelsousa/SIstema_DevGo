/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        String insert = "INSERT INTO PLANO(nm_plano, preco,periodo) VALUES(?,?,?)";
        insert(insert, plano.getNomePlano(), plano.getPreco(),plano.getPeriodo());
    }

    //Atualização de dados
    public void update(Plano plano) throws SQLException {
        String update = "UPDATE CONTATOS "
                + "SET nm_plano = ?, preco = ?, periodo = ?";
        update(update, plano.getNomePlano(), plano.getPreco(),plano.getPeriodo());
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
            planos.setNomePlano(rs.getString("nm_plano"));
            planos.setPreco(rs.getDouble("preco"));
            planos.setPeriodo(rs.getString("periodo"));
            
            
            plano.add(planos);
        }

        rs.close();
        stmt.close();

        return plano;
    }
    public Plano findByName(String nome) throws SQLException {
        String select = "SELECT * FROM PLANO WHERE cpf = ?";
        Plano plano = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
          plano.setId_plano(rs.getLong("cod_plano"));
            plano.setNomePlano(rs.getString("nm_plano"));
            plano.setPreco(rs.getDouble("preco"));
            plano.setPeriodo(rs.getString("periodo"));
        }

        rs.close();
        stmt.close();
        return plano;
    }
}
