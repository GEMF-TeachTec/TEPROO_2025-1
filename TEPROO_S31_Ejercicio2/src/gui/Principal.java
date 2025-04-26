package gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Estudiante;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		String codigo, nombre;
		double promedio;
		Estudiante objEstudiante;

		//Entrada de datos
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el código del estudiante: ");
		codigo = scan.nextLine();
		
		System.out.println("Ingrese el nombre del estudiante: ");
		nombre = scan.nextLine();
		
		try {
			System.out.println("Ingrese el promedio del estudiante: ");
			promedio = scan.nextDouble();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("El dato ingresado no es un valor numérico real.");
			scan.nextLine();
			promedio = -1;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error inesperado! Auxilio!!!!");
			e.printStackTrace();
			scan.nextLine();
			promedio = -1;
		}
		
		scan.close();
		
		//Proceso
		try {
			objEstudiante = new Estudiante(codigo, nombre, promedio);

			//Salida de resultados
			System.out.println(objEstudiante.toString());
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.err.println("Error al crear el objeto." + e.getMessage());
		}
	}
}








