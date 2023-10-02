package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int cuenta = 1;
		while (cuenta <= 10) {
			System.out.println("La cuenta es de " + cuenta);
			cuenta++;
		}
		/*Crear un programa que solicite al usuario un número, dicho numero sera el fina de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado
		 * 1.Importar Scanner
		 * 2.un mensaje para darle contexto al usuario
		 * 3.Almacenar el número del usuario en una nueva variable
		 * 4.Guardar en variable el número que inicia la cuenta (1)
		 * 5.Implementar el ciclo While
		 * 6.Mostrar por consola el resultado.
		*/
		
		//1
		Scanner scanner = new Scanner(System.in);
		//2
		System.out.println("Escribe un número que servirá como número final de una cuenta");
		//3
		int numFinal = scanner.nextInt();
		scanner.close();
		//4
		int numInicial = 1;
		
		//5
		while (numInicial <= numFinal) {
			System.out.println("La cuenta va en" + numInicial);
			numInicial++;
		}
	}

}
