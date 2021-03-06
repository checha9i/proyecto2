/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras.arbolB;
/**
 *
 * @author Usuario
 */
import estructuras.Cola;
import estructuras.detalle.InfoCompras;
import genericos.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Arbol {

    public static ArrayList<String> LineasGrafico = new ArrayList<String>();

    public Bnodo p = new Bnodo();
    public Bnodo Xder = new Bnodo();
    public Bnodo Xizq = new Bnodo();
    public Nodo X;
    public Bnodo Xr;
    public String salida = "", imps = "";
    public boolean EmpA = false, Esta = false;
    public int contadorVentas = 9000;
    public ListaVentas ventas = new ListaVentas(0);
    
    public String getDot(){
        Graficar graficar = new Graficar();
        return graficar.getDot(this);
    }

    public Nodo NodoExistente(Bnodo p, String correo) {
        Nodo i = null;
        if (p != null) {
            for (Nodo j : p.Claves) {
                if (j != null) {
                    if (j.id.equals(correo)) {
                        i = j;
                    }
                }
            }

            if (i == null) {
                if (p.Claves[0] != null) {
                    if (ComparacionNombre(correo, p.Claves[0].id)) {
                        i = NodoExistente(p.Ramas[0], correo);
                    } else if (p.Claves[1] != null) {
                        if (ComparacionNombre(correo, p.Claves[1].id)) {
                            i = NodoExistente(p.Ramas[1], correo);
                        } else if (p.Claves[2] != null) {
                            if (ComparacionNombre(correo, p.Claves[2].id)) {
                                i = NodoExistente(p.Ramas[2], correo);
                            } else if (p.Claves[3] != null) {
                                if (ComparacionNombre(correo, p.Claves[3].id)) {
                                    i = NodoExistente(p.Ramas[3], correo);
                                } else if (p.Claves[4] != null) {
                                    if (ComparacionNombre(correo, p.Claves[4].id)) {
                                        i = NodoExistente(p.Ramas[4], correo);
                                    } else {

                                    }
                                } else {
                                    i = NodoExistente(p.Ramas[4], correo);
                                }
                            } else {
                                i = NodoExistente(p.Ramas[3], correo);
                            }
                        } else {
                            i = NodoExistente(p.Ramas[2], correo);
                        }
                    } else {
                        i = NodoExistente(p.Ramas[1], correo);
                    }
                }
            }
        }
        return i;
    }
    
    public void realizarCompra(Cola productosCarrito, Usuario usuario){
        double total = 0;
        String fecha = Calendar.DATE + "/" + Calendar.MONTH + "/" + Calendar.YEAR;
        Cola.Nodo actual = productosCarrito.getPrimero();
        while(actual != null){
            InfoCompras datos = (InfoCompras)actual.getDato();
            try {
                total += datos.getProducto().getPrecio();
            } catch (Exception e) {}
            actual = actual.getSiguiente();
        }//fin while
        ColaDetalle detalle = new ColaDetalle(contadorVentas);
        while(!productosCarrito.isEmpty()){
            actual = productosCarrito.remover();
            InfoCompras datos = (InfoCompras)actual.getDato();
            detalle.insertar(detalle.crearNodo(datos.getCantidad(), total, datos.getProducto()));
        }//fin while
        insertar(p, contadorVentas+"", fecha, total+"", detalle, usuario);
    }
    
    public void añadirVenta(String numero, String fecha, String totalS, String nickname){
        double total;
        
        try {
            total = Double.parseDouble(totalS);
        } catch (Exception e) {
            total = 0.00;
        }
        ventas.insertarVenta(numero, fecha, total, nickname);
    }//inserta una venta en el arbol
    
    public void añadirDetalle(String numero, String cantidadS, String precioS, String codigoS){
        int cantidad;
        double precio;
        long codigo;
        
        try {
            cantidad = Integer.parseInt(cantidadS);
        } catch (Exception e) {
            cantidad = 0;
        }
        
        try {
            precio = Double.parseDouble(precioS);
        } catch (Exception e) {
            precio = 0.00;
        }
        
        try {
            codigo = Long.parseLong(codigoS);
        } catch (Exception e) {
            codigo = 0;
        }
        ventas.insertarDetalle(numero,cantidad,precio, codigo);
    }//inserta un detalle en la venta
    
    public void actualizarVentas(){
        ListaVentas.Nodo nodo;
        while(!ventas.isEmpty()){
            nodo = ventas.remover();
            insertar(p, nodo.getNumero(), nodo.getFecha(), nodo.getPrecio()+"", nodo.getDetalle(), nodo.getUsuario());
        } 
    }

    public void insertar(Bnodo raiz, String id, String Fecha, String Total, ColaDetalle detalle, Usuario usuario) {
        Nodo c = new Nodo();
        c.id = id;
     
        c.Fecha = Fecha;
        c.Total = Total;
        c.user = usuario;
        c.Detalle = detalle;
        
        
        Empujar(c, raiz);
        if (EmpA) {
            p = new Bnodo();
            p.Cuentas = 1;
            p.Claves[0] = X;
            p.Ramas[0] = raiz;
            p.Ramas[1] = Xr;
        }
        //JOptionPane.showMessageDialog(null,"Insercion Completa");

    }

    public void Empujar(Nodo clave, Bnodo raiz) {
        int k = 0;
        Esta = false;

        if (Vacio(raiz)) {
            EmpA = true;
            X = clave;
            Xr = null;
        } else {
            k = BuscarNodo(clave, raiz);
            if (Esta) {
                JOptionPane.showMessageDialog(null, "No hay claves");
                EmpA = false;
            } else {
                Empujar(clave, raiz.Ramas[k]);
                if (EmpA) {
                    if (raiz.Cuentas < 4) {
                        EmpA = false;
                        MeterHoja(X, raiz, k);
                    } else {
                        EmpA = true;
                        DividirN(X, raiz, k);
                    }
                }
            }
        }
    }

    public int BuscarNodo(Nodo clave, Bnodo raiz) {
        int j = 0;

        if (ComparacionNombre(clave.id, raiz.Claves[0].id) == true) {
            Esta = false;
            j = 0;
        } else {
            j = raiz.Cuentas;

            while (ComparacionNombre(clave.id, raiz.Claves[j - 1].id) == true && j > 1) {
                --j;
            }
            Esta = (clave.id == raiz.Claves[j - 1].id);
        }
        return j;
    }

    //Meter hoja
    public void MeterHoja(Nodo clave, Bnodo raiz, int k) {
        int i = raiz.Cuentas;
        while (i != k) {
            raiz.Claves[i] = raiz.Claves[i - 1];
            raiz.Ramas[i + 1] = raiz.Ramas[i];
            --i;
        }
        raiz.Claves[k] = clave;
        raiz.Ramas[k + 1] = Xr;
        raiz.Cuentas = ++raiz.Cuentas;
    }
    //Dividir nodo

    public void DividirN(Nodo Clave, Bnodo Raiz, int k) {
        int pos = 0;
        int Posmda = 0;
        if (k <= 2) {
            Posmda = 2;
        } else {
            Posmda = 3;
        }
        Bnodo Mder = new Bnodo();
        pos = Posmda + 1;
        while (pos != 5) {
            Mder.Claves[(pos - Posmda) - 1] = Raiz.Claves[pos - 1];
            Mder.Ramas[pos - Posmda] = Raiz.Ramas[pos];
            ++pos;
        }
        Mder.Cuentas = 4 - Posmda;
        Raiz.Cuentas = Posmda;
        if (k <= 2) {
            MeterHoja(Clave, Raiz, k);
        } else {
            MeterHoja(Clave, Mder, (k - Posmda));
        }
        X = Raiz.Claves[Raiz.Cuentas - 1];
        Mder.Ramas[0] = Raiz.Ramas[Raiz.Cuentas];
        Raiz.Cuentas = --Raiz.Cuentas;
        Xr = Mder;
        Raiz.Claves[2] = null;
        Raiz.Claves[3] = null;
    }

    //Esta Vacio
    private boolean Vacio(Bnodo raiz) {
        return (raiz == null || raiz.Cuentas == 0);
    }
    //Recorrido InOrden Iterativo

    void InordenIT() {
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                    salida = salida + "Num ID: " + nodo.Claves[i - 1].id + "\n";
                    
                    salida = salida + "------------------------------\n";
                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
          
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));

    }

    public void escribeNodo(Bnodo actual) {

        if ((actual == null)) {
            return;
        } else {
            int k;
            escribeNodo(actual.Ramas[0]);

            for (k = 0; k <= actual.Cuentas; k++) {

                if (actual.Claves[k] != null) {
                    System.out.println("id:  " + actual.Claves[k].id);
                    System.out.println("Dato1: " + actual.Claves[k].Fecha);
                    System.out.println("Dato2: " + actual.Claves[k].Total);
                    System.out.println("\n");

                    escribeNodo(actual.Ramas[k]);
                    System.out.println("\n");
                }

            }
        }
    }
   
    public boolean ComparacionNombre(String raiz, String Nuevo) {
        boolean validar = false;
        if (raiz.length() > Nuevo.length()) {

            for (int i = 0; i < Nuevo.length(); i++) {

                if (raiz.codePointAt(i) > Nuevo.codePointAt(i)) {
                    validar = false;
                    break;
                } else if (raiz.codePointAt(i) < Nuevo.codePointAt(i)) {
                    validar = true;
                    break;
                } else {
                    //No hace NAda Xq No Deberian LLegar Iguales:
                }
            }

        } else if (raiz == Nuevo) {

        } else {
            for (int i = 0; i < raiz.length(); i++) {

                if (raiz.codePointAt(i) > Nuevo.codePointAt(i)) {
                    validar = false;
                    break;
                } else if (raiz.codePointAt(i) < Nuevo.codePointAt(i)) {
                    validar = true;
                    break;
                } else {
                    //no HAce Nada xq No Deveria Incertar Iguales
                }
            }
        }

        return validar;
    }
   
    public boolean BuscarDentro(String x) {
        boolean retorno = false;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                  //CONDICIONES CON LAS QUE BUSCA 
                    if (nodo.Claves[i - 1].id.equals(x) || nodo.Claves[i - 1].Fecha.equals(x)) {
                        retorno = true;
                    }

                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));

        return retorno;
    }

    public Nodo BuscarRetornandoNodo(String x) {
        Nodo temp = null;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();
        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                    if (nodo.Claves[i - 1].id.equals(x)) {

                        temp = nodo.Claves[i - 1];
                        break;
                    } else if (nodo.Claves[i - 1].Fecha.equals(x)) {
                        temp = nodo.Claves[i - 1];
                        break;
                    }
                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));

        return temp;
    }
    
     public String RetornaInformacionCancion(String x) {
          String envia = "";
        boolean retorno = false;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                    if (nodo.Claves[i - 1].id.equals(x)) {
                    envia = "Album: "+nodo.Claves[i - 1].Fecha +" Artistas: "+nodo.Claves[i - 1].Total;
                   
                    // }
                    }
                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));
        System.out.println("Salen " + envia);
        return envia;
    }
    
    public String Todo() {
        String envia = "";
        boolean retorno = false;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                    envia = envia + "," + nodo.Claves[i - 1].id;
                    System.out.println("imprime " + nodo.Claves[i - 1].id);
                    // }

                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));
        System.out.println("Salen " + envia);
        return envia;
    }
    
    public String TodoArtista() {
        String envia = "";
        boolean retorno = false;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                    envia = envia + "," + nodo.Claves[i - 1].Total;
                    System.out.println("imprime " + nodo.Claves[i - 1].id);
                    // }

                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));
        System.out.println("Salen " + envia);
        return envia;
    }
          
    public String TodoAlbum() {
        String envia = "";
        boolean retorno = false;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                  
                    envia = envia + "," + nodo.Claves[i - 1].Fecha;
                    System.out.println("imprime " + nodo.Claves[i - 1].id);
                    // }

                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));
        System.out.println("Salen " + envia);
        return envia;
    }

    public String BUSCARparaMODIFICAR(String x) {
        String envia = "";
        boolean retorno = false;
        int i = 0;
        Bnodo nodo = p;
        ListaSimpleB Pila = new ListaSimpleB();

        do {
            i = 0;
            while (!Vacio(nodo)) {
                Pila.InsertaFinal(nodo, i);
                nodo = nodo.Ramas[i];
            }
            if (!Pila.VaciaLista()) {
                i = Pila.UltimoNodo.indice;
                nodo = Pila.UltimoNodo.datos;
                Pila.EliminaFinal();
                i++;
                if (i <= nodo.Cuentas) {
                      envia = envia + "," + nodo.Claves[i - 1].id;
                    System.out.println("imprime " + nodo.Claves[i - 1].id);
                    // }

                    if (i < nodo.Cuentas) {
                        Pila.InsertaFinal(nodo, i);
                    }
                    nodo = nodo.Ramas[i];
                }
            }
        } while (!Pila.VaciaLista() || !Vacio(nodo));
        System.out.println("Salen " + envia);
        return envia;
    }
}
