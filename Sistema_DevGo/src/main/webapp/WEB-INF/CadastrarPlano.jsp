<%-- 
    Document   : CadastrarPlano
    Created on : 12/10/2016, 13:54:59
    Author     : Natanael Santos
--%>

<%@page import="sistema.devgo.java.Livro"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page import="sistema.devgo.java.Periodo"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.PeriodoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;" charset="UTF-8">
        <title>Cadastro Plano</title>
        <link type="text/css" rel="stylesheet" href="cadastrarPlano.css" />
        <c:url value="CSS/cadastrarPlano.css" var="cadPlano"/>
        <link rel="stylesheet" href="${cadPlano}"/>
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
                    <li><a href="RelatorioCliente">Relatorios</a></li>
                    <li><a href="Venda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastroProduto">Cadastrar Produto</a></li>
                <li><a href="#">Cadastrar Plano</a></li>
                <li><a href="EditarProduto">Editar Produto</a></li>
                <li><a href="EditarPlano">Editar Plano</a></li>
                </ul>
                    </aside>
                    <c:url value="CadastroPlano" var="CadastroPlano"/>
                    <form action="${CadastroPlano}" method="post" enctype="application/x-www-form-urlencoded">
                        <fieldset id="dados">
                            <h4>Serviço</h4>
                            <div id="topo">
                                <p><label for="Plano">Plano:</label>
                                    <input required="required" type="text" name="Plano" maxlength="35" id="Plano" size="52"/></p>
                                <p><select name="opcao">
                        <option>Selecione o Periodo...</option>
                        <%
                            PeriodoDAO dao = new PeriodoDAO();
                            List<Periodo> period = dao.findPeriodo();
                            for (Periodo periodos : period) {
                        %>
                        <option value="<%=periodos.getCod_periodo()%>"><%=periodos.getNm_periodo()%></option>
                        <%}%>
                        </select></p> 
                        
                        <p><label for="Preco">Preço:</label>
                            <input required="required" type="text" name="Preco" maxlength="35" id="Preco" size="40" onkeypress="return somenteNumero(event)"/></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                        </div>
                        
                    </form>
                    </body>
                    </html>
