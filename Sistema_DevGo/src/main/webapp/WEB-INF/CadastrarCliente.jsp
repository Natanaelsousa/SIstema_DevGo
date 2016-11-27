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

        <meta charset="UTF-8">
        <title>Cadastrar Cliente</title>
        <c:url value="CSS/cadastrarCliente.css" var="urlCadCliente"/>
        <link type="text/css" rel="stylesheet" href="${urlCadCliente}"/>
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
                    <li><a href="BuscaCNPJvenda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastroCliente">Cadastrar Cliente</a></li>
                <li><a href="BuscarCliente">Editar Cliente</a></li>
            </ul>
        </aside>
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="cadastrado" />
        <input type="hidden" id="req" value="Cliente" />
        <div id="mensagem"></div>
        <c:url value="CadastroCliente" var="CadastroCliente" />
        <form action="${CadastroCliente}" method="post" enctype="application/x-www-form-urlencoded" accept-charset="UTF-8">
            <fieldset id="dados">
                <h4>Empresa</h4>
                <div id="topo">
                    <p><label for="Razao">Razao Social:</label>
                        <input required="required" type="text" name="Razao" maxlength="35" id="Razao" size="35"/></p>  
                    <p><label title="Apenas numeros." for="CNPJ">CNPJ:</label>
                        <input required="required" type="text" name="CNPJ" maxlength="14" id="CNPJ" size="75" onkeypress="return somenteNumero(event)"/></p>
                    <p><label title="Apenas numeros." for="Telefone1">Telefone 1:</label>
                        <input required="required" type="tel" name="Telefone1" maxlength="11" id="Telefone1" size="35" onkeypress="return somenteNumero(event)"/></p>
                    <p><label title="Apenas numeros." for="Telefone2">Telefone 2:</label>
                        <input type="tel" name="Telefone2" maxlength="11" id="Telefone2" size="35" onkeypress="return somenteNumero(event)"/></p>
                    <p><label title="E-mail completo." for="Email">E-mail:</label>
                        <input required="required" type="email" name="Email" maxlength="35" id="Email" size="52"/></p>
                    <p><label>CEP:</label>
                        <input name="CEP" type="text" id="cep" value="" size="35" maxlength="9"
                               onblur="pesquisacep(this.value);" onkeypress="return somenteNumero(event)" /></p>
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
