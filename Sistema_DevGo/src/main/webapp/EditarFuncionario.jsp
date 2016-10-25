<%-- 
    Document   : EditarFuncionario
    Created on : 12/10/2016, 13:53:25
    Author     : natan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Cadastros</title>
        <link type="text/css" rel="stylesheet" href="Editar Funcionario.css" />
        <c:url value="CSS/editarFuncionario.css" var="EditarFuncionario"/>
        <link type="text/css" rel="stylesheet" href="${EditarFuncionario}"/>
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
            <li><a href="CadastrarFuncionario.jsp">Cadastrar Funcionario</a></li>
            <li><a href="#">Editar Funcionario</a></li>
            <ul>
                </aside>
                <form>
                    <fieldset id="dados">
                        <h4>Empresa</h4>
                        <div id="topo">
                            <p><label title="Numeros do CPF." for="CPF">CPF:</label>
                                <input required="required" pattern="[A-Za-z]*" type="text" name="CPF" maxlength="35" id="CPF" size="35"/>
                            <input id="Buscar" title="Buscar" value="Buscar" type="submit"></p>
                            <p><label title="Letras de A a Z." for="Nome">Nome:</label>
                                <input required="required" pattern="[A-Za-z]*" type="text" name="Nome" maxlength="35" id="Nome" size="35"/></p>
                            <p><label title="Sobrenome." for="Sobrenome">Sobrenome:</label>
                                <input required="required" pattern="[0-9]*" type="text" name="Sobrenome" maxlength="50" id="Sobrenome" size="92"/></p>
                            <p><label title="Letras de A a Z." for="Telefone">Telefone:</label>
                                <input required="required" pattern="^\d{2}-\d{8}$" type="text" name="Telefone" maxlength="35" id="Telefone" size="35" /></p>
                            <p><label title="Letras de A a Z." for="Datanasc">Data de nascimento:</label>
                                <input required="required" pattern="[A-Za-z]*" type="text" name="Datanasc" maxlength="30" id="Datanasc" size="25"/></p>
                            <p><label title="Letras de A a Z." for="Departamento">Departamento:</label>
                                <input required="required" pattern="[A-Za-z]*" type="text" name="Departamento" maxlength="35" id="Departamento" size="54"/></p>
                            <p><label title="Letras de A a Z." for="Usuario">Usuario:</label>
                                <input required="required" pattern="[0-9]*" type="text" name="Usuario" maxlength="35" id="Usuario" size="35"/></p>
                            <p><label title="Letras de A a Z." for="Senha">Senha:</label>
                                <input required="required" pattern="[0-9]*" type="text" name="Senha" maxlength="35" id="Senha" size="35"/></p>
                            <p><label title="Letras de A a Z." for="Status:">Status:</label>
                                Ativo<input required="required" type="radio" name="Status" maxlength="35" id="Status" size="15"/></p>
                                Inativo<input required="required" type="radio" name="Status" maxlength="35" id="Status" size="15"/></p>
                        </div>
                    </fieldset>
                    <div class="botoes">
                        <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                        <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                    </div>
                </form>
                </body>
                </html>
