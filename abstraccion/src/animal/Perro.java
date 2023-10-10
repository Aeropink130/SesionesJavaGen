package animal;

public class Perro extends Animal { // herencia de la clase superior

	// "Polimorfear" o sobreescribir el método heredado
	
	@Override //Con la antacion @Override, le decimos a Java que el metodo hacerSonido sera sobreescrito
	public void hacerSonido() {
		System.out.println("El perrito ladra y hace waos");
	}// metodo hacerSonido heredado de Animal

	
	public static void main(String[] args) {
		
		//Aquí no hay polimorfismo, ya que instacncio un amnimal generico, y utilizo su metodo hacerSonido
		Animal generico = new Animal();
		generico.hacerSonido();
		
		//Generar la instacia de mi perrillo
		//Si hay polimorfismo, porque es equivalente a decir "instancio a un Animal que es un Perro"
		//Referenciar primero la clase general, y luego la instancia partiucular, permite el polimorfismo
		Animal chilaquil = new Perro();
		chilaquil.hacerSonido();
	}
}
