package clases;

public class Producto {
	//Atributos de instancia
	private int codigo;
	private String nombre;
	private int cantidad;
	private int categoria;
	private double precio;
	
	private static int contadorProductos;
	
	static {
		contadorProductos = 0;
	}

	//Constructores
	public Producto(int codigo, String nombre, int cantidad, int categoria, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.categoria = categoria;
		this.precio = precio;
		Producto.contadorProductos++;
	}

	public Producto(int codigo, String nombre) {
		this(codigo, nombre, 0, 0, 0);
	}

	//Métodos setters y getters
	public int getCodigo() { return codigo; }
	public void setCodigo(int codigo) { this.codigo = codigo; }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public int getCantidad() { return cantidad; }
	public void setCantidad(int cantidad) { this.cantidad = cantidad; }

	public int getCategoria() { return categoria; }
	public void setCategoria(int categoria) { this.categoria = categoria; }

	public double getPrecio() { return precio; }
	public void setPrecio(double precio) { this.precio = precio; }

	public static int getContadorProductos() { return contadorProductos; }
	
	//Métodos de instancia
	public String datosProducto() {
		String datos = "";
		datos += "codigo:" + this.codigo + ", ";
		datos += "nombre:" + this.nombre + ", ";
		datos += "cantidad:" + this.cantidad + ", ";
		datos += "categoria:" + this.categoria + ", ";
		datos += "precio:" + this.precio;
		return datos;
	}
	
	public double descuentoPrecio() {
		double descuento;
		
		switch(this.categoria) {
		case 0: descuento = 0.035; break;
		case 1: descuento = 0.050; break;
		case 2: descuento = 0.025; break;
		default: descuento = 0.0;
		}
		
		return descuento * this.precio;
	}

	public double impuestoPrecio() {
		return (this.precio - descuentoPrecio()) * 0.18;
	}

	public double precioFinal() {
		return this.precio - descuentoPrecio() + impuestoPrecio();
	}
}








