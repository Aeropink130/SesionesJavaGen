package flujoControl;
import java.util.Scanner;


public class Ejercicio {
	public static void main(String[] args) {
		
		/*
		 * condicion para determinar si el paciente es o no mayor de edad
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe tu edad:");
		byte edad = scanner.nextByte();
		scanner.close();
		
		String mayorOMenor = null;
		
		mayorOMenor = (edad >=18) ? "es mayor de edad" : "es menor de edad";
		
		System.out.println("El paciente " + mayorOMenor);
		
		if(edad >= 18) {
			System.out.println("felcidades, ya no necesitas que tu mama te acompañe a hacer el trámite");
		}else {
			System.out.println("Dile a tu mamá que venga");
		}
		
		boolean pago = true;
		
		String resultado = pago ? "ya pagó" : "no pagó"; 
		System.out.println("El paciente " + resultado);
	
	}
}
