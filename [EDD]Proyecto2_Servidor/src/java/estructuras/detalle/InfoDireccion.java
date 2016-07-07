/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.detalle;

/**
 *
 * @author David
 */
public class InfoDireccion implements Info{
    private String direccion;
    private int envio;
    private int facturacion;
    
    public InfoDireccion(String direccion, int envio, int facturacion){
        this.direccion = direccion;
        this.envio = envio;
        this.facturacion = facturacion;
    }
    
    @Override
    public String getDotInfo(){
        return "Direccion: " + getDireccion() + "\\nEnvio: " + getEnvio() + "\\nFacturaccion: " + getFacturacion();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEnvio() {
        return envio;
    }

    public void setEnvio(int envio) {
        this.envio = envio;
    }

    public int getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(int facturacion) {
        this.facturacion = facturacion;
    }
}
