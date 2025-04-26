package hijos;

import padre.Transporte;

public class Avion extends Transporte {
	//Atributos de instancia
	private int motores;
	
	public Avion(String codigo, String nombre, int motores) {
		super(codigo, nombre);
		
		this.motores = motores;
	}
	
	//Sobrescribir el método de la clase padre 
	public String datosTransporte() {
		return "Datos no visibles.";
	}
}
