<%-- 
    Document   : BuscaProduto
    Author     : Sibele
--%>

<%@page import="java.util.List"%>
<%@page import="sistema.devgo.java.Livro"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Buscar Produto</title>
        <c:url value="CSS/buscaProduto.css" var="EditarProduto"/>
        <link type="text/css" rel="stylesheet" href="${EditarProduto}"/>
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
    </head>
    
    
    
    <body>
        <header>
            <div class="logo">
                 <img src="<c:url value="/IMG/DevGo.png"/>" />
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
                    <li><a href="BuscaCNPJvenda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastroProduto">Cadastrar Produto</a></li>
                <li><a href="CadastroPlano">Cadastrar Plano</a></li>
                <li><a href="#">Editar Produto</a></li>
                <li><a href="BuscaPlano">Editar Plano</a></li>
            </ul>
        </aside>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="editado" />
        <input type="hidden" id="req" value="Produto" />
        <div id="mensagem"></div>
        <c:url value="BuscaProduto" var="BuscaProduto"/>
        <form action="${BuscaProduto}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Empresa</h4>
                <div id="topo">
                    <p><select name="opcaoLivro">
                                <option>Selecione o Livro...</option>
                                <%
                                    LivroDAO dao = new LivroDAO();
                                    List<Livro> livros = dao.findLivro();
                                    for (Livro livro : livros) {
                                %>
                                <option value="<%=livro.getCod_idioma()%>"><%=livro.getIdioma()%></option>
                                <%}%>
                            </select></p> 
                            <input id="Buscar" title="Buscar" value="Buscar" type="submit"></p>
                </div>
            </fieldset>
        </form>
    </body>
</html>
