package figura;

public class TestFiguras {
	
	public static void main(String[] args) {
		
		//Generar instancias de nuestras clases
		 
		//1. Instacnicia de la clase figura
		//Figura generica = new Figura(); //que no se puede dice :v 
		
		//2. Instacia de rectangulo
		Figura rectangulo = new Rectangulo(5, 6.5);//base y altura
		
		//3. Instancia de circulo
		Figura circulo = new Circulo(3.14, 3.0);//pi y radio
		
		//4. Invocacion del metodo
		System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
		System.out.println("El area del circulo es: " + circulo.calcularArea());
		
		System.out.println("**************************************");
		
		Esfera esfera = new Esfera(7.2);
		System.out.println("Area de la esfera es: " + esfera.calcularArea());
		System.out.println("El perimetro de la esfera es: " + esfera.calcularPerimetro());
		System.out.println("El volumen de la esfera es: " + esfera.calcularVolumen());
	}
}
