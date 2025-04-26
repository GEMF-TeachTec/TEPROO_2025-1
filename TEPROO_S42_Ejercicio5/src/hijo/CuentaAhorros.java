package hijo;

import interfaces.Retiros;
import padre.CuentaBancaria;

public class CuentaAhorros extends CuentaBancaria implements Retiros {
	//Atributos de instancia
	private int cantidadRetiros;
	
	//Constructor
	public CuentaAhorros(String nroCuentaBancaria, String propietario, String moneda, double saldo,
			int cantidadRetiros) {
		super(nroCuentaBancaria, propietario, moneda, saldo);
		this.cantidadRetiros = cantidadRetiros;
	}

	@Override
	public String retirarDinero() {
		// TODO Auto-generated method stub
		return "Esta cuenta permite " + this.cantidadRetiros + " retiros.";
	}

	@Override
	public String mostrarInformacion() {
		// TODO Auto-generated method stub
		String data = "";
		data += "nroCuenta:" + super.nroCuentaBancaria + ",";
		data += "propietario:" + super.propietario + ",";
		data += super.generarIntereses() + ",";
		data += this.retirarDinero();
		return data;
	}

}
