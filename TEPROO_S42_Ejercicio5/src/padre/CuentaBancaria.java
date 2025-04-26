package padre;

import interfaces.Intereses;

public abstract class CuentaBancaria implements Intereses {
	//Atributos de instancia
	protected String nroCuentaBancaria;
	protected String propietario;
	protected String moneda;
	protected double saldo;
	
	//Constructor
	public CuentaBancaria(String nroCuentaBancaria, String propietario, String moneda, double saldo) {
		this.nroCuentaBancaria = nroCuentaBancaria;
		this.propietario = propietario;
		this.moneda = moneda;
		this.saldo = saldo;
	}
	
	//Método abstracto que deben implementar las clases hijas
	public abstract String mostrarInformacion();

	//Método que la interfaz exige implementar
	@Override
	public String generarIntereses() {
		// TODO Auto-generated method stub
		return "Esta cuenta genera intereses";
	}


}
