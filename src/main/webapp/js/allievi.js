//jquery
$(document).ready(function(){
	//se doc è pronto
	//se clicco su un bottone di modifica
	$(".modifica").click(function(){		
		var tr=$(this).closest("tr"); 
		//ho catturato l'oggetto tr più vicino (sopra) al bottone modifica cliccato
		var nome=tr.find(".nome-allievo").html();
		var cognome=tr.find(".cognome-allievo").html();
		var id=tr.find(".id-allievo").html();
		$("input#nome").val(nome);
		$("input#cognome").val(cognome);
		$("input#id").val(id);
	});
	
});