package gui;

import arreglos.ArregloEstudiantes;
import clases.Estudiante;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArregloEstudiantes lstEstudiantes = new ArregloEstudiantes();
		
		Estudiante objEst1 = new Estudiante("EST001", "Pedro Navaja", 17, 19);
		Estudiante objEst2 = new Estudiante("EST002", "Juanito Alimaña", 17, 19);
		
		lstEstudiantes.agregarEstudiante(objEst1);
		lstEstudiantes.agregarEstudiante(objEst2);
		

	}

}
