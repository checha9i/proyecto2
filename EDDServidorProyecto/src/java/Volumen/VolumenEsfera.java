/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Volumen;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import servidor.*;
/**
 *
 * @author Aurora
 */
@WebService(serviceName = "VolumenEsfera")
public class VolumenEsfera {

    
        /**
     * Web service operation
     * @param User
     * @param Pass
     * @return 
     */
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "User") String User, @WebParam(name = "Pass") String Pass) {
        //TODO write your implementation code here:
        String ingreso="No Ingreso";
        if(datoServer.USUARIOS.comprobarCredenciales(User, Pass)){
            ingreso="Ingreso";
        }
        return ingreso;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "Catalogo")
    public String Catalogo() {
        return datoServer.PRODUCTOS.getCatalogo();
    }

    /**
     * Web service operation
     * @param usuario
     * @return 
     */
    @WebMethod(operationName = "carritodot")
    public String carritodot(String usuario) {
        return "digraph g{" + datoServer.USUARIOS.getDotCarrito(usuario) + "}";
    }

    /**
     * Web service operation
     * @param usuario
     * @return 
     */
    @WebMethod(operationName = "dotcompras")
     
    public String dotcompras(String usuario) {
        return "digraph g{" + datoServer.USUARIOS.getDotCompras(usuario) + "}";
    }

    /**
     * Web service operation
     * @param user
     * @param cantidad
     * @param codigo
     */
    @WebMethod(operationName = "agregarcarrito")
     @Oneway
    public void agregarcarrito(String user,int cantidad,long codigo) {
        //agregar a carrito
        datoServer.USUARIOS.agreagarACarrito(user, cantidad, codigo);
    }
    /**
     * Web service operation
     * @param user
     * @param cantidad
     * @param codigo
     */
    @WebMethod(operationName = "agregarcompra")
     @Oneway
    public void agregarcompra(String user,int cantidad,long codigo) {
        //agregar a whishlist
       datoServer.USUARIOS.agreagarAPorComprar(user, cantidad, codigo);
    }   
    /**
     * Web service operation
     * @param usuario
     */
        @WebMethod(operationName = "comprar")
         @Oneway
    public void comprar(String usuario) {
        //pasar el carrito a ventas
        datoServer.comprarCarrito(usuario);
    }   

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "limpiarporcomprar")
    @Oneway
    public void limpiarporcomprar(String user) {
        //vaciar whislist
        datoServer.USUARIOS.vaciarPorComprar(user);
    }

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "AgregarACarritoDesdeCompras")
    @Oneway
    public void AgregarACarritoDesdeCompras(String user) {
        //agregar toda la wishlista a carrito
        datoServer.USUARIOS.porComprarACarrito(user);
    }

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "eliminarcomprar")
    @Oneway
    public void eliminarcomprar(@WebParam(name = "user") String user) {
        //eliminar uno a uno del carrito
        datoServer.USUARIOS.quitarUnoDeCarrito(user);
    }

    /**
     * Web service operation
     * @param user
     * @param direccion
     * @param envio
     * @param facturacion
     */
    @WebMethod(operationName = "agregardireccion")
    @Oneway
    public void agregardireccion(String user, String direccion, String envio, String facturacion) {
        datoServer.USUARIOS.insertarDireccion(user, direccion, envio, facturacion);
    }

    /**
     * Web service operation
     * @param user
     * @param direccion
     * @param envio
     * @param facturacion
     */
    @WebMethod(operationName = "eliminardireccion")
    @Oneway
    public void eliminardireccion(@WebParam(name = "user") String user, @WebParam(name = "direccion") String direccion, @WebParam(name = "envio") String envio, @WebParam(name = "facturacion") String facturacion) {
        datoServer.USUARIOS.eliminarDireccion(user, direccion, envio, facturacion);
    }
}
