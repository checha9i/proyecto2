/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.avl;

import estructuras.Cola;
import estructuras.ListaSimple;
import estructuras.detalle.InfoCompras;
import estructuras.detalle.InfoDireccion;

/**
 *
 * @author David
 */
public class AVL {
    
    private Nodo raiz;
    private int contadorId;
    
    public AVL(){
        this.contadorId = 0;
        this.raiz = null;
    }
    
    public boolean insertarDireccion(InfoDireccion direccion, String nickname){
        Nodo usuario = buscar(toAscci(nickname), getRaiz());
        if(usuario != null){
            usuario.getDirecciones().insertar(usuario.getDirecciones().crearNodo(direccion));
            return true;
        }//fin if
        return false;
    }
    
    public boolean insertarCompra(InfoCompras compras, String nickname){
        Nodo usuario = buscar(toAscci(nickname), getRaiz());
        if(usuario != null){
            usuario.getCompras().insertar(usuario.getCompras().crearNodo(compras));
            return true;
        }//fin if
        return false;
    }
    
    public boolean insertarCarrito(InfoCompras compras, String nickname){
        Nodo usuario = buscar(toAscci(nickname), getRaiz());
        if(usuario != null){
            usuario.getCarrito().insertar(usuario.getCarrito().crearNodo(compras));
            return true;
        }//fin if
        return false;
    }
    
    public Nodo buscar(int clave, Nodo raiz){
        if(raiz != null){
            if(clave == raiz.getClave()){
                return raiz;
            }//fin if
            if(clave < raiz.getClave()){
                return buscar(clave, raiz.getIzquierdo());
            }//fin if
            if(clave > raiz.getClave()){
                return buscar(clave, raiz.getDerecho());
            }//fin if
        }//fin if
        return null;
    }
    
    private Nodo rotacionDerecha(Nodo nodo){
        Nodo temp = nodo.getIzquierdo();
        nodo.setIzquierdo(temp.getDerecho());
        temp.setDerecho(nodo);
        arreglarAltura(nodo);
        arreglarAltura(temp);
        return temp;
    }
    
    private Nodo rotacionIzquierda(Nodo nodo){
        Nodo temp = nodo.getDerecho();
        nodo.setDerecho(temp.getIzquierdo());
        temp.setIzquierdo(nodo);
        arreglarAltura(nodo);
        arreglarAltura(temp);
        return temp;
    }
    
    private Nodo balancear(Nodo nodo){
        arreglarAltura(nodo);
        if(fe(nodo) == 2){
            if(fe(nodo.getDerecho()) < 0){
                nodo.setDerecho(rotacionDerecha(nodo.getDerecho()));
            }//fin if
            return rotacionIzquierda(nodo);
        }//fin if
        if(fe(nodo) == -2){
            if(fe(nodo.getIzquierdo()) > 0){
                nodo.setIzquierdo(rotacionIzquierda(nodo.getIzquierdo()));
            }//fin if
            return rotacionDerecha(nodo);
        }//fin if
        return nodo; //no se requiere balanceo
    }
    
    public Nodo insertar(Nodo nuevo, Nodo raiz){
        if(raiz == null){
            setContadorId(getContadorId() + 1);
            return nuevo;
        }//fin if
        if(nuevo.getClave() < raiz.getClave()){ //va a la izquierda
            raiz.setIzquierdo(insertar(nuevo, raiz.getIzquierdo()));
        }else if(nuevo.getClave() > raiz.getClave()){ //va a la derecha
            raiz.setDerecho(insertar(nuevo, raiz.getDerecho()));
        }else{ //ya existe
            //log error
        }//fin else
        return balancear(raiz);
    }
    
    private int fe(Nodo nodo){
        return obtenerAltura(nodo.getDerecho())-obtenerAltura(nodo.getIzquierdo());
    }
    
    private int obtenerAltura(Nodo nodo){
        return (nodo!=null) ? nodo.getAltura() : 0;
    }
    
    private void arreglarAltura(Nodo nodo){
        int hl = obtenerAltura(nodo.getIzquierdo());
        int hr = obtenerAltura(nodo.getDerecho());
        nodo.setAltura((hl>hr) ? hl : hr);
    }
    
    private int toAscci(String palabra) {
        int valor = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            valor += (int) caracter;
        }//fin for
        return valor;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
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
