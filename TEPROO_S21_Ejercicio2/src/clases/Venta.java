package clases;

public class Venta {
	//Atributos miembro
	private int codigo;
	private String nombre;
	private double sueldoBase;
	private double comision;
	private double montoVendido;
	
	//Métodos miembro
	public double montoPagar() {
		return sueldoBase + (comision * montoVendido);
	}
	
	//Métodos de acceso
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public double getMontoVendido() {
		return montoVendido;
	}
	public void setMontoVendido(double montoVendido) {
		this.montoVendido = montoVendido;
	}
}
