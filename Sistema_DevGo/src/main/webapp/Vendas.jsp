<%-- 
    Document   : Vendas.jsp
    Created on : 18/10/2016, 22:14:16
    Author     : roberto.slinhares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vendas</title>
        <link type="text/css" rel="stylesheet" href="vendas.css" />
        <c:url value="CSS/vendas.css" var="Vendas"/>
        <link type="text/css" rel="stylesheet" href="${Vendas}"/>
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
        <form>
            <fieldset id="dados">
                <h4>Dados</h4>
                <div id="topo">
                    <p><label title="Letras de A a Z." for="CNPJ:">CNPJ:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="CNPJ:" maxlength="45" id="CNPJ:" size="55"/>
                        <input id="Buscar" title="Buscar" value="Buscar" type="submit"></p>
                    <p><label title="Letras de A a Z." for="Razao">Razao Social:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="Razao" maxlength="35" id="Razao" size="45"/></p>
                    <p><label title="Letras de A a Z." for="Plano">Plano:</label>
                        <input required="required" pattern="[0-9]*" type="text" name="Plano" maxlength="50" id="Plano" size="45"/></p>
                    <p><label title="Letras de A a Z." for="Período">Período:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="Período" maxlength="35" id="Período" size="45"/></p>
                    <p><label title="Letras de A a Z." for="Idioma:">Idioma:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="Idioma" maxlength="35" id="Idioma" size="35"/></p>
                    <p><label title="Letras de A a Z." for="Aluno">Quantidade de Alunos:</label>
                        <input required="required" pattern="[0-9]*" type="text" name="Aluno" maxlength="35" id="Aluno" size="35"/></p>
                    <p><label title="Letras de A a Z." for="Valor">Valor:</label>
                        <input required="required" pattern="[0-9]*" type="text" name="Valor" maxlength="35" id="Valor" size="35"/></p>
                </div>
            </fieldset>
            <div class="botoes">
                <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                <input id="Limpar" title="Limpar" value="Limpar" type="reset">
            </div>
        </form>
    </body>
</html>

</form>
</body>
</html>
