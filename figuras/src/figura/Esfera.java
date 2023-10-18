package figura;

//clase concreta
public class Esfera implements Calculable {

	// Atributos
	private double radio;

	// Cosntructor
	
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	// Métodos
	
	//Volumen V = 4/3 π r³
	//Area 4 π r*r
	//Perimetro 2 * π * r

	@Override
	public double calcularArea() {
		//Area 4 π r*r
		double area = (4 * Math.PI) * Math.pow(radio, 2);
		return area;
	}

	@Override
	public double calcularVolumen() {
		//Volumen V = 4/3 π r³
		double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
		return volumen;
	}

	@Override
	public double calcularPerimetro() {
		//Perimetro 2 * π * 
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

}// Esfera
