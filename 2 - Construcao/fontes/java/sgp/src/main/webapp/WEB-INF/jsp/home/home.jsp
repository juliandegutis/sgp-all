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
                <a class="navbar-brand" href="/sgp/home/">Sistema de Gerenciamento de Projetos - UFU</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                
                
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Usuario <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Perfil</a>
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
                        <a href="#"><i class="fa fa-fw fa-dashboard"></i> Perfil</a>
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
                                <a href="ADMreuniao.html">Criar reuniao</a>
                            </li>
                            <li>
                                <a href="ADMprojetos.html">Criar Projeto</a>
                            </li>
							<li>
                                <a href="ADMusuario.html">Criar usuario</a>
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
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Perfil <small>informacoes</small>
                        </h1>
                        
                    </div>
                </div>
             

                
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-comments fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div id="nReuniao"class="huge">7</div>
                                        <div>Reunioes agendadas</div>
                                    </div>
                                </div>
                            </div>
                            <a href="reuniao.html">
                                <div class="panel-footer">
                                    <span class="pull-left">Ver reunioes</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-tasks fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div id="projetoF"class="huge">12</div>
                                        <div>Projetos finalizados</div>
                                    </div>
                                </div>
                            </div>
                            <a href="projetos.html">
                                <div class="panel-footer">
                                    <span class="pull-left">Ver projetos</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                    
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-red">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-support fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div id="projetoP"class="huge">9</div>
                                        <div>Projetos pendentes</div>
                                    </div>
                                </div>
                            </div>
                            <a href="projetos.html">
                                <div class="panel-footer">
                                    <span class="pull-left">Ver projetos</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                </div>

                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right fa-fw"></i> Reunioes</h3>
                            </div>
                            <div id="tabelareuniao"class="panel-body">
                                <div class="table-responsive">
                                    <table id="tabelareuniao2" class="table table-bordered table-hover table-striped">
                                        <thead>
                                            <tr>
                                                <th>Local</th>
                                                <th>Data</th>
                                                <th>Hora</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Sala 1B110</td>
                                                <td>10/21/2013</td>
                                                <td>16:00</td>
                                                
                                            </tr>
                                            <tr>
                                                <td>Sala 1B130</td>
                                                <td>10/21/2013</td>
                                                <td>8:00</td>
                                                
                                            </tr>
                                            <tr>
                                                <td>Sala 1B110</td>
                                                <td>10/21/2013</td>
                                                <td>20:00</td>
                                                
                                            </tr>
                                            <tr>
                                                <td>Sala 3Q240</td>
                                                <td>10/21/2013</td>
                                                <td>18:00</td>
                                                
                                            </tr>
                                            <tr>
                                                <td>Sala 1B110</td>
                                                <td>10/21/2013</td>
                                                <td>14:00</td>
                                                
                                            </tr>
                                            
                                           
                                        </tbody>
                                    </table>
                                </div>
                                <div class="text-right">
                                    <a href="#">Ver todas <i class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-clock-o fa-fw"></i> Notificacoes</h3>
                            </div>
                            <div class="panel-body">
                                <div class="list-group">
                                    <a href="#" class="list-group-item">
                                        <span class="badge">just now</span>
                                        <i class="fa fa-fw fa-calendar"></i> Nova reuniao
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">Ha 4 minutos</span>
                                        <i class="fa fa-fw fa-comment"></i> Reuniao cancelada
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">Ha 23 minutos</span>
                                        <i class="fa fa-fw fa-truck"></i> Viajem Sao Paulo
                                    </a>
                                 
                                    <a href="#" class="list-group-item">
                                        <span class="badge">Ha 2 horas</span>
                                        <i class="fa fa-fw fa-check"></i> Reuniao finalizada
                                    </a>
                                    
                                    <a href="#" class="list-group-item">
                                        <span class="badge">Ha 2 dias</span>
                                        <i class="fa fa-fw fa-check"></i> Projeto concluido
                                    </a>
                                </div>
                                <div class="text-right">
                                    <a href="#">Ver todas <i class="fa fa-arrow-circle-right"></i></a>
                                </div>
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
