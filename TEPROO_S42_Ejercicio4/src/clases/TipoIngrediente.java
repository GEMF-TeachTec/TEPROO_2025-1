package clases;

public class TipoIngrediente {
	//Atributos de instancia
	private String nombre;
	private String procedencia;
	
	//Constructor
	public TipoIngrediente(String nombre, String procedencia) {
		this.nombre = nombre;
		this.procedencia = procedencia;
	}

	//Métodos de acceso
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getProcedencia() { return procedencia; }
	public void setProcedencia(String procedencia) { this.procedencia = procedencia; }
}
