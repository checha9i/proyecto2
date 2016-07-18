<%-- 
    Document   : agregarUsuario
    Created on : Jul 16, 2016, 10:08:18 AM
    Author     : David
--%>

<%@page import="servidor.datoServer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("newUser") != null && request.getParameter("passNewUser") != null) {
        String usuario = request.getParameter("newUser");
        String pass = request.getParameter("passNewUser");
        datoServer.USUARIOS.insertarUsuario(usuario, pass);
        response.sendRedirect("abcUsuarios.jsp");
    }
%>
