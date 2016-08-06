<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accesso Biblioteca</title>
<%@ include file="includes/risorse.html" %>
</head>
<body>
	<%@ include file="includes/barraNav.html" %>
	<div class="container">
		<h1>Biblioteca 2016</h1>
			<c:if test="${authError!=null}">
				<div class="row alert alert-danger">Utente o pwd NON validi!</div>
			</c:if>			
		
			<div class="col-sm-3 form-group">
				<form action="LoginTessera" method="post" role="form">
					<label for="numero">Numero Tessara Utente:</label><br>
					<input class="form-control" type="text" name="numero"><br>
					<label for="pass">Password:</label><br>
					<input class="form-control" type="password" name="pass"><hr>
					<input class="form-control btn btn-info" type="submit" name="invio" value="invia"><br>
					<input type="hidden" name="destinazione" id="destinazione" value="areaRis.jsp">
			</form>

		</div>
	</div>
</body>
</html>