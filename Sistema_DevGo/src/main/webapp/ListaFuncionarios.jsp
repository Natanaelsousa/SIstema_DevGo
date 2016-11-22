<!DOCTYPE html> 
<%@ page import="sistema.devgo.java.Cliente" %>
<%@ page import="sistema.devgo.Model.dao.ClienteDAO" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="CSS/listaFuncionarios.css" type="text/css" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Clientes Cadastrados</title>
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
                            <a href="CadastroCliente">Cliente</a>
                            <a href="CadastroFuncionario">Funcionario</a>
                        </div>
                    </li>
                    <li><a href="CadastroProduto">Produtos e Serviços</a><li>
                    <li><a href="Relatorio">Relatorios</a></li>
                    <li><a href="Venda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="ListaClientes.jsp">Listar Clientes</a></li>
                <li><a href="ListaFuncionarios.jsp">Listar Funcionários</a></li>
            </ul>
        </aside>
        <table class="table">
            <tr>
                <th>CPF</th>
                <th>Nome</th>
                <th>Sobrenome</th>
                <th>Telefone</th>
                <th>E-mail</th>
                <th>Departamento</th>
                    <%-- <th>Remover</th> --%>
            </tr>
            <tr>
        
        </table>
    </body>
</html>
