package Persona;

public class Dentista extends Persona{
	
	/*
	 *Vamos a heredar nombre, apellido etc de persona 
	 */
	
	
	//atributos
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	
	
	//cosntructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email);//Info para la clase persona
		//Info para la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}
	
	//3 Metodos (Metodo para calcular salario basado en la experiencia
		//Experiencia  = basico, intermedio, avanzado 
		
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
	
	void calcularSalario() {
		//Logica de programacion
		//Diferencia entre evaluar variables con operador de igualdad (==) y evaluar el contenido de las variables con el metodo equals (.equals)
		
		if (experiencia.equals("basico")) {
			salario = 30000;
		}else if (experiencia.equals("intermedio")) {
			salario = 40000;
		}else if (experiencia.equals("avanzado")) {
			salario = 50000;
		}
	}//cierre calcularSalario
	
	void imprimirDentista() {
		System.out.println("Experiencia: " + experiencia);
		System.out.println("Salario: " + salario);
	}
	

}//Cierre dentista
