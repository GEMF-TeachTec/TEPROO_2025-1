package clases;

public class Venta {
	//Atributos miembro
	private int codigo;
	private String nombre;
	private double sueldoBase;
	private double comision;
	private double montoVendido;
	
	//Atributo de clase
	private static int contadorObjetos = 0;
	
	//Constructor
	public Venta(int codigo) {
		this(codigo, null);
	}
	
	public Venta(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		contadorObjetos++;
	}
	
	//Métodos miembro
	public String datosVenta() {
		String data = "";
		data += "Código: " + this.codigo + ", "; 
		data += "Nombre: " + this.nombre + ", "; 
		data += "Sueldo Base: " + this.sueldoBase + ", "; 
		data += "Comisión: " + this.comision + ", "; 
		data += "MontoVendido: " + this.montoVendido; 
		return data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return datosVenta();
	}
	
	public double montoPagar() {
		return sueldoBase + (comision * montoVendido);
	}
	
	public double montoPagar(double comision) {
		return sueldoBase + (comision * montoVendido);
	}
	
	//Métodos de acceso
	public static int getContadorObjetos() {
		return contadorObjetos;
	}
	public int getCodigo() {
		return codigo;
	}
/*
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
*/
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
