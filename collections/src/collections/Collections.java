package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {
		/*
		String[] listaDeCompras = new String[] {
			"Leche", "Pan", "Huevos"	
		};
		
		//Esta impresion solo muestra el espacio en memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
		for (String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}
		*/	
		
		//Implementacion de un arrayList
		//Clase general (interfaz, tipo de dato que usare, nombre de mi estructura de datos,instancia de dicha clase general
		List<String> listaDeContactos = new ArrayList<>();
		
		//Agrego elementos del tipo string a mi arraylist
		listaDeContactos.add("Jelipe");
		listaDeContactos.add("Juana");
		listaDeContactos.add("Banana");
		listaDeContactos.add("Alonso");
		
		//Obtener un elemento de la lista - asignarlo a una variable
		String datoFelipe = listaDeContactos.get(0);
		
		System.out.println(datoFelipe);
		System.out.println(listaDeContactos
				);
		//Borrar un elemento de mi lista
		listaDeContactos.remove(1);
		
		System.out.println(listaDeContactos);
		
		
		
		//Set
		//sintaxis
		//interface de donde implemento + tipo de dato que usare + nombre que le dare al conjunto + instancia de la clase especifica
		
		Set<String> cartasDeJuego = new HashSet<>();
		cartasDeJuego.add("As de corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de treboles");
		
		//No puedo saber posiciones, solo si lo contiene
		if (cartasDeJuego.contains("Reina de corazones")) {
			System.out.println("La reina de treboles si esta en el conjunto");
		}else {
			System.out.println("No encuentro el elemento");
		}
		
		//Implementacion de un mapa (hashmap)
		
		Map<String, String> libretaDeDirecciones = new HashMap<>();
		
		//Agrega elementos a mi libreta de direcciones
		libretaDeDirecciones.put("Felipe", "Tlanepantla");
		libretaDeDirecciones.put("Doctor Simi", "CDMX");
		libretaDeDirecciones.put("Konoha", "Naruto");//aquí la llave y el valor están al revés a propósito
		System.out.println(libretaDeDirecciones);
		libretaDeDirecciones.put("Felipe", "Guadalajara");
		System.out.println(libretaDeDirecciones);
		
		//Metodo para sacar informacion de la libreta, creando una nueva variable
		String direccionDeFelipe = libretaDeDirecciones.get("Felipe");
		String direccionDeSimi = libretaDeDirecciones.get("Doctor Simi");
		String direccionDeNaruto = libretaDeDirecciones.get("Naruto");//null
		
		System.out.println(direccionDeFelipe);
		System.out.println(direccionDeSimi);
		System.out.println(direccionDeNaruto);
		
		
		
		
	}//cierre main
	
}//Cierre collections

/*
 * Colecciones
 * 
 *  -Arrays
 *  
 *  Es una estructura de datos lineal que contiene elementos del mismo tipo. los elementos están almacenados de forma contigua (Una al lado del otro), y se pueden acceder a ellos a traves de un índice. Las principales caracteristicas de un array son:
 *  
 *  -Es una estructura de datos fija, generalmente almacena datos del mismo tipo
 *  -La longitud de un arreglo se establece al momento de crearlo, y no cambia.
 *  -Podemos acceder a elementos por medio de un índice.
 *  -Los arrays pueden contener datos primitivos y objetos
 *  -No proporciona metodos adicionales para agregar o eliminar elementos
 *	
 *	Un ejemplo de array es una lista de compras del supermercado.
 *
 *	
 *	-ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 *  
 *  
 *  -Sets(conjuntos)
 *  
 *  Estructura de datos que almacena datos únicos sin un orden específico. Las principales caracteristicas de un set son:
 *  	- No hay elementos duplicados, ya qie los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora
 *  	- No hay un orden específico, los elementos se almacenan sin un orden especifico
 *  	- La busqueda es más sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar el elemento deseado.
 *  
 *  
 *  Map (mapas)
 * 
 * Un mapa es una estructura de datos que almacena pares de clave-valor. 
 * 
 * 	- Almacenamiento con pares K-V
 * 	- Sin orden especifico (similar a un Set)
 * 	- Busqueda rapida, la busqueda se hace por medio de un valor (key), y usa una funcion interna hash para buscar elementos.
 * 
 * 
 * 
 * 
 * Agenda telefonica (agregar, modificar, eliminar)
 */
 