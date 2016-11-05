/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sistema.devgo.Model.dao.ClienteDAO;
import sistema.devgo.java.Cliente;

/**
 *
 * @author Natanael
 */
@WebServlet(name = "CadastroCliente", urlPatterns = {"/CadastroCliente"})
public class CadastroCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
          /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroCliente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroCliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        
//        // Seta os atributos para compartilhar os valores com o jsp
//        // Nao confundir get/setAttribute com getParameter!!!
//        request.setAttribute("id", request.getParameter("id"));
//        request.setAttribute("Razao", Razao);
//        request.setAttribute("CNPJ", cnpj);
//        request.setAttribute("CEP", cep);
//        request.setAttribute("Telefone1", telefone1);
//        request.setAttribute("Telefone2", telefone2);
//        request.setAttribute("Email", email);
//        request.setAttribute("Rua", rua);
//        request.setAttribute("Cidade", cidade);
//        request.setAttribute("Numero", numero);
//        request.setAttribute("Bairro", bairro);
//        request.setAttribute("Estado", uf);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // Guardando dados vindos da tela nas variaveis
        String Razao = request.getParameter("Razao");
        String cnpj = request.getParameter("CNPJ");
        String cep = request.getParameter("CEP");
        String telefone1 = request.getParameter("Telefone1");
        String telefone2 = request.getParameter("Telefone2");
        String email = request.getParameter("Email");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero"); 
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("uf");
        
        System.out.println(cidade);

        Cliente cliente = new Cliente();
        
        cliente.setRazaoSocial(Razao);
        cliente.setCNPJ(cnpj);
        cliente.setCep(cep);
        cliente.setTelefone1(telefone1);
        cliente.setTelefone2(telefone2);
        cliente.setEmail(email);
        cliente.setRua(rua);
        cliente.setNumero(numero); /* o nomero pode possuir letras */
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        
        ClienteDAO dao = new ClienteDAO ();
        
        try {
            dao.salvar(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.setContentType("text/html;charset=UTF-8");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }
    
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/CadastrarCliente.jsp");
        dispatcher.forward(request, response);
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
