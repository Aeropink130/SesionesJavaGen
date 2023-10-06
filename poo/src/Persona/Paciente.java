package Persona;

public class Paciente {
	
	//Atributos
	String nss;
	String tipoSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	//Costructor que recopile todos los datos
	Paciente(String nss, String tipoSangre, boolean expediente, boolean seguroGastosMedicos, String cita,
			String doctorAsignado, boolean alergias) {
		this.nss = nss;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}
	
	//Cosntructor que recopile solo los datos obligatorios
	Paciente (String nss,boolean expediente, boolean seguroGastosMedicos){
		this.nss = nss;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	}

	//Costructor que recopile todos los datos
	
	
	//Métodos
	
	@Override
	//Método llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [nss=" + nss + ", tipoSangre=" + tipoSangre + ", expediente=" + expediente
				+ ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}
	
}//Cierre clase
