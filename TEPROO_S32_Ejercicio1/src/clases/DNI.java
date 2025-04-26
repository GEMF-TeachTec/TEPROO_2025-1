package clases;

public class DNI {
	//Atributos de instanci
	private String numero;
	private String emision;
	private String caducidad;
	private Persona propietario;
	
	//Constructor
	public DNI(String numero, String emision, String caducidad) {
		this.numero = numero;
		this.emision = emision;
		this.caducidad = caducidad;
	}
	//Métodos de acceso

	public String getNumero() { return numero; }
	public void setNumero(String numero) { this.numero = numero; }
	public String getEmision() { return emision; }
	public void setEmision(String emision) { this.emision = emision; }
	public String getCaducidad() { return caducidad; }
	public void setCaducidad(String caducidad) { this.caducidad = caducidad; }

	//Realación de asociación con la clase Persona
	//Métodos de acceso para el objeto de tipo Persona
	public Persona getPropietario() { return propietario; }
	public void setPropietario(Persona propietario) { this.propietario = propietario; }
}
