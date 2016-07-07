<%-- 
    Document   : prueba
    Created on : Jul 6, 2016, 3:29:22 PM
    Author     : David
--%>
<%@page import="prueba.entero" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% entero hola = (entero)application.getAttribute("variable"); %>
    <body>
        <h1><%= hola.numero %></h1>
        <h1><%= entero.estatico %></h1>
    </body>
</html>
