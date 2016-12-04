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
import sistema.devgo.java.Livro;
import sistema.devgo.java.Venda;

/**
 *
 * @author Alessandra
 */
public class LivroDAO extends GenericaDAO {

    public void salvar(Livro livro) throws SQLException {
        String sql = "INSERT INTO LV_IDIOMA(TIPO_IDIOMA,PRECO,QTDE_ATUAL) "
                + "VALUES(?,?,?)";
        insert(sql, livro.getIdioma(), livro.getPreco(), livro.getQuantidade());
    }

    public void editar(Livro livro) throws SQLException {
        long teste = livro.getCod_idioma();
        String sql = "UPDATE LV_IDIOMA "
                + "SET PRECO = ?, TIPO_IDIOMA = ? WHERE COD_IDIOMA = ?";

        update(sql, livro.getCod_idioma(), livro.getPreco(), livro.getIdioma());

    }

    public Livro trasLivro(Long codLivro) throws SQLException {
        Livro livros = null;

        String sql = "SELECT * FROM LV_IDIOMA where cod_idioma =" + codLivro;

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            livros = new Livro();
            livros.setCod_idioma(rs.getLong("COD_IDIOMA"));
            livros.setIdioma(rs.getString("TIPO_IDIOMA"));
            livros.setPreco(rs.getDouble("PRECO"));
            livros.setQuantidade(rs.getInt("QTDE_ATUAL"));

        }

        rs.close();
        stmt.close();

        return livros;
    }

    public List<Livro> findLivro() throws SQLException {
        List<Livro> livros = new ArrayList<Livro>();

        String sql = "SELECT * FROM LV_IDIOMA";

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Livro livro = new Livro();
            livro.setCod_idioma(rs.getLong("COD_IDIOMA"));
            livro.setIdioma(rs.getString("TIPO_IDIOMA"));
            livro.setPreco(rs.getDouble("PRECO"));
            livro.setQuantidade(rs.getInt("QTDE_ATUAL"));

            livros.add(livro);
        }

        rs.close();
        stmt.close();

        return livros;
    }
//saber o que passa como parametro

    public Livro findByName(String xx) throws SQLException {
        String sql = "SELECT * FROM LV_IDIOMA WHERE TIPO_IDIOMA = ?";
        Livro livro = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        stmt.setString(1, xx);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            livro.setCod_idioma(rs.getLong("COD_IDIOMA"));
            livro.setIdioma(rs.getString("TIPO_IDIOMA"));
            livro.setPreco(rs.getDouble("PRECO"));
            livro.setQuantidade(rs.getInt("QTDE_ATUAL"));

        }

        rs.close();
        stmt.close();
        return livro;
    }

    public Livro findBylivro(String livronome) throws SQLException {

        String sql = "SELECT * FROM LV_IDIOMA WHERE TIPO_IDIOMA = ?";

        Livro livro = new Livro();

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        stmt.setString(1, livronome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            livro.setCod_idioma(rs.getLong("COD_IDIOMA"));
            livro.setIdioma(rs.getString("TIPO_IDIOMA"));
            livro.setPreco(rs.getDouble("PRECO"));
            livro.setQuantidade(rs.getInt("QTDE_ATUAL"));
        }

        rs.close();
        stmt.close();
        return livro;
    }
    
     public Livro findById() throws SQLException {

        String sql = "SELECT * FROM LV_IDIOMA WHERE COD_IDIOMA = ?";

        Livro livro = new Livro();

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            livro.setCod_idioma(rs.getLong("COD_IDIOMA"));
            livro.setIdioma(rs.getString("TIPO_IDIOMA"));
            livro.setPreco(rs.getDouble("PRECO"));
            livro.setQuantidade(rs.getInt("QTDE_ATUAL"));
        }

        rs.close();
        stmt.close();
        return livro;
    }

    public long verificaProdutoExistente(String produto) throws SQLException {

        long codIdioma = 0;

        String select = "SELECT * FROM LV_IDIOMA WHERE TIPO_IDIOMA = '" + produto + "'";
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            codIdioma = rs.getLong("COD_IDIOMA");
        }
        rs.close();
        stmt.close();

        return codIdioma;
    }

    public Livro verificaQuantidadeLivros(Long codIdioma) throws SQLException {
        Livro livros = null;

        String sql = "SELECT QTDE_ATUAL FROM lv_idioma where COD_IDIOMA= " + codIdioma;

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            livros = new Livro();
            livros.setCod_idioma(rs.getLong("COD_IDIOMA"));
            livros.setQuantidade(rs.getInt("QTDE_ATUAL"));

        }

        rs.close();
        stmt.close();

        return livros;
    }

}
