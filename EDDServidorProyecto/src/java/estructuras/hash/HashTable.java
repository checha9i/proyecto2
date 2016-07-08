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
    private int numeroInserciones;
    
    public HashTable(int tamaño){
        this.tamaño = tamaño;
        this.numeroInserciones = 0;
        tabla = new Producto[this.tamaño];
    }
    
    public void insertar(Producto producto){
        int indiceArreglo = hash(producto.getCodigo());
        int contador = 2;
        while(tabla[indiceArreglo] != null){ //compruba si hay colision
            indiceArreglo = indiceArreglo + (contador*contador); //exploracion cuadratica
            if(indiceArreglo > getTamaño()){
                indiceArreglo = indiceArreglo % getTamaño();
            }//fin if
            //log colision
            contador++;
        }
        tabla[indiceArreglo] = producto; //inserccion
        setNumeroInserciones(getNumeroInserciones() + 1); //aumenta el contador de objetos insertados
        verificarCarga();
    }
    
    private void verificarCarga(){ //verifica el factor de carga para evaluar si hay necesidad de un rehash
        double factorCarga =  getNumeroInserciones() / getTamaño();
        if(factorCarga > 0.6){
            reHash();
        }//fin if
    }
    
    private void reHash(){
        Producto viejaTabla[] = getTabla();
        
        setTamaño(getTamaño() * 2); //cambia el tamaño
        setTabla(new Producto[getTamaño()]); //crea la nueva tabla vacia
        setNumeroInserciones(0);
        
        for(int i = 0; i < viejaTabla.length; i++){
            if(viejaTabla[i] != null){
                insertar(viejaTabla[i]); //insertando los elementos de lde la tabla vieja en la nueva
            }//fin if
        }//fin for
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
    
    public String getDot(){
        String cuadros = "" , enlaces = "", labels = "", dot = "\nnodesep=.05; \nrankdir=LR; \nnode [shape=record,width=.1,height=.1];\n";
        for(int i = 0; i < getTabla().length; i++){
            cuadros += "<f" + i + "> | ";
            if(getTabla()[i] != null){
                labels += "node" + i + "[label=\"<n> " + getTabla()[i].getCodigo() + " | " + getTabla()[i].getNombre() + " | " + getTabla()[i].getPrecio()+"\"];\n";
                enlaces += "tabla:f" + i + " -> node" + i + ":n;\n";
            }//fin if
        }//fin for
        dot += "tabla [label = \"" + cuadros +"\",height=2.5];\n";
        dot += "node [width = 1.5];\n";
        dot += "\n" + labels;
        dot += "\n" + enlaces;
        return dot;
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

    public int getNumeroInserciones() {
        return numeroInserciones;
    }

    public void setNumeroInserciones(int numeroInserciones) {
        this.numeroInserciones = numeroInserciones;
    }
    
}
