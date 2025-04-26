package gui;

import hijo.CuentaAhorros;
import hijo.CuentaPlazos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaAhorros ctaAhorros = new CuentaAhorros("0012531458", "Pedro Navaja", "Soles", 250.14, 4);
		System.out.println(ctaAhorros.mostrarInformacion());
		
		CuentaPlazos ctaPlazos = new CuentaPlazos("1125365685", "Juanito Alimaña", "Dólares", 36.14, 36);
		System.out.println(ctaPlazos.mostrarInformacion());
	}

}
