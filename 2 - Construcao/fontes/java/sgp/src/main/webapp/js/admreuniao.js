function criarReuniao() {
    
	jQuery.ajax({
		type: 'POST',
		url: 'http://' + window.location.host + '/sgp/admreuniao/cadastra',
		data : {'nmLocal': nmLocal,
				'dtInicio':dtInicio,
				'dtHorario':dtHorario,
				'idProjeto':idProjeto
		},

		success : function(dataMessage) {
		},
		error : function(dataMessage){
		}
	});	
    alert('Consulta agendada. Verifique a aba de Exames.');
				
			
}