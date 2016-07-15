/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Volumen;

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
     */
    @WebMethod(operationName = "Catalogo")
    public String Catalogo() {
        return datoServer.PRODUCTOS.getCatalogo();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "carritodot")
    public String carritodot(String usuario) {
        return datoServer.USUARIOS.getDotCarrito(usuario);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dotcompras")
    public String dotcompras(String usuario) {
        return datoServer.USUARIOS.getDotCompras(usuario);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarcarrito")
    public void agregarcarrito(String user,int cantidad,long codigo) {
        //TODO write your implementation code here:
       
    }
    
    @WebMethod(operationName = "agregarcompra")
    public void agregarcompra(String user,int cantidad,long codigo) {
        //TODO write your implementation code here:
       
    }    
        @WebMethod(operationName = "comprar")
    public void comprar(String usuario) {
        //TODO write your implementation code here:
       
    }   
}
