package figura;

public class Circulo extends Figura {
	
	//1 Atributos
	double pi;
	double radio;
	
	//Constructor
	public Circulo(double pi, double radio) {
		super();
		this.pi = pi;
		this.radio = radio;
	}

	//Metodos
	@Override
	public double calcularArea() {
		double areaCirculo = pi *(radio * radio);
		return areaCirculo;
	}
	
	
}//Circulo