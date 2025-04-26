package clases;

import java.util.ArrayList;

public class Receta {
	//Atributos de instancia
	private String nombre;
	private ArrayList<Ingrediente> lstIngredientes;
	
	//Constructor
	public Receta(String nombre, Ingrediente[] ingredientes) {
		this.nombre = nombre;
		
		//Construir la lista de ingredientes
		lstIngredientes = new ArrayList<Ingrediente>();
		
		for(Ingrediente objIngrediente: ingredientes) {
			this.agregar(objIngrediente);
		}
	}
	
	//Métodos de acceso
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	//Métodos para gestionar los elementos de la lista
	public void agregar(Ingrediente objIngrediente) {
		lstIngredientes.add(objIngrediente);
	}
	
	public Ingrediente obtener(int indice) {
		return lstIngredientes.get(indice);
	}
	
	public Ingrediente eliminar(int indice) {
		return lstIngredientes.remove(indice);
	}
	
	public int numElementos() {
		return lstIngredientes.size();
	}
	
	public Ingrediente buscar(String nombre) {
		for(Ingrediente objIngrediente: this.lstIngredientes){
			if(objIngrediente.getNombre().equals(objIngrediente)) {
				return objIngrediente;
			}
		}
		
		return null;
	}
}
