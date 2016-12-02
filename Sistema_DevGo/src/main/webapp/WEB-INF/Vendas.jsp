<%-- 
    Document   : Vendas.jsp
    Created on : 18/10/2016, 22:14:16
    Author     : roberto.slinhares
--%>

<%@page import="sistema.devgo.java.Cliente"%>
<%@page import="sistema.devgo.Model.dao.ClienteDAO"%>
<%@page import="sistema.devgo.Model.dao.FuncionarioDAO"%>
<%@page import="sistema.devgo.java.Livro"%>
<%@page import="sistema.devgo.java.Funcionario"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page import="sistema.devgo.java.Plano"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.PlanoDAO"%>
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
    <%
        ClienteDAO daocli = new ClienteDAO();

        String cnpj = (String) request.getAttribute("CNPJ");

        Cliente cliente = daocli.findByName(cnpj);


    %>


        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="" />
        <input type="hidden" id="req" value="" />
    <body>
        <header>
            <div class="logo">
                <h1>Logo</h1>
            </div>
            <div class="logout">
                <h3><a href="#">Sair</a></h3>
            </div>
            <div class="bar">
                <ul id="menu">
                    <li class="dropdown">
                        <a href="#" class="btn">Cadastros</a>
                        <div class="dropdown-content">
                            <a href="CadastroCliente">Cliente</a>
                            <a href="CadastroFuncionario">Funcionario</a>
                        </div>
                    </li>
                    <li><a href="CadastroProduto">Produtos e Serviços</a><li>

                    <li><a href="RelatorioCliente">Relatorios</a></li>
                    <li id="vendas"><a href="#">Vendas</a></li>

                </ul>
            </div>
        </header>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <c:url value="Vendas" var="urlVenda" />
        <form action="${urlVenda}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Dados</h4>
                <div id="topo">
                    <p><label for="id">Registro do cliente</label>
                        <input required="required" type="text" name="Id" maxlength="35" id="id" size="10" value="<%= cliente.getCodCliente()%>" readonly="readonly" </p>    
                    <p><label title="Apenas numeros." for="CNPJ">CNPJ:</label>
                        <input type="text" name="CNPJ" maxlength="14" id="CNPJ" size="55" onkeypress="return somenteNumero(event)" value="<%= cliente.getCNPJ()%>" readonly="readonly"/></p>
                    <p><label for="Razao">Razao Social:</label>
                        <input required="required" type="text" name="Razao" maxlength="35" id="Razao" size="64" value="<%= cliente.getRazaoSocial()%>" readonly="readonly"</p>    

                    <p><select name="opcaoPlano">
                            <option>Selecione o Plano...</option>
                            <%
                                PlanoDAO dao = new PlanoDAO();
                                List<Plano> planos = dao.findPlano();
                                for (Plano plano : planos) {
                            %>
                            <option value="<%=plano.getCod_plano()%>"><%=plano.getNomePlano()%></option>
                            <%}%>
                        </select></p>


                    <p><select name="opcaoIdioma">
                            <option>Selecione o Idioma...</option>
                            <%
                                LivroDAO daoLivro = new LivroDAO();
                                List<Livro> livros = daoLivro.findLivro();
                                for (Livro livro : livros) {
                            %>
                            <option value="<%=livro.getCod_idioma()%>"><%=livro.getIdioma()%></option>
                            <%}%>
                        </select></p>

                    <p><label for="Aluno">Quantidade de Alunos:</label>
                        <input required="required" type="text" name="QTDE_ALUNO" id="Aluno" maxlength="2" onkeypress="return somenteNumero(event)"/></p>


                    <p>
                        <%
                            String resultadoFinal = request.getParameter("resultadoFinal");
                        %> 
                       
                    </p>

                    
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
