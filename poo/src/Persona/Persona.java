package Persona;

public class Persona {
	//1.Atributos
	String nombre;
	String apellido;
	byte edad;
	String telefono;
	String email;
	
	//2.Constructor con parámetros
	Persona(String nombre,String apellido, byte edad, String telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}//Cierre constructor
	
	//3.Metodos
	
	void imprimirInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);
	}
	
	void saludar() {
		System.out.println("Hola, te mando saluditos");
	}
	
	//Método principal
	
	
}//cierre de clase POO
