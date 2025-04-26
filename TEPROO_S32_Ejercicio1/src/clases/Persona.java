package clases;

public class Persona {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	private String direccion;
	private DNI documento;
	
	//Constructor
	public Persona(String codigo, String nombre, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	//Métodos de acceso
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getDireccion() { return direccion; }
	public void setDireccion(String direccion) { this.direccion = direccion; }

	//Realación de asociación con la clase DNI
	//Métodos de acceso para el objeto de tipo DNI
	public DNI getDocumento() { return documento; }
	public void setDocumento(DNI documento) { this.documento = documento; }
}
