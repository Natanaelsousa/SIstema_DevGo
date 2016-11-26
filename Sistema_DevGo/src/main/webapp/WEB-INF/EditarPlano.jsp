<%-- 
    Document   : EditarPlano
    Created on : 12/10/2016, 13:59:22
    Author     : natan
--%>

<%@page import="sistema.devgo.java.Livro"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page import="sistema.devgo.java.Plano"%>
<%@page import="sistema.devgo.Model.dao.PlanoDAO"%>
<%@page import="sistema.devgo.java.Periodo"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.PeriodoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Cadastros</title>
        <c:url value="CSS/editarPlano.css" var="EditarPlano"/>
        <link type="text/css" rel="stylesheet" href="${EditarPlano}"/>
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
                    <li><a href="Venda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastroProduto">Cadastrar Produto</a></li>
                <li><a href="CadastroPlano">Cadastrar Plano</a></li>
                <li><a href="EditarProduto">Editar Produto</a></li>
                <li><a href="#">Editar Plano</a></li>
                </ul>
        </aside>
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="editado" />
        <input type="hidden" id="req" value="Plano" />
        <div id="mensagem"></div>
      <c:url value="EditarPlano" var="EditarPlano"/>
        <form action="${EditarPlano}" method="post" >
                       <fieldset id="dados">
                            <h4>Serviço</h4>
                            <div id="topo">
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
                                <p><select name="opcaoPeriodo">
                        <option>Selecione o Periodo...</option>
                        <%
                            PeriodoDAO daoPeriodo = new PeriodoDAO();
                            List<Periodo> period = daoPeriodo.findPeriodo();
                            for (Periodo periodos : period) {
                        %>
                        <option value="<%=periodos.getCod_periodo()%>"><%=periodos.getNm_periodo()%></option>
                        <%}%>
                        </select></p> 
                                
                                <p><label for="Preço">Preço:</label>
                                    <input required="required" type="text" name="Preco" maxlength="35" id="Preço" size="52" onkeypress="return somenteNumero(event)"/></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                    </div>
                        
             </form>
        </body>
    </html>
