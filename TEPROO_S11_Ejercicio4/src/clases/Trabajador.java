package clases;

public class Trabajador {
	//Atributos miembro
	public int codigo;
	public String nombre;
	public int horasTrabajadas;
	public double tarifaHoraria;
	
	//Métodos miembro
	public double calcularSueldoBruto() {
		return horasTrabajadas * tarifaHoraria;
	}

	//Métodos miembro
	public double determinarPrctjDescuento() {
		double pDscto;
		double suelBruto = calcularSueldoBruto();
		
		if(suelBruto < 4000) {
			pDscto = 0.10;
		}else if(suelBruto < 7000) {
			pDscto = 0.13;
		}else {
			pDscto = 0.15;
		}
		
		return pDscto;
	}

	public double calcularDescuento() {
		return determinarPrctjDescuento() * calcularSueldoBruto();
	}

	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - calcularDescuento();
	}
}
