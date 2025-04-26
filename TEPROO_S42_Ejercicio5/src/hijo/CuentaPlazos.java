package hijo;

import padre.CuentaBancaria;

public class CuentaPlazos extends CuentaBancaria {
	//Atributos de instancia
	private int mesesPlazo;
	
	//Constructor
	public CuentaPlazos(String nroCuentaBancaria, String propietario, String moneda, double saldo, int mesesPlazo) {
		super(nroCuentaBancaria, propietario, moneda, saldo);
		this.mesesPlazo = mesesPlazo;
	}

	@Override
	public String mostrarInformacion() {
		// TODO Auto-generated method stub
		String data = "";
		data += "nroCuenta:" + super.nroCuentaBancaria + ",";
		data += "propietario:" + super.propietario + ",";
		data += super.generarIntereses();
		return data;
	}
}
