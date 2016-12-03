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
import sistema.devgo.Model.dao.LivroDAO;
import sistema.devgo.java.Livro;
import sistema.devgo.java.UsuarioSistema;

/* @author Sibele */
@WebServlet(name = "BuscaProduto", urlPatterns = {"/BuscaProduto"})
public class BuscaProduto extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BuscaProduto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuscaProduto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/BuscaProduto.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession sessao = httpRequest.getSession(false);

        Object objSessao = sessao.getAttribute("user");
        UsuarioSistema usuario = (UsuarioSistema) objSessao;
        usuario.getDepartamento();
        request.setAttribute("departamento", usuario.getDepartamento());
        String serv = "/WEB-INF/EditarProduto.jsp";

        Livro livro = new Livro();

        LivroDAO dao = new LivroDAO();
        
        String opcaoLivro = request.getParameter("opcaoLivro");

        try {

            livro = dao.findByName(opcaoLivro);
            request.setAttribute("opcaoLivro", opcaoLivro);

        } catch (SQLException ex) {

        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(serv);
        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
