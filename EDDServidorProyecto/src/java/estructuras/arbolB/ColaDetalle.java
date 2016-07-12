/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.arbolB;

import genericos.*;

/**
 *
 * @author David
 */
public class ColaDetalle {
    private NodoCola primero;
    private NodoCola ultimo;
    private int contadorId;
    
    public ColaDetalle(){
        this.primero = this.ultimo = null;
        this.contadorId = 0;
    }
    
    public void insertar(NodoCola nuevo){
        if(isEmpty()){
            setPrimero(nuevo);
            setUltimo(nuevo);
        }else{
            getUltimo().setSiguiente(nuevo);
            setUltimo(nuevo);
        }//fin else
    }
    
    public NodoCola crearNodo(int cantidad,double precio,Producto producto){
        return new NodoCola(contadorId,cantidad,precio,producto);
    }
    
    public NodoCola remover(){
        NodoCola retirado = null;
        if(!isEmpty()){
            retirado = getPrimero();
            if(getPrimero() == getUltimo()){
                setPrimero(null);
                setUltimo(null);
            }else{
                setPrimero(getPrimero().getSiguiente());
            }//fin else
        }//fin if
        return retirado;
    }
    
    public String getDot(){
        String dot = "\nnode [shape=record];\n";
        NodoCola actual = getPrimero();
        while(actual != null){
            dot += "node" + actual.getId() + "[label=\"" + "cantidad:"+actual.cantidad+" \n precio:"+actual.precio+" \n producto:"+actual.producto.getNombre() + "\"];\n";
            if(actual.getSiguiente() != null){
                dot += "node" + actual.getId() + " -> node" + actual.getSiguiente().getId() + ";\n";
            }//fin if
            actual = actual.getSiguiente();
        }//fin while
        return dot;
    }
    
    public boolean isEmpty(){
        return getPrimero() == null;
    }

    public NodoCola getPrimero() {
        return primero;
    }

    public void setPrimero(NodoCola primero) {
        this.primero = primero;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
    }
    
    public class NodoCola{
        private int id;
        private int cantidad;
        private double precio;
        private Producto producto;
        private NodoCola siguiente;
        
        public NodoCola(int id,int cantidad,double precio,Producto producto){
            this.id = id;
            this.cantidad=cantidad;
            this.precio=precio;
            this.producto=producto;
            this.siguiente = null;
        }



        public NodoCola getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoCola siguiente) {
            this.siguiente = siguiente;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
