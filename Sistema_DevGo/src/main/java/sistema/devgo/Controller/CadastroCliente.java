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
        // Guardando dados vindos da tela nas variaveis
        String Razao = request.getParameter("Razao");
        String CNPJ = request.getParameter("CNPJ");
        String CEP = request.getParameter("CEP");
        String Telefone1 = request.getParameter("Telefone1");
        String Telefone2 = request.getParameter("Telefone2");
        String Email = request.getParameter("Email");
        String Rua = request.getParameter("Rua");
        String Numero = request.getParameter("Numero");
        String Bairro = request.getParameter("Bairro");
        String Cidade = request.getParameter("Cidade");
        String UF = request.getParameter("UF");

    // Seta os atributos para compartilhar os valores com o jsp
        // Nao confundir get/setAttribute com getParameter!!!
        request.setAttribute("id", request.getParameter("id"));
        request.setAttribute("Razao",Razao);
        request.setAttribute("CNPJ", CNPJ);
        request.setAttribute("CEP", CEP);
        request.setAttribute("Telefone1", Telefone1);
        request.setAttribute("Telefone2", Telefone2);
        request.setAttribute("Email", Email);
        request.setAttribute("Rua", Rua);
        request.setAttribute("Cidade", Cidade);
        request.setAttribute("Numero", Numero);
        request.setAttribute("Bairro", Bairro);
        request.setAttribute("Cidade", Cidade);
        request.setAttribute("UF", UF);

        // Encaminhamento para o processamento continuar no jsp.
        request.getRequestDispatcher("teste.jsp").forward(request, response);
    }
    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

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
