<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Errori</title>
<%@ include file="includes/risorse.html" %>
</head>
<body>
<%@ include file="includes/barraNav.html" %>
	<div class="container">
		<h1>Errori</h1>
		<p class="alert alert-warning">Siamo spiacenti, errori!!!!</p>
		<c:if test="${exception!=null}">
			<p class="alert alert-danger">
				<c:out value="${exception.message}" />	
			</p>		
		</c:if>
		<c:if test="${msg!=null}">
		<p class="alert alert-danger">
			<c:out value="${msg}" />
		</p>
		</c:if>

	</div>
</body>
</html>