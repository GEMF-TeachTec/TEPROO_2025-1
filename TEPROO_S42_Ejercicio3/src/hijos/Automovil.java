package hijos;

import padre.Transporte;

public class Automovil extends Transporte{
	//Atributos de instancia
	private String marca;
	private String modelo;
	
	public Automovil(String codigo, String nombre, String marca, String modelo) {
		//Invocando al constructor de la clase padre
		super(codigo, nombre);
		
		//Seteando atributos propios
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Sobrescribir el método de la clase padre
	public String datosTransporte() {
		String data = super.datosTransporte();
		data += ",marca:" + this.marca + "modelo:" + this.modelo;
		return data;
	}

	//Implementación de un  método abstracto
	@Override
	public String recorrido() {
		// TODO Auto-generated method stub
		return "Lima - Chosica";
	}

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		
	}

}
