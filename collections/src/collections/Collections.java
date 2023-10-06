package collections;

public class Collections {
	
	public static void main(String[] args) {
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
	}
	
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
*/
 