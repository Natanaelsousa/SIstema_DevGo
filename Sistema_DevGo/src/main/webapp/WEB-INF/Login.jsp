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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página - Login</title>
</head>
<body>
<fieldset>
<h1>Página de Login!</h1>
<form action="Login" method="post">
<label>Login : </label>
<input type="text" name="login"><br>
<label>Senha:</label>
<input type="password" name="senha"><br>
<input type="submit" value="Logar"><br>
</form>
</fieldset>
</body>
</html>