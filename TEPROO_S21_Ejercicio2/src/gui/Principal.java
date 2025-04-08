package gui;

import clases.Venta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variable del tipo de la clase
		Venta venta1;
		
		//Construyendo el objeto en la variable
		venta1 = new Venta();
		
		//Asignar valores a los atributos del objeto
		venta1.setCodigo(100);
		venta1.setNombre("Pedro Navaja");
		venta1.setSueldoBase(2300);
		venta1.setComision(0.15);
		venta1.setMontoVendido(8500);
		
		System.out.println("Venta: " + venta1);
		System.out.println("Código: " + venta1.getCodigo());
		System.out.println("Monto a pagar: " + venta1.montoPagar());
	}

}
