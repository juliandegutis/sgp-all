function criarReuniao() {
    
	jQuery.ajax({
		type: 'POST',
		url: 'http://' + window.location.host + '/sgp/admreuniao/cadastra',
		data : {'nmLocal': $('#campoLocal').val(),
				'dtInicio':$('#DataR').val(),
				'dtHorario':$('#HoraR').val(),
				'idProjeto':$('#statusBusca').val()
		},

		success : function(dataMessage) {
		},
		error : function(dataMessage){
		}
	});	
    alert('Cadastrado com sucesso');
	
    window.location.replace($(location).attr('origin') + "/sgp/admreuniao/");
			
}