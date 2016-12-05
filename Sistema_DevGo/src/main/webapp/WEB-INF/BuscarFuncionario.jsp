
<%@page import="sistema.devgo.java.Departamento"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.DepartamentoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Cadastros</title>
        <c:url value="CSS/buscarFuncionario.css" var="BuscarFuncionario"/>
        <link type="text/css" rel="stylesheet" href="${BuscarFuncionario}"/>
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
    </head>
    <body>
        <header>
            <div class="logo">
               <img src="<c:url value="/IMG/DevGo.png"/>" />
            </div>
            <div class="logout">
                <h3><a href="Login">Sair</a></h3>
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
                <li><a href="CadastroFuncionario">Cadastrar Funcionario</a></li>
                <li><a href="#">Editar Funcionario</a></li>
            </ul>
        </aside>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="editado" />
        <input type="hidden" id="req" value="Funcionario" />
       <div id="mensagem"></div>
        <c:url value="BuscarFuncionario" var="BuscarFuncionario"/>
        <form action="${BuscarFuncionario}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Empresa</h4>
                <div id="topo">
                    <p><label title="Apenas numeros." for="CPF">CPF:</label>
                        <input required="required" type="text" name="CPF" maxlength="11" id="CPF" size="55" onblur="return TestaCPF(this.value)" onkeypress="return somenteNumero(event)"/>
                        <input id="Buscar" title="Buscar" value="Buscar" type="submit"></p>
                </div>
            </fieldset>
        </form>
    </body>
</html>