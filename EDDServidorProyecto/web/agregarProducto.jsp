<%-- 
    Document   : agregarProducto
    Created on : Jul 16, 2016, 10:17:30 AM
    Author     : David
--%>

<%@page import="genericos.Producto"%>
<%@page import="servidor.datoServer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("newCodigo") != null  && request.getParameter("newNombre") != null && request.getParameter("newMarca") != null && request.getParameter("newPrecio") != null && request.getParameter("newRuta") != null) {
        String codigo = request.getParameter("newCodigo");
        String nombre = request.getParameter("newNombre");
        String marca = request.getParameter("newMarca");
        String precio = request.getParameter("newPrecio");
        String ruta = request.getParameter("newRuta");
        datoServer.PRODUCTOS.insertar(new Producto(codigo, nombre, marca, precio, ruta));
        response.sendRedirect("abcProductos.jsp");
    }
%>
