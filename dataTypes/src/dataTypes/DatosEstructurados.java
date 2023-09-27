package dataTypes;

public class DatosEstructurados {
	public static void main(String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas
		 * de caracteres o bien, algún tipo de dato primitivo -- String. Cadena de
		 * Caracteres, se declaran entre comillas y hay que definir el tipo de dato con
		 * la palabra reservada String. Los Strings en java son objetos. -- Arrays. --
		 * Creados por el usuario (API Java)
		 */

		String myString = "Hola soy un String";
		System.out.println(myString);

		String helloString = new String("Hola soy un segundo String");
		System.out.println(helloString);

		/*
		 * métodos para strings
		 */
		String texto = "AKLasdasdasSJDOIASDJ";
		// String length. Metodo que devuelve la longitud de una cadena de caracteres
		System.out.println("La longitud " + texto.length());
		/*
		 * tambien podemos guardar la longitud en una variable de tipo entero para
		 * después imprimirla, cualquier manera es válida y su uso depende del contexto
		 * int metodoLength = texto.length(); System.out.println("La longitud " +
		 * metodoLength);
		 */

		// String toUpperCase y toLowerCase
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el método toUpperCase " + upperCase);

		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el método toLowercase " + lowerCase);

		// indexof
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal");// 8
		System.out.println("La palabra 'temporal' inicia en el indice: " + indexOf);

		//Concatenacion
		String firstName = "Daniel";
		String lastName = "Maldonado";
		
		//String username = firstName + " " + lastName;
		
		System.out.println(firstName.concat(lastName));
		
		//metodos de conversión
		
		String presupuesto = "50000";
		System.out.println("El presupuesto es de " + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());
		
		double parseao2 = Double.parseDouble(presupuesto);
		System.out.println("Aplicando parseInt el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao2 + " ahora es de tipo " + ((Object)parseao2).getClass().getSimpleName());
		
		
		/*
		 * Arrays. Conocidos como arreglos, se trata de una colección de datos del mismo tipo donde cada elemento corresponde a una posición identificada por índices numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz
		 */
		
		String[] cars = {"Volkswagen", "Mazda", "Kia"};
		System.out.println(cars[0]);
		
		/*
		 * Variable por tipo de declaración
		 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
		 * 
		 */
		
		//variables dinamicas
		float gastosMensuales = 35684.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales = 42699.2f;
		System.out.println("Ahora mis gastos mensuales ascuienden a " + gastosMensuales);
		
		//variables finales o constantes
		final int SALARIO = 15000;
		System.out.println(SALARIO);
		
		
		
		
	}

}
