package hijos;

import interfaces.Volar;
import padre.Transporte;

public class Avion extends Transporte implements Volar {
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

	@Override
	public String recorrido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ascender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descender() {
		// TODO Auto-generated method stub
		
	}
}
