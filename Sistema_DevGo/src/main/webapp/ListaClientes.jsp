<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html> 
<%@ page import="sistema.devgo.java.Cliente" %>
<%@ page import="sistema.devgo.Model.dao.ClienteDAO" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="CSS/listarCliente.css" type="text/css" />
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
                <li><a href="ListarClientes.jsp">Listar Clientes</a></li>
                <li><a href="ListarFuncionarios.jsp">Listar Funcionários</a></li>
            </ul>
        </aside>
        <%
            ClienteDAO dao = new ClienteDAO();
            List<Cliente> userList = dao.findCliente();
            Iterator<Cliente> itr = userList.iterator();
            Cliente utilisateur = null;
        %>
        <table class="table">
            <tr>
                <th>Id</th>
                <th>CNPJ</th>
                <th>Razao Social</th>
                <th>Cidade</th>
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
                <td><%= utilisateur.getCodCliente()%></td>
                <td><%= utilisateur.getCNPJ()%></td>
                <td><%= utilisateur.getRazaoSocial()%></td>
                <td><%= utilisateur.getCidade()%></td>


                <%-- <td>
                    <form method="POST" action="ClienteHandler">
                        <button class="effacer" onclick="if(!confirm('Êtes-vous sur de bien vouloir supprimer ce utilisateur ?')) return false;"></button>
                        <input type="hidden" name="action" value="delete" >
                        <input type="hidden" name="ID" value="<%= utilisateur.getCodCliente() %>" >
                    </form>
                    
                </td> --%>
            </tr>
            <%
                }
            %>	
        </table>
    </body>
</html>














