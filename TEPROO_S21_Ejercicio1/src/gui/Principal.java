package gui;

import clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		//Declaración de variable del tipo de la clase
		Alumno alumno1;
		
		//Construyendo el objeto en la variable
		alumno1 = new Alumno();
		
		//Asignar valores a los atributos del objeto
		alumno1.setCodigo("N012587");
		alumno1.setNombre("Pedro Navaja");
		alumno1.setNota1(17);
		alumno1.setNota2(9);
		
		//Segundo objeto
		Alumno alumno2 = new Alumno();
		alumno2.setCodigo("N666666");
		alumno2.setNombre("Juanito Alimaña");
		alumno2.setNota1(18);
		alumno2.setNota2(19);
		
		System.out.println("Alumno 1: " + alumno1);
		System.out.println("Código: " + alumno1.getCodigo());
		System.out.println("Promedio alumno 1: " + alumno1.calcularPromedio());
		System.out.println("Alumno 2: " + alumno2);
		System.out.println("Código: " + alumno2.getCodigo());
		System.out.println("Promedio alumno 2: " + alumno2.calcularPromedio());
	}

}
