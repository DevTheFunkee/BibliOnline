<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Biblioteca</title>
<%@ include file="includes/risorse.html" %>
</head>
<body>
	<%@ include file="includes/barraNav.html" %>
	<div class="container">
		<header>
			<h1>Biblioteca 2016</h1>
			<h2>Elenco Libri</h2>
		</header>
		<div>
			<jsp:include page="includes/tabellaLibri.jsp" />
		</div>
	</div>
</body>
</html>