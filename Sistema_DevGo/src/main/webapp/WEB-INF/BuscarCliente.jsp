<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Buscar Cliente</title>
        <c:url value="CSS/buscarCliente.css" var="BuscarCliente"/>
        <link type="text/css" rel="stylesheet" href="${BuscarCliente}"/>
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
                    <li><a href="Venda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastroCliente">Cadastrar Cliente</a></li>
                <li><a href="#">Editar Cliente</a></li>
            </ul>
        </aside>
        <c:url value="BuscarCliente" var="BuscarCliente"/>
        <form action="${BuscarCliente}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Empresa</h4>
                <div id="topo">
                    <p><label title="Apenas numeros." for="CNPJ">CNPJ:</label>
                        <input required="required" type="text" name="CNPJ" maxlength="14" id="CNPJ" size="55" onkeypress="return somenteNumero(event)"/>
                        <input id="Buscar" title="Buscar" value="Buscar" type="submit"></p>
                </div>
            </fieldset>
        </form>
    </body>
</html>