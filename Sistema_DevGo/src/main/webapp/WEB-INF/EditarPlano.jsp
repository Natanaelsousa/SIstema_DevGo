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
        <link type="text/css" rel="stylesheet" href="EditarPlano.css" />
        <c:url value="CSS/editarPlano.css" var="EditarPlano"/>
        <link type="text/css" rel="stylesheet" href="${EditarPlano}"/>
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
    </head>
        <%
            PlanoDAO dao = new PlanoDAO();
            
            String opcaoPlano = (String) request.getAttribute("opcaoPlano");
            long livroOpcao = Long.parseLong(opcaoPlano);
            Plano plano = dao.trasPlano(livroOpcao);
            String cod = plano.getNomePlano();
                   
        %>
    <body>
        <header>
            <div class="logo">
                 <img src="<c:url value="/IMG/DevGo.png"/>" />
            </div>
            <div class="logout">
                <h3><a href="Login">Sair</a></h3>
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
                    <li id="prod"><a href="CadastroProduto">Produtos e Serviços</a><li>
                    <li><a href="RelatorioCliente">Relatorios</a></li>
                    <li><a href="BuscaCNPJvenda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <aside>
            <ul>
                <li><a href="CadastroProduto">Cadastrar Produto</a></li>
                <li><a href="CadastroPlano">Cadastrar Plano</a></li>
                <li><a href="BuscaProduto">Editar Produto</a></li>
                <li><a href="BuscaPlano">Editar Plano</a></li>
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
                        <p><label for="codigo">Código do Plano:</label>
                            <input required="required" type="text" name="codigo" maxlength="35" id="codigo" size="52" readonly="true" value="<%= plano.getCod_plano()%>" /></p>
                        <p><label for="nomePlano">Nome do Plano:</label>
                            <input required="required" type="text" name="nomePlano" maxlength="35" id="nomePlano" size="52"  value="<%= plano.getNomePlano()%>" /></p>
                                <p><label for="Periodo">Periodo:</label><select name="opcaoPeriodo">
                        <%
                            PeriodoDAO daoPeriodo = new PeriodoDAO();
                            List<Periodo> period = daoPeriodo.buscaPeriodosDoPlanoCadastrado(plano.getNomePlano());
                            for (Periodo periodos : period) {
                        %>
                        <option value="<%=periodos.getCod_periodo()%>"><%=periodos.getNm_periodo()%></option>
                        <%}%>
                        </select></p> 
                                
                    <p><label for="Preço">Preço:</label>
                            <input required="required" type="text" name="Preco" maxlength="35" id="Preço" size="52"  onkeypress="return somenteNumero(event)" value="<%= plano.getPreco()%>" /></p>
                            </div>
                        </fieldset>
                        <div class="botoes">
                            <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                            <input id="Limpar" title="Limpar" value="Limpar" type="reset">
                    </div>
                        
             </form>
        </body>
    </html>
