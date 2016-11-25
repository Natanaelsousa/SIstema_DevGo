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
import sistema.devgo.Model.dao.ClienteDAO;
import sistema.devgo.java.Cliente;

/**
 *
 * @author natan
 */
@WebServlet(name = "EditarCliente", urlPatterns = {"/EditarCliente"})
public class EditarCliente extends HttpServlet {

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
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/EditarCliente.jsp");
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
        String cnpj = request.getParameter("CNPJ");
        String Razao = request.getParameter("Razao");
        String cep = request.getParameter("cep");
        String telefone1 = request.getParameter("Telefone1");
        String telefone2 = request.getParameter("Telefone2");
        String email = request.getParameter("Email");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero"); 
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("uf"); 
        
        
        Cliente cliente = new Cliente();
        
        cliente.setRazaoSocial(Razao);
        cliente.setCNPJ(cnpj);
        cliente.setCep(cep);
        cliente.setTelefone1(telefone1);
        cliente.setTelefone2(telefone2);
        cliente.setEmail(email);
        cliente.setRua(rua);
        cliente.setNumero(numero); /* o nomero pode possuir letras */
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        
        ClienteDAO dao = new ClienteDAO ();
        
        try {
            dao.editar(cliente);
            request.setAttribute("msgm", "sucesso");
        } catch (SQLException ex) {
        }
      
      RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/BuscarCliente.jsp");
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
