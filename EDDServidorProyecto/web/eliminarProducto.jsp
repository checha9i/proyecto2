<%-- 
    Document   : eliminarProducto
    Created on : Jul 16, 2016, 10:17:52 AM
    Author     : David
--%>

<%@page import="servidor.datoServer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("deleteCodigo") != null) {
        String codigo = request.getParameter("deleteCodigo");     
        datoServer.PRODUCTOS.bajas(codigo);
        response.sendRedirect("abcProductos.jsp");
    }
%>
