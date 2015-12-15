function login() {
	
	var nome = $('#nomeRecurso').val();
	jQuery.ajax({
		type: 'POST',
		url: 'http://' + window.location.host + '/sgp/login',
		data : {'nomeRecurso':nome
		},
		success : function(dataMessage) {
		},
		error : function(dataMessage){
		}
	});
	
	window.location.replace($(location).attr('origin') + "/sgp/home/");
}