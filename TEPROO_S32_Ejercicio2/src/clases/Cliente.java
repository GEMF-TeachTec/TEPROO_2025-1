package clases;

import java.util.ArrayList;

public class Cliente {
	//Atributos de instancia
	private String codigo;
	private String nombre;
	private String direccion;
	private ArrayList<Factura> facturas;
	
	//Constructor
	public Cliente(String codigo, String nombre, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		
		//Inicializar el array
		facturas = new ArrayList<Factura>();
	}
	
	//Métodos de acceso
	public String getCodigo() { return codigo; }
	public String getNombre() { return nombre; }
	public String getDireccion() { return direccion; }
	
	public void setCodigo(String codigo) { this.codigo = codigo; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setDireccion(String direccion) { this.direccion = direccion; }
	
	//Concretar la relación de asociación con lo objetos de tipo Factura
	//Agregar un elemento a la colección. El ingreso es en cola.
	public void agregarFactura(Factura objFactura) {
		facturas.add(objFactura);
	}
	
	//Obtener una referencia a un objeto según su posicón (indice).
	public Factura obtenerFactura(int indice) {
		return facturas.get(indice);
	}
	
	//Remover un elemento por su posicón (indice). El elemento removido es devuelto.
	public Factura eliminarFactura(int indice) {
		return facturas.remove(indice);
	}

	//Remover un elemento por su referencia (direccion de memoria). Devuelve true si es eliminado.
	public boolean eliminarFactura(Factura objFactura) {
		return facturas.remove(objFactura);
	}
	
	//Reemplaza un elemento por su posición (indice). Devuelve el objeto reemplazado.
	public Factura reemplazarFactura(int indice, Factura objFactura) {
		return facturas.set(indice, objFactura);
	}
	
	//Devuel el índice del elemento recibido como parámetro.
	public int obtenerIndice(Factura objFactura) {
		return facturas.indexOf(objFactura);
	}
	
	public int numElementos() {
		return facturas.size();
	}
	
	public Factura buscarPorNumero(String numero) {
		for(Factura objFactura: facturas) {
			if(objFactura.getNumero().equals(numero)) {
				return objFactura; //Retornar objeto encontrado
			}
		}
		
		//Retorno por defecto
		return null;
	}
	
	public void mostrarFacturas() {
		for(Factura objFactura: facturas) {
			System.out.format("numero:%s, fecha:%s\n", objFactura.getNumero(), objFactura.getFecha());
		}
	}	
}
