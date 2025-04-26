package clases;

public class Ingrediente {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	
	//Constructor
	public Ingrediente(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	//Métodos de acceso
	public String getCodigo() { return codigo; }
	public String getNombre() { return nombre; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}
