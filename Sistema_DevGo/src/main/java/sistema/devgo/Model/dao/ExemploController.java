/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Model.dao;
////
////import sistema.devgo.Model.dao.ExemploDao;
////import sistema.devgo.java.exemplo;
/////**
//// *
//// * @author Erik
//// */
////public class ExemploController {
////    
//// 
////
////import javax.swing.*;
////import java.sql.Date;
////import java.sql.SQLException;
////import java.text.DateFormat;
////import java.text.ParseException;
////import java.text.SimpleDateFormat;
////import java.util.List;
////
////public class ContatoController {
////
////    private Date formatarData(String data) throws ParseException {
////        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
////        return new Date( formatter.parse(data).getTime() );
////    }
////
////    public void salvar(String nome, String apelido, String dtNascimento) 
////		throws SQLException, ParseException 
////	{
////        Contato contato = new Contato();
////        contato.setNome(nome);
////        contato.setApelido(apelido);
////        contato.setDtNascimento(formatarData(dtNascimento));
////
////        new ContatoDao().salvar(contato);
////    }
////
////    public void alterar(long id, String nome, String apelido, String dtNascimento) 
////		throws ParseException, SQLException 
////	{
////        
////		Contato contato = new Contato();
////        contato.setId(id);
////        contato.setNome(nome);
////        contato.setApelido(apelido);
////        contato.setDtNascimento(formatarData(dtNascimento));
////
////        new ContatoDao().alterar(contato);
////    }
////
////    public List<Contato> listaContatos() {
////        ContatoDao dao = new ContatoDao();
////        try {
////            return dao.findContatos();
////        } catch (SQLException e) {
////            JOptionPane.showMessageDialog(null, 
////				"Problemas ao localizar contaton" + 
////				e.getLocalizedMessage()
////			);
////        }
////        return null;
////    }
////
////    public void excluir(long id) throws SQLException {
////        new ContatoDao().excluir(id);
////    }
////
////    public Contato buscaContatoPorNome(String nome) throws SQLException {
////        ContatoDao dao = new ContatoDao();
////        return dao.findByName(nome);
////    }
////}
////    
//}
