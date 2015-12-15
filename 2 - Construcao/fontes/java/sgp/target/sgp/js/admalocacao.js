function criarAlocacao() {
    
	jQuery.ajax({
		type: 'POST',
		url: 'http://' + window.location.host + '/sgp/admalocacao/cadastra',
		data : {'idProjeto': $('#nomeProjeto').val(),
				'idRecurso':$('#nomeRecurso').val(),
				'dtInicio':$('#dataInicio').val(),
				'dtFim':$('#dataFim').val()
		},

		success : function(dataMessage) {
		},
		error : function(dataMessage){
		}
	});	
    alert('Cadastrado com sucesso');
				
    window.location.replace($(location).attr('origin') + "/sgp/admalocacao/");	
}