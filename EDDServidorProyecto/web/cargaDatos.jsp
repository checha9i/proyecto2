<%-- 
    Document   : cargaDatos
    Created on : Jul 11, 2016, 8:31:19 PM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga de Datos</title>
        <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">[EDD]Proyecto #2</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="cargaDatos.jsp">Carga</a>
                        </li>
                        <li>
                            <a href="reportes.jsp">Reportes</a>
                        </li>
                        <li>
                            <a href="abcUsuarios.jsp">ABC Usuarios</a>
                        </li>
                        <li>
                            <a href="abcProductos.jsp">ABC Productos</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Page Content -->
        <div class="container">
                <div class="page-wr">
                    <div class="row">
                        <div class="col-lg-10 col-lg-offset-1 jumbotron">
                            <h1>Carga de Datos</h1>
                            <h4>Suba el archivo de entrada para iniciar las estrucutras</h4>
                            <br />
                            <div class="row">
                                <div class="col-lg-3 col-lg-offset-2">
                                    <form action="subir.jsp" enctype="MULTIPART/FORM-DATA" method="post">
                                        <input type="file" name="file" class="btn btn-primary"/><br/>
                                        <input type="submit" value="Upload" class="btn btn-success"/>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </div>        
        
        <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="bootstrap-3.3.6-dist/js/jquery.js" type="text/javascript"></script>
    </body>
</html>
