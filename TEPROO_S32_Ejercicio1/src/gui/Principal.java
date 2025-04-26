package gui;

import clases.DNI;
import clases.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona objPer = new Persona("666", "Pedro Navaja", "Lima centro");
		DNI objDNI = new DNI("96857432", "15/02/1999", "15/02/2009");
		
		//Asociando los objetos
		objPer.setDocumento(objDNI);
		System.out.println("Codigo: " + objPer.getCodigo());
		System.out.println("Nombre: " + objPer.getNombre());
		System.out.println("DNI: " + objPer.getDocumento().getNumero());
		System.out.println("DNI: " + objPer.getDocumento());
		
		objDNI.setPropietario(objPer);
		System.out.println("Numero: " + objDNI.getNumero());
		System.out.println("Propietario: " + objDNI.getPropietario().getNombre());
		

	}

}
