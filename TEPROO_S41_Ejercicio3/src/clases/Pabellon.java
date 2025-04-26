package clases;

import java.util.ArrayList;

public class Pabellon {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	
	private ArrayList<Aula> lstAulas;
	
	//Constructor
	public Pabellon(String codigo, String nombre, Aula[] aulas) {
		this.codigo = codigo;
		this.nombre = nombre;
		
		lstAulas = new ArrayList<Aula>();
		
		for(Aula objAula: aulas) {
			this.agregarAula(objAula);
		}
	}
	
	//Métodos de acceso
	public String getCodigo() { return codigo; }
	public String getNombre() { return nombre; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	//Agregar los métodos para gestionar la coleccion de aulas
	//Agregar, Obtener, Remover, Numero de elementos, Indice de elemento, Buscar, etc.
	public void agregarAula(Aula objAula) {
		//Construir un nuevo objeto Aula que será parte del todo
		Aula nuevaParte = new Aula(objAula.getCodigo(), objAula.getNombre() ); 
		lstAulas.add( nuevaParte );
	}
	
	public int numElementos() {
		return lstAulas.size();
	}
}
