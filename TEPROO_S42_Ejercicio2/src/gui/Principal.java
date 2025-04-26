package gui;

import hijos.Automovil;
import hijos.Avion;
import padre.Transporte;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Transporte a = new Transporte("001", "Optimus Prime");
		//System.out.println(a.datosTransporte());
		
		Automovil auto = new Automovil("002", "Orion", "BWM", "Combi");
		System.out.println( auto.datosTransporte() );

		Avion avion = new Avion("003", "Boeing", 4);
		System.out.println( avion.datosTransporte() );
	}

}
