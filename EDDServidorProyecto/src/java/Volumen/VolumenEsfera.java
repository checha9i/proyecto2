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
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     * @param user
     * @return 
     */
    @WebMethod(operationName = "carritodot")
    public String carritodot(String user) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     * @param user
     * @return 
     */
    @WebMethod(operationName = "dotcompras")  
    public String dotcompras(String user) {
        //TODO write your implementation code here:
        return null;
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
        //TODO write your implementation code here:
       
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
        //TODO write your implementation code here:
       
    }    
       /**
     * Web service operation
     * @param usuario
     */
        @WebMethod(operationName = "comprar")
        @Oneway
    public void comprar(String usuario) {
        //TODO write your implementation code here:
       
    }   

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "AgregarACarritoDesdeCompras")
    @Oneway
    public void AgregarACarritoDesdeCompras(String user) {
     

//TODO write your implementation code here:
       
    }

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "limpiarporcomprar")
    @Oneway
    public void limpiarporcomprar(String user) {
        //TODO write your implementation code here:
        
    }

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "eliminarcomprar")
    @Oneway
    public void eliminarcomprar(String user) {
    }
}
