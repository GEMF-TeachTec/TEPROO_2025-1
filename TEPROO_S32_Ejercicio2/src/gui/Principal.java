package gui;

import clases.Cliente;
import clases.Factura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura objF1 = new Factura("N001", "15-02-2024");
		Factura objF2 = new Factura("N002", "25-02-2024");
		Factura objF3 = new Factura("N003", "18-02-2024");
		Factura objF4 = new Factura("N004", "20-02-2024");
		Factura objF5 = new Factura("N005", "05-03-2024");
		
		Cliente objCli1 = new Cliente("666", "Pedro Navaja", "Los Sauces");
		Cliente objCli2 = new Cliente("333", "Juanito Alimaña", "Las Perdices");
		
		//Asociar los objetos (bidireccional)
		objF1.setCliente(objCli2);
		objCli2.agregarFactura(objF1);
		
		objF2.setCliente(objCli1);
		objCli1.agregarFactura(objF2);
		
		objF3.setCliente(objCli1);
		objCli1.agregarFactura(objF3);
		
		objF4.setCliente(objCli2);
		objCli2.agregarFactura(objF4);
		
		objF5.setCliente(objCli1);
		objCli1.agregarFactura(objF5);
		
		//Probar las asociaciones
		System.out.println("-- Listar cada factura con el enombre de su cliente --");
		System.out.format("Cliente del objeto Factura 1: %s\n",objF1.getCliente().getNombre());
		System.out.format("Cliente del objeto Factura 2: %s\n",objF2.getCliente().getNombre());
		System.out.format("Cliente del objeto Factura 3: %s\n",objF3.getCliente().getNombre());
		System.out.format("Cliente del objeto Factura 4: %s\n",objF4.getCliente().getNombre());
		System.out.format("Cliente del objeto Factura 5: %s\n",objF5.getCliente().getNombre());
		System.out.println("");
		
		System.out.println("-- Listar las facturas del cliente 1--");
		System.out.format("Numero de la primera factura del Cliente 1: %s\n", objCli1.obtenerFactura(0).getNumero());
		System.out.format("Numero de la primera factura del Cliente 1: %s\n", objCli1.obtenerFactura(1).getNumero());
		System.out.format("Numero de la primera factura del Cliente 1: %s\n", objCli1.obtenerFactura(2).getNumero());
		System.out.println("");
		
		System.out.println("-- Listar en consola las facturas del cliente 2--");
		objCli2.mostrarFacturas();
	}

}
