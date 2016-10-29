<%-- 
    Document   : EditarCliente
    Created on : 12/10/2016, 13:52:57
    Author     :Natanael Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Editar Cliente</title>
        <c:url value="CSS/editarCliente.css" var="EditarCliente"/>
        <link type="text/css" rel="stylesheet" href="${EditarCliente}"/>
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
                <li><a href="CadastrarCliente.jsp">Cadastrar Cliente</a></li>
                <li><a href="EditarCliente.jsp">Editar Cliente</a></li>
                <ul>
                    </aside>
        <c:url value="CadastroFuncionario" var="CadastroCliente"/>
        <form action="${CadastroCliente}" method="post" enctype="application/x-www-form-urlencoded">
                        <fieldset id="dados">
                            <h4>Empresa</h4>
                            <div id="topo">
                                <p><label title="CNPJ Completo." for="CNPJ:">CNPJ:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="CNPJ" maxlength="14" id="CNPJ" size="55" onkeypress="return somenteNumero(event)"/></p>
                                    <input id="Buscar" title="Buscar" value="Buscar" type="submit">
                                <p><label title="Letras de A a Z." for="Razao">Razao Social:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Razao" maxlength="35" id="Razao" size="64"/></p>
                                <p><label title="Apenas numeros." for="Telefone1">Telefone Residencial:</label>
                                    <input required="required" pattern="^\d{10}$" type="tel" name="Telefone1" maxlength="10" id="Telefone1" size="35" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="Apenas numeros." for="Telefone2">Celular:</label>
                                    <input pattern="^\d{11}$" type="tel" name="Telefone2" maxlength="11" id="Telefone2" size="35" onkeypress="return somenteNumero(event)"/></p>
                                <p><label title="E-mail completo." for="Email">E-mail:</label>
                                    <input required="required" pattern="[A-Za-z]*" type="text" name="Email" maxlength="35" id="Email" size="53"/></p>
                                <p><label>Cep:</label>
                                    <input name="cep" type="text" id="cep" value="" size="35" maxlength="9"
                                           onblur="pesquisacep(this.value);" onkeypress="return somenteNumero(event)"/></p>
                                <p><label>Rua:</label>
                                    <input name="rua" type="text" id="rua" size="65" /></p>
                                <p><label>Número:</label>
                                    <input required="required" name="numero" type="text" id="numero" size="22" maxlength="9" onkeypress="return somenteNumero(event)"/></p>
                                <p><label>Bairro:</label>
                                    <input name="bairro" type="text" id="bairro" size="40" /><br />
                                <p><label>Cidade:</label>
                                    <input name="cidade" type="text" id="cidade" size="40" /></p>
                                <p><label>Estado:</label>
                                    <input name="uf" type="text" id="uf" size="20" /></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                        </div>
                    </form>
                    </body>
                    </html>