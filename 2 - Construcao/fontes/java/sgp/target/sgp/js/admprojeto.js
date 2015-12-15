function criarReuniao() {
    
	jQuery.ajax({
		type: 'POST',
		url: 'http://' + window.location.host + '/sgp/admprojeto/cadastra',
		data : {'nmProjeto': $('#campoNomep').val(),
				'dtInicio':$('#DataIP').val()
		},

		success : function(dataMessage) {
		},
		error : function(dataMessage){
		}
	});	
    alert('Cadastrado com sucesso');
				
    window.location.replace($(location).attr('origin') + "/sgp/admprojeto/");
}