package gui;

import clases.Venta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variable del tipo de la clase
		Venta venta1;
		
		//Construyendo el objeto en la variable
		venta1 = new Venta(666);
		
		//Asignar valores a los atributos del objeto
		//venta1.setCodigo(100);
		venta1.setNombre("Pedro Navaja");
		venta1.setSueldoBase(2300);
		venta1.setComision(0.15);
		venta1.setMontoVendido(8500);
		
		System.out.println("Datos Venta: " + venta1);
		//System.out.println(venta1.datosVenta());
		System.out.println("Monto a pagar: " + venta1.montoPagar());
		System.out.println("Monto a pagar: " + venta1.montoPagar(0.20));
		System.out.println("Objetos creados: " + Venta.getContadorObjetos());

		Venta venta2 = new Venta(999);
		Venta venta3 = new Venta(777);
		Venta venta4 = new Venta(888);
	
		System.out.println("Objetos creados: " + Venta.getContadorObjetos());
	
	
	}
}
