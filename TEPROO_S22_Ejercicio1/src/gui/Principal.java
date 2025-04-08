package gui;

import clases.Terreno;

public class Principal {

	public static void main(String[] args) {
		Terreno lote1 = new Terreno("T0125", "Naplo", 500, 1500, 350);
		
		System.out.println("Datos del terreno: " + lote1.datosTerreno());
		System.out.println("Valor comercial: " + lote1.valorComercial());
		System.out.println("Valor comercial: " + lote1.valorPredial());
		System.out.println("Comisión vendedor (2.5%): " + lote1.calcularComision(0.025) );
		System.out.println("Comisión vendedor (1.5%): " + lote1.calcularComision(0.015) );
	}
}
