<%-- 
    Document   : abcUsuarios
    Created on : Jul 16, 2016, 9:59:39 AM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Productos</title>
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
                    <div class="col-lg-12 text-center jumbotron">
                        <h1>ABC Usuarios</h1>
                        <br/>
                        <form action="agregarUsuario.jsp" method="post">
                            Nickname:
                            <input type="text" name="newUser" class="col-lg-2 form-control"/><br/>
                            Contraseña:
                            <input type="text" name="passNewUser" class="col-lg-2 form-control"/><br/>
                            <input type="submit" value="Agregar" class="btn btn-success"/>
                        </form>
                        <form action="eliminarUsuario.jsp" method="post">
                            Nickname:
                            <input type="text" name="deleteUser" class="col-lg-2 form-control"/><br/>
                            <input type="submit" value="Eliminar" class="btn btn-success"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>        

        <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="bootstrap-3.3.6-dist/js/jquery.js" type="text/javascript"></script>
    </body>
</html>
