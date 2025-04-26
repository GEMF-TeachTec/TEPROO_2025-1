package arreglos;

import java.util.ArrayList;
import clases.Estudiante;

public class ArregloEstudiantes {
	
	private ArrayList<Estudiante> arrEstudiantes;

	public ArregloEstudiantes() {
		this.arrEstudiantes = new ArrayList<Estudiante>();
	}
	
	//Métodos para gestionar la lista de estudiantes
	public void agregarEstudiante(Estudiante objEst) {
		arrEstudiantes.add(objEst);
	}
	
	public Estudiante obtenerEstudiante(int indice) {
		return arrEstudiantes.get(indice);
	}
	
	public int cantidadEstudiantes() {
		return arrEstudiantes.size();
	}
	
	public Estudiante removerEstudiante(int indice) {
		return arrEstudiantes.remove(indice);
	}
	
	public boolean removerEstudiante(Estudiante objEst) {
		return arrEstudiantes.remove(objEst);
	}
	
	public Estudiante buscarPorCodigo(String codigo) {
		for (Estudiante objEst: arrEstudiantes) {
			if(objEst.getCodigo().equals(codigo)) {
				return objEst;
			}
		}
		return null;
	}

}


