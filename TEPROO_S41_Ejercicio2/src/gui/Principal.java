package gui;

import clases.Ingrediente;
import clases.Receta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingrediente ing1 = new Ingrediente("I001", "Pollo");
		Ingrediente ing2 = new Ingrediente("I002", "Arroz");
		Ingrediente ing3 = new Ingrediente("I003", "Choclo");
		Ingrediente ing4 = new Ingrediente("I001", "Cebolla");

		//Vamos a crear una receta para un plato
		Ingrediente[] arrozConPollo = new Ingrediente[3];
		arrozConPollo[0] = ing1;
		arrozConPollo[1] = ing2;
		arrozConPollo[2] = ing4;
		
		Receta objRecetaArrozConPollo = new Receta("R001", "Aroz con pollo", arrozConPollo);
		System.out.format("Arroz con pollo tiene %d ingredientes\n", objRecetaArrozConPollo.numElementos());
		
		//Vamos a crear una receta para otro plato
		Ingrediente[] arrozConChoclo = new Ingrediente[2];
		arrozConPollo[0] = ing2;
		arrozConPollo[1] = ing3;
		Receta objRecetaArrozConChoclo = new Receta("R002", "Aroz con choclo", arrozConChoclo);
		System.out.format("Arroz con choclo tiene %d ingredientes\n", objRecetaArrozConChoclo.numElementos());
	}
}
