/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.arbolB;

import genericos.Producto;
import genericos.Usuario;
import servidor.datoServer;

/**
 *
 * @author David
 */
public class ListaVentas {
    
    private Nodo primero;
    private Nodo ultimo;
    private int contadorId;
    private int id;
    
    public ListaVentas(int id){
        this.primero = this.ultimo = null;
        this.contadorId = 0;
        this.id = id;
    }
    
    public Nodo buscar(String numero){
        if(!isEmpty()){
            Nodo actual = getPrimero();
            while (actual != null) {
                if (actual.getNumero().equals(numero)) {
                    return actual;
                }//fin if
                actual = actual.getSiguiente();
            }//fin while
        }//fin if
        return null;
    }
    
    public void insertarVenta(String numero, String fecha, double precio, String nickname){
        Usuario usuario = datoServer.USUARIOS.buscar(toAscci(nickname), datoServer.USUARIOS.getRaiz()).getUsuario();
        if(usuario != null){
            insertar(new Nodo(numero, fecha, precio, usuario, getContadorId()));
        }//fin if
    }
    
    public void insertarDetalle(String numero, int cantidad, double total, long codigo){
        Nodo usuario = buscar(numero);
        if(usuario != null){
            Producto producto = datoServer.PRODUCTOS.buscar(codigo);
            if (producto != null) {
                usuario.getDetalle().insertar(usuario.getDetalle().crearNodo(cantidad, total, producto));
            }//fin if
        }//fin if
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
    
    public Nodo crearNodo(String numero, String fecha, double precio, String nickname, int id){
        Usuario usuario = datoServer.USUARIOS.buscar(toAscci(nickname), datoServer.USUARIOS.getRaiz()).getUsuario();
        if(usuario != null){
            return new Nodo(numero, fecha, precio, usuario, getContadorId());
        }//fin if
        return null;
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
    
    /*public Nodo remover(Info dato){
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
    }*/
    
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
    
    private int toAscci(String palabra) {
        int valor = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            valor += (int) caracter;
        }//fin for
        return valor;
    }
    
    public class Nodo{
        private int id;
        private String numero;
        private String fecha;
        private double precio;
        private Usuario usuario;
        private ColaDetalle detalle;
        private Nodo siguiente;
        
        public Nodo(String numero, String fecha, double precio, Usuario usuario, int id){
            this.id = id;
            this.numero = numero;
            this.fecha = fecha;
            this.precio = precio;
            detalle = new ColaDetalle(id + 8000);
            this.usuario = usuario;
            this.siguiente = null;
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

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public ColaDetalle getDetalle() {
            return detalle;
        }

        public void setDetalle(ColaDetalle detalle) {
            this.detalle = detalle;
        }
    }
}
