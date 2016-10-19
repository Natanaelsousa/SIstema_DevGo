<%-- 
    Document   : Relatorio
    Created on : 12/10/2016, 13:57:16
    Author     : natan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <title>Cadastros</title>
        <link type="text/css" rel="stylesheet" href="relatorio.css" />
        <c:url value="CSS/relatorio.css" var="Relatorio"/>
        <link type="text/css" rel="stylesheet" href="${Relatorio}"/>
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

        <form>
            <fieldset id="dados">
                <h4>Critérios de busca</h4>
                <div id="topo">
                    <input placeholder="Tipo de relatório"required="required" pattern="[A-Za-z]*" type="text" name="Razao" maxlength="35" id="Razao" size="35"/></p>
                    <p><label title="Data inicial." for="DataIni">Data Inicial:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="DataIni" maxlength="35" id="DataIni" size="15"/></p>
                    <p><label title="Data final." for="DataFim">Data Final:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="DataFim" maxlength="35" id="DataFim" size="15"/></p>
                </div>
                <div class="botoes">
                    <input id="Buscar" title="Buscar" value="Buscar" type="submit">
                    <input id="Exportar" title="Exportar" value="Exportar" type="reset">
                </div>
            </fieldset>
            <fieldset id="tabela">
                <table  style="width:100%">
                    <tr><th>Coluna 1</th><th>Coluna 2</th><th>Coluna 3</th></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                    <tr><td>a</td> <td>a</td> <td>a</td></tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
