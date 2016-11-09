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

        <div id="dados">
            <h4>Critérios de busca</h4>
            <div id="topo">
                <p><label for="Relatorio">Tipo de relatório:</label>
                    <select name="Relatorio">
                        <option value="Vendas">Vendas</option>
                    </select></p>
                <p><label title="Data inicial." for="DataIni">Data Inicial:</label>
                    <input required="required" type="date" name="dia" id="DataIni"/></p>
                <p><label title="Data final." for="DataFim">Data Final:</label>
                    <input required="required" type="date" name="ano" id="DataFim"/></p>
            </div>
            <div class="botoes">
                <input id="Buscar" title="Buscar" value="Buscar" type="submit">
                <input id="Exportar" title="Exportar" value="Exportar" type="reset">
            </div>
            <form>
                <fieldset id="tabela">
                    <table  style="width:100%">
                        <tr><th>Coluna 1</th><th>Coluna 2</th><th>Coluna 3</th></tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </body>
</html>
