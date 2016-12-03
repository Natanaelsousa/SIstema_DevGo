<%@page import="sistema.devgo.java.Venda"%>
<%@page import="sistema.devgo.Model.dao.VendaDAO"%>

<!DOCTYPE html> 
<a href="RelatorioVenda.jsp"></a>
<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="CSS/listaVendas.css" type="text/css" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
        <title>Vendas Realizadas</title>
    </head>
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
                    <li><a href="CadastroProduto">Produtos e Serviços</a><li>
                    <li id="relatorio"><a href="RelatorioCliente">Relatorios</a></li>
                    <li><a href="BuscaCNPJvenda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="" />
        <input type="hidden" id="req" value="" />
        <aside>
            <ul>
                <li><a href="RelatorioCliente">Listar Clientes</a></li>
                <li><a href="RelatorioFuncionario">Listar Funcionário</a></li>
                <li><a href="#">Listar Vendas</a></li>
            </ul>
        </aside>
        <%
            VendaDAO dao = new VendaDAO();
            List<Venda> userList = dao.findVendaRelatorio();
            Iterator<Venda> itr = userList.iterator();
            Venda utilisateur = null;
        %>
        <form>
            <table id="exTable" class="table">
                <tr>
                    <th>Razão</th>
                    <th>Plano</th>
                    <th>Idioma</th>
                    <th>Qtde Alunos</th>
                    <th>Valor</th>
                    <th>Data</th>
                </tr>
                <tr>
                    <%
                        while (itr.hasNext()) {
                            utilisateur = itr.next();
                    %>
                    <td><%= utilisateur.getRazao()%></td>
                    <td><%= utilisateur.getPlano()%></td>
                    <td><%= utilisateur.getIdioma()%></td>
                    <td><%= utilisateur.getQuantidadeAluno()%></td>
                    <td><%= utilisateur.getValorVenda()%></td>
                    <td><%= utilisateur.getData_venda()%></td>

                </tr>
                <%
                    }
                %>	
            </table>
        </form>
        <input type="button" value="Gerar Relatório" id="exportar" onclick="exportToExcel('exTable')"/>
    </body>
</html>
