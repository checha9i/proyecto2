using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ProyectoCliente
{

    public class datoCliente
    {
        public static int indice = 0;   
        public static servicioweb.VolumenEsferaClient proxy = new servicioweb.VolumenEsferaClient();
        public static ArrayList Productos;
        public static void getCatalogo() {

            //String catalogo= proxy.Catalogo();
            Productos = new ArrayList();
            String catalogo = "123213,nombre,marca,13.80,IM3.jpg%123213,nombre,marca,13.80,http:////localhost:39551/IM3.jpg%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf%123213,nombre,marca,13.80,lkajdf";
            if (catalogo != null)
            {
                String[] producto = catalogo.Split('%');
                Producto[] productos = new Producto[20];
                int cont = 0;
                for (int i = 0; i < producto.Length; i++)
                {
                    String[] atributo = producto[i].Split(',');
                    productos[cont] = new Producto(atributo[0], atributo[1], atributo[2], atributo[3], atributo[4]);
                    cont++;
                    

                    if (cont == 20)
                    {
                        Productos.Add(productos);
                        productos = new Producto[20];
                        cont = 0;
                    }
                }
                if (producto.Length % 20 != 0) 
                {
                    Productos.Add(productos);
                }
            }
        }

    }

}