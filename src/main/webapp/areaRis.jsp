<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area riservata Biblioteca</title>
<%@ include file="includes/risorse.html" %>
</head>
<body>
	<%@ include file="includes/barraNav.html" %>
	<div class="container">
		<h1>Area Riservata Biblioteca 2016</h1>
		<p>Ciao <c:out value="${sessionScope.auth.utente.nome}" /> <c:out value="${sessionScope.auth.utente.cognome}" /></p>
		<ul>
		<li><a href="FormLibro">Inserisci un libro</a></li>
		</ul>
		
	</div>
</body>
</html>