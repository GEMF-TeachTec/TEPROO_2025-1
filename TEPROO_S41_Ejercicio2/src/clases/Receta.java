package clases;

import java.util.ArrayList;

public class Receta {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	private ArrayList<Ingrediente> lstIngredientes;
	
	//Constructor
	public Receta(String codigo, String nombre, Ingrediente[] ingredientes) {
		this.codigo = codigo;
		this.nombre = nombre;
		
		//Lista que va a contener las partes del todo
		lstIngredientes = new ArrayList<Ingrediente>();
		
		//Aquí se concreta la relación de AGREGACIÓN.
		//El TODO nace con sus PARTES
		for(Ingrediente objIngediente: ingredientes) {
			this.agregarIngrediente(objIngediente);
		}
	}
	
	//Métodos de acceso
	public String getCodigo() { return codigo; }
	public String getNombre() { return nombre; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	//Agregar los métodos necesarios para gestionar la colección de ingredientes:
	//Agregar, Obtener, Remover, Buscar, Tamaño de colección, Indiced de elemento, entre otros...
	public void agregarIngrediente(Ingrediente objIngrediente) {
		lstIngredientes.add(objIngrediente);
	}
	public int numElementos() {
		return lstIngredientes.size();
	}
	//...
}
