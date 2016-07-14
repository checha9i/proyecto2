/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.detalle.Info;

/**
 *
 * @author David
 */
public class ListaSimple {
    
    private Nodo primero;
    private Nodo ultimo;
    private int contadorId;
    private int id;
    
    public ListaSimple(int id){
        this.primero = this.ultimo = null;
        this.contadorId = 0;
        this.id = id;
    }
    
    public void insertar(Nodo nuevo){
        if(isEmpty()){
            setPrimero(nuevo);
            setUltimo(nuevo);
        }else{
            getUltimo().setSiguiente(nuevo);
            setUltimo(nuevo);
        }//fin else
    }
    
    public Nodo crearNodo(Info dato){
        return new Nodo(dato, getContadorId());
    }
    
    public Nodo remover(Info dato){
        Nodo retirado = null;
        Nodo actual = getPrimero();
        if(actual.getDato() == dato){
            retirado = actual;
            setPrimero(getPrimero().getSiguiente());
        }else{
            while (actual.getSiguiente() != null) {
                if (actual.getSiguiente().getDato() == dato) {
                    retirado = actual.getSiguiente();
                    actual.setSiguiente(retirado.getSiguiente());
                    break;
                }//fin if
                actual = actual.getSiguiente();
            }//fin while
        }
        return retirado;
    }
    
    public String getDot(){
        String dot = "\nnode [shape=record];\n";
        Nodo actual = getPrimero();
        while(actual != null){
            dot += "node" + actual.getId() + "[label=\"" + actual.dato.getDotInfo() + "\"];\n";
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

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public class Nodo{
        private int id;
        private Info dato;
        private Nodo siguiente;
        
        public Nodo(Info dato, int id){
            this.id = id;
            this.dato = dato;
            this.siguiente = null;
        }

        public Info getDato() {
            return dato;
        }

        public void setDato(Info dato) {
            this.dato = dato;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
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
