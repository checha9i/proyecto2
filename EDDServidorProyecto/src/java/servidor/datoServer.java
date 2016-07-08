/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import estructuras.arbolB.Arbol;
import estructuras.avl.AVL;
import estructuras.hash.HashTable;

/**
 *
 * @author David
 */
public class datoServer {
    
    /*INICIALIZACION DE LAS ESTRUCUTRAS EN EL SERVIDOR PARA SER LLAMADAS EN TODO MOMENTO*/
    public static final AVL USUARIOS = new AVL();
    public static final Arbol VENTAS = new Arbol();
    public static final HashTable PRODUCTOS = new HashTable(23);
    
}
