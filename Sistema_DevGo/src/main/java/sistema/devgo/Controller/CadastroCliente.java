/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cadastro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cadastro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
    
    String razao = request.getParameter("Razao");
    String nome = request.getParameter("Nome");
    String cnpj = request.getParameter("CNPJ");
    String endereco = request.getParameter("Endereco");
    String cidade = request.getParameter("Cidade");
    String cep = request.getParameter("CEP");
    String telefone1 = request.getParameter("Telefone1");
    String telefone2 = request.getParameter("Telefone2");
    String email = request.getParameter("Email");
    
    //String[] interesses = request.getParameterMap().get("CEP");
    //String opcaoStr = request.getParameter("opcao");
    
//    DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//    Date dtNasc = null;
//    try {
//      dtNasc = formatador.parse(dtNascStr);
//    } catch (ParseException ex) {
//      //TODO: Fazer tratamento se data for invalida
//    }
//    
//    int sexo = Integer.parseInt(sexoStr);

    // PROCESSAMENTO DOS DADOS
    
    
    // Seta os atributos para compartilhar os valores com o jsp
    // Nao confundir get/setAttribute com getParameter!!!
    request.setAttribute("id", request.getParameter("id"));
    request.setAttribute("Razao", razao);
    request.setAttribute("Nome", nome);
    request.setAttribute("CNPJ", cnpj);
    request.setAttribute("Endereco", endereco);
    request.setAttribute("Cidade", cidade);
    request.setAttribute("CEP", cep);
    request.setAttribute("Telefone1", telefone1);
    request.setAttribute("Telefone2", telefone2);
    request.setAttribute("Email", email);
    
    // Encaminhamento para o processamento continuar no jsp.
    RequestDispatcher dispatcher =
	    request.getRequestDispatcher("resposta.jsp");
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

