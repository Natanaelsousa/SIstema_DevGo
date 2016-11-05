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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <c:url value="CSS/erroLogin.css" var="ErroLogin"/>
        <link type="text/css" rel="stylesheet" href="${ErroLogin}"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    </head>
    <body>
        <div class="dados">
            <h1>Login</h1>
        </div>
        <form>
            <div id="formulario">
                <div id="topo">
                    <h2>Login</h2>
                </div>
                <div id="form">
                    <p><label title="Nome do usuario." for="Login"><i class="material-icons">person</i>Usuario:</label>
                        <input required="required" type="text" name="Login" maxlength="35" id="Login" size="44" /></p>
                    <p><label title="Senha de acesso." for="Senha"><i class="material-icons">lock_outline</i>Senha:</label>
                        <input required="required" type="password" name="Senha" maxlength="35" id="Senha" size="44" /></p>
                    <p><input id="Entrar" title="Entrar" value="Entrar" type="submit"></p>
                    <h5>Dados Incorretos.</h5>
                </div>
            </div>
        </form>
        <footer>2016</footer>
    </body>
</html>