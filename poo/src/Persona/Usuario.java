package Persona;

public class Usuario {
	// Atributos
	private String role;
	private String username;
	private String password;
	
	// Crear un nuevo usuario (cosntrcutor)
	public Usuario (String role,String username, String password) {
		this.role = role;
		this.username = username;
		this.password = password;
	}
	
	// Recuperar contraseña (getter)
	public String getPassword() {
		//si el usuario registrado coincide con el usuario que paso como parametro entonces obtengo la contraseña
		return password;
	}
	
	// Cambiar contraseña (setter)
	public void setPassword(String newPassword) {
		//si la nueva contraseña es diferente a una cadena vacía y es diferente a la anterior y que su longitud es mayor o igual a 8 entonces...
		if (newPassword != "" && newPassword != password && newPassword.length()>= 8) {
			//... reemplazo la contraseña anterior
			password = newPassword;
			System.out.println("Se cambió la contraseña correctamente");
		}else {
			System.out.println("no se va a poder mi chavo, no se cambió la contraseña");
		}
	}

	//generados por compilador
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "role=" + role + ", username=" + username + ", password=" + password;
	}
	
	
}//cierre de la clase
