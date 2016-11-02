<%-- 
    Document   : CadastrarProduto
    Created on : 12/10/2016, 13:56:27
    Author     : Natanael Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Produtos</title>
        <c:url value="CSS/cadastrarProduto.css" var="cadProduto"/>
        <link type="text/css" rel="stylesheet" href="${cadProduto}" />
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
                            <a href="CadastrarCliente.jsp">Cliente</a>
                            <a href="CadastrarFuncionario.jsp">Funcionario</a>
                        </div>
                    </li>
                    <li><a href="CadastrarProduto.jsp">Produtos e Serviços</a><li>
                    <li><a href="Relatorio.jsp">Relatorios</a></li>
                    <li><a href="Vendas.jsp">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastrarProduto.jsp">Cadastrar Produto</a></li>
                <li><a href="CadastrarPlano.jsp">Cadastrar Plano</a></li>
                <li><a href="EditarProduto.jsp">Editar Produto</a></li>
                <li><a href="EditarPlano.jsp">Editar Plano</a></li>
                </ul>
                    </aside>
        <c:url value="CadastroProduto" var="CadastroProduto"/>
        <form action="${CadastroProduto}" method="post" enctype="application/x-www-form-urlencoded">
                        <fieldset id="dados">
                            <h4>Produto</h4>
                            <div id="topo">
                                <p><label title="Nome do idioma." for="Idioma">Livro idioma:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="LivroIdioma" maxlength="35" id="Idioma" size="80"/></p>
                                <p><label title="Preço dos produtos." for="Preco">Preço:</label>
                                    <input required="required" type="text" name="Preco" maxlength="10" id="Preço" size="35" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Quantidade de produtos." for="Quantidade">Quantidade:</label>
                                    <input required="required" type="text" name="Quantidade" maxlength="10" id="Quantidade" size="35" onkeypress="return somenteNumero(event)"/></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                        </div>
                    </form>
                    </body>
                    </html>