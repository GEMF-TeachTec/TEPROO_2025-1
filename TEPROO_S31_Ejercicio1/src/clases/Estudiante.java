package clases;

public class Estudiante {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	private double promedio;
	
	//Constructor
	public Estudiante(String codigo, String nombre, double promedio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.promedio = promedio;
	}
	//Métodos de acceso (getters y setters)
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public double getPromedio() { return promedio; }
	public void setPromedio(double promedio) { this.promedio = promedio; }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Estudiante{codigo:'" + this.codigo + "', " +
						  "nombre:" + this.nombre + "', " +
						  "promedio:" + this.promedio + "}";
	}
}
