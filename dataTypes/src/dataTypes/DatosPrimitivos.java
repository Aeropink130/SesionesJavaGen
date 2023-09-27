package dataTypes;

import java.sql.Struct;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los
		 * tipos de información más básicos Existen 8 tipos de datos primitivos: byte,
		 * short, int, long, float, dohble, boolean, char
		 */
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor minimo de byte es: " + minByte);
		System.out.println("El valor maximo de byte es: " + maxByte);
		
		System.out.println("************************************");
		
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de short es: " + minShort);
		System.out.println("El valor máximo de short es: " + maxShort);
		
		System.out.println("************************************");
		
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de int es: " + minInt);
		System.out.println("El valor máximo de int es: " + maxInt);
		
		System.out.println("************************************");
		
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de long es: " + minLong);
		System.out.println("El valor maximo de long es: " + maxLong);
		
		System.out.println("************************************");
		
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println(minFloat);
		System.out.println(maxFloat);
		
		System.out.println("************************************");
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println(minDouble);
		System.out.println(maxDouble);
		
		System.out.println("************************************");
		
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		//casteo
		
		int myNumber = 125;
		System.out.println(myNumber);
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 28;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		float myFloat = 1.99f;
		System.out.println(myFloat);
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
		
	}

}
