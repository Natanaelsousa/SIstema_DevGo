<%-- 
    Document   : EditarProduto
    Created on : 12/10/2016, 13:59:54
    Author     : natan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Cadastros</title>
        <link type="text/css" rel="stylesheet" href="Editar Produto.css" />
        <c:url value="CSS/editarProduto.css" var="EditarProduto"/>
        <link type="text/css" rel="stylesheet" href="${EditarProduto}"/>
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
                <ul>
                    </aside>
                    <form>
                        <fieldset id="dados">
                            <h4>Serviço</h4>
                            <div id="topo">
                                <p><label title="Idioma." for="Idioma">Livro idioma:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="LivroIdioma" maxlength="35" id="Plano" size="52"/></p>
                                <p><label title="Preço." for="Preço">Preço:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Preço" maxlength="35" id="Preço" size="52"  onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Quantidade." for="Quantidade">Quantidade:</label>
                                    <input required="required" type="text" name="Quantidade" maxlength="35" id="Quantidade" size="52" onkeypress="return somenteNumero(event)"/></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                        </div>
                    </form>
                    </body>
                    </html>