/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.hash;

import genericos.Producto;

/**
 *
 * @author David
 */
public class HashTable {
    
    private Producto tabla[];
    private int tamaño;
    
    public HashTable(int tamaño){
        this.tamaño = tamaño;
        tabla = new Producto[this.tamaño];
    }
    
    public void insertar(){
        
    }
    
    private void reHash(){
        
    }
    
    private int hash(long clave){ //funcion hash
        int valorHash = 0; //valor que debe tomar en el array
        String temp = String.valueOf(clave);
        int plegamiento[] = new int[(temp.length()/getNumeroDigitos(getTamaño())) + 1];
        for(int i = 0; i < plegamiento.length; i++){
            plegamiento[i] = (int) (clave % getDivisor());
            clave = clave / getDivisor();
        }//fin for
        for(int i = 0; i < plegamiento.length; i++){
            valorHash += plegamiento[i];
        }//fin for
        return valorHash % getTamaño();
    }
    
    private int getDivisor(){
        int potencia = 1;
        for(int i = 0; i < getNumeroDigitos(getTamaño()); i++){
            potencia *= 10;
        }
        return potencia;
    }
    
    private int getNumeroDigitos(int numero){ //obtiene la cantidad de digitos de un numero
        return String.valueOf(numero).length();
    }

    public Producto[] getTabla() {
        return tabla;
    }

    public void setTabla(Producto[] tabla) {
        this.tabla = tabla;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
}
