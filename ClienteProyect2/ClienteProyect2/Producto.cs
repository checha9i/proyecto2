using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ClienteProyect2
{
    public class Producto
    {
        public long codigo;
        public String nombre;
        public String marca;
        public double precio;
        public String ruta;

        public Producto(String codigo, String nombre, String marca, String precio, String ruta) {
            
            this.codigo = long.Parse(codigo);
            this.nombre = nombre;
            this.marca = marca;
            this.precio = double.Parse(precio);
            this.ruta = ruta;

        }
    }
}