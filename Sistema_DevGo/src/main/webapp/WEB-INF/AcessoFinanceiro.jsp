
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <c:url value="CSS/acesso.css" var="AcessoFinanceiro"/>
        <link type="text/css" rel="stylesheet" href="${AcessoFinanceiro}"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    </head>
    <body>
        <div class="bar">
            <h1>Astec</h1>
        </div>
        <h2>Bem-Vindo!</h2>
        <ul>
            <li><a href="RelatorioCliente"><i class="material-icons">description</i>Relatório</a> 
                - Exportar e gerar relatórios.</li>
            <li><a href="BuscaCNPJvenda"><i class="material-icons">shopping_cart</i>Vendas</a> 
                - Realizar nova venda.</li>
        </ul>
    </body>
</html>

