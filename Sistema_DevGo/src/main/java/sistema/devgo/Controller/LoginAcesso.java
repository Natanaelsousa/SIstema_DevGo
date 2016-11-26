/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sistema.devgo.Model.dao.PermissaoDAO;
import sistema.devgo.java.UsuarioSistema;

/**
 *
 * @author natan
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class LoginAcesso extends HttpServlet {

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
            out.println("<title>Servlet LoginAcesso</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginAcesso at " + request.getContextPath() + "</h1>");
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

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/Login.jsp");
        dispatcher.forward(request, response);
        //Redireciona para uma pagina mas não consegui encontrar ela no projeto / teste-servlet ???
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

        String login = request.getParameter("login");
        String ssenha = request.getParameter("senha");
        

        UsuarioSistema user = new UsuarioSistema(login, ssenha);

        String senhagerada = String.valueOf(user.getHashSenha());
        PermissaoDAO usuDAO = new PermissaoDAO();
        String departamento = null;
        try {
            departamento = usuDAO.findDepartamento(user);
        } catch (SQLException ex) {
            Logger.getLogger(LoginAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
        UsuarioSistema usuAutenticado = usuDAO.autenticacao(user);

        if (usuAutenticado != null) {
            HttpSession sessao = request.getSession(true);
            sessao.setAttribute("usuario", user);

            if (departamento == "TECNOLOGIA DA INFORMACAO") {
                request.getRequestDispatcher("/WEB-INF/AcessoTI.jsp").forward(request, response);
            } else if (departamento == "FINANCEIRO") {
                request.getRequestDispatcher("/WEB-INF/AcessoFinanceiro.jsp").forward(request, response);
            } else if (departamento == "SERVICO") {
                request.getRequestDispatcher("/WEB-INF/AcessoProdServ.jsp").forward(request, response);
            } else {
                response.sendRedirect("erroLogin.jsp");
            }
        }
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
