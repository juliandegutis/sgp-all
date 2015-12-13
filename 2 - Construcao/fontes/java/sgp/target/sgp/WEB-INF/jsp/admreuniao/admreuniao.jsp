<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=request.getContextPath()%>/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<%=request.getContextPath()%>/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Sistema de Gerenciamento de Projetos - UFU</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                
                
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Usuario <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="/sgp/home/"><i class="fa fa-fw fa-user"></i> Perfil</a>
                        </li>
                        <li>
                            <a href="/sgp/"><i class="fa fa-fw fa-gear"></i> Sair</a>
                        </li>
                        
                        <li>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="/sgp/home/"><i class="fa fa-fw fa-dashboard"></i> Perfil</a>
                    </li>
                    <li>
                        <a href="/sgp/relatorios/"><i class="fa fa-fw fa-bar-chart-o"></i> Relatorios</a>
                    </li>
                    <li>
                        <a href="/sgp/reunioes/"><i class="fa fa-fw fa-table"></i> Reunioes</a>
                    </li>
                    <li>
                        <a href="/sgp/projetos/"><i class="fa fa-fw fa-edit"></i> Projetos</a>
                    </li>
                    
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Administrador <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                            <li>
                                <a href="#">Criar reuniao</a>
                            </li>
                            <li>
                                <a href="/sgp/admprojeto/">Criar Projeto</a>
                            </li>
                        </ul>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
             
                
                <!-- /.row Gerar Reunioes -->
				<div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
					<div class="panel panel-default">
                            <div class="panel-heading">
                                <h1 class="panel-title">Criar reuniao</h1>
                            </div>
                            <div class="panel-body">

						<br>
						
							<div class="col-lg-6">
							<div id="CriarReuniao" class="form-group">
                                <label>Local:</label>
                                <input id="campoLocal" class="form-control">
                                <p class="help-block">Entre com o local da reuniao</p>
								
								<label>Data:</label>
                                <input id="DataR" class="form-control">
                                <p class="help-block">Entre com a data da reuniao</p>
								
								<label>Hora:</label>
                                <input id="HoraR" class="form-control">
                                <p class="help-block">Entre com a data da reuniao</p>
								

							<label>Convocados:</label>
							<select id="convocadosR" multiple class="form-control">
                                    <option>Augusto</option>
                                    <option>Nivaldo</option>
									<option>Lorena</option>
									<option>Julian</option>
									<option>William</option>
                                    
                                </select>
                                <p class="help-block">Selecione os funcionários convocados para reuniao</p>
                            
							<button id="bottonBusca" type="button" class="btn btn-primary">Criar</button>
							
                        </div>
						
                    </div>
                </div>
             <br><br>
			 </div>
            </div>
</div>
</div>
                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

</body>

</html>
