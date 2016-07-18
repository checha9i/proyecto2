<%-- 
    Document   : eliminarUsuario
    Created on : Jul 16, 2016, 10:08:42 AM
    Author     : David
--%>

<%@page import="servidor.datoServer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("deleteUser") != null) {
        String usuario = request.getParameter("deleteUser");
        datoServer.USUARIOS.eliminarUsuario(usuario);
        response.sendRedirect("abcUsuarios.jsp");
    }
%>
