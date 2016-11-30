<%-- 
    Document   : EditarFuncionario
    Created on : 12/10/2016, 13:53:25
    Author     : natan
--%>

<%@page import="sistema.devgo.java.Permissao"%>
<%@page import="sistema.devgo.Model.dao.PermissaoDAO"%>
<%@page import="sistema.devgo.java.Funcionario"%>
<%@page import="sistema.devgo.Model.dao.FuncionarioDAO"%>
<%@page import="sistema.devgo.java.Departamento"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="sistema.devgo.Model.dao.DepartamentoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <title>Cadastros</title>
        <c:url value="CSS/editarFuncionario.css" var="EditarFuncionario"/>
        <link type="text/css" rel="stylesheet" href="${EditarFuncionario}"/>
        <script type="text/javascript" src="SCRIPT/funcoes.js"></script>
    </head>
         <%
            FuncionarioDAO fdao = new FuncionarioDAO();
            String cpf = (String) request.getAttribute("CPF");
            Funcionario funcionario = fdao.findByCPF(cpf);
            PermissaoDAO pDao = new PermissaoDAO();
            Permissao permissao = pDao.find(funcionario.getCodFuncionario());
                           
        %>
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
                    <li><a href="BuscaCNPJvenda">Vendas</a></li>
                </ul>
            </div>
        </header>
        <aside>
            <ul>
                <li><a href="CadastroFuncionario">Cadastrar Funcionario</a></li>
                <li><a href="BuscarCliente">Editar Funcionario</a></li>
            </ul>
    </aside>
        <input type="hidden" id="departamento" value="<c:out value="${departamento}"/>" />
        <input type="hidden" id="mens" value="<c:out value="${msgm}"/>" />
        <input type="hidden" id="act" value="editado" />
        <input type="hidden" id="req" value="Funcionario" />
        <div id="mensagem"></div>
        <c:url value="EditarFuncionario" var="EditarFuncionario"/>
        <form action="${EditarFuncionario}" method="post" enctype="application/x-www-form-urlencoded">
            <fieldset id="dados">
                <h4>Empresa</h4>
                <div id="topo">
                    <p><label title="Apenas numeros." for="CPF">CPF:</label>
                        <input required="required" type="text" name="CPF" maxlength="11" id="CPF" size="35"  onkeypress="return somenteNumero(event)" value="<%= funcionario.getCpf()%>" readonly="readonly"/>
                    <p><label title="Letras de A a Z." for="Nome">Nome:</label>
                        <input required="required" type="text" name="Nome" maxlength="35" id="Nome" size="35" value="<%= funcionario.getNome()%>"/></p>
                    <p><label title="Letras de A a Z." for="Sobrenome">Sobrenome:</label>
                        <input required="required" type="text" name="Sobrenome" maxlength="50" id="Sobrenome" size="92" value="<%= funcionario.getSobrenome()%>"/></p>
                    <p><label title="Apenas numeros." for="Telefone">Telefone:</label>
                        <input required="required" type="text" name="Telefone" maxlength="35" id="Telefone" size="35" value="<%= funcionario.getTelefone()%>"/></p>
                    <p><label for="Datanasc">Data de nascimento:</label>
                        <input required="required" type="date" name="Datanasc" id="Datanasc" value="<%= funcionario.getDtNascimento()%>"/></p>
                    <p><select name="opcao">
                        <option>Selecione o Departamento...</option>
                        <%
                            DepartamentoDAO dao = new DepartamentoDAO();
                            List<Departamento> deptos = dao.findDeptos();
                            for (Departamento departamentos : deptos) {
                        %>
                        <option value="<%=departamentos.getCodDepartamento()%>"><%=departamentos.getSetor()%></option>
                        <%}%>
                        </select></p>      
                    <p><label for="Usuario">Usuario:</label>
                        <input required="required" type="text" name="Usuario" maxlength="35" id="Usuario" size="35" value="<%=permissao.getUsuario()%>"/></p>
                    <p><label for="Senha">Senha:</label>
                        <input required="required" type="password" name="Senha" maxlength="15" id="Senha" size="18" onchange="Senha2.pattern = this.value;"/></p>
                    <p><label for="Senha2">Confirmar senha:</label>
                        <input required="required" type="password" name="Senha2" maxlength="15" id="Senha2" size="18" onchange="this.setCustomValidity(this.validity.patternMismatch ? 'As senhas não conferem' : '')"/></p>
                    <p><label for="Status">Status:</label>
                        Ativo<input  type="radio" name="status" id="Status" value="Ativo"/>
                        Inativo<input type="radio" name="status" id="Status" value="Inativo"/></p>        
                </div>
            </fieldset>
            <div class="botoes">
                <input id="Finalizar" title="Finalizar" value="Finalizar" type="submit">
                <input id="Limpar" title="Limpar" value="Limpar" type="reset">
            </div>
                   
        </form>
    </body>
</html>
