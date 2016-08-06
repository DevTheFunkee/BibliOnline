<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-sm-6">
<form method="post" action="SalvaLibro" name="frmLibro" id="frmLibro"  role="form">
	<label for="titolo">Titolo:</label><br>
	<input class="form-control" type="text" name="titolo"><br>
	<label for="copertina">Copertina:</label><br>
	<input class="form-control" type="text" name="copertina"><br>
	<label for="isbn">ISBN:</label><br>
	<input class="form-control" type="text" name="isbn"><br>
	<label for="anno">Anno:</label><br>
	<input class="form-control" type="text" name="anno"><br>
	<label for="descrizione">Descrizione:</label><br>
	<input class="form-control" type="text" name="descrizione"><br>
	<label for="editore">Editore:</label><br>
	<select class="form-control" name="editore">
	<c:forEach items="${editori}" var="ed">
		<option value="${ed.codEditore}"><c:out value="${ed.nome}" /></option>
	</c:forEach>	
	</select><br>
	<label for="lingua">Lingua:</label><br>
	<select class="form-control" name="lingua">
	<c:forEach items="${lingue}" var="ling">
		<option value="${ling.codLingua}"><c:out value="${ling.descrizione}" /></option>
	</c:forEach>	
	</select><br>
	<label for="genere">Genere:</label><br>
	<select class="form-control" name="genere">
	<c:forEach items="${generi}" var="gen">
		<option value="${gen.codGenere}"><c:out value="${gen.descrizione}" /></option>
	</c:forEach>	
	</select><br>
	<label for="autori">Autori:</label><br>
	<select class="form-control" name="autori" multiple="multiple" size="3">
	<c:forEach items="${autori}" var="a">
		<option value="${a.codAutore}"><c:out value="${a}" /></option>
	</c:forEach>	
	</select><br>
	<label for="copia">Crea copia:</label> <input type="checkbox" name="copia" checked="checked">
	<hr>
	<input class="form-control btn btn-info" type="submit" name="invio" value=" Inserisci il Libro"><br>
</form>
</div>	
