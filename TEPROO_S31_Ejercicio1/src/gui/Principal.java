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
		
		codigo = leerCodigo(scan);
		
		System.out.println("Ingrese el nombre del estudiante: ");
		nombre = scan.nextLine();
		
		do {
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
			if(promedio < 0.0 || promedio > 20.0) {
				System.out.println("El promedio debe estar entre 0.0 y 20.0");
			}
		}while(promedio < 0.0 || promedio > 20.0);
		
		scan.close();
		
		//Proceso
		objEstudiante = new Estudiante(codigo, nombre, promedio);

		//Salida de resultados
		System.out.println(objEstudiante.toString());
	}
	
	public static String leerCodigo(Scanner scan) {
		String dato;

		do {
			System.out.println("Ingrese el código del estudiante: ");
			dato = scan.nextLine();
			
			if(dato.trim().length() != 9) {
				System.err.println("El código debe tener 9 caracteres");
			}
		}while( dato.trim().length() != 9 );
		
		return dato;
	}

}








