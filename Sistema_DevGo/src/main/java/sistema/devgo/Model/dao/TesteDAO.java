package sistema.devgo.Model.dao;



import java.sql.SQLException;

import sistema.devgo.java.Cliente;

/**
 *
 * @author Erik
 */
public class TesteDAO {
    
        public static void main(String[] args) throws SQLException {
         
           //recebendo do browser
          String CNPJ = "445458";
          String razaoSocial = "TATA";
          String cep = "123";
          String rua = "jd";
          String numero = "123a";
          String bairro = "jdalfredo";
          String cidade = "SAO";
          String estado = "sp";
          String telefone1 ="1138678386";
          String telefone2 ="11977839930";
          String email ="teste@hotmail.com";
          
          //tratar os dados necessários
     
          
          //instanciar o cliente
          Cliente c = new Cliente(CNPJ, razaoSocial,cep,rua, numero, bairro, cidade, estado, telefone1, telefone2, email);
          //instanciar o clienteDAO
          ClienteDAO cdao = new ClienteDAO();
          
            try {
                
              // metodo salvar sobescrito do DAO
              cdao.salvar(c);
                
            } catch (Exception e) {
                
                System.out.println("O CNPJ informado já possui cadastro!");
            }
       
         
         
          String CNPJ2 = "445458";
          String razaoSocial2 = "TTTTTTTTTTT";
          String cep2 = "123";
          String rua2 = "jd";
          String numero2 = "123a";
          String bairro2 = "jdalfredo";
          String cidade2 = "SAO";
          String estado2 = "sp";
          String telefone12 ="1138678386";
          String telefone22 ="11977839930";
          String email2 ="teste@hotmail.com";
         
          Cliente e = new Cliente(CNPJ2, razaoSocial2,cep2,rua2, numero2, bairro2, cidade2, estado2, telefone12, telefone22, email2);
          
          cdao.editar(e);
         
 
        }
 }
     


