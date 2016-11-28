<%@page import="sistema.devgo.java.Venda"%>
<%@page import="sistema.devgo.Model.dao.VendaDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html> 
<%@ page import="sistema.devgo.java.Cliente" %>
<%@ page import="sistema.devgo.Model.dao.ClienteDAO" %>
<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="CSS/ApresentacaoVenda.css" type="text/css" />
        <c:url value="CSS/ApresentacaoVenda.css" var="ApresentacaoVenda."/>
        <link type="text/css" rel="stylesheet" href="${Vendas}"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Vendas efetudas</title>
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
        <c:url value="ApresentacaoVenda" var="ApresentacaoVenda" />
        <form action="${ApresentacaoVenda}" method="post" enctype="application/x-www-form-urlencoded">

            <div id="topo">
                <%
                    VendaDAO dao = new VendaDAO();
                    List<Venda> userList = dao.findVenda();
                    Iterator<Venda> itr = userList.iterator();
                    Venda utilisateur = null;

                %>
                <table class="table">
                    <tr>
                        <th>Registro da venda</th>
                        <th>Cliente</th>
                        <th>Plano</th>
                        <th>Idioma</th>
                        <th>Quantidade de alunos</th>
                        <th>Valor total</th>
                        
                        
                    </tr>
                    <tr>
                        <%while (itr.hasNext()) {
                                utilisateur = itr.next();
                        %>
                        <td><%= utilisateur.getCodVenda()%></td>
                        <td><%= utilisateur.getCodCliente()%></td>
                        <td><%= utilisateur.getCodPlano()%></td>
                        <td><%= utilisateur.getCodIdioma()%></td>
                        <td><%= utilisateur.getQuantidadeAluno()%></td>
                        <td><%= utilisateur.getValorVenda()%></td>
                    </tr>
                    <%
                        }
                    %>	
                </table>

            </div>
            <div class="botoes">
                <input id="Voltar" title="Voltar" value="Voltar" type="submit">
            </div>
        </form>

    </body>
</html>