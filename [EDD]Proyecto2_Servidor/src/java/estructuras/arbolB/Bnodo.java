/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto2;

/**
 *
 * @author javier
 */


public class Bnodo {

    Bnodo[] Ramas = new Bnodo[5];
    Nodo[] Claves = new Nodo[4];
    int Cuentas = 0;

    Bnodo(Nodo clave) {
        Claves[0] = clave;
    }

    Bnodo() {
    }
}
