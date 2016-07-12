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
    </head>
    <body>
        <h1 align="center">Carga de Datos</h1><br/>
        <form action="subir.jsp" enctype="MULTIPART/FORM-DATA" method="post">
            <input type="file" name="file" /><br/>
            <input type="submit" value="Upload" />
        </form>
    </body>
</html>
