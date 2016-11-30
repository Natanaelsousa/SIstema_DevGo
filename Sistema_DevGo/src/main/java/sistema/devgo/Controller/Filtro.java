/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;
import sistema.devgo.Model.dao.PermissaoDAO;
import sistema.devgo.java.UsuarioSistema;

/**
 *
 * @author natanael.ssousa
 */
@WebFilter(filterName = "filtro",
        servletNames = {"BuscarCliente", "BuscarFuncionario", "CadastroCliente", "CadastroFuncionario", 
            "CadastroPlano", "CadastroProduto", "EditarCliente", "EditarFuncionario", "EditarPlano", "EditarProduto",
            "Relatorio", "RelatorioCliente", "RelatorioFuncionario", "Vendas","ApresentacaoVenda"},
        urlPatterns = {"/protegido/*"})
public class Filtro implements Filter {

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        // 1) FAZER CAST DOS OBJETOS REQUEST E RESPONSE
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // 2) TENTAR RECUPERAR USUARIO DA SESSAO
        HttpSession sessao = httpRequest.getSession(false);
        UsuarioSistema usuario = null;
        if (sessao != null) {
            Object objSessao = sessao.getAttribute("user");
            if (objSessao != null) {
                usuario = (UsuarioSistema) objSessao;
            } else {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "");
                return;
            }
        } else {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "Login");
            return;
        }

        // 3) VERIFICAR SE USUARIO PODE ACESSAR PAGINA
        try {
            if (verificarAcesso(usuario, httpRequest, httpResponse)) {
                // ENCAMINHA REQUISIÇÃO PARA O PRÓXIMO FILTRO OU SERVLET
                chain.doFilter(request, response);
            } else {
                // NÃO PODE ACESSAR. APRESENTA TELA DE ERRO
                httpResponse.sendRedirect(httpRequest.getContextPath()
                        + "Login");
            }

        } catch (Throwable t) {
      // If an exception is thrown somewhere down the filter chain,
            // we still want to execute our after processing, and then
            // rethrow the problem after that.
            t.printStackTrace();
        }

    }

    private static
            boolean verificarAcesso(UsuarioSistema usuario,
                    HttpServletRequest request,
                    HttpServletResponse response) throws SQLException {

        String paginaCompleta = request.getRequestURI();
        String pagina = paginaCompleta.replace(request.getContextPath(), "");

        if (pagina.endsWith("/BuscarCliente") && 
             ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;   
        } else if (pagina.endsWith("/BuscarFuncionario")&& 
               "TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento())){
            return true;
         } else if (pagina.endsWith("/BuscaCNPJvenda")&& 
               ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;    
        } else if (pagina.endsWith("/Vendas")&& 
               ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;   
        } else if (pagina.endsWith("CadastroCliente")
                && "TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento())) {
            return true;
        } else if (pagina.endsWith("CadastroFuncionario")
                && "TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento())) {
            return true;
        } else if (pagina.endsWith("CadastroPlano") && 
                ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "SERVICO".equalsIgnoreCase(usuario.getDepartamento()) )){
            return true;
        } else if (pagina.endsWith("CadastroProduto")&&
                ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "SERVICO".equalsIgnoreCase(usuario.getDepartamento()) )){
            return true;
        } else if (pagina.endsWith("EditarCliente")
                && "TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento())) {
            return true;

        } else if (pagina.endsWith("EditarFuncionario")
                && "TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento())) {
            return true;

        } else if (pagina.endsWith("EditarPlano") && 
                 ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "SERVICO".equalsIgnoreCase(usuario.getDepartamento()) )){
            return true;

        } else if (pagina.endsWith("EditarProduto")&& 
                 ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "SERVICO".equalsIgnoreCase(usuario.getDepartamento()))){
            return true;

        } else if (pagina.endsWith("Relatorio") && 
                ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;

        } else if (pagina.endsWith("RelatorioCliente")&&
                ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;

        } else if (pagina.endsWith("RelatorioFuncionario")&& 
                ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;
       
        }else if (pagina.endsWith("ApresentacaoVenda")&& 
                ("TECNOLOGIA DA INFORMACAO".equalsIgnoreCase(usuario.getDepartamento()) 
                || "FINANCEIRO".equalsIgnoreCase(usuario.getDepartamento()) )) {
            return true;
       
        }

        return false;

    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {

    }

    /**
     * Init method for this filter
     */
    @Override
    public void init(FilterConfig filterConfig) {

    }

}
