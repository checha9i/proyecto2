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
public class ListaSimpleB {
    NodosLista PrimerNodo;
    NodosLista UltimoNodo;
    
    public boolean VaciaLista(){
		return PrimerNodo ==null;
	}
	public ListaSimpleB(String s){
		PrimerNodo=UltimoNodo=null;
	}
	public ListaSimpleB(){
		this ("Lista");
	}
	//Inserta un elemento al frente de la lista (solo prestamos)
	void InsertaInicio(Bnodo ElemInser,int ind){
		if(VaciaLista())
			PrimerNodo=UltimoNodo=new NodosLista(ElemInser,ind);
		else
			PrimerNodo=new NodosLista(ElemInser, PrimerNodo,ind);
	}
	//Inserta al final de la lista (solo prestamos)
	public void InsertaFinal(Bnodo ElemInser,int ind){
		if(VaciaLista()){
			PrimerNodo= UltimoNodo = new NodosLista (ElemInser,ind);
	    }
		else{
			UltimoNodo=UltimoNodo.siguiente=new NodosLista(ElemInser,ind);
	    }
	}
	//Elimina al final (todos)
	public void EliminaFinal(){
    	if (VaciaLista())
      		System.out.println ("No hay elementos");
		if (PrimerNodo.equals (UltimoNodo))
      		PrimerNodo = UltimoNodo = null;
    	else{
    		NodosLista Actual =PrimerNodo;
      		while (Actual.siguiente != UltimoNodo)
          		Actual = Actual.siguiente;
			UltimoNodo =Actual;
      		Actual.siguiente = null;
    	}
	}	
	//Inserta al final de la lista (normal)
	public void InsertaFinal(String ElemInser){
		if(VaciaLista()){
			PrimerNodo= UltimoNodo = new NodosLista (ElemInser);
	    }
		else{
			UltimoNodo=UltimoNodo.siguiente=new NodosLista(ElemInser);
	    }
	}
	//Elimina al Inicio (todos)
	public void EliminaInicio(){
		if(VaciaLista())
			System.out.println("No hay elementos");
		else
			if(PrimerNodo.equals(UltimoNodo))
				PrimerNodo=UltimoNodo=null;
			else
				PrimerNodo=PrimerNodo.siguiente;
	}
	// Largo
	public void Largo(){
		NodosLista aux=PrimerNodo;
		int Lar =0;
		while (aux!= null){
	  		Lar++;
	  		aux =aux.siguiente;
    	}
    	System.out.println ( "El largo de la Lista es: "+ Lar);
	}
	//Imprimir
	void Imprimir(){
		NodosLista m=PrimerNodo;
		String k;
		while(m!=null){
			k=String.valueOf(m.letra);
			if(k.equals("#"))
				System.out.print(" ");
			else{
				System.out.print(m.letra);
			}
			m=m.siguiente;
		}
		System.out.println("");
	}
}
