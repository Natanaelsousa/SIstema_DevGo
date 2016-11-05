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
import sistema.devgo.Model.dao.PlanoDAO;
import sistema.devgo.java.Plano;

/**
 *
 * @author natan
 */
@WebServlet(name = "EditarPlano", urlPatterns = {"/EditarPlano"})
public class EditarPlano extends HttpServlet {

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
            out.println("<title>Servlet EditarPlano</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditarPlano at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/EditarPlano.jsp");
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
// Guardando dados vindos da tela nas variaveis
        String nome = request.getParameter("opcaoPlano");
        long periodo = Long.parseLong(request.getParameter("opcaoPeriodo"));
        long idioma = Long.parseLong(request.getParameter("opcaoIdioma"));
        double preco = Double.parseDouble(request.getParameter("Preco")); 
        
        Plano plano= new Plano();
        plano.setNomePlano(nome);
        plano.setCod_Periodo(periodo);
        plano.setCod_idioma(idioma);
        plano.setPreco(preco);
       
        
         PlanoDAO dao = new PlanoDAO ();
        try {
            dao.update(plano);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
