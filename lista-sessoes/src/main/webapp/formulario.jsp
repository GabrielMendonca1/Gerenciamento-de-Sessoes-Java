<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2>Formulário de Informações</h2>

<form action="InfoServlet" method="post">
  <label for="login">Informações de Login:</label><br>
  <input type="text" id="login" name="login"><br>
  <label for="personal">Informações Pessoais:</label><br>
  <input type="text" id="personal" name="personal"><br>
  <label for="academic">Informações Acadêmicas:</label><br>
  <input type="text" id="academic" name="academic"><br>
  <label for="professional">Informações Profissionais:</label><br>
  <input type="text" id="professional" name="professional"><br>
  <input type="submit" value="Enviar">
</form>

</body>
</html>
    