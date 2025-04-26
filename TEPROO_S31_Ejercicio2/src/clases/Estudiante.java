package clases;

public class Estudiante {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	private double promedio;
	
	//Constructor
	public Estudiante(String codigo, String nombre, double promedio) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setPromedio(promedio);
	}
	//Métodos de acceso (getters y setters)
	public String getCodigo() { return codigo; }
	public String getNombre() { return nombre; }
	public double getPromedio() { return promedio; }
	
	
	private void setCodigo(String codigo) {
		if(codigo == null || codigo.trim().isEmpty()) {
			throw new IllegalArgumentException("El código no puede ser nulo o estar vacío.");
		}
		if(codigo.trim().length() != 9) {
			throw new IllegalArgumentException("El código debe tener 9 caracteres.");
		}
		this.codigo = codigo; 
	}
	
	public void setNombre(String nombre) { 
		if(nombre == null || nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacío.");
		}
		this.nombre = nombre; 
	}
	
	public void setPromedio(double promedio) { 
		if(promedio < 0.0 || promedio > 20.0) {
			throw new IllegalArgumentException("El promedio debe estar entre 0.0 y 20.0");
		}
		this.promedio = promedio; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Estudiante{codigo:'" + this.codigo + "', " +
						  "nombre:" + this.nombre + "', " +
						  "promedio:" + this.promedio + "}";
	}
}
