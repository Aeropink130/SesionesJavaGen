package Persona;


public class Test {
	
	public static void main(String[] args) {
		Persona felipe = new Persona("Felipe", "Maqueda", (byte)31, "1122334455", "felipemaqueda@mail.com");
		
		System.out.println(felipe);//Imprime direccion en memoria
		felipe.imprimirInfo();//imprime info
		felipe.saludar();
		System.out.println("**********************************");
		
		Dentista simi = new Dentista("Simi", "lares", (byte)50, "1111111111", "SimiLares@mail.com", "Familiar", "1656516", "500", "avanzado", "matutino", 500);
		simi.calcularSalario();
		simi.imprimirDentista();
		System.out.println("**********************************");
		
		
		//instancia de paciente
		Paciente chencho = new Paciente("31654355", "AB+", true, true, "25/10/23", "Dr. Simi", false);
		System.out.println("**********************************");
		System.out.println(chencho.toString());
		System.out.println("**********************************");
		//Instancia de Paciente con datos obligatorios
		
		Paciente masiosare = new Paciente("16569854",false,false);
		
		System.out.println(masiosare.toString());
		
		
	}//Cierre main

}
