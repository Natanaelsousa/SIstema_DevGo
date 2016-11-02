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
        <c:url value="Venda" var="urlVenda" />
        <form action="${urlVenda}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Dados</h4>
                <div id="topo">
                    <p><label title="Apenas Numeros" for="CNPJ">CNPJ:</label>
                        <input title="Apenas numeros." required="required" type="text" name="CNPJ" maxlength="14" id="CNPJ" size="75" onkeypress="return somenteNumero(event)" />
                        <input id="Buscar" title="Buscar" value="Buscar" type="submit"></p>
                    <p><label title="Letras de A a Z." for="Razao">Razao Social:</label>
                        <input required="required" pattern="[A-Za-z]*" type="text" name="Razao" maxlength="35" id="Razao" size="45"/></p>
                    <p><label title="Letras de A a Z." for="Plano">Plano:</label>
                        <select name="Periodo">
                            <option value="1" selected>Gold</option>
                            <option value="2" >Silver</option>
                            <option value="3" >Bronze</option>
                        </select></p>
                    <p><label for="Periodo">Período:</label>
                        <select  name="Periodo">
                            <option value="1" selected>Semestral</option>
                            <option value="2" >Trimestral</option>
                            <option value="3" >Mensal</option>
                        </select></p>
                    <p><label for="Livro">Idioma:</label>
                                    <select name="Idioma">
                                        <option value="1" >Ingles</option>
                                        <option value="2" >Espanhol</option>
                                    </select></p>
                    <p><label for="Aluno">Quantidade de Alunos:</label>
                        <input required="required" type="text" name="QtdeAluno" id="Aluno" onkeypress="return somenteNumero(event)" /></p>
                    <p><label for="Valor">Valor:</label>
                        <input required="required" type="text" name="Valor" id="Valor" onkeypress="return somenteNumero(event)" /></p>
                </div>
            </fieldset>
            <div class="botoes">
                <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                <input id="Limpar" title="Limpar" value="Limpar" type="reset">
            </div>
        </form>
    </body>
</html>
</body>
</html>
