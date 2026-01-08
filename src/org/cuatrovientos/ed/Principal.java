package org.cuatrovientos.ed;

public class Principal {

	public static void main(String[] args) {
		User usr1 = new User();
		User usr2 = new User();
		
		//Usuario 1 añade productos a su lista
		usr1.lista.addProducto("Arroz");
		usr1.lista.addProducto("Pasta");
		usr1.lista.addProducto("Frijoles");
		usr1.lista.addProducto("Cuscus");
		usr1.lista.addProducto("Quinoa");
		
		System.out.println(usr1.lista.getAll());
		
		usr1.lista.removeProducto("Pasta");
		usr1.lista.addProducto("Pan");
		
		System.out.println(usr1.lista.getAll());
		

	}

}
