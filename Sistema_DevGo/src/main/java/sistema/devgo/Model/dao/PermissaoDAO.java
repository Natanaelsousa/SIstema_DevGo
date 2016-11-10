/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.devgo.java.Permissao;
import sistema.devgo.java.UsuarioSistema;


/**
 *
 * @author Natanael 
 */
public class PermissaoDAO extends GenericaDAO {
    
    private Connection con = ConexaoBD.getConnection();
   public void insert(Permissao permissao,long codFuncionario) throws SQLException {
        String insert = "INSERT INTO PERMISSAO (USUARIO,SENHA,COD_FUNCIONARIO) VALUES(?,?,?)";
        insert(insert, permissao.getUsuario(),permissao.getSenha(),codFuncionario);
        
    }

    public void update(Permissao permissao,long codFuncionario) throws SQLException {
        String update = "UPDATE FUNCIONARIO "
                + "SET COD_FUNCIONARIO = ?, USUARIO = ?,SENHA = ? WHERE COD_PERMISSAO = ?";
        update(update, permissao.getUsuario(),permissao.getSenha(),codFuncionario);
    }

    public List<Permissao> findFuncionario() throws SQLException {
        List<Permissao> permissoes = new ArrayList<Permissao>();

        String select = "SELECT * FROM PERMISSAO";

        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Permissao permissao = new Permissao();
           // permissao.setCod_funcionario(rs.getLong("cod_funcionario"));
            permissao.setUsuario(rs.getString("usuario"));
            permissao.setSenha(rs.getString("senha"));
            permissao.setCod_permissao(rs.getLong("cod_permissao"));
            permissoes.add(permissao);
        }

        rs.close();
        stmt.close();

        return permissoes;
    }
    
    public long buscarId() throws SQLException {
        
        long cod = 0;
    
        
        String select = "SELECT MAX(COD_FUNCIONARIO) AS COD FROM funcionario";
        
        PreparedStatement stmt
                = getConnection().prepareStatement(select);
        
        ResultSet rs = stmt.executeQuery();
        
         if (rs.next()) {

         cod = rs.getLong("COD");
       }

         
        rs.close();
        stmt.close();

        return cod+1;
 
    }
     public UsuarioSistema autenticacao(UsuarioSistema usuario){
        UsuarioSistema usuRetorno = null;
        
         
        String senhagerada = String.valueOf(usuario.getHashSenha());
        
     String sql = "SELECT * FROM PERMISSAO WHERE USUARIO = ? AND SENHA = ? ";
     
   try{
       PreparedStatement preparador = con.prepareStatement(sql);
       preparador.setString(1, usuario.getNome());
        preparador.setString(2, senhagerada);
        //(2, usuario.getHashSenha);
        
        
        
        ResultSet resultado = preparador.executeQuery();
        
        //se possui registro
        if(resultado.next()){
            usuRetorno = new UsuarioSistema();
            
           
            usuRetorno.setNome(resultado.getString("nome"));
            usuRetorno.setSenhaCripto(resultado.getString("senha"));
        //(resultado.getString("senha"));
            
        }
   }    catch (SQLException ex) {  
            Logger.getLogger(PermissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    return usuRetorno;
}
}
