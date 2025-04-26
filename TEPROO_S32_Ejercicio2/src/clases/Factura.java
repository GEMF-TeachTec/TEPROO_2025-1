package clases;

public class Factura {
	//Atributos de instancia
	private String numero;
	private String fecha;
	private Cliente cliente;
	
	//Constructor
	public Factura(String numero, String fecha) {
		this.numero = numero;
		this.fecha = fecha;
	}
	
	//Métodos de acceso
	public String getNumero() { return numero; }
	public String getFecha() { return fecha; }

	public void setNumero(String numero) { this.numero = numero; }
	public void setFecha(String fecha) { this.fecha = fecha; }
	
	//Agregar setter y getter para consolidar la relación de asociación con Cliente
	public Cliente getCliente() { return cliente; }
	public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
