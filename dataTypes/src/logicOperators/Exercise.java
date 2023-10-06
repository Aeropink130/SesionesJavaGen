package logicOperators;

public class Exercise {

	public static void main(String[] args) {
		//Enrique, Paola y Mariana cada uno compran un iphone 15. 
		//Si el total de la compra supera los 25mil pesos, 
		//por lo tanto obitnenen un 10% de descuento. 
		//La tienda en estos momentos cuenta con una promoción
		//de 12 meses sin intereses, por lo tanto, deciden pagar 
		//con la TDC de Mariana. ¿ Cuál sería el costo total de los equipos?
		//¿Aplica descuento? ¿Cuál sería el costo total con descuento? 
		//¿Cuánto pagarían mensualmente?
		
		final float iphone = 19499f;
		float enriqueCompra;
		float paolaCompra;
		float marianaCompra;
		float subtotal;
		float total;
		boolean tdd;
		
		System.out.println("Enrique elige un Iphone 15");
		enriqueCompra = iphone;
		
		System.out.println("Paola elige un Iphone 15");
		paolaCompra = iphone;
		
		System.out.println("Mariana elige un Iphone 15");
		marianaCompra = iphone;
		
		subtotal = enriqueCompra + paolaCompra + marianaCompra;
		
		System.out.println("El subtotal de la compra es: $" + subtotal);
		
		if (subtotal > 25000) {
			System.out.println("Felicidades! tienes un descuento del 10%");
			total = subtotal * .90f;
		}else {
			total = subtotal;
		}
		
		System.out.println("El total de la compra es: $" + total);
		
		System.out.println("Metodo de pago?");
		tdd = true;
		
		if (tdd) {
			System.out.println("El metodo de pago es TDC");
			float mensualidad = total/12;
			System.out.println("Mariana pagará 12 mensualidades de $" + mensualidad);
		}else {
			System.out.println("Mariana pagará al contado");
		}
		
		System.out.println("Gracias por su compra! Nos vemos el próximo año cuando salga el nuevo Iphone :v");


	}

}
