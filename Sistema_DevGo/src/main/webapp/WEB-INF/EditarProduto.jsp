<%-- 
    Document   : EditarProduto
    Created on : 12/10/2016, 13:59:54
    Author     : natan
--%>

<%@page import="sistema.devgo.java.Livro"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Edicao de produto</title>
        <link type="text/css" rel="stylesheet" href="Editar Produto.css" />
        <c:url value="CSS/editarProduto.css" var="EditaProduto"/>

        <link type="text/css" rel="stylesheet" href="${EditaProduto}"/>
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
    </head
    <%
            LivroDAO dao = new LivroDAO();
            
            String opcaoLivro = (String) request.getAttribute("opcaoLivro");
            
           
            Livro livro = dao.findBylivro(opcaoLivro);
            
                   
        %>

    
    <body>
        <header>
            <div class="logo">
                 <img src="<c:url value="/IMG/DevGo.png"/>" />
            </div>
            <div class="logout">
                <h3><a href="Login">Sair</a></h3>
            </div>
            <div class="bar">
                <ul id="menu">
                    <li class="dropdown">
                        <a href="#" class="btn">Cadastros</a>
                        <div class="dropdown-content">
                            <a href="CadastroCliente">Cliente</a>
                            <a href="CadastroFuncionario">Funcionario</a>
                        </div>
                    </li>
                    <li id="prod"><a href="CadastroProduto">Produtos e Serviços</a><li>
                    <li><a href="RelatorioCliente">Relatorios</a></li>
                    <li><a href="BuscaCNPJvenda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <aside>
            <ul>
                <li><a href="CadastroProduto">Cadastrar Produto</a></li>
                <li><a href="CadastroPlano">Cadastrar Plano</a></li>
                <li id="editarProduto"><a href="#">Editar Produto</a></li>
                <li><a href="EditarPlano">Editar Plano</a></li>
            </ul>
        </aside>
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="editado" />
        <input type="hidden" id="req" value="Produto" />
        <div id="mensagem"></div>
      <c:url value="EditaProduto" var="EditaProduto"/>
      <form action="${EditaProduto}" method="post" enctype="application/x-www-form-urlencoded">
                <fieldset id="dados">
                    <h4>Serviço</h4>
                    <div id="topo">
                        <p><label for="opcaoIdioma">Nome do produto:</label>
                            <input required="required" type="text" name="opcaoIdioma" maxlength="35" id="opcaoIdioma" size="52"  value="<%= livro.getIdioma()%>" /></p>
                        <p><label for="Preço">Preço:</label>
                            <input required="required" type="text" name="Preco" maxlength="35" id="Preço" size="52"  onkeypress="return somenteNumero(event)" value="<%= livro.getPreco()%>" /></p>
                        <p><label for="Quantidade">Quantidade:</label>
                            <input required="required" type="text" name="Quantidade" maxlength="35" id="Quantidade" size="52" onkeypress="return somenteNumero(event)" value="<%= livro.getQuantidade()%>"/></p>
                    </div>
                </fieldset>
                <div class="botoes">
                    <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                    <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                </div>
                       
            </form>
    </body>
</html>
