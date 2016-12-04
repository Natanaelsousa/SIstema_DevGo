<%-- 
    Document   : Qntdemaior
    Created on : 04/12/2016, 16:49:40
    Author     : Sibele
--%>

<%@page import="sistema.devgo.java.Livro"%>
<%@page import="sistema.devgo.Model.dao.LivroDAO"%>
<%@page import="sistema.devgo.java.Plano"%>
<%@page import="sistema.devgo.Model.dao.PlanoDAO"%>
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
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Vendas efetudas</title>


    </head>
    <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
    <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
    <input type="hidden" id="act" value="" />
    <input type="hidden" id="req" value="" />



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
                    <li><a href="RelatorioCliente">Relatorios</a></li>
                    <li id="vendas"><a href="Venda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <c:url value="ApresentacaoVenda" var="ApresentacaoVenda" />
        <form action="${ApresentacaoVenda}" method="post" enctype="application/x-www-form-urlencoded">

            <h2> Quantidade de livros indisponiveis no momento </h2>
           
            </table>
            <div class="botoes">
                <input id="Voltar" title="Voltar" value="Sair" type="submit">
            </div>
        </form>

    </body>
</html>