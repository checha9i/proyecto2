/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.avl;

import estructuras.Cola;
import estructuras.ListaSimple;

/**
 *
 * @author David
 */
public class AVL {
    
    Nodo raiz;
    int contadorId;
    
    public AVL(){
        this.contadorId = 0;
        this.raiz = null;
    }
    
    private Nodo rotacionDerecha(Nodo nodo){
        Nodo temp = nodo.getIzquierdo();
        return temp;
    }
    
    private void arreglarFe(Nodo nodo){
        
    }
    
    private int obtenerAltura(Nodo nodo){
        return (nodo!=null) ? nodo.getAltura() : 0;
    }
    
    private void arreglarAltura(Nodo nodo){
        int hl = obtenerAltura(nodo.getIzquierdo());
        int hr = obtenerAltura(nodo.getDerecho());
        nodo.setAltura((hl>hr) ? hl : hr);
    }
    
    public class Nodo{
        private int clave;
        private int id;
        private int altura;
        private Nodo derecho;
        private Nodo izquierdo;
        private String nickname;
        private String contraseña;
        private ListaSimple direcciones;
        private Cola compras;
        private Cola carrito;
        
        public Nodo(String nickname, String contraseña, int id){
            this.clave = toAscci(nickname);
            this.id = id;
            this.altura = 1;
            this.nickname = nickname;
            this.contraseña = contraseña;
            this.direcciones = new ListaSimple();
            this.compras = new Cola();
            this.carrito = new Cola();
        }
        
        private int toAscci(String palabra){
            int valor = 0;
            for(int i = 0; i < palabra.length(); i++){
                char caracter = palabra.charAt(i);
                valor += (int) caracter;
            }//fin for
            return valor;
        }

        public int getClave() {
            return clave;
        }

        public void setClave(int clave) {
            this.clave = clave;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Nodo getDerecho() {
            return derecho;
        }

        public void setDerecho(Nodo derecho) {
            this.derecho = derecho;
        }

        public Nodo getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(Nodo izquierdo) {
            this.izquierdo = izquierdo;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public ListaSimple getDirecciones() {
            return direcciones;
        }

        public void setDirecciones(ListaSimple direcciones) {
            this.direcciones = direcciones;
        }

        public Cola getCompras() {
            return compras;
        }

        public void setCompras(Cola compras) {
            this.compras = compras;
        }

        public Cola getCarrito() {
            return carrito;
        }

        public void setCarrito(Cola carrito) {
            this.carrito = carrito;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
    }
}
