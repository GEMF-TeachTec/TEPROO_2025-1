package clases;

public class Terreno {
	//Atributos miembro o de instancia
	private String codigo;
	private String ubicacion;
	private double area;
	private double valorMt2Comercial;
	private double valorMt2Predial;
	
	//Constructor
	public Terreno(String codigo, String ubicacion, double area, double valorMt2Comercial, double valorMt2Predial) {
		this.codigo = codigo;
		this.ubicacion = ubicacion;
		this.area = area;
		this.valorMt2Comercial = valorMt2Comercial;
		this.valorMt2Predial = valorMt2Predial;
	}
	
	//Setters y Getters
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }

	public String getUbicacion() { return ubicacion; }
	public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

	public double getArea() { return area; }
	public void setArea(double area) { this.area = area; }

	public double getValorMt2Comercial() { return valorMt2Comercial; }
	public void setValorMt2Comercial(double valorMt2Comercial) { this.valorMt2Comercial = valorMt2Comercial; }

	public double getValorMt2Predial() { return valorMt2Predial; }
	public void setValorMt2Predial(double valorMt2Predial) { this.valorMt2Predial = valorMt2Predial;}
	
	//Método miembro o de instancia
	public String datosTerreno() {
		String datos = "";
		
		datos += "codigo:" + this.codigo + ", ";
		datos += "ubicacion:" + this.ubicacion + ", ";
		datos += "area:" + this.area + ", ";
		datos += "valorMt2Comercial:" + this.valorMt2Comercial + ", ";
		datos += "valorMt2Predial:" + this.valorMt2Predial;
		
		return datos;
	}
	
	public double valorPredial() {
		return this.area * this.valorMt2Predial;
	}

	public double valorComercial() {
		return this.area * this.valorMt2Comercial;
	}

	public double margenGanancia() {
		return this.valorComercial() - this.valorPredial();
	}
	
	public double calcularComision(double pComision) {
		return this.valorComercial() * pComision;
	}
}










