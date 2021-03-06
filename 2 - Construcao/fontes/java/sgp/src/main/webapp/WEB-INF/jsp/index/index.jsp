<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>SGP - Login</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
	
		<script src="<%=request.getContextPath()%>/js/index.js"></script>

	</head>
	<body>
<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
          <h1 class="text-center">Logar</h1>
      </div>
      <div class="modal-body">
            <div class="form-group">
              <input type="text" id="nomeRecurso" class="form-control input-lg" placeholder="Nome">
            </div>
            <div class="form-group">
              <input type="password" class="form-control input-lg" placeholder="Senha">
            </div>
				<button class="btn btn-primary btn-lg" onclick="login()">Entrar</button>
      </div>
      <div class="modal-footer">
          	
      </div>
  </div>
  </div>
</div>
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	</body>
</html>