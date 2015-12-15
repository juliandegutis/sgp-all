function loadAttr(linha) {
	var elementos = [];
    var linhaSelecionada = linha.parent().parent().find('td');
    
    for (var i = 0 ; i < linhaSelecionada.length ; i++) {
        elementos[i] = linhaSelecionada[i].innerText;
    }
    
    $('#idProjetoHidden').val(elementos[1]);
}

function lancarHoras() {
    
	jQuery.ajax({
		type: 'POST',
		url: 'http://' + window.location.host + '/sgp/projetos/lancaHoras',
		data : {'idProjeto': $('#idProjetoHidden').val(),
				'dataLanc' : $('#dataLanc').val(),
				'horasLanc':$('#horasLanc').val()
		},

		success : function(dataMessage) {
		},
		error : function(dataMessage){
		}
	});	
    alert('Cadastrado com sucesso');
	
    window.location.replace($(location).attr('origin') + "/sgp/projetos/");
			
}