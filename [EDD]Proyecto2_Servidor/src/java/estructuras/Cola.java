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
public class Cola {
    private Nodo primero;
    private Nodo ultimo;
    
    public Cola(){
        this.primero = this.ultimo = null;
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
    
    public Nodo remover(){
        Nodo retirado = null;
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
        String dot = "\nnode [shape=\"box\"];\n";
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
