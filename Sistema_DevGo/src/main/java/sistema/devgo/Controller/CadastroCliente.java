/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Natanael
 */
@WebServlet(name = "CadastroCliente", urlPatterns = {"/cadastroCliente"})
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
        }
    }

   
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
      
     // Guardando dados vindos da tela nas variaveis
    String razao = request.getParameter("Razao");
    String cnpj = request.getParameter("CNPJ");
    String cep = request.getParameter("CEP");
    String telefone1 = request.getParameter("Telefone1");
    String telefone2 = request.getParameter("Telefone2");
    String email = request.getParameter("Email");
    String rua = request.getParameter("Rua");
    String numero = request.getParameter("Numero");
    String bairro = request.getParameter("Bairro");
    String cidade = request.getParameter("Cidade");
    String uf = request.getParameter("Estado");
    
    // Seta os atributos para compartilhar os valores com o jsp
    // Nao confundir get/setAttribute com getParameter!!!
    request.setAttribute("id", request.getParameter("id"));
    request.setAttribute("Razao", razao);
    request.setAttribute("CNPJ", cnpj);
    request.setAttribute("CEP", cep);
    request.setAttribute("Telefone1", telefone1);
    request.setAttribute("Telefone2", telefone2);
    request.setAttribute("Email", email);
    request.setAttribute("Rua", rua);
    request.setAttribute("Cidade", cidade);
    request.setAttribute("Numero", numero);
    request.setAttribute("Bairro", bairro);
    request.setAttribute("Estado", uf);
    
    // Encaminhamento para o processamento continuar no jsp.
   RequestDispatcher dispatcher =
	    request.getRequestDispatcher("EditarCliente.jsp");
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

