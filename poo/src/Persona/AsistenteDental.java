package Persona;

public class AsistenteDental {
	// 1 Atributos privados
	private String fechaDeIngreso;
	private double salario;

	// 2 Constructor
	// Constructor público para poder acceder de forma sencilla a el
	public AsistenteDental(String fechaDeIngreso, double salario) {
		this.fechaDeIngreso = fechaDeIngreso;
		this.salario = salario;
	}
	
	// 3 Métodos
	public void mostrarDatosAsistente() {
		System.out.println("la fecha de ingreso del  assitente es: " + fechaDeIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos
	//Sin getters, la información me aparece en null
	//Sin setters no puedo cambiar la informción
	
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario (double nuevoSalario) {
		if(nuevoSalario > 0 && nuevoSalario < 100) {
			salario = nuevoSalario;
		}
	}
	
	
}
