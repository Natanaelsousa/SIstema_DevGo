<%-- 
    Document   : Login
    Created on : 12/10/2016, 13:55:45
    Author     : natan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Escola de Idioma</title>
    </head>
    <body>
         <h1>Acesso.</h1>
    <div>
      <form action="login" method="post">
	<div>
	  <label for="txtnome">Login:</label>
	  <input type="text" name="login" id="txtnome" maxlength="100"
		 placeholder="Digite o Login" />
	</div>
	<div>
	  <label for="txtsenha">Senha:</label>
	  <input type="password" name="senha" id="txtsenha"
		 placeholder="Digite a senha" />
	</div>
	<div><input type="submit" value="Entrar" /></div>
      </form>
    </body>
</html>
