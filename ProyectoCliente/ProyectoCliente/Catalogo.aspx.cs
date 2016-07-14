﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ProyectoCliente
{
    public partial class Catalogo : System.Web.UI.Page
    {
        ProyectoCliente.servicioweb.VolumenEsferaClient proxy = new ProyectoCliente.servicioweb.VolumenEsferaClient();
        
        protected void Page_Load(object sender, EventArgs e)
        {
            Label1.Text=(datoCliente.indice+1)+"";
            datoCliente.getCatalogo();
            Producto[] productos = null;
            if(datoCliente.Productos.Count > 0){
                 productos = (Producto[])datoCliente.Productos[datoCliente.indice];
            }
            int numProducto = 0;
            Table1.BorderWidth = 3;
            
            for(int fila=0;fila<5;fila++)
            {
                TableRow Row = new TableRow();
                Table1.Rows.Add(Row);

                Table1.CellSpacing = 10;

                for (int columna = 0; columna < 4;columna++ )
                {
                    if (productos != null)
                    {
                        if (productos[numProducto] != null)
                        {
                            TableCell Cell = new TableCell();
                            Cell.BorderWidth = 3;
                            Cell.BorderStyle = System.Web.UI.WebControls.BorderStyle.Double;
                            Cell.BorderColor = System.Drawing.Color.Snow;
                            Cell.Text = "<img src=\" "+productos[numProducto].ruta+" \"></br>Codigo: "+productos[numProducto].codigo + "</br>Nombre: " + productos[numProducto].nombre + "</br>Marca: "
                                + productos[numProducto].marca + "</br>Precio: Q" + productos[numProducto].precio;
                            
                            Row.Cells.Add(Cell);
                        }
                    }
                    numProducto++;
                }
                //numProducto++;
            }
            
        }

        protected void Anterior_Click(object sender, EventArgs e)
        {
            int indice = datoCliente.indice;
            if(indice>0){
                datoCliente.indice--;
            }
        }

        protected void Siguiente_Click(object sender, EventArgs e)
        {
            int indice = datoCliente.indice;
            if (indice < datoCliente.Productos.Count - 1) {
                datoCliente.indice++;
            }
        }

        
    }
}