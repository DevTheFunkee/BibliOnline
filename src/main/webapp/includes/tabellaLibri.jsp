<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="table table-striped table-bordered">
	<tr>
		<th>Titolo</th>
		<th>Editore</th>
		<th>Anno</th>
		<th>Autore</th>
		<th>Genere</th>
	</tr>
	<c:forEach items="${libri}" var="libro">
		<tr>
			<td><c:out value="${libro.titolo}" /></td>
			<td><c:out value="${libro.editore}" /></td>
			<td><c:out value="${libro.anno}" /></td>
			<td><c:out value="${libro.elencoAutori}" /></td>	
			<td><c:out value="${libro.genere}" /></td>		
		</tr>
	</c:forEach>
</table>