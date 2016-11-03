
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.SQLException;
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
import sistema.devgo.Model.dao.FuncionarioDAO;
import sistema.devgo.Model.dao.PlanoDAO;
import sistema.devgo.java.Plano;

@WebServlet(name = "CadastroPlano", urlPatterns = {"/CadastroPlano"})
public class CadastroPlano extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroPlano</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroPlano at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Guardando dados vindos da tela nas variaveis
        String nm_plano = request.getParameter("Plano");
        String periodo= request.getParameter("Periodo");
        long idioma = Long.parseLong(request.getParameter("Idioma"));
        String preco_plano= request.getParameter("Preço");
        
        Double preco = null;
        try {
           
             String precos = Double.toString(preco);
         } catch (NumberFormatException ex) {
             ex.printStackTrace();
             return;
         }
        
        Plano plano= new Plano();
        plano.setNomePlano(nm_plano);
        plano.setPeriodo(periodo);
        plano.setPreco(preco);
        plano.setCod_idioma(idioma);
        
         PlanoDAO dao = new PlanoDAO ();
        try {
            dao.insert(plano);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
