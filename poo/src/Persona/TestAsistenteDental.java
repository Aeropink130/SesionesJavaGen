package Persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		//Instancia de nuestro asistente 
		AsistenteDental francisca = new AsistenteDental("05/10/2023", 875.40d);
		
		//impresion de la info del asistente
		francisca.mostrarDatosAsistente();
		
		//mostrar el sueldo antes del getter
		//System.out.println(francisca.sueldo);
		
		//mostrar el sueldo despues del getter
		System.out.println(francisca.getSalario());
		
		
		//modificar salario con el setter
		francisca.setSalario(30.00);
		
		//nuevo slario de frnacisca
		System.out.println(francisca.getSalario());
	}

}
