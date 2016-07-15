/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author David
 */
public class Producto {
    private long codigo;
    private String nombre;
    private String marca;
    private double precio;
    private String ruta;
    
    public String getDatos(){
        return codigo + "," + nombre + "," + marca + "," + precio + "," + ruta;
    }
    
    public Producto(String codigo, String nombre, String marca, String precio, String ruta){
        try {
            this.codigo = Long.parseLong(codigo);
        } catch (Exception e) {
            this.codigo = 1312312;
        }
        this.nombre = nombre;
        this.marca = marca;
        try {
            this.precio = Double.parseDouble(precio);
        } catch (Exception e) {
            this.precio = 0.00;
        }
        this.ruta = ruta;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
