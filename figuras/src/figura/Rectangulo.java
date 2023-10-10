//En esta clase vamos a heredar el metodo de la clase abstracta figura, y lo vamos  a sobreescribir

package figura;

//1. Aplicamos herencia

public class Rectangulo extends Figura{
	
	//Atributos
	double base;
	double altura;
	
	
	//Cosntructor
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	//Metodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//Método calcular area

	
}//Rectangulo