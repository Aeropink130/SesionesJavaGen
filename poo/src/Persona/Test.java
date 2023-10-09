	package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		
		//implementacion de arrayListde Dentista
		List<Dentista> listaDentistasArrayList = new ArrayList<>();
		
		Dentista chapatin = new Dentista("Dr. Chapatin", "Chespirito", (byte)50, "1111111111", "SimiLares@mail.com", "Familiar", "1656516", "500", "avanzado", "matutino", 500);
		//Si agrego la instacia a una variable, puedo imprimir su informacion usando un toString, o un metodo mostrarinfo()
		
		listaDentistasArrayList.add(new Dentista("Simi", "lares", (byte)50, "1111111111", "SimiLares@mail.com", "Familiar", "1656516", "500", "avanzado", "matutino", 500));
		//aqui se genera la instancia directamente dentro del array tendré que usar un foreach para imprimir dato por dato
		
		
		//Implementar dentista en un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet<>();
		
		//Agregando Dentista a mi Conjunto
		conjuntoDentistas.add(new Dentista ("Simi", "lares", (byte)50, "1111111111", "SimiLares@mail.com", "Familiar", "1656516", "500", "avanzado", "matutino", 500));
		
		
		//Implementacion de iun HashMap de dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista a mi mapa
		mapaDentistas.put("Dr. House", new Dentista("Gregory", "House", (byte)55, "1111111111", "house@mail.com", "Cirujano", "1656516", "600", "avanzado", "Vespertino", 1400));
		mapaDentistas.get("Dr. House");
		
		//Imprimir el Objeto doctor
		Dentista doctorBuscadoString = mapaDentistas.get("Dr. House");
		System.out.println(doctorBuscadoString);
		
		
		
	}//Cierre main

}
