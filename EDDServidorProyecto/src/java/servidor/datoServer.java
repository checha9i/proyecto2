/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import estructuras.arbolB.Arbol;
import estructuras.avl.AVL;
import estructuras.hash.HashTable;
import genericos.Producto;

/**
 *
 * @author David
 */
public class datoServer {
    
    /*INICIALIZACION DE LAS ESTRUCUTRAS EN EL SERVIDOR PARA SER LLAMADAS EN TODO MOMENTO*/
    public static final AVL USUARIOS = new AVL();
    public static final Arbol VENTAS = new Arbol();
    public static final HashTable PRODUCTOS = new HashTable(23);
    
    public static void cargaDatos(String archivo){
        archivo = archivo.replace("\n", "");
        archivo = archivo.replace(")", "");
        archivo = archivo.replace("(", "%");
        String lineas[] = archivo.split(";");
        String datos[], parametros[];
        for(int i = 0; i < lineas.length; i++){
            datos = lineas[i].split("%");
            parametros = datos[1].split(",");
            switch(datos[0]){
                case "Usuario":
                    if(parametros.length == 2){
                        USUARIOS.insertarUsuario(parametros[0], parametros[1]);
                    }
                    break;
                case "Direccion":
                    if(parametros.length == 4){
                        USUARIOS.insertarDireccion(parametros[0], parametros[1], parametros[2], parametros[3]);
                    }
                    break;
                case "Carrito":
                    if(parametros.length == 3){
                        USUARIOS.insertarCarrito(parametros[0], parametros[1], parametros[2]);
                    }
                    break;
                case "PorComprar":
                    if(parametros.length == 3){
                        USUARIOS.insertarCompra(parametros[0], parametros[1], parametros[2]);
                    }
                    break;
                case "Producto":
                    if(parametros.length == 5){
                        PRODUCTOS.insertar(new Producto(parametros[0],parametros[1],parametros[2],parametros[3],parametros[4]));
                    }
                    break;
                case "Venta":
                    if(parametros.length == 4){
                        VENTAS.añadirVenta(parametros[0], parametros[1], parametros[2], parametros[3]);
                    }
                    break;
                case "Detalle":
                    if(parametros.length == 4){
                        VENTAS.añadirDetalle(parametros[0], parametros[1], parametros[2], parametros[3]);
                    }
                    break;
            }//fin switch
        }//fin for
        VENTAS.actualizarVentas();
    }
    
}
