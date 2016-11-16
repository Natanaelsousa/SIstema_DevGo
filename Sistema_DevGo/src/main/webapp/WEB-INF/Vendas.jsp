<%-- 
    Document   : Vendas.jsp
    Created on : 18/10/2016, 22:14:16
    Author     : roberto.slinhares
--%>

<%@page import="sistema.devgo.java.Cliente"%>
<%@page import="sistema.devgo.Model.dao.ClienteDAO"%>
<%@page import="sistema.devgo.Model.dao.FuncionarioDAO"%>
<%@page import="sistema.devgo.java.Livro"%>
<%@page import="sistema.devgo.java.Funcionario"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page import="sistema.devgo.java.Plano"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.PlanoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vendas</title>
        <link type="text/css" rel="stylesheet" href="vendas.css" />
        <c:url value="CSS/vendas.css" var="Vendas"/>
        <link type="text/css" rel="stylesheet" href="${Vendas}"/>
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
    </head>
    <body>
        <header>
            <div class="logo">
                <h1>Logo</h1>
            </div>
            <div class="logout">
                <h3><a href="#">Sair</a></h3>
            </div>
            <div class="bar">
                <ul>
                    <li class="dropdown">
                        <a href="#" class="btn">Cadastros</a>
                        <div class="dropdown-content">
                            <a href="CadastroCliente">Cliente</a>
                            <a href="CadastroFuncionario">Funcionario</a>
                        </div>
                    </li>
                    <li><a href="CadastroProduto">Produtos e Serviços</a><li>
                    <li><a href="Relatorio">Relatorios</a></li>
                    <li><a href="Venda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <c:url value="Vendas" var="urlVenda" />
        <form action="${urlVenda}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Dados</h4>
                <div id="topo">
                    <p><select name="opcaoCliente">
                        <option>Selecione o Cliente...</option>
                        <%
                            ClienteDAO daoCli = new ClienteDAO();
                            List<Cliente> cliente = daoCli.findCliente();
                            for (Cliente clientes : cliente) {
                        %>
                        <option value="<%=clientes.getCodCliente()%>"><%=clientes.getCNPJ()%><%=clientes.getRazaoSocial()%></option>
                        <%}%>
                        </select></p>
           
                    <p><select name="opcaoPlano">
                        <option>Selecione o Plano...</option>
                        <%
                            PlanoDAO dao = new PlanoDAO();
                            List<Plano> planos = dao.findPlano();
                            for (Plano plano : planos) {
                        %>
                        <option value="<%=plano.getCod_plano()%>"><%=plano.getNomePlano()%></option>
                        <%}%>
                        </select></p>
                        
                        
                    <p><select name="opcaoIdioma">
                        <option>Selecione o Idioma...</option>
                        <%
                            LivroDAO daoLivro = new LivroDAO();
                            List<Livro> livros = daoLivro.findLivro();
                            for (Livro livro : livros) {
                        %>
                        <option value="<%=livro.getCod_idioma()%>"><%=livro.getIdioma()%></option>
                        <%}%>
                        </select></p>
                        
                    <p><label for="Aluno">Quantidade de Alunos:</label>
                        <input required="required" type="number" name="QTDE_ALUNO" id="Aluno" /></p>
                    <p><label for="Valor">Valor:</label>
                        <input required="required" type="number" name="Valor" id="Valor" /></p>
                <p><label for="DataVenda">Data da venda:</label>
                        <input required="required" type="date" name="Datanasc" id="Datanasc"/></p>
                
                </div>
            </fieldset>
            <div class="botoes">
                <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                <input id="Limpar" title="Limpar" value="Limpar" type="reset">
            </div>
        </form>
    </body>
</html>
</body>
</html>
