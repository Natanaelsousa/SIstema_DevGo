<%-- 
    Document   : CadastrarFuncionario
    Created on : 12/10/2016, 13:52:20
    Author     : Natanael Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Cadastro Funcionario</title>
        <link type="text/css" rel="stylesheet" href="cadastrarFuncionario.css" />
        <c:url value="CSS/cadastrarFuncionario.css" var="CadFuncionario"/>
        <link type="text/css" rel="stylesheet" href="${CadFuncionario}"/>
        <meta name="viewport" content="width=device-width">
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
                <li><a href="EditarFuncionario.jsp">Editar Funcionario</a></li>
                <ul>
                    </aside>
                    <c:url value="CadastroFuncionario" var="CadastroFuncionario"/>
                    <form action="${CadastroFuncionario}" method="post" enctype="application/x-www-form-urlencoded">
                        <fieldset id="dados">
                            <h4>Empresa</h4>
                            <div id="topo">
                                <p><label title="Letras de A a Z." for="Nome">Nome:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Nome" maxlength="35" id="Nome" size="35"/></p>
                                <p><label title="Letras de A a Z." for="Nome">Sobrenome:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Sobrenome" maxlength="35" id="Sobrenome" size="85"/></p>
                                <p><label title="CPF Completo." for="CPF">CPF:</label>
                                    <input required="required" pattern="[0-9]*" type="text" name="CPF" maxlength="50" id="CPF" size="35" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Telefone Completo." for="Telefone">Telefone:</label>
                                    <input required="required" pattern="^\d{2}-\d{8}$" type="text" name="Telefone" maxlength="35" id="Telefone" size="35" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title=" " for="Datanasc">Data de Nascimento:</label>
                                    <input required="required" type="date" name="Datanasc" id="Datanasc" size="35"/></p>
                                <p><label title="Letras de A a Z." for="Departamento">Departamento:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Departamento" maxlength="35" id="Departamento" size="36"/></p>
                                <p><label title="Letras de A a Z." for="Usuario">Usuario:</label>
                                    <input required="required" pattern="[0-9]*" type="text" name="Usuario" maxlength="35" id="Usuario" size="35"/></p>
                                <p><label title=" " for="Senha">Senha:</label>
                                    <input required="required" type="password" name="Senha" minlength="5" maxlength="15" id="Senha" size="37"/></p>
                                <p><label title="Letras de A a Z." for="Status">Status:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Status" maxlength="35" id="Status" size="30"/></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                        </div>
                    </form>
                    </body>
                    </html>
