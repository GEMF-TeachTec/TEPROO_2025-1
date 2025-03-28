package gui;

import java.util.Scanner;

import clases.Trabajador;

public class Principal {

	public static void main(String[] args) {
		//Declaración de variables
		Trabajador objTrabajador = new Trabajador();
		double sueldoBruto, pDscto, descuento, sueldoNeto;
		
		//Entrada de datos
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el código del trabajador: ");
		objTrabajador.codigo = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Ingrese el nombre del trabajador: ");
		objTrabajador.nombre = scan.nextLine();

		System.out.print("Ingrese las horas del trabajador: ");
		objTrabajador.horasTrabajadas = scan.nextInt();

		System.out.print("Ingrese la tarifa del trabajador: ");
		objTrabajador.tarifaHoraria = scan.nextDouble();
		scan.close();
		
		//Proceso
		sueldoBruto = objTrabajador.calcularSueldoBruto();
		pDscto = objTrabajador.determinarPrctjDescuento();
		descuento = objTrabajador.calcularDescuento();
		sueldoNeto = objTrabajador.calcularSueldoNeto();
		
		//Salida de resultados
		System.out.println("Resultados:");
		System.out.printf("Sueldo Bruto: %,.2f\n", sueldoBruto);
		System.out.printf("Descuento (%.2f%%): %,.2f\n", (pDscto * 100), descuento);
		System.out.printf("Sueldo Bruto: %,.2f\n", sueldoNeto);
	}

}
