<%-- 
    Document   : Login
    Created on : 12/10/2016, 13:55:45
    Author     : natan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:url value="CSS/login.css" var="Login"/>
<link type="text/css" rel="stylesheet" href="${Login}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página - Login</title>
</head>
<body>
<fieldset>
<h1>Página de Login</h1>
<form action="Login" method="post">
               <div id="formulario">
                <div id="topo">
                    <h2>Login</h2>
                </div>
                <c:url value="Login" var="Login"/>
                <form action="${Login}" method="post" enctype="application/x-www-form-urlencoded">
                    <div id="form">
                    <p><label title="Nome do usuario." for="Login">Usuario:</label>
                        <input required="required" type="text" name="login" maxlength="35" id="Login" size="44" /></p>
                    <p><label title="Senha de acesso." for="Senha"><Senha:</label>
                        <input  required="required" type="password" name="senha" maxlength="35" id="Senha" size="44" /></p>
                    <p><input id="Entrar" title="Entrar" value="Entrar" type="submit"></p>
                    </div>
            </div>
</form>
</fieldset>
</body>
</html>