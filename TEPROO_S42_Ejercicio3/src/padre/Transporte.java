package padre;

import interfaces.Movimiento;

public abstract class Transporte implements Movimiento{
	//Atributos protegidos para la relación de herencia
	protected String codigo;
	protected String nombre;
	
	//Constructor
	public Transporte(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public String datosTransporte() {
		String data = "codigo:" + this.codigo + ",nombre:" + this.nombre; 
		return data;
	}
	
	//Declarando un  método abstracto
	public abstract String recorrido();
}
