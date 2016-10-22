<%-- 
    Document   : CadastrarCliente
    Created on : 08/10/2016, 17:37:36
    Author     : Natanael 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente </title>
        <c:url value="CSS/cadastrarCliente.css" var="urlCadCliente"/>
        <link type="text/css" rel="stylesheet" href="${urlCadCliente}"/>
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
                            <a href="Cadastrar Cliente.jsp">Cliente</a>
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
                <li><a href="CadastrarCliente.jsp">Cadastrar Cliente</a></li>
                <li><a href="EditarCliente.jsp">Editar Cliente</a></li>
                <ul>
                    </aside>
                    <c:url value="CadastroCliente" var="urlCadastroCliente" />
                    <form action="${urlCadastroCliente}" method="post" enctype="application/x-www-form-urlencoded">
                        <fieldset id="dados">
                            <h4>Empresa</h4>
                            <div id="topo">
                                <p><label title="Letras de A a Z." for="Razao">Razao Social:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Razao" maxlength="35" id="Razao" size="35"/></p>  
                                <p><label title="CNPJ Completo." for="Nome">CNPJ:</label>
                                    <input title="Digite seu cnpj no formato ##.###.###-####" placeholder="##.###.###-####" required="required" 
                                           type="text" name="CNPJ" maxlength="14" id="CNPJ" size="52" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Letras de A a Z." for="Endereço">Endereço:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Endereco" maxlength="35" id="Razao" size="66"/></p>
                                <p><label title="Apenas numeros." for="CEP">CEP:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="CEP" maxlength="35" id="CEP" size="35"  onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Apenas numeros." for="Telefone1">Telefone 1:</label>
                                    <input required="required" pattern="^\d{4}-\d{3}-\d{4}$" type="tel" name="Telefone1" maxlength="35" id="Telefone1" size="35" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Apenas numeros." for="Telefone2">Telefone 2:</label>
                                    <input pattern="^\d{4}-\d{3}-\d{4}$" type="tel" name="Telefone2" maxlength="35" id="Telefone2" size="52" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="E-mail completo." for="Email">E-mail:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Email" maxlength="35" id="Email" size="65"/></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                        </div>
                    </form>
                    </body>
                    </html>