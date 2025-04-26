package clases;

public class Ingrediente {
	//Atributos de instancia
	private String nombre;
	private String cantidad;
	private TipoIngrediente tipoIngrediente;
	
	//Constructor
	public Ingrediente(String nombre, String cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	//Métodos de acceso
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public String getCantidad() { return cantidad; }
	public void setCantidad(String cantidad) { this.cantidad = cantidad; }

	//Implementación de la Asociación Ingrediente -> TipoIngrediente
	public TipoIngrediente getTipoIngrediente() { return tipoIngrediente; }
	public void setTipoIngrediente(TipoIngrediente tipoIngrediente) { this.tipoIngrediente = tipoIngrediente; }
}
