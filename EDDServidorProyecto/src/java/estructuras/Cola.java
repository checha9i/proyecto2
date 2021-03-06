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
    private int contadorId;
    private int id;
    
    public Cola(int id){
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
        setContadorId(getContadorId() + 1);
    }
    
    public Nodo crearNodo(Info dato){
        return new Nodo(dato, contadorId);
    }
    
    public Nodo remover(Info dato){
        Nodo retirado = null;
        if(!isEmpty()){
            retirado = getPrimero();
            if(retirado.getDato() == dato){
                if(getPrimero() == getUltimo()){
                    setPrimero(null);
                    setUltimo(null);
                }
            }else{
                while(retirado.getSiguiente() != null){
                    if(retirado.getSiguiente().getDato() == dato){
                        Nodo temp = retirado.getSiguiente();
                        Nodo siguiente = retirado.getSiguiente().getSiguiente();
                        retirado.setSiguiente(siguiente);
                        if(getUltimo() == temp){
                            setUltimo(retirado);
                        }//fin if
                        return temp;
                    }//fin if
                    retirado = retirado.getSiguiente();
                }//fin while
            }//fin else
        }//fin if
        return retirado;
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
        String dot = "\nnode [shape=record];\n";
        Nodo actual = getPrimero();
        while(actual != null){
            dot += "node" + actual.getId() + getId() + "[label=\"" + actual.dato.getDotInfo() + "\"];\n";
            if(actual.getSiguiente() != null){
                dot += "node" + actual.getId() + getId()  + " -> node" + actual.getSiguiente().getId() + getId()  + ";\n";
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
