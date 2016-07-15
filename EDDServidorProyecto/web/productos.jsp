<%-- 
    Document   : productos
    Created on : Jul 14, 2016, 1:50:51 PM
    Author     : David
--%>

<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.File"%>
<%@page import="servidor.datoServer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Productos</title>
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
                            <h1>Reportes de Productos</h1>
                            <br />
                            <div class="row">
                                <%
                                    String grafo = "digraph g{";
                                    grafo += datoServer.VENTAS.getDot();
                                    grafo += "}";
                                    
                                    String path = getServletContext().getRealPath("") + File.separator + "uploads";
                                    
                                    try{
                                        File archivo = new File("uploads"+ File.separator + "productos.txt");
                                        FileWriter fw = new FileWriter(archivo);
                                        BufferedWriter bw = new BufferedWriter(fw);
                                        bw.write(grafo);
                                        bw.close();
                                        fw.close();
                                    }catch(Exception e){}
                                    
                                    try {

                                    String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
                                    String fileInputPath = path + File.separator + "productos.txt";
                                    String fileOutputPath = path + File.separator + "productos.jpg";
                                    String tParam = "-Tjpg";
                                    String tOParam = "-o";

                                    String[] cmd = new String[5];
                                    cmd[0] = dotPath;
                                    cmd[1] = tParam;
                                    cmd[2] = fileInputPath;
                                    cmd[3] = tOParam;
                                    cmd[4] = fileOutputPath;

                                    Runtime rt = Runtime.getRuntime();
                                    rt.exec(cmd);
                                    } catch (Exception ex) {}
                                    out.print("<img src=\"" + request.getContextPath() + File.separator +  "uploads" + File.separator + "productos.jpg" + "\">");
                                %>
                            </div>
                        </div>
                    </div>
                </div>
        </div>        
        
        <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="bootstrap-3.3.6-dist/js/jquery.js" type="text/javascript"></script>
    </body>
</html>
