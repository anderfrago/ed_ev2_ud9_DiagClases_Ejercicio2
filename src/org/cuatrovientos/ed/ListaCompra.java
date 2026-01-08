package org.cuatrovientos.ed;

import java.util.Iterator;

public class ListaCompra {
	
	private String[] productos;
	private static final int MAX_PRODUCTS = 100;
	
	public ListaCompra() {
		this.productos = new String[this.MAX_PRODUCTS];		
	}
		
	//añadir
	public boolean addProducto(String elemento) {
		// Si la lista NO está llena
		if(productos[this.productos.length-1] == null) {
			// Añadir el elemento en la última posición
			for (int i = 0; i < productos.length; i++) {
				// Si la posicón está vacía..
				if(productos[i] ==  null) {
					// añadir
					this.productos[i] = elemento;
					return true;
				}
			}							
		}		
		// en caso contrario, la lista está llena
		return false;
	}
	
	//quitar
	public boolean removeProducto(String elemento) {
		// Si la lista NO está llena
		if(productos[this.productos.length-1] == null) {
			// Añadir el elemento en la última posición
			for (int i = 0; i < productos.length; i++) {
				// Si la posición está vacía..
				if(productos[i] ==  elemento) {
					// quitar
					this.productos[i] = null;
					return true;
				}
			}							
		}		
		// en caso contrario, la lista está llena
		return false;
	}
		
	
	//mostrartodo
	public String getAll() {
		String resultado = "";		
		for (String temporal : productos) {
			if(temporal != null)
				resultado = resultado + temporal + "\n";
		}
		return resultado;		
	}
	
	
	

}
