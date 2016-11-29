/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sistema.devgo.Model.dao.ClienteDAO;
import sistema.devgo.Model.dao.FuncionarioDAO;
import sistema.devgo.Model.dao.PermissaoDAO;
import sistema.devgo.java.Cliente;
import sistema.devgo.java.Funcionario;
import sistema.devgo.java.Permissao;
import sistema.devgo.java.UsuarioSistema;

/**
 *
 * @author roberto.slinhares
 */
@WebServlet(name = "BuscarFuncionario", urlPatterns = {"/BuscarFuncionario"})
public class BuscarFuncionario extends HttpServlet {

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
            out.println("<title>Servlet BuscarFuncionario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuscarFuncionario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        HttpSession sessao = httpRequest.getSession(false);
        
        Object objSessao = sessao.getAttribute("user");
        UsuarioSistema usuario = (UsuarioSistema) objSessao;
        usuario.getDepartamento();
        
        request.setAttribute("departamento", usuario.getDepartamento());
         String msgm = request.getParameter("msgm"); 
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/BuscarFuncionario.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        String serv = "/WEB-INF/EditarFuncionario.jsp";
          
        Funcionario funcionario = new Funcionario();
        Permissao permissao = new Permissao();
        FuncionarioDAO dao = new FuncionarioDAO ();
        PermissaoDAO dao2 = new PermissaoDAO ();

        String CPF = request.getParameter("CPF");
        
        try {
            
            funcionario = dao.findByCPF(CPF);
            request.setAttribute("CPF", CPF);
            request.setAttribute("", CPF);
               
        } catch (SQLException ex) {
           serv = "/WEB-INF/Erro-funcionario-nao-encontrado.jsp";
        }
        
        if(funcionario.getCpf() == null){
            
            serv = "/WEB-INF/Erro-funcionario-nao-encontrado.jsp";
                
            }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(serv);
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
