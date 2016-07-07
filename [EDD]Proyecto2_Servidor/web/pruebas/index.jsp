<%-- 
    Document   : index
    Created on : Jul 6, 2016, 3:22:57 PM
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
    <body>
        <h1><a href="prueba.jsp">Hello World!</a></h1>
    </body>
    <% // Para fijar una variable en un jsp
   application.setAttribute("variable", new entero(2));%>
</html>
