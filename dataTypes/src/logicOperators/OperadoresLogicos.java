package logicOperators;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/*
		 * -- Operadores aritméticos (+, - , *, /, %)
		 * -- Operadores lógicos.
		 * -- Operadores relacionales ( =, +=, -=, *=, /=, <, >, <=, >=)
		 */
		 
		int num1 = 12;
		int num2 = 7;
		
	//	float resultado = num1/num2;
		
		
		/*Relacionales
		= asignación
		+= asignación suma
		-= asignación resta
		*= asignación multiplicación
		/= asignación división
		== igual que
		!= distinto que
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
*/
		
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
		System.out.println("**********************************");
		
		/*
		 * Operadores lógicos.
		 * AND (&&)
		 * OR (||)
		 * NOT (!)
		 */
		
		int numero1 = 5;
		int numero2 = 7;
		
		boolean comparacionUno = numero1 == numero2;
		System.out.println(comparacionUno);
		boolean comparacionDos = (numero1 < numero2) && (numero1 > numero2);
		System.out.println(comparacionDos);
		
		boolean comparacionTres = (numero1 < numero2) || (numero1 > numero2);
		System.out.println(comparacionTres);
		
		System.out.println(!comparacionTres);
		
		System.out.println("**********************************");
		
		
	}
}
