/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author javier
 */
@WebService(serviceName = "ServerWebService")
public class ServerWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "CalcularVolumenEsfera")
    public double CalcularVolumenEsfera(@WebParam(name = "Radio") double Radio) {
        //TODO write your implementation code here:
        double volumen = 0.0d;
        if(Radio>0)
        {
            volumen = (3.0/4.0)* Math.PI* Math.pow(Radio, 3);
        }
        return volumen;
    }

    
}
