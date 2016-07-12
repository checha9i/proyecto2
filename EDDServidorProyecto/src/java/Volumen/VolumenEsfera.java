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
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ImagenesR")
    public String ImagenesR() {
        //TODO write your implementation code here:
        return null;
    }

    
}
