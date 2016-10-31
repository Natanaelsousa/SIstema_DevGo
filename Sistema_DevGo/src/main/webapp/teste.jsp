<%-- 
    Document   : teste
    Created on : 31/10/2016, 19:27:17
    Author     : roberto.slinhares
--%>

<%@page import="sistema.devgo.Controller.CadastroCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="teste.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <p><c:out value="${razao}"/></p>
        <p><c:out value="${cnpj}"/></p>
        <p><c:out value="${cep}"/></p>
        <p><c:out value="${telefone1}"/></p>
        <p><c:out value="${telefone2}"/></p>
        <p><c:out value="${email}"/></p>
        <p><c:out value="${rua}"/></p>
        <p><c:out value="${cidade}"/></p>
        <p><c:out value="${numero}"/></p>
        <p><c:out value="${bairro}"/></p>
        <p><c:out value="${uf}"/></p>
    </body>
</html>

