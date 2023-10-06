package Persona;

public class TestUsuario {
	public static void main(String[] args) {
		
		System.out.println("Se crea user1");
		Usuario user1 = new Usuario("Paciente", "user1", "papitas123");
		
		System.out.println("Se creo el usuario: " + user1.getUsername() + " con el rol: " + user1.getRole() + " y la contraseña: " + user1.getPassword());
		
		System.out.println("Se intenta cambiar la contraseña por una cadena vacia");
		user1.setPassword("");
		System.out.println(user1.toString());
		
		System.out.println("Se intenta cambiar la contraseña por la misma contraseña");
		user1.setPassword("papitas123");
		System.out.println(user1.toString());
		
		System.out.println("Se intenta cambiar la contraseña por una con menos de 8 carácteres");
		user1.setPassword("papitas");
		System.out.println(user1.toString());
		
		System.out.println("Se intenta cambiar la contraseña por una  diferente con más de 8 carácteres");
		user1.setPassword("papaschiquitas321");
		System.out.println(user1.toString());
		
	}
}
