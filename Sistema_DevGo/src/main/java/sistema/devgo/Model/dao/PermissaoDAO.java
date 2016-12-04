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
   public void insert(Permissao permissao) throws SQLException {
        String insert = "INSERT INTO PERMISSAO (USUARIO,SENHA,COD_FUNCIONARIO) VALUES(?,?,?)";
        insert(insert, permissao.getUsuario(),permissao.getSenha(),permissao.getCod_funcionario());
        
    }

    public void update(Permissao permissao) throws SQLException {
        String update = "UPDATE PERMISSAO "
                + "SET COD_FUNCIONARIO = ?, USUARIO = ?,SENHA = ? WHERE COD_PERMISSAO = ?";
        update(update,permissao.getCod_permissao(), permissao.getCod_funcionario(), permissao.getUsuario(),permissao.getSenha());
    }

    public Permissao find(long funcionario) throws SQLException {

        String select = "SELECT * FROM PERMISSAO WHERE COD_FUNCIONARIO= "+funcionario+"";
         Permissao permissao = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            permissao = new Permissao();
           // permissao.setCod_funcionario(rs.getLong("cod_funcionario"));
            permissao.setUsuario(rs.getString("usuario"));
            permissao.setSenha(rs.getString("senha"));
            permissao.setCod_permissao(rs.getLong("cod_permissao"));
         
        }

        rs.close();
        stmt.close();

        return permissao;
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

        return cod;
 
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
            
           
            usuRetorno.setNome(resultado.getString("usuario"));
            usuRetorno.setSenhaCripto(resultado.getString("senha"));
        //(resultado.getString("senha"));
            
        }
   }    catch (SQLException ex) {  
            Logger.getLogger(PermissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    return usuRetorno;
}
     
      public String findDepartamento(Long user) throws SQLException {
        String depto = null;

        String select = "SELECT b.SETOR FROM funcionario AS a INNER JOIN "
                + "DEPARTAMENTO AS b ON (a.cod_depto = b.cod_depto) where COD_FUNCIONARIO="+user;

       PreparedStatement stmt
                = getConnection().prepareStatement(select);
        
        ResultSet rs = stmt.executeQuery();
        
         if (rs.next()) {

         depto = rs.getString("SETOR");
       }

         
     
        rs.close();
        stmt.close();

        return depto;
    }
          public long verificaUser (String nome) throws SQLException{
        
     long codFuncionario=0;  
        
     String select = "SELECT * FROM PERMISSAO WHERE USUARIO = '"+nome+"'";
         PreparedStatement stmt
                = getConnection().prepareStatement(select);
        
        ResultSet rs = stmt.executeQuery();
        
         if (rs.next()) {

         codFuncionario = rs.getLong("COD_FUNCIONARIO");
       }
        rs.close();
        stmt.close();

 
    return codFuncionario ;
}
          
          public long buscarIdPermissao(Long cod_funcionario) throws SQLException {
        
        long cod = 0;
    
        
        String select = "SELECT cod_permissao AS COD from permissao where cod_funcionario ='"+cod_funcionario+"'";
        
        PreparedStatement stmt
                = getConnection().prepareStatement(select);
        
        ResultSet rs = stmt.executeQuery();
        
         if (rs.next()) {

         cod = rs.getLong("COD");
       }

         
        rs.close();
        stmt.close();

        return cod;
 
    }
}

