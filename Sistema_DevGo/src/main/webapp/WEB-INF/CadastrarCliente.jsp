<%-- 
    Document   : CadastrarCliente
    Created on : 08/10/2016, 17:37:36
    Author     : Natanael 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!doctype html>
<html>	
	<head>
             <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>Cadastro de Clientes</title>
                 <c:url value="css/CadastroCliente.css" var="urlCadastroCliente" />
                 <link rel="stylesheet" href="${urlCadastroCliente}" />
	</head>
    <body>
        <header>
            <div class="logo">
                <h1>Logo</h1>
            </div>
            <div class="logout">
                <h3><a href="Login.html">Sair</a></h3>
            </div>
            <div class="bar">
                <ul>
                    <li class="dropdown">
                        <a href="#" class="btn">Cadastros</a>
                        <div class="dropdown-content">
                            <a href="cadastro.html">Cliente</a>
                            <a href="#">Funcionario</a>
                        </div></li>
                    <li><a href="#">Produtos e Servicos</a></li>
                    <li><a href="#">Relatorios</a></li>
                    <li><a href="#">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a>Cadastrar Cliente</a></li>
                <li><a href="editar.html">Editar Cliente</a></li>
            </ul>
        </aside>
        <form>
            <fieldset id="formulario">
                <fieldset id="dados">
                    <h4>Empresa</h4>
                    <label title="Letras de A a Z." for="Razao">Razao Social:</label>	
                    <input required="required" pattern="[A-Za-z]*" type="text" name="Razao" maxlength="35" id="Razao" size="35"/>
                    <label title="Letras de A a Z." for="Nome">Nome Fantasia:</label>
                    <input required="required" pattern="[A-Za-z]*" type="text" name="Nome" maxlength="35" id="Nome" size="35" />
                    <label title="CNPJ completo." for="CNPJ">CNPJ:</label>
                    <input required="required" type="text" name="CNPJ" maxlength="50" id="CNPJ" size="52"  pattern="[0-9]"/>
                    <label title="Endereco." for="Endereco">Endereco:</label>
                    <input required="required" type="text" name="Endereco" maxlength="15" id="Telefone" size="65" />
                    <label title="Cidade." for="Telefone">Cidade:</label>
                    <input required="required" type="text" name="Cidade" maxlength="15" id="Cidade" size="66" />
                    <label title="Apenas numeros." for="CEP">CEP:</label>	
                    <input required="required"  pattern="[0-9]" type="text" name="CEP" maxlength="35" id="CEP" size="35"/>
                    <label title="Telefone 1." for="Telefone1">Telefone 1:</label>
                    <input required="required"  pattern="[0-9]" type="text" name="Telefone 2" maxlength="35" id="Telefone1" size="35" />
                    <label title="Telefone 2." for="Telefone2">Telefone 2:</label>
                    <input required="required" pattern="[0-9]" type="text" name="Telefone 2" maxlength="15" id="Telefone2" size="52" />
                    <label title="E-mail completo." for="Email">E-mail:</label>
                    <input required="required" type="text" name="Email" maxlength="50" id="Endereco" size="65" />
                </fieldset>
                <div class = "botoes">
                    <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                    <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                    </fieldset></div>
        </form>
    </body>
</html>