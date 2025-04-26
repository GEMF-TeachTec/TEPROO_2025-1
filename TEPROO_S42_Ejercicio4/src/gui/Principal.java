package gui;

import clases.Ingrediente;
import clases.Receta;
import clases.TipoIngrediente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoIngrediente tipo1 = new TipoIngrediente("Tubérculo", "Carbohidrato");
		TipoIngrediente tipo2 = new TipoIngrediente("Carne blanca", "Proteína");
		
		Ingrediente ing1 = new Ingrediente("Papa blanca", "2 unidades");
		ing1.setTipoIngrediente(tipo1);
		
		Ingrediente ing2 = new Ingrediente("Papa negra", "1 unidad");
		ing2.setTipoIngrediente(tipo1);
		
		Ingrediente ing3 = new Ingrediente("Pollo", "1 pechuga");
		ing3.setTipoIngrediente(tipo2);
		
		Ingrediente[] polloConPapas = new Ingrediente[3];
		polloConPapas[0] = ing1;
		polloConPapas[1] = ing2;
		polloConPapas[2] = ing3;
		
		Receta receta = new Receta("Pollo con papas", polloConPapas);
	}

}
