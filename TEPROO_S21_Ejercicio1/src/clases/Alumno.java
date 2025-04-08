package clases;

public class Alumno {
	//Atributos miembro con modificadores de acceso público
	private String codigo;
	private String nombre;
	private int nota1;
	private int nota2;
	
	//Métodos de acceso (setters y getters)
	public void setCodigo(String cod) { codigo = cod; }
	
	public String getCodigo() { return codigo; }
	
	public void setNombre(String nom) { nombre = nom; }

	public String getNombre() { return nombre; }
	
	public void setNota1(int n1) { nota1 = n1; }
	
	public int getNota1() { return nota1; }

	public void setNota2(int n2) {
		nota2 = n2;
	}

	public int getNota2() {
		return nota2;
	}
	
	//Métodos miembro
	public double calcularPromedio() {
		return (nota1 + nota2) / 2.0;
	}

}
