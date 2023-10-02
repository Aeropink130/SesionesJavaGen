package loops;

public class ForLoop {

	public static void main(String[] args) {
		//El ciclo for 
		
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Número igual a " + numero);
		}
		int contador;
		for (contador = 1; contador <=5; contador++) {
			System.out.println("La cuenta es " + contador);
		}
		
		int filas = 5;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("El valor de Pi es " + Math.PI);
		
		int potencias = 5;
		for (int base = 1; base <= potencias; base++) {
			double resultado = Math.pow(Math.PI, base);
			System.out.println("Pi elevado a la " + base + " es igual a " + resultado);
		}
	}

} 
