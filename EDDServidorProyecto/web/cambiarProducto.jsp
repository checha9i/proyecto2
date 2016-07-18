<%-- 
    Document   : cambiarProducto
    Created on : Jul 16, 2016, 10:17:40 AM
    Author     : David
--%>

<%@page import="servidor.datoServer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("codigo") != null) {
        String codigo = request.getParameter("codigo");
        String nombre, marca, precio, ruta;
        if(request.getParameter("nombre") != null){
            nombre = request.getParameter("nombre");
        }else{
            nombre = "";
        }
        if(request.getParameter("marca") != null){
            marca = request.getParameter("marca");
        }else{
            marca = "";
        }
        if(request.getParameter("precio") != null){
            precio = request.getParameter("precio");
        }else{
            precio = "";
        }if(request.getParameter("ruta") != null){
            ruta = request.getParameter("ruta");
        }else{
            ruta = "";
        }
        
        datoServer.PRODUCTOS.cambios(codigo, nombre, marca, precio, ruta);
        response.sendRedirect("abcProductos.jsp");
    }
%>
