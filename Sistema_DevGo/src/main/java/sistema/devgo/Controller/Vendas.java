/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
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
import sistema.devgo.Model.dao.ClienteDAO;
import sistema.devgo.Model.dao.LivroDAO;
import sistema.devgo.Model.dao.PlanoDAO;
import sistema.devgo.Model.dao.VendaDAO;
import sistema.devgo.java.Cliente;
import sistema.devgo.java.Livro;
import sistema.devgo.java.Plano;
import sistema.devgo.java.Venda;

/**
 *
 * @author Sibele
 */
@WebServlet(name = "Vendas", urlPatterns = {"/Vendas"})
public class Vendas extends HttpServlet {

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
            out.println("<title>Servlet Vendas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Vendas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Vendas.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PlanoDAO planodao = new PlanoDAO();
        LivroDAO livrodao = new LivroDAO();

        String dataVenda = request.getParameter("DataVenda");
        long codCliente = Long.parseLong(request.getParameter("Id"));
        long idiomaLivro = Long.parseLong(request.getParameter("opcaoIdioma")); // pega ID
        long codplano = Long.parseLong(request.getParameter("opcaoPlano"));// pega ID
        int quantAluno = Integer.parseInt(request.getParameter("QTDE_ALUNO"));

        Plano modeloPlano = null;
        try {
            modeloPlano = planodao.trasPlano(codplano);
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        Livro modelolivro = null;
        try {
            modelolivro = livrodao.trasLivro(idiomaLivro);
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        double resultado1 = quantAluno * modelolivro.getPreco();
        double resultado2 = resultado1 + modeloPlano.getPreco();
        double valor_venda = resultado2;

        Venda venda = new Venda();
        venda.setCodPlano(codplano);
        venda.setCodCliente(codCliente);
        venda.setCodIdioma(idiomaLivro);
        venda.setQuantidadeAluno(quantAluno);
        venda.setValorVenda(valor_venda);

        VendaDAO dao = new VendaDAO();

        try {
            dao.insert(venda);
            request.setAttribute("msgm", "sucesso");
        } catch (SQLException ex) {
            request.setAttribute("msgm", "erro");
        }
        response.setContentType("text/html;charset=UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ApresentacaoVenda.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
