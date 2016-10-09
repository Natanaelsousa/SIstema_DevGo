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
 * @author natan
 */
@WebServlet(name = "Cadastro", urlPatterns = {"/cadastro"})
public class Cadastro extends HttpServlet {

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
    
    String nome = request.getParameter("nome");
    String email = request.getParameter("email");
    String senha = request.getParameter("senha");
    String dtNascStr = request.getParameter("dtnasc");
    String sexoStr = request.getParameter("sexo");
    String[] interesses = request.getParameterMap().get("interesses");
    String opcaoStr = request.getParameter("opcao");
    
    DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Date dtNasc = null;
    try {
      dtNasc = formatador.parse(dtNascStr);
    } catch (ParseException ex) {
      //TODO: Fazer tratamento se data for invalida
    }
    
    int sexo = Integer.parseInt(sexoStr);

    // PROCESSAMENTO DOS DADOS
    
    
    // Seta os atributos para compartilhar os valores com o jsp
    // Nao confundir get/setAttribute com getParameter!!!
    request.setAttribute("id", request.getParameter("id"));
    request.setAttribute("nome", nome);
    request.setAttribute("email", email);
    request.setAttribute("senha", senha);
    request.setAttribute("dtnascimento", dtNasc);
    request.setAttribute("salario", new BigDecimal(1000000));
    request.setAttribute("sexo", sexo);
    request.setAttribute("interesses", interesses);
    request.setAttribute("opcao", opcaoStr);
    
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

