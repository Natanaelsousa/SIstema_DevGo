<%@page import="sistema.devgo.java.Venda"%>
<%@page import="sistema.devgo.Model.dao.VendaDAO"%>
<%@page import="sistema.devgo.java.Funcionario"%>
<%@page import="sistema.devgo.Model.dao.FuncionarioDAO"%>
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
                <li><a href="RelatorioCliente">Listar Clientes</a></li>
                <li><a href="#">Listar Funcionários</a></li>
            </ul>
        </aside>
        <%
            VendaDAO dao = new VendaDAO();
            List<Venda> userList = dao.find();
            Iterator<Funcionario> itr = userList.iterator();
            Funcionario utilisateur = null;
        %>
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
                <% //avec la boucle while
                    //	while(itr.hasNext()){
                    //		userBean user = new userBean();
                    //		System.out.println(user.getID());
                    while (itr.hasNext()) {
                        utilisateur = itr.next();
                %>
                <td><%= utilisateur.getCpf()%></td>
                <td><%= utilisateur.getNome()%></td>
                <td><%= utilisateur.getSobrenome()%></td>
                <td><%= utilisateur.getTelefone()%></td>
                <td><%= utilisateur.getStatus()%></td>
                <td><%= utilisateur.getCodDepartamento()%></td>
            </tr>
            <%
                }
            %>	
        </table>
    </body>
</html>
