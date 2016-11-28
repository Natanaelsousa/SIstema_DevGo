

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <c:url value="CSS/acesso.css" var="Acesso"/>
        <link type="text/css" rel="stylesheet" href="${Acesso}"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    </head>
    <body>
        <div class="bar">
            <h1>Astec</h1>
        </div>
        <h2>Bem-Vindo!</h2>
        <ul>
            <li><a href="CadastroCliente"><i class="material-icons">person</i><i class="material-icons">work</i>Cadastros</a> 
                - Cadastros e edições de Clientes e Funcionários.</li>
            <li><a href="CadastroProduto"><i class="material-icons">shop</i><i class="material-icons">poll</i>Produtos e Serviços</a> 
                - Cadastros e edições de Produtos e Serviços.</li>
            <li><a href="RelatorioCliente"><i class="material-icons">description</i>Relatório</a> 
                - Exportar e gerar relatórios.</li>
            <li><a href="BuscaCNPJvenda"><i class="material-icons">shopping_cart</i>Vendas</a> 
                - Realizar nova venda.</li>
        </ul>
    </body>
</html>
