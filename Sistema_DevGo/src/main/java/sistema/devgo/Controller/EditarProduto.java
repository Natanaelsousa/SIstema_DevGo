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
import sistema.devgo.Model.dao.EstoqueDAO;
import sistema.devgo.Model.dao.LivroDAO;
import sistema.devgo.java.Estoque;
import sistema.devgo.java.Livro;
import sistema.devgo.java.UsuarioSistema;

/**
 *
 * @author Natanael
 */
@WebServlet(name = "EditaProduto", urlPatterns = {"/EditaProduto"})
public class EditarProduto extends HttpServlet {

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
            out.println("<title>Servlet EditarProduto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditarProduto at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/EditarProduto.jsp");
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
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession sessao = httpRequest.getSession(false);

        Object objSessao = sessao.getAttribute("user");
        UsuarioSistema usuario = (UsuarioSistema) objSessao;
        usuario.getDepartamento();

        String preco = request.getParameter("Preco");
        int quantidade = Integer.parseInt(request.getParameter("Quantidade"));
        int quantidadeAtual = Integer.parseInt(request.getParameter("QuantidadeAtual"));
        String opcaoLivro = request.getParameter("opcaoIdioma");
        long codigo = Long.parseLong(request.getParameter("codigo"));
        double preco1 = Double.parseDouble(preco);

        Livro livro = new Livro();
        Estoque estoque = new Estoque();
        estoque.setCodIdioma(codigo);
        estoque.setQtdeEntrada(quantidade);
        livro.setIdioma(opcaoLivro);
        livro.setPreco(preco1);
        livro.setCod_idioma(codigo);
        LivroDAO dao = new LivroDAO();
        EstoqueDAO dao1 = new EstoqueDAO();
        if (estoque.getQtdeEntrada() == 0) {
            try {
                dao.editar(livro);
                request.setAttribute("departamento", usuario.getDepartamento());
                request.setAttribute("msgm", "sucesso");
            } catch (SQLException ex) {
                request.setAttribute("departamento", usuario.getDepartamento());
                request.setAttribute("msgm", "erro");
            }
        } else {
            try {
                dao.editar(livro);
                dao1.insert(estoque);
                request.setAttribute("departamento", usuario.getDepartamento());
                request.setAttribute("msgm", "sucesso");
            } catch (SQLException ex) {
                request.setAttribute("departamento", usuario.getDepartamento());
                request.setAttribute("msgm", "erro");
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/BuscaProduto.jsp");
            dispatcher.forward(request, response);

        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/BuscaProduto.jsp");
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
