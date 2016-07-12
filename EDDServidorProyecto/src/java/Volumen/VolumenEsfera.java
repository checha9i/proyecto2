/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Volumen;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Aurora
 */
@WebService(serviceName = "VolumenEsfera")
public class VolumenEsfera {

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
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "User") String User, @WebParam(name = "Pass") String Pass) {
        //TODO write your implementation code here:
        String ingreso="Ingreso";
        
        
        return ingreso;
    }

    
}