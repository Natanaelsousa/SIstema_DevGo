/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Model.dao;

import java.sql.SQLException;
import sistema.devgo.java.Estoque;

/**
 *
 * @author natan
 */
public class EstoqueDAO extends GenericaDAO {
    public void insert (Estoque estoque) throws SQLException {
        String sql = "INSERT INTO ENTRADA(COD_IDIOMA,QTDE_ATUAL) "
                + "VALUES(?,?)";
        insert(sql, estoque.getCodIdioma(), estoque.getQtdeEntrada());
    } 
}
