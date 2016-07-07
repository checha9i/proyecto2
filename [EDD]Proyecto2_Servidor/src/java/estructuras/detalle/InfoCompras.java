/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.detalle;

import genericos.Producto;

/**
 *
 * @author David
 */
public class InfoCompras implements Info{
    private Producto producto;
    private int cantidad;
    
    @Override
    public String getDotInfo(){
        String dot = "";
        dot += "Cantidad: " + getCantidad() + " \\n";
        return dot;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
